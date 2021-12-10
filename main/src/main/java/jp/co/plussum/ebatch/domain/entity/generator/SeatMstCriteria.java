package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SeatMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatMstCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public SeatMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SeatMstCriteria orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        SeatMstCriteria example = new SeatMstCriteria();
        return example.createCriteria();
    }

    public SeatMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SeatMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Long value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Long value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Long value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Long value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Long value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Long> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Long> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Long value1, Long value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Long value1, Long value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdIsNull() {
            addCriterion("seat_shp_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdIsNotNull() {
            addCriterion("seat_shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdEqualTo(Long value) {
            addCriterion("seat_shp_id =", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdNotEqualTo(Long value) {
            addCriterion("seat_shp_id <>", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdGreaterThan(Long value) {
            addCriterion("seat_shp_id >", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seat_shp_id >=", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdLessThan(Long value) {
            addCriterion("seat_shp_id <", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdLessThanOrEqualTo(Long value) {
            addCriterion("seat_shp_id <=", value, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_shp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatShpIdIn(List<Long> values) {
            addCriterion("seat_shp_id in", values, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdNotIn(List<Long> values) {
            addCriterion("seat_shp_id not in", values, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdBetween(Long value1, Long value2) {
            addCriterion("seat_shp_id between", value1, value2, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatShpIdNotBetween(Long value1, Long value2) {
            addCriterion("seat_shp_id not between", value1, value2, "seatShpId");
            return (Criteria) this;
        }

        public Criteria andSeatNameIsNull() {
            addCriterion("seat_name is null");
            return (Criteria) this;
        }

        public Criteria andSeatNameIsNotNull() {
            addCriterion("seat_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNameEqualTo(String value) {
            addCriterion("seat_name =", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameNotEqualTo(String value) {
            addCriterion("seat_name <>", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameGreaterThan(String value) {
            addCriterion("seat_name >", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameGreaterThanOrEqualTo(String value) {
            addCriterion("seat_name >=", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameLessThan(String value) {
            addCriterion("seat_name <", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameLessThanOrEqualTo(String value) {
            addCriterion("seat_name <=", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatNameLike(String value) {
            addCriterion("seat_name like", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameNotLike(String value) {
            addCriterion("seat_name not like", value, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameIn(List<String> values) {
            addCriterion("seat_name in", values, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameNotIn(List<String> values) {
            addCriterion("seat_name not in", values, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameBetween(String value1, String value2) {
            addCriterion("seat_name between", value1, value2, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatNameNotBetween(String value1, String value2) {
            addCriterion("seat_name not between", value1, value2, "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatSortIsNull() {
            addCriterion("seat_sort is null");
            return (Criteria) this;
        }

        public Criteria andSeatSortIsNotNull() {
            addCriterion("seat_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSeatSortEqualTo(Integer value) {
            addCriterion("seat_sort =", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortNotEqualTo(Integer value) {
            addCriterion("seat_sort <>", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortGreaterThan(Integer value) {
            addCriterion("seat_sort >", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_sort >=", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortLessThan(Integer value) {
            addCriterion("seat_sort <", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortLessThanOrEqualTo(Integer value) {
            addCriterion("seat_sort <=", value, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sort <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSortIn(List<Integer> values) {
            addCriterion("seat_sort in", values, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortNotIn(List<Integer> values) {
            addCriterion("seat_sort not in", values, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortBetween(Integer value1, Integer value2) {
            addCriterion("seat_sort between", value1, value2, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatSortNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_sort not between", value1, value2, "seatSort");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgIsNull() {
            addCriterion("seat_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgIsNotNull() {
            addCriterion("seat_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgEqualTo(String value) {
            addCriterion("seat_del_flg =", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgNotEqualTo(String value) {
            addCriterion("seat_del_flg <>", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgGreaterThan(String value) {
            addCriterion("seat_del_flg >", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("seat_del_flg >=", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLessThan(String value) {
            addCriterion("seat_del_flg <", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLessThanOrEqualTo(String value) {
            addCriterion("seat_del_flg <=", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLike(String value) {
            addCriterion("seat_del_flg like", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgNotLike(String value) {
            addCriterion("seat_del_flg not like", value, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgIn(List<String> values) {
            addCriterion("seat_del_flg in", values, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgNotIn(List<String> values) {
            addCriterion("seat_del_flg not in", values, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgBetween(String value1, String value2) {
            addCriterion("seat_del_flg between", value1, value2, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgNotBetween(String value1, String value2) {
            addCriterion("seat_del_flg not between", value1, value2, "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatCdateIsNull() {
            addCriterion("seat_cdate is null");
            return (Criteria) this;
        }

        public Criteria andSeatCdateIsNotNull() {
            addCriterion("seat_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCdateEqualTo(Date value) {
            addCriterionForJDBCDate("seat_cdate =", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("seat_cdate <>", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("seat_cdate >", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seat_cdate >=", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateLessThan(Date value) {
            addCriterionForJDBCDate("seat_cdate <", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seat_cdate <=", value, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCdateIn(List<Date> values) {
            addCriterionForJDBCDate("seat_cdate in", values, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("seat_cdate not in", values, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seat_cdate between", value1, value2, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seat_cdate not between", value1, value2, "seatCdate");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeIsNull() {
            addCriterion("seat_ctime is null");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeIsNotNull() {
            addCriterion("seat_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("seat_ctime =", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("seat_ctime <>", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("seat_ctime >", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("seat_ctime >=", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeLessThan(Date value) {
            addCriterionForJDBCTime("seat_ctime <", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("seat_ctime <=", value, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("seat_ctime in", values, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("seat_ctime not in", values, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("seat_ctime between", value1, value2, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("seat_ctime not between", value1, value2, "seatCtime");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampIsNull() {
            addCriterion("seat_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampIsNotNull() {
            addCriterion("seat_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampEqualTo(Date value) {
            addCriterion("seat_ctimestamp =", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampNotEqualTo(Date value) {
            addCriterion("seat_ctimestamp <>", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampGreaterThan(Date value) {
            addCriterion("seat_ctimestamp >", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("seat_ctimestamp >=", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampLessThan(Date value) {
            addCriterion("seat_ctimestamp <", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("seat_ctimestamp <=", value, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampIn(List<Date> values) {
            addCriterion("seat_ctimestamp in", values, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampNotIn(List<Date> values) {
            addCriterion("seat_ctimestamp not in", values, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampBetween(Date value1, Date value2) {
            addCriterion("seat_ctimestamp between", value1, value2, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("seat_ctimestamp not between", value1, value2, "seatCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUdateIsNull() {
            addCriterion("seat_udate is null");
            return (Criteria) this;
        }

        public Criteria andSeatUdateIsNotNull() {
            addCriterion("seat_udate is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUdateEqualTo(Date value) {
            addCriterionForJDBCDate("seat_udate =", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("seat_udate <>", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("seat_udate >", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seat_udate >=", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateLessThan(Date value) {
            addCriterionForJDBCDate("seat_udate <", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seat_udate <=", value, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUdateIn(List<Date> values) {
            addCriterionForJDBCDate("seat_udate in", values, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("seat_udate not in", values, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seat_udate between", value1, value2, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seat_udate not between", value1, value2, "seatUdate");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeIsNull() {
            addCriterion("seat_utime is null");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeIsNotNull() {
            addCriterion("seat_utime is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("seat_utime =", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("seat_utime <>", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("seat_utime >", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("seat_utime >=", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeLessThan(Date value) {
            addCriterionForJDBCTime("seat_utime <", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("seat_utime <=", value, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("seat_utime in", values, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("seat_utime not in", values, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("seat_utime between", value1, value2, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("seat_utime not between", value1, value2, "seatUtime");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampIsNull() {
            addCriterion("seat_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampIsNotNull() {
            addCriterion("seat_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampEqualTo(Date value) {
            addCriterion("seat_utimestamp =", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampNotEqualTo(Date value) {
            addCriterion("seat_utimestamp <>", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampGreaterThan(Date value) {
            addCriterion("seat_utimestamp >", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("seat_utimestamp >=", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampLessThan(Date value) {
            addCriterion("seat_utimestamp <", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("seat_utimestamp <=", value, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampIn(List<Date> values) {
            addCriterion("seat_utimestamp in", values, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampNotIn(List<Date> values) {
            addCriterion("seat_utimestamp not in", values, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampBetween(Date value1, Date value2) {
            addCriterion("seat_utimestamp between", value1, value2, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSeatUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("seat_utimestamp not between", value1, value2, "seatUtimestamp");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Long value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("version_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Long> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Long> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Long value1, Long value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Long value1, Long value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserIsNull() {
            addCriterion("seat_update_user is null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserIsNotNull() {
            addCriterion("seat_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserEqualTo(Long value) {
            addCriterion("seat_update_user =", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserNotEqualTo(Long value) {
            addCriterion("seat_update_user <>", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserGreaterThan(Long value) {
            addCriterion("seat_update_user >", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("seat_update_user >=", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserLessThan(Long value) {
            addCriterion("seat_update_user <", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("seat_update_user <=", value, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserIn(List<Long> values) {
            addCriterion("seat_update_user in", values, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserNotIn(List<Long> values) {
            addCriterion("seat_update_user not in", values, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserBetween(Long value1, Long value2) {
            addCriterion("seat_update_user between", value1, value2, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("seat_update_user not between", value1, value2, "seatUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameIsNull() {
            addCriterion("seat_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameIsNotNull() {
            addCriterion("seat_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameEqualTo(String value) {
            addCriterion("seat_update_sys_name =", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameNotEqualTo(String value) {
            addCriterion("seat_update_sys_name <>", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameGreaterThan(String value) {
            addCriterion("seat_update_sys_name >", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("seat_update_sys_name >=", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLessThan(String value) {
            addCriterion("seat_update_sys_name <", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("seat_update_sys_name <=", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLike(String value) {
            addCriterion("seat_update_sys_name like", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameNotLike(String value) {
            addCriterion("seat_update_sys_name not like", value, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameIn(List<String> values) {
            addCriterion("seat_update_sys_name in", values, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameNotIn(List<String> values) {
            addCriterion("seat_update_sys_name not in", values, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameBetween(String value1, String value2) {
            addCriterion("seat_update_sys_name between", value1, value2, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("seat_update_sys_name not between", value1, value2, "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameIsNull() {
            addCriterion("seat_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameIsNotNull() {
            addCriterion("seat_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameEqualTo(String value) {
            addCriterion("seat_update_class_name =", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameNotEqualTo(String value) {
            addCriterion("seat_update_class_name <>", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameGreaterThan(String value) {
            addCriterion("seat_update_class_name >", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("seat_update_class_name >=", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLessThan(String value) {
            addCriterion("seat_update_class_name <", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("seat_update_class_name <=", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLike(String value) {
            addCriterion("seat_update_class_name like", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameNotLike(String value) {
            addCriterion("seat_update_class_name not like", value, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameIn(List<String> values) {
            addCriterion("seat_update_class_name in", values, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameNotIn(List<String> values) {
            addCriterion("seat_update_class_name not in", values, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameBetween(String value1, String value2) {
            addCriterion("seat_update_class_name between", value1, value2, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("seat_update_class_name not between", value1, value2, "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameIsNull() {
            addCriterion("seat_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameIsNotNull() {
            addCriterion("seat_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameEqualTo(String value) {
            addCriterion("seat_update_method_name =", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameNotEqualTo(String value) {
            addCriterion("seat_update_method_name <>", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameGreaterThan(String value) {
            addCriterion("seat_update_method_name >", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("seat_update_method_name >=", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLessThan(String value) {
            addCriterion("seat_update_method_name <", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("seat_update_method_name <=", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLike(String value) {
            addCriterion("seat_update_method_name like", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameNotLike(String value) {
            addCriterion("seat_update_method_name not like", value, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameIn(List<String> values) {
            addCriterion("seat_update_method_name in", values, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameNotIn(List<String> values) {
            addCriterion("seat_update_method_name not in", values, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("seat_update_method_name between", value1, value2, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("seat_update_method_name not between", value1, value2, "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnIsNull() {
            addCriterion("seat_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnIsNotNull() {
            addCriterion("seat_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnEqualTo(String value) {
            addCriterion("seat_update_crud_kbn =", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("seat_update_crud_kbn <>", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnGreaterThan(String value) {
            addCriterion("seat_update_crud_kbn >", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("seat_update_crud_kbn >=", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLessThan(String value) {
            addCriterion("seat_update_crud_kbn <", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("seat_update_crud_kbn <=", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLike(String value) {
            addCriterion("seat_update_crud_kbn like", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnNotLike(String value) {
            addCriterion("seat_update_crud_kbn not like", value, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnIn(List<String> values) {
            addCriterion("seat_update_crud_kbn in", values, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("seat_update_crud_kbn not in", values, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("seat_update_crud_kbn between", value1, value2, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("seat_update_crud_kbn not between", value1, value2, "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksIsNull() {
            addCriterion("seat_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksIsNotNull() {
            addCriterion("seat_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksEqualTo(String value) {
            addCriterion("seat_sys_remarks =", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksNotEqualTo(String value) {
            addCriterion("seat_sys_remarks <>", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksNotEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksGreaterThan(String value) {
            addCriterion("seat_sys_remarks >", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksGreaterThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("seat_sys_remarks >=", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksGreaterThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLessThan(String value) {
            addCriterion("seat_sys_remarks <", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLessThanColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("seat_sys_remarks <=", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLessThanOrEqualToColumn(SeatMst.Column column) {
            addCriterion(new StringBuilder("seat_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLike(String value) {
            addCriterion("seat_sys_remarks like", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksNotLike(String value) {
            addCriterion("seat_sys_remarks not like", value, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksIn(List<String> values) {
            addCriterion("seat_sys_remarks in", values, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksNotIn(List<String> values) {
            addCriterion("seat_sys_remarks not in", values, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksBetween(String value1, String value2) {
            addCriterion("seat_sys_remarks between", value1, value2, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksNotBetween(String value1, String value2) {
            addCriterion("seat_sys_remarks not between", value1, value2, "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSeatNameLikeInsensitive(String value) {
            addCriterion("upper(seat_name) like", value.toUpperCase(), "seatName");
            return (Criteria) this;
        }

        public Criteria andSeatDelFlgLikeInsensitive(String value) {
            addCriterion("upper(seat_del_flg) like", value.toUpperCase(), "seatDelFlg");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(seat_update_sys_name) like", value.toUpperCase(), "seatUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(seat_update_class_name) like", value.toUpperCase(), "seatUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(seat_update_method_name) like", value.toUpperCase(), "seatUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSeatUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(seat_update_crud_kbn) like", value.toUpperCase(), "seatUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSeatSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(seat_sys_remarks) like", value.toUpperCase(), "seatSysRemarks");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SeatMstCriteria example;

        protected Criteria(SeatMstCriteria example) {
            super();
            this.example = example;
        }

        public SeatMstCriteria example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(jp.co.plussum.ebatch.domain.entity.generator.SeatMstCriteria example);
    }
}