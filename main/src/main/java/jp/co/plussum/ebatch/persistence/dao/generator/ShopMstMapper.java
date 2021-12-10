package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.ShopMst;
import jp.co.plussum.ebatch.domain.entity.generator.ShopMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ShopMstMapper {
    long countByExample(ShopMstCriteria example);

    int deleteByExample(ShopMstCriteria example);

    int deleteByPrimaryKey(Long shpId);

    int insert(ShopMst record);

    int insertSelective(ShopMst record);

    List<ShopMst> selectByExampleWithRowbounds(ShopMstCriteria example, RowBounds rowBounds);

    ShopMst selectOneByExample(ShopMstCriteria example);

    List<ShopMst> selectByExample(ShopMstCriteria example);

    ShopMst selectByPrimaryKey(Long shpId);

    int updateByExampleSelective(@Param("record") ShopMst record, @Param("example") ShopMstCriteria example);

    int updateByExample(@Param("record") ShopMst record, @Param("example") ShopMstCriteria example);

    int updateByPrimaryKeySelective(ShopMst record);

    int updateByPrimaryKey(ShopMst record);
}