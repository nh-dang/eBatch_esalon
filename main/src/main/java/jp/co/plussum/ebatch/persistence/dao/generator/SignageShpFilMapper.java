package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.SignageShpFil;
import jp.co.plussum.ebatch.domain.entity.generator.SignageShpFilCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface SignageShpFilMapper {
    long countByExample(SignageShpFilCriteria example);

    int deleteByExample(SignageShpFilCriteria example);

    int deleteByPrimaryKey(Long ssfId);

    int insert(SignageShpFil record);

    int insertSelective(SignageShpFil record);

    List<SignageShpFil> selectByExampleWithRowbounds(SignageShpFilCriteria example, RowBounds rowBounds);

    SignageShpFil selectOneByExample(SignageShpFilCriteria example);

    List<SignageShpFil> selectByExample(SignageShpFilCriteria example);

    SignageShpFil selectByPrimaryKey(Long ssfId);

    int updateByExampleSelective(@Param("record") SignageShpFil record, @Param("example") SignageShpFilCriteria example);

    int updateByExample(@Param("record") SignageShpFil record, @Param("example") SignageShpFilCriteria example);

    int updateByPrimaryKeySelective(SignageShpFil record);

    int updateByPrimaryKey(SignageShpFil record);
}