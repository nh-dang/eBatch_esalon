package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GroupMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupMstCriteria() {
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

    public GroupMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GroupMstCriteria orderBy(String ... orderByClauses) {
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
        GroupMstCriteria example = new GroupMstCriteria();
        return example.createCriteria();
    }

    public GroupMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GroupMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andGrpIdIsNull() {
            addCriterion("grp_id is null");
            return (Criteria) this;
        }

        public Criteria andGrpIdIsNotNull() {
            addCriterion("grp_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrpIdEqualTo(Long value) {
            addCriterion("grp_id =", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdNotEqualTo(Long value) {
            addCriterion("grp_id <>", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdGreaterThan(Long value) {
            addCriterion("grp_id >", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grp_id >=", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdLessThan(Long value) {
            addCriterion("grp_id <", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdLessThanOrEqualTo(Long value) {
            addCriterion("grp_id <=", value, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpIdIn(List<Long> values) {
            addCriterion("grp_id in", values, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdNotIn(List<Long> values) {
            addCriterion("grp_id not in", values, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdBetween(Long value1, Long value2) {
            addCriterion("grp_id between", value1, value2, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpIdNotBetween(Long value1, Long value2) {
            addCriterion("grp_id not between", value1, value2, "grpId");
            return (Criteria) this;
        }

        public Criteria andGrpCdIsNull() {
            addCriterion("grp_cd is null");
            return (Criteria) this;
        }

        public Criteria andGrpCdIsNotNull() {
            addCriterion("grp_cd is not null");
            return (Criteria) this;
        }

        public Criteria andGrpCdEqualTo(String value) {
            addCriterion("grp_cd =", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdNotEqualTo(String value) {
            addCriterion("grp_cd <>", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdGreaterThan(String value) {
            addCriterion("grp_cd >", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdGreaterThanOrEqualTo(String value) {
            addCriterion("grp_cd >=", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdLessThan(String value) {
            addCriterion("grp_cd <", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdLessThanOrEqualTo(String value) {
            addCriterion("grp_cd <=", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cd <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdLike(String value) {
            addCriterion("grp_cd like", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdNotLike(String value) {
            addCriterion("grp_cd not like", value, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdIn(List<String> values) {
            addCriterion("grp_cd in", values, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdNotIn(List<String> values) {
            addCriterion("grp_cd not in", values, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdBetween(String value1, String value2) {
            addCriterion("grp_cd between", value1, value2, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpCdNotBetween(String value1, String value2) {
            addCriterion("grp_cd not between", value1, value2, "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpNameIsNull() {
            addCriterion("grp_name is null");
            return (Criteria) this;
        }

        public Criteria andGrpNameIsNotNull() {
            addCriterion("grp_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrpNameEqualTo(String value) {
            addCriterion("grp_name =", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameNotEqualTo(String value) {
            addCriterion("grp_name <>", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThan(String value) {
            addCriterion("grp_name >", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThanOrEqualTo(String value) {
            addCriterion("grp_name >=", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThan(String value) {
            addCriterion("grp_name <", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThanOrEqualTo(String value) {
            addCriterion("grp_name <=", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameLike(String value) {
            addCriterion("grp_name like", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotLike(String value) {
            addCriterion("grp_name not like", value, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameIn(List<String> values) {
            addCriterion("grp_name in", values, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotIn(List<String> values) {
            addCriterion("grp_name not in", values, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameBetween(String value1, String value2) {
            addCriterion("grp_name between", value1, value2, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameNotBetween(String value1, String value2) {
            addCriterion("grp_name not between", value1, value2, "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnIsNull() {
            addCriterion("grp_name_kn is null");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnIsNotNull() {
            addCriterion("grp_name_kn is not null");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnEqualTo(String value) {
            addCriterion("grp_name_kn =", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnNotEqualTo(String value) {
            addCriterion("grp_name_kn <>", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnGreaterThan(String value) {
            addCriterion("grp_name_kn >", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnGreaterThanOrEqualTo(String value) {
            addCriterion("grp_name_kn >=", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLessThan(String value) {
            addCriterion("grp_name_kn <", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLessThanOrEqualTo(String value) {
            addCriterion("grp_name_kn <=", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_name_kn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLike(String value) {
            addCriterion("grp_name_kn like", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnNotLike(String value) {
            addCriterion("grp_name_kn not like", value, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnIn(List<String> values) {
            addCriterion("grp_name_kn in", values, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnNotIn(List<String> values) {
            addCriterion("grp_name_kn not in", values, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnBetween(String value1, String value2) {
            addCriterion("grp_name_kn between", value1, value2, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnNotBetween(String value1, String value2) {
            addCriterion("grp_name_kn not between", value1, value2, "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdIsNull() {
            addCriterion("grp_hdr_com_id is null");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdIsNotNull() {
            addCriterion("grp_hdr_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdEqualTo(Long value) {
            addCriterion("grp_hdr_com_id =", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdNotEqualTo(Long value) {
            addCriterion("grp_hdr_com_id <>", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdGreaterThan(Long value) {
            addCriterion("grp_hdr_com_id >", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grp_hdr_com_id >=", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdLessThan(Long value) {
            addCriterion("grp_hdr_com_id <", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdLessThanOrEqualTo(Long value) {
            addCriterion("grp_hdr_com_id <=", value, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_hdr_com_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdIn(List<Long> values) {
            addCriterion("grp_hdr_com_id in", values, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdNotIn(List<Long> values) {
            addCriterion("grp_hdr_com_id not in", values, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdBetween(Long value1, Long value2) {
            addCriterion("grp_hdr_com_id between", value1, value2, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpHdrComIdNotBetween(Long value1, Long value2) {
            addCriterion("grp_hdr_com_id not between", value1, value2, "grpHdrComId");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksIsNull() {
            addCriterion("grp_remarks is null");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksIsNotNull() {
            addCriterion("grp_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksEqualTo(String value) {
            addCriterion("grp_remarks =", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksNotEqualTo(String value) {
            addCriterion("grp_remarks <>", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksGreaterThan(String value) {
            addCriterion("grp_remarks >", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("grp_remarks >=", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLessThan(String value) {
            addCriterion("grp_remarks <", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLessThanOrEqualTo(String value) {
            addCriterion("grp_remarks <=", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLike(String value) {
            addCriterion("grp_remarks like", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksNotLike(String value) {
            addCriterion("grp_remarks not like", value, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksIn(List<String> values) {
            addCriterion("grp_remarks in", values, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksNotIn(List<String> values) {
            addCriterion("grp_remarks not in", values, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksBetween(String value1, String value2) {
            addCriterion("grp_remarks between", value1, value2, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksNotBetween(String value1, String value2) {
            addCriterion("grp_remarks not between", value1, value2, "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrIsNull() {
            addCriterion("grp_avl_date_fr is null");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrIsNotNull() {
            addCriterion("grp_avl_date_fr is not null");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr =", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrNotEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr <>", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrGreaterThan(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr >", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr >=", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrLessThan(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr <", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_fr <=", value, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_fr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrIn(List<Date> values) {
            addCriterionForJDBCDate("grp_avl_date_fr in", values, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrNotIn(List<Date> values) {
            addCriterionForJDBCDate("grp_avl_date_fr not in", values, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_avl_date_fr between", value1, value2, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateFrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_avl_date_fr not between", value1, value2, "grpAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToIsNull() {
            addCriterion("grp_avl_date_to is null");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToIsNotNull() {
            addCriterion("grp_avl_date_to is not null");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to =", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToNotEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to <>", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToGreaterThan(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to >", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to >=", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToLessThan(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to <", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_avl_date_to <=", value, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_avl_date_to <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToIn(List<Date> values) {
            addCriterionForJDBCDate("grp_avl_date_to in", values, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToNotIn(List<Date> values) {
            addCriterionForJDBCDate("grp_avl_date_to not in", values, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_avl_date_to between", value1, value2, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpAvlDateToNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_avl_date_to not between", value1, value2, "grpAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgIsNull() {
            addCriterion("grp_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgIsNotNull() {
            addCriterion("grp_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgEqualTo(String value) {
            addCriterion("grp_del_flg =", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgNotEqualTo(String value) {
            addCriterion("grp_del_flg <>", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgGreaterThan(String value) {
            addCriterion("grp_del_flg >", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("grp_del_flg >=", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLessThan(String value) {
            addCriterion("grp_del_flg <", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLessThanOrEqualTo(String value) {
            addCriterion("grp_del_flg <=", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLike(String value) {
            addCriterion("grp_del_flg like", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgNotLike(String value) {
            addCriterion("grp_del_flg not like", value, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgIn(List<String> values) {
            addCriterion("grp_del_flg in", values, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgNotIn(List<String> values) {
            addCriterion("grp_del_flg not in", values, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgBetween(String value1, String value2) {
            addCriterion("grp_del_flg between", value1, value2, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgNotBetween(String value1, String value2) {
            addCriterion("grp_del_flg not between", value1, value2, "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpCdateIsNull() {
            addCriterion("grp_cdate is null");
            return (Criteria) this;
        }

        public Criteria andGrpCdateIsNotNull() {
            addCriterion("grp_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andGrpCdateEqualTo(Date value) {
            addCriterionForJDBCDate("grp_cdate =", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("grp_cdate <>", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("grp_cdate >", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_cdate >=", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateLessThan(Date value) {
            addCriterionForJDBCDate("grp_cdate <", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_cdate <=", value, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCdateIn(List<Date> values) {
            addCriterionForJDBCDate("grp_cdate in", values, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("grp_cdate not in", values, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_cdate between", value1, value2, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_cdate not between", value1, value2, "grpCdate");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeIsNull() {
            addCriterion("grp_ctime is null");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeIsNotNull() {
            addCriterion("grp_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("grp_ctime =", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("grp_ctime <>", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("grp_ctime >", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("grp_ctime >=", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeLessThan(Date value) {
            addCriterionForJDBCTime("grp_ctime <", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("grp_ctime <=", value, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("grp_ctime in", values, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("grp_ctime not in", values, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("grp_ctime between", value1, value2, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("grp_ctime not between", value1, value2, "grpCtime");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampIsNull() {
            addCriterion("grp_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampIsNotNull() {
            addCriterion("grp_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampEqualTo(Date value) {
            addCriterion("grp_ctimestamp =", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampNotEqualTo(Date value) {
            addCriterion("grp_ctimestamp <>", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampGreaterThan(Date value) {
            addCriterion("grp_ctimestamp >", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("grp_ctimestamp >=", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampLessThan(Date value) {
            addCriterion("grp_ctimestamp <", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("grp_ctimestamp <=", value, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampIn(List<Date> values) {
            addCriterion("grp_ctimestamp in", values, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampNotIn(List<Date> values) {
            addCriterion("grp_ctimestamp not in", values, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampBetween(Date value1, Date value2) {
            addCriterion("grp_ctimestamp between", value1, value2, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("grp_ctimestamp not between", value1, value2, "grpCtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUdateIsNull() {
            addCriterion("grp_udate is null");
            return (Criteria) this;
        }

        public Criteria andGrpUdateIsNotNull() {
            addCriterion("grp_udate is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUdateEqualTo(Date value) {
            addCriterionForJDBCDate("grp_udate =", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("grp_udate <>", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("grp_udate >", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_udate >=", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateLessThan(Date value) {
            addCriterionForJDBCDate("grp_udate <", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grp_udate <=", value, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUdateIn(List<Date> values) {
            addCriterionForJDBCDate("grp_udate in", values, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("grp_udate not in", values, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_udate between", value1, value2, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grp_udate not between", value1, value2, "grpUdate");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeIsNull() {
            addCriterion("grp_utime is null");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeIsNotNull() {
            addCriterion("grp_utime is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("grp_utime =", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("grp_utime <>", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("grp_utime >", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("grp_utime >=", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeLessThan(Date value) {
            addCriterionForJDBCTime("grp_utime <", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("grp_utime <=", value, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("grp_utime in", values, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("grp_utime not in", values, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("grp_utime between", value1, value2, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("grp_utime not between", value1, value2, "grpUtime");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampIsNull() {
            addCriterion("grp_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampIsNotNull() {
            addCriterion("grp_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampEqualTo(Date value) {
            addCriterion("grp_utimestamp =", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampNotEqualTo(Date value) {
            addCriterion("grp_utimestamp <>", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampGreaterThan(Date value) {
            addCriterion("grp_utimestamp >", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("grp_utimestamp >=", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampLessThan(Date value) {
            addCriterion("grp_utimestamp <", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("grp_utimestamp <=", value, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampIn(List<Date> values) {
            addCriterion("grp_utimestamp in", values, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampNotIn(List<Date> values) {
            addCriterion("grp_utimestamp not in", values, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampBetween(Date value1, Date value2) {
            addCriterion("grp_utimestamp between", value1, value2, "grpUtimestamp");
            return (Criteria) this;
        }

        public Criteria andGrpUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("grp_utimestamp not between", value1, value2, "grpUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(GroupMst.Column column) {
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

        public Criteria andGrpUpdateUserIsNull() {
            addCriterion("grp_update_user is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserIsNotNull() {
            addCriterion("grp_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserEqualTo(Long value) {
            addCriterion("grp_update_user =", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserNotEqualTo(Long value) {
            addCriterion("grp_update_user <>", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserGreaterThan(Long value) {
            addCriterion("grp_update_user >", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("grp_update_user >=", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserLessThan(Long value) {
            addCriterion("grp_update_user <", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("grp_update_user <=", value, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserIn(List<Long> values) {
            addCriterion("grp_update_user in", values, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserNotIn(List<Long> values) {
            addCriterion("grp_update_user not in", values, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserBetween(Long value1, Long value2) {
            addCriterion("grp_update_user between", value1, value2, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("grp_update_user not between", value1, value2, "grpUpdateUser");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameIsNull() {
            addCriterion("grp_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameIsNotNull() {
            addCriterion("grp_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameEqualTo(String value) {
            addCriterion("grp_update_sys_name =", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameNotEqualTo(String value) {
            addCriterion("grp_update_sys_name <>", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameGreaterThan(String value) {
            addCriterion("grp_update_sys_name >", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("grp_update_sys_name >=", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLessThan(String value) {
            addCriterion("grp_update_sys_name <", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("grp_update_sys_name <=", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLike(String value) {
            addCriterion("grp_update_sys_name like", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameNotLike(String value) {
            addCriterion("grp_update_sys_name not like", value, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameIn(List<String> values) {
            addCriterion("grp_update_sys_name in", values, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameNotIn(List<String> values) {
            addCriterion("grp_update_sys_name not in", values, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameBetween(String value1, String value2) {
            addCriterion("grp_update_sys_name between", value1, value2, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("grp_update_sys_name not between", value1, value2, "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameIsNull() {
            addCriterion("grp_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameIsNotNull() {
            addCriterion("grp_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameEqualTo(String value) {
            addCriterion("grp_update_class_name =", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameNotEqualTo(String value) {
            addCriterion("grp_update_class_name <>", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameGreaterThan(String value) {
            addCriterion("grp_update_class_name >", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("grp_update_class_name >=", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLessThan(String value) {
            addCriterion("grp_update_class_name <", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("grp_update_class_name <=", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLike(String value) {
            addCriterion("grp_update_class_name like", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameNotLike(String value) {
            addCriterion("grp_update_class_name not like", value, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameIn(List<String> values) {
            addCriterion("grp_update_class_name in", values, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameNotIn(List<String> values) {
            addCriterion("grp_update_class_name not in", values, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameBetween(String value1, String value2) {
            addCriterion("grp_update_class_name between", value1, value2, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("grp_update_class_name not between", value1, value2, "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameIsNull() {
            addCriterion("grp_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameIsNotNull() {
            addCriterion("grp_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameEqualTo(String value) {
            addCriterion("grp_update_method_name =", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameNotEqualTo(String value) {
            addCriterion("grp_update_method_name <>", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameGreaterThan(String value) {
            addCriterion("grp_update_method_name >", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("grp_update_method_name >=", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLessThan(String value) {
            addCriterion("grp_update_method_name <", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("grp_update_method_name <=", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLike(String value) {
            addCriterion("grp_update_method_name like", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameNotLike(String value) {
            addCriterion("grp_update_method_name not like", value, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameIn(List<String> values) {
            addCriterion("grp_update_method_name in", values, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameNotIn(List<String> values) {
            addCriterion("grp_update_method_name not in", values, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("grp_update_method_name between", value1, value2, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("grp_update_method_name not between", value1, value2, "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnIsNull() {
            addCriterion("grp_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnIsNotNull() {
            addCriterion("grp_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnEqualTo(String value) {
            addCriterion("grp_update_crud_kbn =", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("grp_update_crud_kbn <>", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnGreaterThan(String value) {
            addCriterion("grp_update_crud_kbn >", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("grp_update_crud_kbn >=", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLessThan(String value) {
            addCriterion("grp_update_crud_kbn <", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("grp_update_crud_kbn <=", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLike(String value) {
            addCriterion("grp_update_crud_kbn like", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnNotLike(String value) {
            addCriterion("grp_update_crud_kbn not like", value, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnIn(List<String> values) {
            addCriterion("grp_update_crud_kbn in", values, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("grp_update_crud_kbn not in", values, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("grp_update_crud_kbn between", value1, value2, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("grp_update_crud_kbn not between", value1, value2, "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksIsNull() {
            addCriterion("grp_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksIsNotNull() {
            addCriterion("grp_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksEqualTo(String value) {
            addCriterion("grp_sys_remarks =", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksNotEqualTo(String value) {
            addCriterion("grp_sys_remarks <>", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksGreaterThan(String value) {
            addCriterion("grp_sys_remarks >", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("grp_sys_remarks >=", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLessThan(String value) {
            addCriterion("grp_sys_remarks <", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("grp_sys_remarks <=", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLike(String value) {
            addCriterion("grp_sys_remarks like", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksNotLike(String value) {
            addCriterion("grp_sys_remarks not like", value, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksIn(List<String> values) {
            addCriterion("grp_sys_remarks in", values, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksNotIn(List<String> values) {
            addCriterion("grp_sys_remarks not in", values, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksBetween(String value1, String value2) {
            addCriterion("grp_sys_remarks between", value1, value2, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksNotBetween(String value1, String value2) {
            addCriterion("grp_sys_remarks not between", value1, value2, "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminIsNull() {
            addCriterion("grp_update_admin is null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminIsNotNull() {
            addCriterion("grp_update_admin is not null");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminEqualTo(Long value) {
            addCriterion("grp_update_admin =", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminNotEqualTo(Long value) {
            addCriterion("grp_update_admin <>", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminNotEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminGreaterThan(Long value) {
            addCriterion("grp_update_admin >", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminGreaterThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminGreaterThanOrEqualTo(Long value) {
            addCriterion("grp_update_admin >=", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminGreaterThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminLessThan(Long value) {
            addCriterion("grp_update_admin <", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminLessThanColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminLessThanOrEqualTo(Long value) {
            addCriterion("grp_update_admin <=", value, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminLessThanOrEqualToColumn(GroupMst.Column column) {
            addCriterion(new StringBuilder("grp_update_admin <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminIn(List<Long> values) {
            addCriterion("grp_update_admin in", values, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminNotIn(List<Long> values) {
            addCriterion("grp_update_admin not in", values, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminBetween(Long value1, Long value2) {
            addCriterion("grp_update_admin between", value1, value2, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateAdminNotBetween(Long value1, Long value2) {
            addCriterion("grp_update_admin not between", value1, value2, "grpUpdateAdmin");
            return (Criteria) this;
        }

        public Criteria andGrpCdLikeInsensitive(String value) {
            addCriterion("upper(grp_cd) like", value.toUpperCase(), "grpCd");
            return (Criteria) this;
        }

        public Criteria andGrpNameLikeInsensitive(String value) {
            addCriterion("upper(grp_name) like", value.toUpperCase(), "grpName");
            return (Criteria) this;
        }

        public Criteria andGrpNameKnLikeInsensitive(String value) {
            addCriterion("upper(grp_name_kn) like", value.toUpperCase(), "grpNameKn");
            return (Criteria) this;
        }

        public Criteria andGrpRemarksLikeInsensitive(String value) {
            addCriterion("upper(grp_remarks) like", value.toUpperCase(), "grpRemarks");
            return (Criteria) this;
        }

        public Criteria andGrpDelFlgLikeInsensitive(String value) {
            addCriterion("upper(grp_del_flg) like", value.toUpperCase(), "grpDelFlg");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(grp_update_sys_name) like", value.toUpperCase(), "grpUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(grp_update_class_name) like", value.toUpperCase(), "grpUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(grp_update_method_name) like", value.toUpperCase(), "grpUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andGrpUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(grp_update_crud_kbn) like", value.toUpperCase(), "grpUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andGrpSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(grp_sys_remarks) like", value.toUpperCase(), "grpSysRemarks");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GroupMstCriteria example;

        protected Criteria(GroupMstCriteria example) {
            super();
            this.example = example;
        }

        public GroupMstCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.GroupMstCriteria example);
    }
}