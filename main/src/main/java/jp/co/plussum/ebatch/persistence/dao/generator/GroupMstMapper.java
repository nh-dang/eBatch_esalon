package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.GroupMst;
import jp.co.plussum.ebatch.domain.entity.generator.GroupMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface GroupMstMapper {
    long countByExample(GroupMstCriteria example);

    int deleteByExample(GroupMstCriteria example);

    int deleteByPrimaryKey(Long grpId);

    int insert(GroupMst record);

    int insertSelective(GroupMst record);

    List<GroupMst> selectByExampleWithRowbounds(GroupMstCriteria example, RowBounds rowBounds);

    GroupMst selectOneByExample(GroupMstCriteria example);

    List<GroupMst> selectByExample(GroupMstCriteria example);

    GroupMst selectByPrimaryKey(Long grpId);

    int updateByExampleSelective(@Param("record") GroupMst record, @Param("example") GroupMstCriteria example);

    int updateByExample(@Param("record") GroupMst record, @Param("example") GroupMstCriteria example);

    int updateByPrimaryKeySelective(GroupMst record);

    int updateByPrimaryKey(GroupMst record);
}