package jp.co.plussum.ebatch.persistence.dao.custom;

import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrm;
import jp.co.plussum.ebatch.dto.job0001.FindLayoutPrmRst;
import jp.co.plussum.ebatch.persistence.dao.generator.LayoutMstMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomLayoutMstMapper extends LayoutMstMapper {

    List<FindLayoutPrmRst> findLayoutMst(FindLayoutPrm prm);

}
