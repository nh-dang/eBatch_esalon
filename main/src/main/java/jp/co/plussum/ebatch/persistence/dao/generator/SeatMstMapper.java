package jp.co.plussum.ebatch.persistence.dao.generator;

import java.util.List;
import jp.co.plussum.ebatch.domain.entity.generator.SeatMst;
import jp.co.plussum.ebatch.domain.entity.generator.SeatMstCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface SeatMstMapper {
    long countByExample(SeatMstCriteria example);

    int deleteByExample(SeatMstCriteria example);

    int deleteByPrimaryKey(Long seatId);

    int insert(SeatMst record);

    int insertSelective(SeatMst record);

    List<SeatMst> selectByExampleWithRowbounds(SeatMstCriteria example, RowBounds rowBounds);

    SeatMst selectOneByExample(SeatMstCriteria example);

    List<SeatMst> selectByExample(SeatMstCriteria example);

    SeatMst selectByPrimaryKey(Long seatId);

    int updateByExampleSelective(@Param("record") SeatMst record, @Param("example") SeatMstCriteria example);

    int updateByExample(@Param("record") SeatMst record, @Param("example") SeatMstCriteria example);

    int updateByPrimaryKeySelective(SeatMst record);

    int updateByPrimaryKey(SeatMst record);
}