package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.SignageMst;
import jp.co.plussum.ebatch.domain.entity.generator.SignageMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface SignageMstMapper {
    long countByExample(SignageMstCriteria example);

    int deleteByExample(SignageMstCriteria example);

    int deleteByPrimaryKey(Long sigId);

    int insert(SignageMst record);

    int insertSelective(SignageMst record);

    List<SignageMst> selectByExampleWithRowbounds(SignageMstCriteria example, RowBounds rowBounds);

    SignageMst selectOneByExample(SignageMstCriteria example);

    List<SignageMst> selectByExample(SignageMstCriteria example);

    SignageMst selectByPrimaryKey(Long sigId);

    int updateByExampleSelective(@Param("record") SignageMst record, @Param("example") SignageMstCriteria example);

    int updateByExample(@Param("record") SignageMst record, @Param("example") SignageMstCriteria example);

    int updateByPrimaryKeySelective(SignageMst record);

    int updateByPrimaryKey(SignageMst record);
}