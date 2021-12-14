package jp.co.plussum.ebatch.job.concrete;

import com.google.api.services.drive.Drive;
import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrmRst;
import jp.co.plussum.ebatch.dto.job0001.Job0001Request;
import jp.co.plussum.ebatch.job.DefaultAbstractJobRunner;
import jp.co.plussum.ebatch.job.core.ClientRequest;
import jp.co.plussum.ebatch.job.core.Job;
import jp.co.plussum.ebatch.job.type.JobID;
import jp.co.plussum.ebatch.service.GoogleService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.transform.TransformerException;
import java.util.*;

@Job(JobID.JOB0001)
@Data
@AllArgsConstructor
@Slf4j
public class Job0001 extends DefaultAbstractJobRunner<Job0001Request> {

    private static final String DOWNLOAD_MODE = "download_mode";


    @Autowired
    GoogleService googleService;

    @Autowired
    private Drive googleConfigDrive;

    @Override
    public Class<?> getClassType() {
        return this.getClass();
    }

    @Override
    public Job0001Request convertToRequest(ClientRequest request) throws Exception {
        return Job0001Request.builder()
                .build();
    }

    @Override
    public boolean validate(Job0001Request request) {

        return true;
    }

    @Override
    public void perform(Job0001Request request) throws TransformerException {
        List<FindLayoutPrmRst> findLayoutPrmRstList = googleService.updateSvgFile();
        if (!findLayoutPrmRstList.isEmpty()) {
            findLayoutPrmRstList.forEach(layoutPrmRst -> {
                try {
                    String fileId = googleService.uploadImageFile(layoutPrmRst.getSsfShpId(),
                            layoutPrmRst.getSigImagePath(),
                            layoutPrmRst.getLaySvg());
                    if (StringUtils.isNotEmpty(layoutPrmRst.getSsfFileId())) {
                        googleService.deleteImageFile(layoutPrmRst.getSsfFileId());
                    }
                    googleService.updateFileId(layoutPrmRst.getSsfId(), fileId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
