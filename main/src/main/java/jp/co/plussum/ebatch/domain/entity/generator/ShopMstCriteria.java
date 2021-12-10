package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopMstCriteria() {
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

    public ShopMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ShopMstCriteria orderBy(String ... orderByClauses) {
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
        ShopMstCriteria example = new ShopMstCriteria();
        return example.createCriteria();
    }

    public ShopMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ShopMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andShpIdIsNull() {
            addCriterion("shp_id is null");
            return (Criteria) this;
        }

        public Criteria andShpIdIsNotNull() {
            addCriterion("shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpIdEqualTo(Long value) {
            addCriterion("shp_id =", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdNotEqualTo(Long value) {
            addCriterion("shp_id <>", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThan(Long value) {
            addCriterion("shp_id >", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_id >=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdLessThan(Long value) {
            addCriterion("shp_id <", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdLessThanOrEqualTo(Long value) {
            addCriterion("shp_id <=", value, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpIdIn(List<Long> values) {
            addCriterion("shp_id in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotIn(List<Long> values) {
            addCriterion("shp_id not in", values, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdBetween(Long value1, Long value2) {
            addCriterion("shp_id between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpIdNotBetween(Long value1, Long value2) {
            addCriterion("shp_id not between", value1, value2, "shpId");
            return (Criteria) this;
        }

        public Criteria andShpCdIsNull() {
            addCriterion("shp_cd is null");
            return (Criteria) this;
        }

        public Criteria andShpCdIsNotNull() {
            addCriterion("shp_cd is not null");
            return (Criteria) this;
        }

        public Criteria andShpCdEqualTo(String value) {
            addCriterion("shp_cd =", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdNotEqualTo(String value) {
            addCriterion("shp_cd <>", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdGreaterThan(String value) {
            addCriterion("shp_cd >", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdGreaterThanOrEqualTo(String value) {
            addCriterion("shp_cd >=", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdLessThan(String value) {
            addCriterion("shp_cd <", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdLessThanOrEqualTo(String value) {
            addCriterion("shp_cd <=", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cd <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdLike(String value) {
            addCriterion("shp_cd like", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdNotLike(String value) {
            addCriterion("shp_cd not like", value, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdIn(List<String> values) {
            addCriterion("shp_cd in", values, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdNotIn(List<String> values) {
            addCriterion("shp_cd not in", values, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdBetween(String value1, String value2) {
            addCriterion("shp_cd between", value1, value2, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpCdNotBetween(String value1, String value2) {
            addCriterion("shp_cd not between", value1, value2, "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpPassIsNull() {
            addCriterion("shp_pass is null");
            return (Criteria) this;
        }

        public Criteria andShpPassIsNotNull() {
            addCriterion("shp_pass is not null");
            return (Criteria) this;
        }

        public Criteria andShpPassEqualTo(String value) {
            addCriterion("shp_pass =", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassNotEqualTo(String value) {
            addCriterion("shp_pass <>", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassGreaterThan(String value) {
            addCriterion("shp_pass >", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassGreaterThanOrEqualTo(String value) {
            addCriterion("shp_pass >=", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassLessThan(String value) {
            addCriterion("shp_pass <", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassLessThanOrEqualTo(String value) {
            addCriterion("shp_pass <=", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pass <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPassLike(String value) {
            addCriterion("shp_pass like", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassNotLike(String value) {
            addCriterion("shp_pass not like", value, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassIn(List<String> values) {
            addCriterion("shp_pass in", values, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassNotIn(List<String> values) {
            addCriterion("shp_pass not in", values, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassBetween(String value1, String value2) {
            addCriterion("shp_pass between", value1, value2, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpPassNotBetween(String value1, String value2) {
            addCriterion("shp_pass not between", value1, value2, "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdIsNull() {
            addCriterion("shp_hdr_com_id is null");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdIsNotNull() {
            addCriterion("shp_hdr_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdEqualTo(Long value) {
            addCriterion("shp_hdr_com_id =", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdNotEqualTo(Long value) {
            addCriterion("shp_hdr_com_id <>", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdGreaterThan(Long value) {
            addCriterion("shp_hdr_com_id >", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_hdr_com_id >=", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdLessThan(Long value) {
            addCriterion("shp_hdr_com_id <", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdLessThanOrEqualTo(Long value) {
            addCriterion("shp_hdr_com_id <=", value, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_hdr_com_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdIn(List<Long> values) {
            addCriterion("shp_hdr_com_id in", values, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdNotIn(List<Long> values) {
            addCriterion("shp_hdr_com_id not in", values, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdBetween(Long value1, Long value2) {
            addCriterion("shp_hdr_com_id between", value1, value2, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpHdrComIdNotBetween(Long value1, Long value2) {
            addCriterion("shp_hdr_com_id not between", value1, value2, "shpHdrComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdIsNull() {
            addCriterion("shp_ope_com_id is null");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdIsNotNull() {
            addCriterion("shp_ope_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdEqualTo(Long value) {
            addCriterion("shp_ope_com_id =", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdNotEqualTo(Long value) {
            addCriterion("shp_ope_com_id <>", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdGreaterThan(Long value) {
            addCriterion("shp_ope_com_id >", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_ope_com_id >=", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdLessThan(Long value) {
            addCriterion("shp_ope_com_id <", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdLessThanOrEqualTo(Long value) {
            addCriterion("shp_ope_com_id <=", value, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ope_com_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdIn(List<Long> values) {
            addCriterion("shp_ope_com_id in", values, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdNotIn(List<Long> values) {
            addCriterion("shp_ope_com_id not in", values, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdBetween(Long value1, Long value2) {
            addCriterion("shp_ope_com_id between", value1, value2, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpOpeComIdNotBetween(Long value1, Long value2) {
            addCriterion("shp_ope_com_id not between", value1, value2, "shpOpeComId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdIsNull() {
            addCriterion("shp_grp_id is null");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdIsNotNull() {
            addCriterion("shp_grp_id is not null");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdEqualTo(Long value) {
            addCriterion("shp_grp_id =", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdNotEqualTo(Long value) {
            addCriterion("shp_grp_id <>", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdGreaterThan(Long value) {
            addCriterion("shp_grp_id >", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_grp_id >=", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdLessThan(Long value) {
            addCriterion("shp_grp_id <", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdLessThanOrEqualTo(Long value) {
            addCriterion("shp_grp_id <=", value, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_grp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpGrpIdIn(List<Long> values) {
            addCriterion("shp_grp_id in", values, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdNotIn(List<Long> values) {
            addCriterion("shp_grp_id not in", values, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdBetween(Long value1, Long value2) {
            addCriterion("shp_grp_id between", value1, value2, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpGrpIdNotBetween(Long value1, Long value2) {
            addCriterion("shp_grp_id not between", value1, value2, "shpGrpId");
            return (Criteria) this;
        }

        public Criteria andShpNameIsNull() {
            addCriterion("shp_name is null");
            return (Criteria) this;
        }

        public Criteria andShpNameIsNotNull() {
            addCriterion("shp_name is not null");
            return (Criteria) this;
        }

        public Criteria andShpNameEqualTo(String value) {
            addCriterion("shp_name =", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameNotEqualTo(String value) {
            addCriterion("shp_name <>", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameGreaterThan(String value) {
            addCriterion("shp_name >", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameGreaterThanOrEqualTo(String value) {
            addCriterion("shp_name >=", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameLessThan(String value) {
            addCriterion("shp_name <", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameLessThanOrEqualTo(String value) {
            addCriterion("shp_name <=", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameLike(String value) {
            addCriterion("shp_name like", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameNotLike(String value) {
            addCriterion("shp_name not like", value, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameIn(List<String> values) {
            addCriterion("shp_name in", values, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameNotIn(List<String> values) {
            addCriterion("shp_name not in", values, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameBetween(String value1, String value2) {
            addCriterion("shp_name between", value1, value2, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameNotBetween(String value1, String value2) {
            addCriterion("shp_name not between", value1, value2, "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameKnIsNull() {
            addCriterion("shp_name_kn is null");
            return (Criteria) this;
        }

        public Criteria andShpNameKnIsNotNull() {
            addCriterion("shp_name_kn is not null");
            return (Criteria) this;
        }

        public Criteria andShpNameKnEqualTo(String value) {
            addCriterion("shp_name_kn =", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnNotEqualTo(String value) {
            addCriterion("shp_name_kn <>", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnGreaterThan(String value) {
            addCriterion("shp_name_kn >", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnGreaterThanOrEqualTo(String value) {
            addCriterion("shp_name_kn >=", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnLessThan(String value) {
            addCriterion("shp_name_kn <", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnLessThanOrEqualTo(String value) {
            addCriterion("shp_name_kn <=", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_name_kn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpNameKnLike(String value) {
            addCriterion("shp_name_kn like", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnNotLike(String value) {
            addCriterion("shp_name_kn not like", value, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnIn(List<String> values) {
            addCriterion("shp_name_kn in", values, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnNotIn(List<String> values) {
            addCriterion("shp_name_kn not in", values, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnBetween(String value1, String value2) {
            addCriterion("shp_name_kn between", value1, value2, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpNameKnNotBetween(String value1, String value2) {
            addCriterion("shp_name_kn not between", value1, value2, "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpZipCdIsNull() {
            addCriterion("shp_zip_cd is null");
            return (Criteria) this;
        }

        public Criteria andShpZipCdIsNotNull() {
            addCriterion("shp_zip_cd is not null");
            return (Criteria) this;
        }

        public Criteria andShpZipCdEqualTo(String value) {
            addCriterion("shp_zip_cd =", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdNotEqualTo(String value) {
            addCriterion("shp_zip_cd <>", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdGreaterThan(String value) {
            addCriterion("shp_zip_cd >", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdGreaterThanOrEqualTo(String value) {
            addCriterion("shp_zip_cd >=", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdLessThan(String value) {
            addCriterion("shp_zip_cd <", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdLessThanOrEqualTo(String value) {
            addCriterion("shp_zip_cd <=", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_zip_cd <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpZipCdLike(String value) {
            addCriterion("shp_zip_cd like", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdNotLike(String value) {
            addCriterion("shp_zip_cd not like", value, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdIn(List<String> values) {
            addCriterion("shp_zip_cd in", values, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdNotIn(List<String> values) {
            addCriterion("shp_zip_cd not in", values, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdBetween(String value1, String value2) {
            addCriterion("shp_zip_cd between", value1, value2, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpZipCdNotBetween(String value1, String value2) {
            addCriterion("shp_zip_cd not between", value1, value2, "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpAddr01IsNull() {
            addCriterion("shp_addr01 is null");
            return (Criteria) this;
        }

        public Criteria andShpAddr01IsNotNull() {
            addCriterion("shp_addr01 is not null");
            return (Criteria) this;
        }

        public Criteria andShpAddr01EqualTo(String value) {
            addCriterion("shp_addr01 =", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01NotEqualTo(String value) {
            addCriterion("shp_addr01 <>", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01GreaterThan(String value) {
            addCriterion("shp_addr01 >", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01GreaterThanOrEqualTo(String value) {
            addCriterion("shp_addr01 >=", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01LessThan(String value) {
            addCriterion("shp_addr01 <", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01LessThanOrEqualTo(String value) {
            addCriterion("shp_addr01 <=", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr01Like(String value) {
            addCriterion("shp_addr01 like", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01NotLike(String value) {
            addCriterion("shp_addr01 not like", value, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01In(List<String> values) {
            addCriterion("shp_addr01 in", values, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01NotIn(List<String> values) {
            addCriterion("shp_addr01 not in", values, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01Between(String value1, String value2) {
            addCriterion("shp_addr01 between", value1, value2, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr01NotBetween(String value1, String value2) {
            addCriterion("shp_addr01 not between", value1, value2, "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr02IsNull() {
            addCriterion("shp_addr02 is null");
            return (Criteria) this;
        }

        public Criteria andShpAddr02IsNotNull() {
            addCriterion("shp_addr02 is not null");
            return (Criteria) this;
        }

        public Criteria andShpAddr02EqualTo(String value) {
            addCriterion("shp_addr02 =", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02NotEqualTo(String value) {
            addCriterion("shp_addr02 <>", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02GreaterThan(String value) {
            addCriterion("shp_addr02 >", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02GreaterThanOrEqualTo(String value) {
            addCriterion("shp_addr02 >=", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02LessThan(String value) {
            addCriterion("shp_addr02 <", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02LessThanOrEqualTo(String value) {
            addCriterion("shp_addr02 <=", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr02Like(String value) {
            addCriterion("shp_addr02 like", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02NotLike(String value) {
            addCriterion("shp_addr02 not like", value, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02In(List<String> values) {
            addCriterion("shp_addr02 in", values, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02NotIn(List<String> values) {
            addCriterion("shp_addr02 not in", values, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02Between(String value1, String value2) {
            addCriterion("shp_addr02 between", value1, value2, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr02NotBetween(String value1, String value2) {
            addCriterion("shp_addr02 not between", value1, value2, "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr03IsNull() {
            addCriterion("shp_addr03 is null");
            return (Criteria) this;
        }

        public Criteria andShpAddr03IsNotNull() {
            addCriterion("shp_addr03 is not null");
            return (Criteria) this;
        }

        public Criteria andShpAddr03EqualTo(String value) {
            addCriterion("shp_addr03 =", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03NotEqualTo(String value) {
            addCriterion("shp_addr03 <>", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03GreaterThan(String value) {
            addCriterion("shp_addr03 >", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03GreaterThanOrEqualTo(String value) {
            addCriterion("shp_addr03 >=", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03LessThan(String value) {
            addCriterion("shp_addr03 <", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03LessThanOrEqualTo(String value) {
            addCriterion("shp_addr03 <=", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr03Like(String value) {
            addCriterion("shp_addr03 like", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03NotLike(String value) {
            addCriterion("shp_addr03 not like", value, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03In(List<String> values) {
            addCriterion("shp_addr03 in", values, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03NotIn(List<String> values) {
            addCriterion("shp_addr03 not in", values, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03Between(String value1, String value2) {
            addCriterion("shp_addr03 between", value1, value2, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr03NotBetween(String value1, String value2) {
            addCriterion("shp_addr03 not between", value1, value2, "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr04IsNull() {
            addCriterion("shp_addr04 is null");
            return (Criteria) this;
        }

        public Criteria andShpAddr04IsNotNull() {
            addCriterion("shp_addr04 is not null");
            return (Criteria) this;
        }

        public Criteria andShpAddr04EqualTo(String value) {
            addCriterion("shp_addr04 =", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04NotEqualTo(String value) {
            addCriterion("shp_addr04 <>", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04GreaterThan(String value) {
            addCriterion("shp_addr04 >", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04GreaterThanOrEqualTo(String value) {
            addCriterion("shp_addr04 >=", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04LessThan(String value) {
            addCriterion("shp_addr04 <", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04LessThanOrEqualTo(String value) {
            addCriterion("shp_addr04 <=", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_addr04 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAddr04Like(String value) {
            addCriterion("shp_addr04 like", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04NotLike(String value) {
            addCriterion("shp_addr04 not like", value, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04In(List<String> values) {
            addCriterion("shp_addr04 in", values, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04NotIn(List<String> values) {
            addCriterion("shp_addr04 not in", values, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04Between(String value1, String value2) {
            addCriterion("shp_addr04 between", value1, value2, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpAddr04NotBetween(String value1, String value2) {
            addCriterion("shp_addr04 not between", value1, value2, "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpTel01IsNull() {
            addCriterion("shp_tel_01 is null");
            return (Criteria) this;
        }

        public Criteria andShpTel01IsNotNull() {
            addCriterion("shp_tel_01 is not null");
            return (Criteria) this;
        }

        public Criteria andShpTel01EqualTo(String value) {
            addCriterion("shp_tel_01 =", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01NotEqualTo(String value) {
            addCriterion("shp_tel_01 <>", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01GreaterThan(String value) {
            addCriterion("shp_tel_01 >", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01GreaterThanOrEqualTo(String value) {
            addCriterion("shp_tel_01 >=", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01LessThan(String value) {
            addCriterion("shp_tel_01 <", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01LessThanOrEqualTo(String value) {
            addCriterion("shp_tel_01 <=", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel01Like(String value) {
            addCriterion("shp_tel_01 like", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01NotLike(String value) {
            addCriterion("shp_tel_01 not like", value, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01In(List<String> values) {
            addCriterion("shp_tel_01 in", values, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01NotIn(List<String> values) {
            addCriterion("shp_tel_01 not in", values, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01Between(String value1, String value2) {
            addCriterion("shp_tel_01 between", value1, value2, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel01NotBetween(String value1, String value2) {
            addCriterion("shp_tel_01 not between", value1, value2, "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel02IsNull() {
            addCriterion("shp_tel_02 is null");
            return (Criteria) this;
        }

        public Criteria andShpTel02IsNotNull() {
            addCriterion("shp_tel_02 is not null");
            return (Criteria) this;
        }

        public Criteria andShpTel02EqualTo(String value) {
            addCriterion("shp_tel_02 =", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02NotEqualTo(String value) {
            addCriterion("shp_tel_02 <>", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02GreaterThan(String value) {
            addCriterion("shp_tel_02 >", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02GreaterThanOrEqualTo(String value) {
            addCriterion("shp_tel_02 >=", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02LessThan(String value) {
            addCriterion("shp_tel_02 <", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02LessThanOrEqualTo(String value) {
            addCriterion("shp_tel_02 <=", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel02Like(String value) {
            addCriterion("shp_tel_02 like", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02NotLike(String value) {
            addCriterion("shp_tel_02 not like", value, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02In(List<String> values) {
            addCriterion("shp_tel_02 in", values, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02NotIn(List<String> values) {
            addCriterion("shp_tel_02 not in", values, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02Between(String value1, String value2) {
            addCriterion("shp_tel_02 between", value1, value2, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel02NotBetween(String value1, String value2) {
            addCriterion("shp_tel_02 not between", value1, value2, "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel03IsNull() {
            addCriterion("shp_tel_03 is null");
            return (Criteria) this;
        }

        public Criteria andShpTel03IsNotNull() {
            addCriterion("shp_tel_03 is not null");
            return (Criteria) this;
        }

        public Criteria andShpTel03EqualTo(String value) {
            addCriterion("shp_tel_03 =", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03NotEqualTo(String value) {
            addCriterion("shp_tel_03 <>", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03GreaterThan(String value) {
            addCriterion("shp_tel_03 >", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03GreaterThanOrEqualTo(String value) {
            addCriterion("shp_tel_03 >=", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03LessThan(String value) {
            addCriterion("shp_tel_03 <", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03LessThanOrEqualTo(String value) {
            addCriterion("shp_tel_03 <=", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_tel_03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpTel03Like(String value) {
            addCriterion("shp_tel_03 like", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03NotLike(String value) {
            addCriterion("shp_tel_03 not like", value, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03In(List<String> values) {
            addCriterion("shp_tel_03 in", values, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03NotIn(List<String> values) {
            addCriterion("shp_tel_03 not in", values, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03Between(String value1, String value2) {
            addCriterion("shp_tel_03 between", value1, value2, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpTel03NotBetween(String value1, String value2) {
            addCriterion("shp_tel_03 not between", value1, value2, "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpFax01IsNull() {
            addCriterion("shp_fax_01 is null");
            return (Criteria) this;
        }

        public Criteria andShpFax01IsNotNull() {
            addCriterion("shp_fax_01 is not null");
            return (Criteria) this;
        }

        public Criteria andShpFax01EqualTo(String value) {
            addCriterion("shp_fax_01 =", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01NotEqualTo(String value) {
            addCriterion("shp_fax_01 <>", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01GreaterThan(String value) {
            addCriterion("shp_fax_01 >", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01GreaterThanOrEqualTo(String value) {
            addCriterion("shp_fax_01 >=", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01LessThan(String value) {
            addCriterion("shp_fax_01 <", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01LessThanOrEqualTo(String value) {
            addCriterion("shp_fax_01 <=", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax01Like(String value) {
            addCriterion("shp_fax_01 like", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01NotLike(String value) {
            addCriterion("shp_fax_01 not like", value, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01In(List<String> values) {
            addCriterion("shp_fax_01 in", values, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01NotIn(List<String> values) {
            addCriterion("shp_fax_01 not in", values, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01Between(String value1, String value2) {
            addCriterion("shp_fax_01 between", value1, value2, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax01NotBetween(String value1, String value2) {
            addCriterion("shp_fax_01 not between", value1, value2, "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax02IsNull() {
            addCriterion("shp_fax_02 is null");
            return (Criteria) this;
        }

        public Criteria andShpFax02IsNotNull() {
            addCriterion("shp_fax_02 is not null");
            return (Criteria) this;
        }

        public Criteria andShpFax02EqualTo(String value) {
            addCriterion("shp_fax_02 =", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02NotEqualTo(String value) {
            addCriterion("shp_fax_02 <>", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02GreaterThan(String value) {
            addCriterion("shp_fax_02 >", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02GreaterThanOrEqualTo(String value) {
            addCriterion("shp_fax_02 >=", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02LessThan(String value) {
            addCriterion("shp_fax_02 <", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02LessThanOrEqualTo(String value) {
            addCriterion("shp_fax_02 <=", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax02Like(String value) {
            addCriterion("shp_fax_02 like", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02NotLike(String value) {
            addCriterion("shp_fax_02 not like", value, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02In(List<String> values) {
            addCriterion("shp_fax_02 in", values, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02NotIn(List<String> values) {
            addCriterion("shp_fax_02 not in", values, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02Between(String value1, String value2) {
            addCriterion("shp_fax_02 between", value1, value2, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax02NotBetween(String value1, String value2) {
            addCriterion("shp_fax_02 not between", value1, value2, "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax03IsNull() {
            addCriterion("shp_fax_03 is null");
            return (Criteria) this;
        }

        public Criteria andShpFax03IsNotNull() {
            addCriterion("shp_fax_03 is not null");
            return (Criteria) this;
        }

        public Criteria andShpFax03EqualTo(String value) {
            addCriterion("shp_fax_03 =", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03EqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03NotEqualTo(String value) {
            addCriterion("shp_fax_03 <>", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03NotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03GreaterThan(String value) {
            addCriterion("shp_fax_03 >", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03GreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03GreaterThanOrEqualTo(String value) {
            addCriterion("shp_fax_03 >=", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03GreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03LessThan(String value) {
            addCriterion("shp_fax_03 <", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03LessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03LessThanOrEqualTo(String value) {
            addCriterion("shp_fax_03 <=", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03LessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_fax_03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpFax03Like(String value) {
            addCriterion("shp_fax_03 like", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03NotLike(String value) {
            addCriterion("shp_fax_03 not like", value, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03In(List<String> values) {
            addCriterion("shp_fax_03 in", values, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03NotIn(List<String> values) {
            addCriterion("shp_fax_03 not in", values, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03Between(String value1, String value2) {
            addCriterion("shp_fax_03 between", value1, value2, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpFax03NotBetween(String value1, String value2) {
            addCriterion("shp_fax_03 not between", value1, value2, "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpRemarksIsNull() {
            addCriterion("shp_remarks is null");
            return (Criteria) this;
        }

        public Criteria andShpRemarksIsNotNull() {
            addCriterion("shp_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andShpRemarksEqualTo(String value) {
            addCriterion("shp_remarks =", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksNotEqualTo(String value) {
            addCriterion("shp_remarks <>", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksGreaterThan(String value) {
            addCriterion("shp_remarks >", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("shp_remarks >=", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksLessThan(String value) {
            addCriterion("shp_remarks <", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksLessThanOrEqualTo(String value) {
            addCriterion("shp_remarks <=", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRemarksLike(String value) {
            addCriterion("shp_remarks like", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksNotLike(String value) {
            addCriterion("shp_remarks not like", value, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksIn(List<String> values) {
            addCriterion("shp_remarks in", values, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksNotIn(List<String> values) {
            addCriterion("shp_remarks not in", values, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksBetween(String value1, String value2) {
            addCriterion("shp_remarks between", value1, value2, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpRemarksNotBetween(String value1, String value2) {
            addCriterion("shp_remarks not between", value1, value2, "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrIsNull() {
            addCriterion("shp_avl_date_fr is null");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrIsNotNull() {
            addCriterion("shp_avl_date_fr is not null");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr =", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrNotEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr <>", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrGreaterThan(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr >", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr >=", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrLessThan(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr <", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_fr <=", value, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_fr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrIn(List<Date> values) {
            addCriterionForJDBCDate("shp_avl_date_fr in", values, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrNotIn(List<Date> values) {
            addCriterionForJDBCDate("shp_avl_date_fr not in", values, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_avl_date_fr between", value1, value2, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateFrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_avl_date_fr not between", value1, value2, "shpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToIsNull() {
            addCriterion("shp_avl_date_to is null");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToIsNotNull() {
            addCriterion("shp_avl_date_to is not null");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to =", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToNotEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to <>", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToGreaterThan(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to >", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to >=", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToLessThan(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to <", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_avl_date_to <=", value, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_avl_date_to <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToIn(List<Date> values) {
            addCriterionForJDBCDate("shp_avl_date_to in", values, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToNotIn(List<Date> values) {
            addCriterionForJDBCDate("shp_avl_date_to not in", values, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_avl_date_to between", value1, value2, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpAvlDateToNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_avl_date_to not between", value1, value2, "shpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgIsNull() {
            addCriterion("shp_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgIsNotNull() {
            addCriterion("shp_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgEqualTo(String value) {
            addCriterion("shp_del_flg =", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgNotEqualTo(String value) {
            addCriterion("shp_del_flg <>", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgGreaterThan(String value) {
            addCriterion("shp_del_flg >", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("shp_del_flg >=", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLessThan(String value) {
            addCriterion("shp_del_flg <", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLessThanOrEqualTo(String value) {
            addCriterion("shp_del_flg <=", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLike(String value) {
            addCriterion("shp_del_flg like", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgNotLike(String value) {
            addCriterion("shp_del_flg not like", value, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgIn(List<String> values) {
            addCriterion("shp_del_flg in", values, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgNotIn(List<String> values) {
            addCriterion("shp_del_flg not in", values, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgBetween(String value1, String value2) {
            addCriterion("shp_del_flg between", value1, value2, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgNotBetween(String value1, String value2) {
            addCriterion("shp_del_flg not between", value1, value2, "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpCdateIsNull() {
            addCriterion("shp_cdate is null");
            return (Criteria) this;
        }

        public Criteria andShpCdateIsNotNull() {
            addCriterion("shp_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andShpCdateEqualTo(Date value) {
            addCriterionForJDBCDate("shp_cdate =", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shp_cdate <>", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("shp_cdate >", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_cdate >=", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateLessThan(Date value) {
            addCriterionForJDBCDate("shp_cdate <", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_cdate <=", value, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCdateIn(List<Date> values) {
            addCriterionForJDBCDate("shp_cdate in", values, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shp_cdate not in", values, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_cdate between", value1, value2, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_cdate not between", value1, value2, "shpCdate");
            return (Criteria) this;
        }

        public Criteria andShpCtimeIsNull() {
            addCriterion("shp_ctime is null");
            return (Criteria) this;
        }

        public Criteria andShpCtimeIsNotNull() {
            addCriterion("shp_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andShpCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("shp_ctime =", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("shp_ctime <>", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("shp_ctime >", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shp_ctime >=", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeLessThan(Date value) {
            addCriterionForJDBCTime("shp_ctime <", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shp_ctime <=", value, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("shp_ctime in", values, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("shp_ctime not in", values, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shp_ctime between", value1, value2, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shp_ctime not between", value1, value2, "shpCtime");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampIsNull() {
            addCriterion("shp_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampIsNotNull() {
            addCriterion("shp_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampEqualTo(Date value) {
            addCriterion("shp_ctimestamp =", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampNotEqualTo(Date value) {
            addCriterion("shp_ctimestamp <>", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampGreaterThan(Date value) {
            addCriterion("shp_ctimestamp >", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("shp_ctimestamp >=", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampLessThan(Date value) {
            addCriterion("shp_ctimestamp <", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("shp_ctimestamp <=", value, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpCtimestampIn(List<Date> values) {
            addCriterion("shp_ctimestamp in", values, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampNotIn(List<Date> values) {
            addCriterion("shp_ctimestamp not in", values, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampBetween(Date value1, Date value2) {
            addCriterion("shp_ctimestamp between", value1, value2, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("shp_ctimestamp not between", value1, value2, "shpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUdateIsNull() {
            addCriterion("shp_udate is null");
            return (Criteria) this;
        }

        public Criteria andShpUdateIsNotNull() {
            addCriterion("shp_udate is not null");
            return (Criteria) this;
        }

        public Criteria andShpUdateEqualTo(Date value) {
            addCriterionForJDBCDate("shp_udate =", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shp_udate <>", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("shp_udate >", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_udate >=", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateLessThan(Date value) {
            addCriterionForJDBCDate("shp_udate <", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_udate <=", value, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUdateIn(List<Date> values) {
            addCriterionForJDBCDate("shp_udate in", values, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shp_udate not in", values, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_udate between", value1, value2, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_udate not between", value1, value2, "shpUdate");
            return (Criteria) this;
        }

        public Criteria andShpUtimeIsNull() {
            addCriterion("shp_utime is null");
            return (Criteria) this;
        }

        public Criteria andShpUtimeIsNotNull() {
            addCriterion("shp_utime is not null");
            return (Criteria) this;
        }

        public Criteria andShpUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("shp_utime =", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("shp_utime <>", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("shp_utime >", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shp_utime >=", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeLessThan(Date value) {
            addCriterionForJDBCTime("shp_utime <", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("shp_utime <=", value, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("shp_utime in", values, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("shp_utime not in", values, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shp_utime between", value1, value2, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("shp_utime not between", value1, value2, "shpUtime");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampIsNull() {
            addCriterion("shp_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampIsNotNull() {
            addCriterion("shp_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampEqualTo(Date value) {
            addCriterion("shp_utimestamp =", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampNotEqualTo(Date value) {
            addCriterion("shp_utimestamp <>", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampGreaterThan(Date value) {
            addCriterion("shp_utimestamp >", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("shp_utimestamp >=", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampLessThan(Date value) {
            addCriterion("shp_utimestamp <", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("shp_utimestamp <=", value, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUtimestampIn(List<Date> values) {
            addCriterion("shp_utimestamp in", values, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampNotIn(List<Date> values) {
            addCriterion("shp_utimestamp not in", values, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampBetween(Date value1, Date value2) {
            addCriterion("shp_utimestamp between", value1, value2, "shpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andShpUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("shp_utimestamp not between", value1, value2, "shpUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(ShopMst.Column column) {
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

        public Criteria andShpUpdateUserIsNull() {
            addCriterion("shp_update_user is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserIsNotNull() {
            addCriterion("shp_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserEqualTo(Long value) {
            addCriterion("shp_update_user =", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserNotEqualTo(Long value) {
            addCriterion("shp_update_user <>", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserGreaterThan(Long value) {
            addCriterion("shp_update_user >", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_update_user >=", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserLessThan(Long value) {
            addCriterion("shp_update_user <", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("shp_update_user <=", value, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserIn(List<Long> values) {
            addCriterion("shp_update_user in", values, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserNotIn(List<Long> values) {
            addCriterion("shp_update_user not in", values, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserBetween(Long value1, Long value2) {
            addCriterion("shp_update_user between", value1, value2, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("shp_update_user not between", value1, value2, "shpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameIsNull() {
            addCriterion("shp_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameIsNotNull() {
            addCriterion("shp_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameEqualTo(String value) {
            addCriterion("shp_update_sys_name =", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameNotEqualTo(String value) {
            addCriterion("shp_update_sys_name <>", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameGreaterThan(String value) {
            addCriterion("shp_update_sys_name >", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("shp_update_sys_name >=", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLessThan(String value) {
            addCriterion("shp_update_sys_name <", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("shp_update_sys_name <=", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLike(String value) {
            addCriterion("shp_update_sys_name like", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameNotLike(String value) {
            addCriterion("shp_update_sys_name not like", value, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameIn(List<String> values) {
            addCriterion("shp_update_sys_name in", values, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameNotIn(List<String> values) {
            addCriterion("shp_update_sys_name not in", values, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameBetween(String value1, String value2) {
            addCriterion("shp_update_sys_name between", value1, value2, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("shp_update_sys_name not between", value1, value2, "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameIsNull() {
            addCriterion("shp_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameIsNotNull() {
            addCriterion("shp_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameEqualTo(String value) {
            addCriterion("shp_update_class_name =", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameNotEqualTo(String value) {
            addCriterion("shp_update_class_name <>", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameGreaterThan(String value) {
            addCriterion("shp_update_class_name >", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("shp_update_class_name >=", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLessThan(String value) {
            addCriterion("shp_update_class_name <", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("shp_update_class_name <=", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLike(String value) {
            addCriterion("shp_update_class_name like", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameNotLike(String value) {
            addCriterion("shp_update_class_name not like", value, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameIn(List<String> values) {
            addCriterion("shp_update_class_name in", values, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameNotIn(List<String> values) {
            addCriterion("shp_update_class_name not in", values, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameBetween(String value1, String value2) {
            addCriterion("shp_update_class_name between", value1, value2, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("shp_update_class_name not between", value1, value2, "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameIsNull() {
            addCriterion("shp_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameIsNotNull() {
            addCriterion("shp_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameEqualTo(String value) {
            addCriterion("shp_update_method_name =", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameNotEqualTo(String value) {
            addCriterion("shp_update_method_name <>", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameGreaterThan(String value) {
            addCriterion("shp_update_method_name >", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("shp_update_method_name >=", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLessThan(String value) {
            addCriterion("shp_update_method_name <", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("shp_update_method_name <=", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLike(String value) {
            addCriterion("shp_update_method_name like", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameNotLike(String value) {
            addCriterion("shp_update_method_name not like", value, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameIn(List<String> values) {
            addCriterion("shp_update_method_name in", values, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameNotIn(List<String> values) {
            addCriterion("shp_update_method_name not in", values, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("shp_update_method_name between", value1, value2, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("shp_update_method_name not between", value1, value2, "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnIsNull() {
            addCriterion("shp_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnIsNotNull() {
            addCriterion("shp_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnEqualTo(String value) {
            addCriterion("shp_update_crud_kbn =", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("shp_update_crud_kbn <>", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnGreaterThan(String value) {
            addCriterion("shp_update_crud_kbn >", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("shp_update_crud_kbn >=", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLessThan(String value) {
            addCriterion("shp_update_crud_kbn <", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("shp_update_crud_kbn <=", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLike(String value) {
            addCriterion("shp_update_crud_kbn like", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnNotLike(String value) {
            addCriterion("shp_update_crud_kbn not like", value, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnIn(List<String> values) {
            addCriterion("shp_update_crud_kbn in", values, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("shp_update_crud_kbn not in", values, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("shp_update_crud_kbn between", value1, value2, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("shp_update_crud_kbn not between", value1, value2, "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksIsNull() {
            addCriterion("shp_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksIsNotNull() {
            addCriterion("shp_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksEqualTo(String value) {
            addCriterion("shp_sys_remarks =", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksNotEqualTo(String value) {
            addCriterion("shp_sys_remarks <>", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksGreaterThan(String value) {
            addCriterion("shp_sys_remarks >", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("shp_sys_remarks >=", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLessThan(String value) {
            addCriterion("shp_sys_remarks <", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("shp_sys_remarks <=", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLike(String value) {
            addCriterion("shp_sys_remarks like", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksNotLike(String value) {
            addCriterion("shp_sys_remarks not like", value, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksIn(List<String> values) {
            addCriterion("shp_sys_remarks in", values, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksNotIn(List<String> values) {
            addCriterion("shp_sys_remarks not in", values, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksBetween(String value1, String value2) {
            addCriterion("shp_sys_remarks between", value1, value2, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksNotBetween(String value1, String value2) {
            addCriterion("shp_sys_remarks not between", value1, value2, "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdIsNull() {
            addCriterion("shp_prf_cd is null");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdIsNotNull() {
            addCriterion("shp_prf_cd is not null");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdEqualTo(String value) {
            addCriterion("shp_prf_cd =", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdNotEqualTo(String value) {
            addCriterion("shp_prf_cd <>", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdGreaterThan(String value) {
            addCriterion("shp_prf_cd >", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdGreaterThanOrEqualTo(String value) {
            addCriterion("shp_prf_cd >=", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLessThan(String value) {
            addCriterion("shp_prf_cd <", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLessThanOrEqualTo(String value) {
            addCriterion("shp_prf_cd <=", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_prf_cd <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLike(String value) {
            addCriterion("shp_prf_cd like", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdNotLike(String value) {
            addCriterion("shp_prf_cd not like", value, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdIn(List<String> values) {
            addCriterion("shp_prf_cd in", values, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdNotIn(List<String> values) {
            addCriterion("shp_prf_cd not in", values, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdBetween(String value1, String value2) {
            addCriterion("shp_prf_cd between", value1, value2, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdNotBetween(String value1, String value2) {
            addCriterion("shp_prf_cd not between", value1, value2, "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrIsNull() {
            addCriterion("shp_pc_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrIsNotNull() {
            addCriterion("shp_pc_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrEqualTo(String value) {
            addCriterion("shp_pc_ml_addr =", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrNotEqualTo(String value) {
            addCriterion("shp_pc_ml_addr <>", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrGreaterThan(String value) {
            addCriterion("shp_pc_ml_addr >", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("shp_pc_ml_addr >=", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLessThan(String value) {
            addCriterion("shp_pc_ml_addr <", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLessThanOrEqualTo(String value) {
            addCriterion("shp_pc_ml_addr <=", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_pc_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLike(String value) {
            addCriterion("shp_pc_ml_addr like", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrNotLike(String value) {
            addCriterion("shp_pc_ml_addr not like", value, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrIn(List<String> values) {
            addCriterion("shp_pc_ml_addr in", values, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrNotIn(List<String> values) {
            addCriterion("shp_pc_ml_addr not in", values, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrBetween(String value1, String value2) {
            addCriterion("shp_pc_ml_addr between", value1, value2, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrNotBetween(String value1, String value2) {
            addCriterion("shp_pc_ml_addr not between", value1, value2, "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrIsNull() {
            addCriterion("shp_mbl_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrIsNotNull() {
            addCriterion("shp_mbl_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrEqualTo(String value) {
            addCriterion("shp_mbl_ml_addr =", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrNotEqualTo(String value) {
            addCriterion("shp_mbl_ml_addr <>", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrGreaterThan(String value) {
            addCriterion("shp_mbl_ml_addr >", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("shp_mbl_ml_addr >=", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLessThan(String value) {
            addCriterion("shp_mbl_ml_addr <", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLessThanOrEqualTo(String value) {
            addCriterion("shp_mbl_ml_addr <=", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_mbl_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLike(String value) {
            addCriterion("shp_mbl_ml_addr like", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrNotLike(String value) {
            addCriterion("shp_mbl_ml_addr not like", value, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrIn(List<String> values) {
            addCriterion("shp_mbl_ml_addr in", values, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrNotIn(List<String> values) {
            addCriterion("shp_mbl_ml_addr not in", values, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrBetween(String value1, String value2) {
            addCriterion("shp_mbl_ml_addr between", value1, value2, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrNotBetween(String value1, String value2) {
            addCriterion("shp_mbl_ml_addr not between", value1, value2, "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminIsNull() {
            addCriterion("shp_update_admin is null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminIsNotNull() {
            addCriterion("shp_update_admin is not null");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminEqualTo(Long value) {
            addCriterion("shp_update_admin =", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminNotEqualTo(Long value) {
            addCriterion("shp_update_admin <>", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminGreaterThan(Long value) {
            addCriterion("shp_update_admin >", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminGreaterThanOrEqualTo(Long value) {
            addCriterion("shp_update_admin >=", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminLessThan(Long value) {
            addCriterion("shp_update_admin <", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminLessThanOrEqualTo(Long value) {
            addCriterion("shp_update_admin <=", value, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_update_admin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminIn(List<Long> values) {
            addCriterion("shp_update_admin in", values, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminNotIn(List<Long> values) {
            addCriterion("shp_update_admin not in", values, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminBetween(Long value1, Long value2) {
            addCriterion("shp_update_admin between", value1, value2, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpUpdateAdminNotBetween(Long value1, Long value2) {
            addCriterion("shp_update_admin not between", value1, value2, "shpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrIsNull() {
            addCriterion("shp_rpt_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrIsNotNull() {
            addCriterion("shp_rpt_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrEqualTo(String value) {
            addCriterion("shp_rpt_ml_addr =", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrNotEqualTo(String value) {
            addCriterion("shp_rpt_ml_addr <>", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrGreaterThan(String value) {
            addCriterion("shp_rpt_ml_addr >", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("shp_rpt_ml_addr >=", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLessThan(String value) {
            addCriterion("shp_rpt_ml_addr <", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLessThanOrEqualTo(String value) {
            addCriterion("shp_rpt_ml_addr <=", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_rpt_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLike(String value) {
            addCriterion("shp_rpt_ml_addr like", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrNotLike(String value) {
            addCriterion("shp_rpt_ml_addr not like", value, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrIn(List<String> values) {
            addCriterion("shp_rpt_ml_addr in", values, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrNotIn(List<String> values) {
            addCriterion("shp_rpt_ml_addr not in", values, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrBetween(String value1, String value2) {
            addCriterion("shp_rpt_ml_addr between", value1, value2, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrNotBetween(String value1, String value2) {
            addCriterion("shp_rpt_ml_addr not between", value1, value2, "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateIsNull() {
            addCriterion("shp_install_date is null");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateIsNotNull() {
            addCriterion("shp_install_date is not null");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateEqualTo(Date value) {
            addCriterionForJDBCDate("shp_install_date =", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shp_install_date <>", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateGreaterThan(Date value) {
            addCriterionForJDBCDate("shp_install_date >", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_install_date >=", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateLessThan(Date value) {
            addCriterionForJDBCDate("shp_install_date <", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shp_install_date <=", value, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_install_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpInstallDateIn(List<Date> values) {
            addCriterionForJDBCDate("shp_install_date in", values, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shp_install_date not in", values, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_install_date between", value1, value2, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpInstallDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shp_install_date not between", value1, value2, "shpInstallDate");
            return (Criteria) this;
        }

        public Criteria andShpComNoIsNull() {
            addCriterion("shp_com_no is null");
            return (Criteria) this;
        }

        public Criteria andShpComNoIsNotNull() {
            addCriterion("shp_com_no is not null");
            return (Criteria) this;
        }

        public Criteria andShpComNoEqualTo(String value) {
            addCriterion("shp_com_no =", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoNotEqualTo(String value) {
            addCriterion("shp_com_no <>", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoGreaterThan(String value) {
            addCriterion("shp_com_no >", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoGreaterThanOrEqualTo(String value) {
            addCriterion("shp_com_no >=", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoLessThan(String value) {
            addCriterion("shp_com_no <", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoLessThanOrEqualTo(String value) {
            addCriterion("shp_com_no <=", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNoLike(String value) {
            addCriterion("shp_com_no like", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoNotLike(String value) {
            addCriterion("shp_com_no not like", value, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoIn(List<String> values) {
            addCriterion("shp_com_no in", values, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoNotIn(List<String> values) {
            addCriterion("shp_com_no not in", values, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoBetween(String value1, String value2) {
            addCriterion("shp_com_no between", value1, value2, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNoNotBetween(String value1, String value2) {
            addCriterion("shp_com_no not between", value1, value2, "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNameIsNull() {
            addCriterion("shp_com_name is null");
            return (Criteria) this;
        }

        public Criteria andShpComNameIsNotNull() {
            addCriterion("shp_com_name is not null");
            return (Criteria) this;
        }

        public Criteria andShpComNameEqualTo(String value) {
            addCriterion("shp_com_name =", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameNotEqualTo(String value) {
            addCriterion("shp_com_name <>", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameNotEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameGreaterThan(String value) {
            addCriterion("shp_com_name >", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameGreaterThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameGreaterThanOrEqualTo(String value) {
            addCriterion("shp_com_name >=", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameGreaterThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameLessThan(String value) {
            addCriterion("shp_com_name <", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameLessThanColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameLessThanOrEqualTo(String value) {
            addCriterion("shp_com_name <=", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameLessThanOrEqualToColumn(ShopMst.Column column) {
            addCriterion(new StringBuilder("shp_com_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShpComNameLike(String value) {
            addCriterion("shp_com_name like", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameNotLike(String value) {
            addCriterion("shp_com_name not like", value, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameIn(List<String> values) {
            addCriterion("shp_com_name in", values, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameNotIn(List<String> values) {
            addCriterion("shp_com_name not in", values, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameBetween(String value1, String value2) {
            addCriterion("shp_com_name between", value1, value2, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpComNameNotBetween(String value1, String value2) {
            addCriterion("shp_com_name not between", value1, value2, "shpComName");
            return (Criteria) this;
        }

        public Criteria andShpCdLikeInsensitive(String value) {
            addCriterion("upper(shp_cd) like", value.toUpperCase(), "shpCd");
            return (Criteria) this;
        }

        public Criteria andShpPassLikeInsensitive(String value) {
            addCriterion("upper(shp_pass) like", value.toUpperCase(), "shpPass");
            return (Criteria) this;
        }

        public Criteria andShpNameLikeInsensitive(String value) {
            addCriterion("upper(shp_name) like", value.toUpperCase(), "shpName");
            return (Criteria) this;
        }

        public Criteria andShpNameKnLikeInsensitive(String value) {
            addCriterion("upper(shp_name_kn) like", value.toUpperCase(), "shpNameKn");
            return (Criteria) this;
        }

        public Criteria andShpZipCdLikeInsensitive(String value) {
            addCriterion("upper(shp_zip_cd) like", value.toUpperCase(), "shpZipCd");
            return (Criteria) this;
        }

        public Criteria andShpAddr01LikeInsensitive(String value) {
            addCriterion("upper(shp_addr01) like", value.toUpperCase(), "shpAddr01");
            return (Criteria) this;
        }

        public Criteria andShpAddr02LikeInsensitive(String value) {
            addCriterion("upper(shp_addr02) like", value.toUpperCase(), "shpAddr02");
            return (Criteria) this;
        }

        public Criteria andShpAddr03LikeInsensitive(String value) {
            addCriterion("upper(shp_addr03) like", value.toUpperCase(), "shpAddr03");
            return (Criteria) this;
        }

        public Criteria andShpAddr04LikeInsensitive(String value) {
            addCriterion("upper(shp_addr04) like", value.toUpperCase(), "shpAddr04");
            return (Criteria) this;
        }

        public Criteria andShpTel01LikeInsensitive(String value) {
            addCriterion("upper(shp_tel_01) like", value.toUpperCase(), "shpTel01");
            return (Criteria) this;
        }

        public Criteria andShpTel02LikeInsensitive(String value) {
            addCriterion("upper(shp_tel_02) like", value.toUpperCase(), "shpTel02");
            return (Criteria) this;
        }

        public Criteria andShpTel03LikeInsensitive(String value) {
            addCriterion("upper(shp_tel_03) like", value.toUpperCase(), "shpTel03");
            return (Criteria) this;
        }

        public Criteria andShpFax01LikeInsensitive(String value) {
            addCriterion("upper(shp_fax_01) like", value.toUpperCase(), "shpFax01");
            return (Criteria) this;
        }

        public Criteria andShpFax02LikeInsensitive(String value) {
            addCriterion("upper(shp_fax_02) like", value.toUpperCase(), "shpFax02");
            return (Criteria) this;
        }

        public Criteria andShpFax03LikeInsensitive(String value) {
            addCriterion("upper(shp_fax_03) like", value.toUpperCase(), "shpFax03");
            return (Criteria) this;
        }

        public Criteria andShpRemarksLikeInsensitive(String value) {
            addCriterion("upper(shp_remarks) like", value.toUpperCase(), "shpRemarks");
            return (Criteria) this;
        }

        public Criteria andShpDelFlgLikeInsensitive(String value) {
            addCriterion("upper(shp_del_flg) like", value.toUpperCase(), "shpDelFlg");
            return (Criteria) this;
        }

        public Criteria andShpUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(shp_update_sys_name) like", value.toUpperCase(), "shpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(shp_update_class_name) like", value.toUpperCase(), "shpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(shp_update_method_name) like", value.toUpperCase(), "shpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andShpUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(shp_update_crud_kbn) like", value.toUpperCase(), "shpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andShpSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(shp_sys_remarks) like", value.toUpperCase(), "shpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andShpPrfCdLikeInsensitive(String value) {
            addCriterion("upper(shp_prf_cd) like", value.toUpperCase(), "shpPrfCd");
            return (Criteria) this;
        }

        public Criteria andShpPcMlAddrLikeInsensitive(String value) {
            addCriterion("upper(shp_pc_ml_addr) like", value.toUpperCase(), "shpPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpMblMlAddrLikeInsensitive(String value) {
            addCriterion("upper(shp_mbl_ml_addr) like", value.toUpperCase(), "shpMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpRptMlAddrLikeInsensitive(String value) {
            addCriterion("upper(shp_rpt_ml_addr) like", value.toUpperCase(), "shpRptMlAddr");
            return (Criteria) this;
        }

        public Criteria andShpComNoLikeInsensitive(String value) {
            addCriterion("upper(shp_com_no) like", value.toUpperCase(), "shpComNo");
            return (Criteria) this;
        }

        public Criteria andShpComNameLikeInsensitive(String value) {
            addCriterion("upper(shp_com_name) like", value.toUpperCase(), "shpComName");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ShopMstCriteria example;

        protected Criteria(ShopMstCriteria example) {
            super();
            this.example = example;
        }

        public ShopMstCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.ShopMstCriteria example);
    }
}