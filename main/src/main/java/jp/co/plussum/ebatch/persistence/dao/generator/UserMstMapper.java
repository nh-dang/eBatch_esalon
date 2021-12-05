package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.UserMst;
import jp.co.plussum.ebatch.domain.entity.generator.UserMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserMstMapper {
    long countByExample(UserMstCriteria example);

    int deleteByExample(UserMstCriteria example);

    int deleteByPrimaryKey(Long usrId);

    int insert(UserMst record);

    int insertSelective(UserMst record);

    List<UserMst> selectByExampleWithRowbounds(UserMstCriteria example, RowBounds rowBounds);

    UserMst selectOneByExample(UserMstCriteria example);

    List<UserMst> selectByExample(UserMstCriteria example);

    UserMst selectByPrimaryKey(Long usrId);

    int updateByExampleSelective(@Param("record") UserMst record, @Param("example") UserMstCriteria example);

    int updateByExample(@Param("record") UserMst record, @Param("example") UserMstCriteria example);

    int updateByPrimaryKeySelective(UserMst record);

    int updateByPrimaryKey(UserMst record);
}