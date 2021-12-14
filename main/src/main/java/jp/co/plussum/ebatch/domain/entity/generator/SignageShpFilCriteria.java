package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SignageShpFilCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignageShpFilCriteria() {
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

    public SignageShpFilCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SignageShpFilCriteria orderBy(String ... orderByClauses) {
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
        SignageShpFilCriteria example = new SignageShpFilCriteria();
        return example.createCriteria();
    }

    public SignageShpFilCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SignageShpFilCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andSsfIdIsNull() {
            addCriterion("ssf_id is null");
            return (Criteria) this;
        }

        public Criteria andSsfIdIsNotNull() {
            addCriterion("ssf_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsfIdEqualTo(Long value) {
            addCriterion("ssf_id =", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdNotEqualTo(Long value) {
            addCriterion("ssf_id <>", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThan(Long value) {
            addCriterion("ssf_id >", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ssf_id >=", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThan(Long value) {
            addCriterion("ssf_id <", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThanOrEqualTo(Long value) {
            addCriterion("ssf_id <=", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfIdIn(List<Long> values) {
            addCriterion("ssf_id in", values, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotIn(List<Long> values) {
            addCriterion("ssf_id not in", values, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdBetween(Long value1, Long value2) {
            addCriterion("ssf_id between", value1, value2, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotBetween(Long value1, Long value2) {
            addCriterion("ssf_id not between", value1, value2, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdIsNull() {
            addCriterion("ssf_sig_id is null");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdIsNotNull() {
            addCriterion("ssf_sig_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdEqualTo(Long value) {
            addCriterion("ssf_sig_id =", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdNotEqualTo(Long value) {
            addCriterion("ssf_sig_id <>", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdGreaterThan(Long value) {
            addCriterion("ssf_sig_id >", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ssf_sig_id >=", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdLessThan(Long value) {
            addCriterion("ssf_sig_id <", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdLessThanOrEqualTo(Long value) {
            addCriterion("ssf_sig_id <=", value, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sig_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSigIdIn(List<Long> values) {
            addCriterion("ssf_sig_id in", values, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdNotIn(List<Long> values) {
            addCriterion("ssf_sig_id not in", values, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdBetween(Long value1, Long value2) {
            addCriterion("ssf_sig_id between", value1, value2, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfSigIdNotBetween(Long value1, Long value2) {
            addCriterion("ssf_sig_id not between", value1, value2, "ssfSigId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdIsNull() {
            addCriterion("ssf_shp_id is null");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdIsNotNull() {
            addCriterion("ssf_shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdEqualTo(Long value) {
            addCriterion("ssf_shp_id =", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdNotEqualTo(Long value) {
            addCriterion("ssf_shp_id <>", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdGreaterThan(Long value) {
            addCriterion("ssf_shp_id >", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ssf_shp_id >=", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdLessThan(Long value) {
            addCriterion("ssf_shp_id <", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdLessThanOrEqualTo(Long value) {
            addCriterion("ssf_shp_id <=", value, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_shp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfShpIdIn(List<Long> values) {
            addCriterion("ssf_shp_id in", values, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdNotIn(List<Long> values) {
            addCriterion("ssf_shp_id not in", values, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdBetween(Long value1, Long value2) {
            addCriterion("ssf_shp_id between", value1, value2, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfShpIdNotBetween(Long value1, Long value2) {
            addCriterion("ssf_shp_id not between", value1, value2, "ssfShpId");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgIsNull() {
            addCriterion("ssf_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgIsNotNull() {
            addCriterion("ssf_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgEqualTo(String value) {
            addCriterion("ssf_del_flg =", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgNotEqualTo(String value) {
            addCriterion("ssf_del_flg <>", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgGreaterThan(String value) {
            addCriterion("ssf_del_flg >", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_del_flg >=", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLessThan(String value) {
            addCriterion("ssf_del_flg <", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLessThanOrEqualTo(String value) {
            addCriterion("ssf_del_flg <=", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLike(String value) {
            addCriterion("ssf_del_flg like", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgNotLike(String value) {
            addCriterion("ssf_del_flg not like", value, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgIn(List<String> values) {
            addCriterion("ssf_del_flg in", values, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgNotIn(List<String> values) {
            addCriterion("ssf_del_flg not in", values, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgBetween(String value1, String value2) {
            addCriterion("ssf_del_flg between", value1, value2, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgNotBetween(String value1, String value2) {
            addCriterion("ssf_del_flg not between", value1, value2, "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfCdateIsNull() {
            addCriterion("ssf_cdate is null");
            return (Criteria) this;
        }

        public Criteria andSsfCdateIsNotNull() {
            addCriterion("ssf_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andSsfCdateEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_cdate =", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_cdate <>", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ssf_cdate >", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_cdate >=", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateLessThan(Date value) {
            addCriterionForJDBCDate("ssf_cdate <", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_cdate <=", value, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCdateIn(List<Date> values) {
            addCriterionForJDBCDate("ssf_cdate in", values, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ssf_cdate not in", values, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssf_cdate between", value1, value2, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssf_cdate not between", value1, value2, "ssfCdate");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeIsNull() {
            addCriterion("ssf_ctime is null");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeIsNotNull() {
            addCriterion("ssf_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_ctime =", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_ctime <>", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("ssf_ctime >", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_ctime >=", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeLessThan(Date value) {
            addCriterionForJDBCTime("ssf_ctime <", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_ctime <=", value, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("ssf_ctime in", values, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("ssf_ctime not in", values, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ssf_ctime between", value1, value2, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ssf_ctime not between", value1, value2, "ssfCtime");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampIsNull() {
            addCriterion("ssf_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampIsNotNull() {
            addCriterion("ssf_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampEqualTo(Date value) {
            addCriterion("ssf_ctimestamp =", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampNotEqualTo(Date value) {
            addCriterion("ssf_ctimestamp <>", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampGreaterThan(Date value) {
            addCriterion("ssf_ctimestamp >", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("ssf_ctimestamp >=", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampLessThan(Date value) {
            addCriterion("ssf_ctimestamp <", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("ssf_ctimestamp <=", value, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampIn(List<Date> values) {
            addCriterion("ssf_ctimestamp in", values, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampNotIn(List<Date> values) {
            addCriterion("ssf_ctimestamp not in", values, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampBetween(Date value1, Date value2) {
            addCriterion("ssf_ctimestamp between", value1, value2, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("ssf_ctimestamp not between", value1, value2, "ssfCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUdateIsNull() {
            addCriterion("ssf_udate is null");
            return (Criteria) this;
        }

        public Criteria andSsfUdateIsNotNull() {
            addCriterion("ssf_udate is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUdateEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_udate =", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_udate <>", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ssf_udate >", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_udate >=", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateLessThan(Date value) {
            addCriterionForJDBCDate("ssf_udate <", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssf_udate <=", value, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUdateIn(List<Date> values) {
            addCriterionForJDBCDate("ssf_udate in", values, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ssf_udate not in", values, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssf_udate between", value1, value2, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssf_udate not between", value1, value2, "ssfUdate");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeIsNull() {
            addCriterion("ssf_utime is null");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeIsNotNull() {
            addCriterion("ssf_utime is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_utime =", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_utime <>", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("ssf_utime >", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_utime >=", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeLessThan(Date value) {
            addCriterionForJDBCTime("ssf_utime <", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("ssf_utime <=", value, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("ssf_utime in", values, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("ssf_utime not in", values, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ssf_utime between", value1, value2, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("ssf_utime not between", value1, value2, "ssfUtime");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampIsNull() {
            addCriterion("ssf_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampIsNotNull() {
            addCriterion("ssf_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampEqualTo(Date value) {
            addCriterion("ssf_utimestamp =", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampNotEqualTo(Date value) {
            addCriterion("ssf_utimestamp <>", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampGreaterThan(Date value) {
            addCriterion("ssf_utimestamp >", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("ssf_utimestamp >=", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampLessThan(Date value) {
            addCriterion("ssf_utimestamp <", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("ssf_utimestamp <=", value, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampIn(List<Date> values) {
            addCriterion("ssf_utimestamp in", values, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampNotIn(List<Date> values) {
            addCriterion("ssf_utimestamp not in", values, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampBetween(Date value1, Date value2) {
            addCriterion("ssf_utimestamp between", value1, value2, "ssfUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSsfUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("ssf_utimestamp not between", value1, value2, "ssfUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(SignageShpFil.Column column) {
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

        public Criteria andSsfUpdateUserIsNull() {
            addCriterion("ssf_update_user is null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserIsNotNull() {
            addCriterion("ssf_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserEqualTo(Long value) {
            addCriterion("ssf_update_user =", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserNotEqualTo(Long value) {
            addCriterion("ssf_update_user <>", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserGreaterThan(Long value) {
            addCriterion("ssf_update_user >", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("ssf_update_user >=", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserLessThan(Long value) {
            addCriterion("ssf_update_user <", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("ssf_update_user <=", value, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserIn(List<Long> values) {
            addCriterion("ssf_update_user in", values, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserNotIn(List<Long> values) {
            addCriterion("ssf_update_user not in", values, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserBetween(Long value1, Long value2) {
            addCriterion("ssf_update_user between", value1, value2, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("ssf_update_user not between", value1, value2, "ssfUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameIsNull() {
            addCriterion("ssf_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameIsNotNull() {
            addCriterion("ssf_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameEqualTo(String value) {
            addCriterion("ssf_update_sys_name =", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameNotEqualTo(String value) {
            addCriterion("ssf_update_sys_name <>", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameGreaterThan(String value) {
            addCriterion("ssf_update_sys_name >", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_update_sys_name >=", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLessThan(String value) {
            addCriterion("ssf_update_sys_name <", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("ssf_update_sys_name <=", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLike(String value) {
            addCriterion("ssf_update_sys_name like", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameNotLike(String value) {
            addCriterion("ssf_update_sys_name not like", value, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameIn(List<String> values) {
            addCriterion("ssf_update_sys_name in", values, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameNotIn(List<String> values) {
            addCriterion("ssf_update_sys_name not in", values, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameBetween(String value1, String value2) {
            addCriterion("ssf_update_sys_name between", value1, value2, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("ssf_update_sys_name not between", value1, value2, "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameIsNull() {
            addCriterion("ssf_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameIsNotNull() {
            addCriterion("ssf_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameEqualTo(String value) {
            addCriterion("ssf_update_class_name =", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameNotEqualTo(String value) {
            addCriterion("ssf_update_class_name <>", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameGreaterThan(String value) {
            addCriterion("ssf_update_class_name >", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_update_class_name >=", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLessThan(String value) {
            addCriterion("ssf_update_class_name <", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("ssf_update_class_name <=", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLike(String value) {
            addCriterion("ssf_update_class_name like", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameNotLike(String value) {
            addCriterion("ssf_update_class_name not like", value, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameIn(List<String> values) {
            addCriterion("ssf_update_class_name in", values, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameNotIn(List<String> values) {
            addCriterion("ssf_update_class_name not in", values, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameBetween(String value1, String value2) {
            addCriterion("ssf_update_class_name between", value1, value2, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("ssf_update_class_name not between", value1, value2, "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameIsNull() {
            addCriterion("ssf_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameIsNotNull() {
            addCriterion("ssf_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameEqualTo(String value) {
            addCriterion("ssf_update_method_name =", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameNotEqualTo(String value) {
            addCriterion("ssf_update_method_name <>", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameGreaterThan(String value) {
            addCriterion("ssf_update_method_name >", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_update_method_name >=", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLessThan(String value) {
            addCriterion("ssf_update_method_name <", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("ssf_update_method_name <=", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLike(String value) {
            addCriterion("ssf_update_method_name like", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameNotLike(String value) {
            addCriterion("ssf_update_method_name not like", value, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameIn(List<String> values) {
            addCriterion("ssf_update_method_name in", values, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameNotIn(List<String> values) {
            addCriterion("ssf_update_method_name not in", values, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("ssf_update_method_name between", value1, value2, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("ssf_update_method_name not between", value1, value2, "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnIsNull() {
            addCriterion("ssf_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnIsNotNull() {
            addCriterion("ssf_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnEqualTo(String value) {
            addCriterion("ssf_update_crud_kbn =", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("ssf_update_crud_kbn <>", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnGreaterThan(String value) {
            addCriterion("ssf_update_crud_kbn >", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_update_crud_kbn >=", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLessThan(String value) {
            addCriterion("ssf_update_crud_kbn <", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("ssf_update_crud_kbn <=", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLike(String value) {
            addCriterion("ssf_update_crud_kbn like", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnNotLike(String value) {
            addCriterion("ssf_update_crud_kbn not like", value, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnIn(List<String> values) {
            addCriterion("ssf_update_crud_kbn in", values, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("ssf_update_crud_kbn not in", values, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("ssf_update_crud_kbn between", value1, value2, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("ssf_update_crud_kbn not between", value1, value2, "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksIsNull() {
            addCriterion("ssf_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksIsNotNull() {
            addCriterion("ssf_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksEqualTo(String value) {
            addCriterion("ssf_sys_remarks =", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksNotEqualTo(String value) {
            addCriterion("ssf_sys_remarks <>", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksGreaterThan(String value) {
            addCriterion("ssf_sys_remarks >", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_sys_remarks >=", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLessThan(String value) {
            addCriterion("ssf_sys_remarks <", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("ssf_sys_remarks <=", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLike(String value) {
            addCriterion("ssf_sys_remarks like", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksNotLike(String value) {
            addCriterion("ssf_sys_remarks not like", value, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksIn(List<String> values) {
            addCriterion("ssf_sys_remarks in", values, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksNotIn(List<String> values) {
            addCriterion("ssf_sys_remarks not in", values, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksBetween(String value1, String value2) {
            addCriterion("ssf_sys_remarks between", value1, value2, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksNotBetween(String value1, String value2) {
            addCriterion("ssf_sys_remarks not between", value1, value2, "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdIsNull() {
            addCriterion("ssf_file_id is null");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdIsNotNull() {
            addCriterion("ssf_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdEqualTo(String value) {
            addCriterion("ssf_file_id =", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdNotEqualTo(String value) {
            addCriterion("ssf_file_id <>", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdNotEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdGreaterThan(String value) {
            addCriterion("ssf_file_id >", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdGreaterThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("ssf_file_id >=", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdGreaterThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLessThan(String value) {
            addCriterion("ssf_file_id <", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLessThanColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLessThanOrEqualTo(String value) {
            addCriterion("ssf_file_id <=", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLessThanOrEqualToColumn(SignageShpFil.Column column) {
            addCriterion(new StringBuilder("ssf_file_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLike(String value) {
            addCriterion("ssf_file_id like", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdNotLike(String value) {
            addCriterion("ssf_file_id not like", value, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdIn(List<String> values) {
            addCriterion("ssf_file_id in", values, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdNotIn(List<String> values) {
            addCriterion("ssf_file_id not in", values, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdBetween(String value1, String value2) {
            addCriterion("ssf_file_id between", value1, value2, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdNotBetween(String value1, String value2) {
            addCriterion("ssf_file_id not between", value1, value2, "ssfFileId");
            return (Criteria) this;
        }

        public Criteria andSsfDelFlgLikeInsensitive(String value) {
            addCriterion("upper(ssf_del_flg) like", value.toUpperCase(), "ssfDelFlg");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(ssf_update_sys_name) like", value.toUpperCase(), "ssfUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(ssf_update_class_name) like", value.toUpperCase(), "ssfUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(ssf_update_method_name) like", value.toUpperCase(), "ssfUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSsfUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(ssf_update_crud_kbn) like", value.toUpperCase(), "ssfUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSsfSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(ssf_sys_remarks) like", value.toUpperCase(), "ssfSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSsfFileIdLikeInsensitive(String value) {
            addCriterion("upper(ssf_file_id) like", value.toUpperCase(), "ssfFileId");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SignageShpFilCriteria example;

        protected Criteria(SignageShpFilCriteria example) {
            super();
            this.example = example;
        }

        public SignageShpFilCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.SignageShpFilCriteria example);
    }
}