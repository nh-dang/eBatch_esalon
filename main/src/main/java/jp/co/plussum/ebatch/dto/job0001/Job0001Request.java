package jp.co.plussum.ebatch.dto.job0001;

import jp.co.plussum.ebatch.dto.base.request.BaseRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Job0001Request extends BaseRequest {
    private String download;
}
