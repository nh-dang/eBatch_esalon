package jp.co.plussum.ebatch.dto.job0001;

import jp.co.plussum.ebatch.domain.entity.generator.LayoutMst;
import lombok.Data;


@Data
public class FindLayoutPrmRst {

    private String laySvg;

    private String ssfShpId;

    private Long ssfId;

    private String ssfFileId;

    private String sigImagePath;

}
