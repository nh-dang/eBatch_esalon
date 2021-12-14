package jp.co.plussum.ebatch.service;

import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrmRst;
import org.apache.batik.transcoder.TranscoderException;
import org.springframework.stereotype.Service;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Service
public interface GoogleService {

    List<FindLayoutPrmRst> updateSvgFile() throws TransformerException;

    String uploadImageFile(String shipId, String folderId, String svg) throws IOException, TranscoderException;

    void deleteImageFile(String ssfFileId) throws IOException;

    void updateFileId(Long ssfSig, String ssfFileId);
}
