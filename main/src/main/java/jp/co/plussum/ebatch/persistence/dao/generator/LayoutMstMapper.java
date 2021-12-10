package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.LayoutMst;
import jp.co.plussum.ebatch.domain.entity.generator.LayoutMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface LayoutMstMapper {
    long countByExample(LayoutMstCriteria example);

    int deleteByExample(LayoutMstCriteria example);

    int deleteByPrimaryKey(Long layId);

    int insert(LayoutMst record);

    int insertSelective(LayoutMst record);

    List<LayoutMst> selectByExampleWithRowbounds(LayoutMstCriteria example, RowBounds rowBounds);

    LayoutMst selectOneByExample(LayoutMstCriteria example);

    List<LayoutMst> selectByExample(LayoutMstCriteria example);

    LayoutMst selectByPrimaryKey(Long layId);

    int updateByExampleSelective(@Param("record") LayoutMst record, @Param("example") LayoutMstCriteria example);

    int updateByExample(@Param("record") LayoutMst record, @Param("example") LayoutMstCriteria example);

    int updateByPrimaryKeySelective(LayoutMst record);

    int updateByPrimaryKey(LayoutMst record);
}