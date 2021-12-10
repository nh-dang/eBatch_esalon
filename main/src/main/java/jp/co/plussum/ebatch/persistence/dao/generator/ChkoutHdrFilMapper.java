package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.ChkoutHdrFil;
import jp.co.plussum.ebatch.domain.entity.generator.ChkoutHdrFilCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ChkoutHdrFilMapper {
    long countByExample(ChkoutHdrFilCriteria example);

    int deleteByExample(ChkoutHdrFilCriteria example);

    int deleteByPrimaryKey(Long cohId);

    int insert(ChkoutHdrFil record);

    int insertSelective(ChkoutHdrFil record);

    List<ChkoutHdrFil> selectByExampleWithRowbounds(ChkoutHdrFilCriteria example, RowBounds rowBounds);

    ChkoutHdrFil selectOneByExample(ChkoutHdrFilCriteria example);

    List<ChkoutHdrFil> selectByExample(ChkoutHdrFilCriteria example);

    ChkoutHdrFil selectByPrimaryKey(Long cohId);

    int updateByExampleSelective(@Param("record") ChkoutHdrFil record, @Param("example") ChkoutHdrFilCriteria example);

    int updateByExample(@Param("record") ChkoutHdrFil record, @Param("example") ChkoutHdrFilCriteria example);

    int updateByPrimaryKeySelective(ChkoutHdrFil record);

    int updateByPrimaryKey(ChkoutHdrFil record);
}