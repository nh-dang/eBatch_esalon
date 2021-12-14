package jp.co.plussum.ebatch.service;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import jp.co.plussum.ebatch.domain.entity.generator.*;
import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrm;
import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrmRst;
import jp.co.plussum.ebatch.persistence.dao.custom.CustomLayoutMstMapper;
import jp.co.plussum.ebatch.persistence.dao.generator.ChkoutHdrFilMapper;
import jp.co.plussum.ebatch.persistence.dao.generator.LayoutMstMapper;
import jp.co.plussum.ebatch.persistence.dao.generator.SignageShpFilMapper;
import jp.co.plussum.ebatch.util.Dates;
import jp.co.plussum.ebatch.util.FileUtil;
import org.apache.batik.transcoder.TranscoderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class GoogleServiceImpl implements GoogleService{

    @Autowired
    LayoutMstMapper layoutMstMapper;

    @Autowired
    CustomLayoutMstMapper customLayoutMstMapper;

    @Autowired
    ChkoutHdrFilMapper chkoutHdrFilMapper;

    @Autowired
    SignageShpFilMapper signageShpFilMapper;

    @Autowired
    Drive googleConfigDrive;

    @Override
    public List<FindLayoutPrmRst> updateSvgFile() throws TransformerException {
        Date toDate = new Date();
        List<FindLayoutPrmRst> findLayoutPrmRstList = new ArrayList<>();
        ChkoutHdrFilCriteria chkCriteria = new ChkoutHdrFilCriteria();
        chkCriteria.createCriteria()
                .andCohDateEqualTo(toDate)
                .andCohStrTimeLessThanOrEqualTo(toDate)
                .andCohEndTimeGreaterThanOrEqualTo(toDate);
        List<ChkoutHdrFil> chkoutHdrFilList = chkoutHdrFilMapper.selectByExample(chkCriteria);
        List<Long> cohShpIds = chkoutHdrFilList .stream().map(ChkoutHdrFil::getCohShpId).collect(Collectors.toList());
        if (!cohShpIds.isEmpty()) {
            LayoutMstCriteria layoutMstCriteria = new LayoutMstCriteria();
            layoutMstCriteria.createCriteria().andLayShpIdIn(cohShpIds);
            List<LayoutMst> layoutMstList = layoutMstMapper.selectByExample(layoutMstCriteria);
            HashMap<Long, LayoutMst> map = new HashMap<Long, LayoutMst>();
            List<Long> layoutMstShpIds = new ArrayList<>();
            for (int i = 0; i < chkoutHdrFilList.size(); i++) {
                ChkoutHdrFil chkoutHdrFil = chkoutHdrFilList.get(i);
                LayoutMst layoutMst;
                if (map.containsKey(chkoutHdrFil.getCohShpId())){
                    layoutMst = map.get(chkoutHdrFil.getCohShpId());
                } else {
                    layoutMst = layoutMstList.stream()
                            .filter(x -> chkoutHdrFil.getCohShpId()==x.getLayShpId())
                            .findAny()
                            .orElse(null);
                    layoutMst.setLaySvg(layoutMst.getLaySvg().replace("red", "rgb(128,128,128)"));
                }

                if (layoutMst == null){
                    continue;
                }
                Document doc = FileUtil.convertStringToDocument(layoutMst.getLaySvg());
                XPathFactory xPathfactory = XPathFactory.newInstance();
                XPath xpath = xPathfactory.newXPath();
                XPathExpression expr = null;
                NodeList nodeList = null;
                try {
                    expr = xpath.compile("//*[@SeatId='"+chkoutHdrFil.getCohSeatId()+"']");
                    nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
                } catch (XPathExpressionException e) {
                    e.printStackTrace();
                }
                if ( nodeList.getLength() > 0) {
                    Node value = nodeList.item(0).getAttributes().getNamedItem("style");
                    String val = value.getNodeValue();
                    value.setNodeValue(val.replace("rgb(128,128,128)", "red"));
                    StringWriter writer = new StringWriter();
                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    transformer.transform(new DOMSource(doc), new StreamResult(writer));
                    layoutMst.setLaySvg(writer.getBuffer().toString());
                    layoutMstShpIds.add(chkoutHdrFil.getCohShpId());
                    map.put(chkoutHdrFil.getCohShpId(), layoutMst);
                }
            }

            if (!layoutMstShpIds.isEmpty()){
                map.forEach((k, v) -> layoutMstMapper.updateByPrimaryKey(v));
            }
            FindLayoutPrm findLayoutPrm = new FindLayoutPrm();
            findLayoutPrm.setLayoutShpIdList(layoutMstShpIds);
            findLayoutPrmRstList = customLayoutMstMapper.findLayoutMst(findLayoutPrm);
        }
        return findLayoutPrmRstList;
    }

    @Override
    public String uploadImageFile(String shipId, String folderId, String svg) throws IOException, TranscoderException {
        File fileMetadata = new File();
        fileMetadata.setName("shipId_" + shipId + "_" + Dates.convertYYYYMMddHHmmss() + ".jpg");
        fileMetadata.setParents(Collections.singletonList(folderId));
//        Document doc = FileUtil.convertStringToDocument(svg);
        byte[] out = FileUtil.pngBytesFromSvg(svg);
        File file = googleConfigDrive.files().create(fileMetadata, new ByteArrayContent("",
                            out))
                    .setFields("id")
                    .execute();
            return file.getId();
    }

    @Override
    public void deleteImageFile(String ssfFileId) throws IOException {
        googleConfigDrive.files().delete(ssfFileId).execute();
    }

    @Override
    public void updateFileId(Long ssfSig, String ssfFileId) {
        SignageShpFil signageShpFil = signageShpFilMapper.selectByPrimaryKey(ssfSig);
        signageShpFil.setSsfFileId(ssfFileId);
        signageShpFilMapper.updateByPrimaryKey(signageShpFil);
    }
}
