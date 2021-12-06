package jp.co.plussum.ebatch.job.concrete;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;
import jp.co.plussum.ebatch.dto.job0001.Job0001Request;
import jp.co.plussum.ebatch.job.DefaultAbstractJobRunner;
import jp.co.plussum.ebatch.job.core.ClientRequest;
import jp.co.plussum.ebatch.job.core.Job;
import jp.co.plussum.ebatch.job.type.JobID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Job(JobID.JOB0001)
@Data
@AllArgsConstructor
@Slf4j
public class Job0001 extends DefaultAbstractJobRunner<Job0001Request> {

    private static final String DOWNLOAD_MODE = "download_mode";

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
    public void perform(Job0001Request request) throws Exception {

        FileList listFile = googleConfigDrive.files().list()
                .setPageSize(1000)
                .setFields("nextPageToken, files(id, name, size, thumbnailLink, shared)") // get field of google drive file
                .execute();

        String result = "Number of downloaded file: " + listFile.size();

        this.result.setResponse(result);
    }


}
