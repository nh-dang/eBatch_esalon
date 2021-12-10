package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SignageMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignageMstCriteria() {
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

    public SignageMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SignageMstCriteria orderBy(String ... orderByClauses) {
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
        SignageMstCriteria example = new SignageMstCriteria();
        return example.createCriteria();
    }

    public SignageMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SignageMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andSigIdIsNull() {
            addCriterion("sig_id is null");
            return (Criteria) this;
        }

        public Criteria andSigIdIsNotNull() {
            addCriterion("sig_id is not null");
            return (Criteria) this;
        }

        public Criteria andSigIdEqualTo(Long value) {
            addCriterion("sig_id =", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdNotEqualTo(Long value) {
            addCriterion("sig_id <>", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdGreaterThan(Long value) {
            addCriterion("sig_id >", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sig_id >=", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdLessThan(Long value) {
            addCriterion("sig_id <", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdLessThanOrEqualTo(Long value) {
            addCriterion("sig_id <=", value, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigIdIn(List<Long> values) {
            addCriterion("sig_id in", values, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdNotIn(List<Long> values) {
            addCriterion("sig_id not in", values, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdBetween(Long value1, Long value2) {
            addCriterion("sig_id between", value1, value2, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigIdNotBetween(Long value1, Long value2) {
            addCriterion("sig_id not between", value1, value2, "sigId");
            return (Criteria) this;
        }

        public Criteria andSigImagePathIsNull() {
            addCriterion("sig_image_path is null");
            return (Criteria) this;
        }

        public Criteria andSigImagePathIsNotNull() {
            addCriterion("sig_image_path is not null");
            return (Criteria) this;
        }

        public Criteria andSigImagePathEqualTo(String value) {
            addCriterion("sig_image_path =", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathNotEqualTo(String value) {
            addCriterion("sig_image_path <>", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathGreaterThan(String value) {
            addCriterion("sig_image_path >", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("sig_image_path >=", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathLessThan(String value) {
            addCriterion("sig_image_path <", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathLessThanOrEqualTo(String value) {
            addCriterion("sig_image_path <=", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_image_path <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigImagePathLike(String value) {
            addCriterion("sig_image_path like", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathNotLike(String value) {
            addCriterion("sig_image_path not like", value, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathIn(List<String> values) {
            addCriterion("sig_image_path in", values, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathNotIn(List<String> values) {
            addCriterion("sig_image_path not in", values, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathBetween(String value1, String value2) {
            addCriterion("sig_image_path between", value1, value2, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigImagePathNotBetween(String value1, String value2) {
            addCriterion("sig_image_path not between", value1, value2, "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgIsNull() {
            addCriterion("sig_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgIsNotNull() {
            addCriterion("sig_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgEqualTo(String value) {
            addCriterion("sig_del_flg =", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgNotEqualTo(String value) {
            addCriterion("sig_del_flg <>", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgGreaterThan(String value) {
            addCriterion("sig_del_flg >", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("sig_del_flg >=", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLessThan(String value) {
            addCriterion("sig_del_flg <", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLessThanOrEqualTo(String value) {
            addCriterion("sig_del_flg <=", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLike(String value) {
            addCriterion("sig_del_flg like", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgNotLike(String value) {
            addCriterion("sig_del_flg not like", value, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgIn(List<String> values) {
            addCriterion("sig_del_flg in", values, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgNotIn(List<String> values) {
            addCriterion("sig_del_flg not in", values, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgBetween(String value1, String value2) {
            addCriterion("sig_del_flg between", value1, value2, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgNotBetween(String value1, String value2) {
            addCriterion("sig_del_flg not between", value1, value2, "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigCdateIsNull() {
            addCriterion("sig_cdate is null");
            return (Criteria) this;
        }

        public Criteria andSigCdateIsNotNull() {
            addCriterion("sig_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigCdateEqualTo(Date value) {
            addCriterionForJDBCDate("sig_cdate =", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sig_cdate <>", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sig_cdate >", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sig_cdate >=", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateLessThan(Date value) {
            addCriterionForJDBCDate("sig_cdate <", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sig_cdate <=", value, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCdateIn(List<Date> values) {
            addCriterionForJDBCDate("sig_cdate in", values, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sig_cdate not in", values, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sig_cdate between", value1, value2, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sig_cdate not between", value1, value2, "sigCdate");
            return (Criteria) this;
        }

        public Criteria andSigCtimeIsNull() {
            addCriterion("sig_ctime is null");
            return (Criteria) this;
        }

        public Criteria andSigCtimeIsNotNull() {
            addCriterion("sig_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andSigCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("sig_ctime =", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sig_ctime <>", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sig_ctime >", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sig_ctime >=", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeLessThan(Date value) {
            addCriterionForJDBCTime("sig_ctime <", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sig_ctime <=", value, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("sig_ctime in", values, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sig_ctime not in", values, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sig_ctime between", value1, value2, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sig_ctime not between", value1, value2, "sigCtime");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampIsNull() {
            addCriterion("sig_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampIsNotNull() {
            addCriterion("sig_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampEqualTo(Date value) {
            addCriterion("sig_ctimestamp =", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampNotEqualTo(Date value) {
            addCriterion("sig_ctimestamp <>", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampGreaterThan(Date value) {
            addCriterion("sig_ctimestamp >", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("sig_ctimestamp >=", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampLessThan(Date value) {
            addCriterion("sig_ctimestamp <", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("sig_ctimestamp <=", value, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigCtimestampIn(List<Date> values) {
            addCriterion("sig_ctimestamp in", values, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampNotIn(List<Date> values) {
            addCriterion("sig_ctimestamp not in", values, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampBetween(Date value1, Date value2) {
            addCriterion("sig_ctimestamp between", value1, value2, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("sig_ctimestamp not between", value1, value2, "sigCtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUdateIsNull() {
            addCriterion("sig_udate is null");
            return (Criteria) this;
        }

        public Criteria andSigUdateIsNotNull() {
            addCriterion("sig_udate is not null");
            return (Criteria) this;
        }

        public Criteria andSigUdateEqualTo(Date value) {
            addCriterionForJDBCDate("sig_udate =", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sig_udate <>", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sig_udate >", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sig_udate >=", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateLessThan(Date value) {
            addCriterionForJDBCDate("sig_udate <", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sig_udate <=", value, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUdateIn(List<Date> values) {
            addCriterionForJDBCDate("sig_udate in", values, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sig_udate not in", values, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sig_udate between", value1, value2, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sig_udate not between", value1, value2, "sigUdate");
            return (Criteria) this;
        }

        public Criteria andSigUtimeIsNull() {
            addCriterion("sig_utime is null");
            return (Criteria) this;
        }

        public Criteria andSigUtimeIsNotNull() {
            addCriterion("sig_utime is not null");
            return (Criteria) this;
        }

        public Criteria andSigUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("sig_utime =", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sig_utime <>", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sig_utime >", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sig_utime >=", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeLessThan(Date value) {
            addCriterionForJDBCTime("sig_utime <", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sig_utime <=", value, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("sig_utime in", values, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sig_utime not in", values, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sig_utime between", value1, value2, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sig_utime not between", value1, value2, "sigUtime");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampIsNull() {
            addCriterion("sig_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampIsNotNull() {
            addCriterion("sig_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampEqualTo(Date value) {
            addCriterion("sig_utimestamp =", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampNotEqualTo(Date value) {
            addCriterion("sig_utimestamp <>", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampGreaterThan(Date value) {
            addCriterion("sig_utimestamp >", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("sig_utimestamp >=", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampLessThan(Date value) {
            addCriterion("sig_utimestamp <", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("sig_utimestamp <=", value, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUtimestampIn(List<Date> values) {
            addCriterion("sig_utimestamp in", values, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampNotIn(List<Date> values) {
            addCriterion("sig_utimestamp not in", values, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampBetween(Date value1, Date value2) {
            addCriterion("sig_utimestamp between", value1, value2, "sigUtimestamp");
            return (Criteria) this;
        }

        public Criteria andSigUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("sig_utimestamp not between", value1, value2, "sigUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(SignageMst.Column column) {
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

        public Criteria andSigUpdateUserIsNull() {
            addCriterion("sig_update_user is null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserIsNotNull() {
            addCriterion("sig_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserEqualTo(Long value) {
            addCriterion("sig_update_user =", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserNotEqualTo(Long value) {
            addCriterion("sig_update_user <>", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserGreaterThan(Long value) {
            addCriterion("sig_update_user >", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("sig_update_user >=", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserLessThan(Long value) {
            addCriterion("sig_update_user <", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("sig_update_user <=", value, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserIn(List<Long> values) {
            addCriterion("sig_update_user in", values, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserNotIn(List<Long> values) {
            addCriterion("sig_update_user not in", values, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserBetween(Long value1, Long value2) {
            addCriterion("sig_update_user between", value1, value2, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("sig_update_user not between", value1, value2, "sigUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameIsNull() {
            addCriterion("sig_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameIsNotNull() {
            addCriterion("sig_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameEqualTo(String value) {
            addCriterion("sig_update_sys_name =", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameNotEqualTo(String value) {
            addCriterion("sig_update_sys_name <>", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameGreaterThan(String value) {
            addCriterion("sig_update_sys_name >", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sig_update_sys_name >=", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLessThan(String value) {
            addCriterion("sig_update_sys_name <", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("sig_update_sys_name <=", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLike(String value) {
            addCriterion("sig_update_sys_name like", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameNotLike(String value) {
            addCriterion("sig_update_sys_name not like", value, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameIn(List<String> values) {
            addCriterion("sig_update_sys_name in", values, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameNotIn(List<String> values) {
            addCriterion("sig_update_sys_name not in", values, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameBetween(String value1, String value2) {
            addCriterion("sig_update_sys_name between", value1, value2, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("sig_update_sys_name not between", value1, value2, "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameIsNull() {
            addCriterion("sig_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameIsNotNull() {
            addCriterion("sig_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameEqualTo(String value) {
            addCriterion("sig_update_class_name =", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameNotEqualTo(String value) {
            addCriterion("sig_update_class_name <>", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameGreaterThan(String value) {
            addCriterion("sig_update_class_name >", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("sig_update_class_name >=", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLessThan(String value) {
            addCriterion("sig_update_class_name <", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("sig_update_class_name <=", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLike(String value) {
            addCriterion("sig_update_class_name like", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameNotLike(String value) {
            addCriterion("sig_update_class_name not like", value, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameIn(List<String> values) {
            addCriterion("sig_update_class_name in", values, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameNotIn(List<String> values) {
            addCriterion("sig_update_class_name not in", values, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameBetween(String value1, String value2) {
            addCriterion("sig_update_class_name between", value1, value2, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("sig_update_class_name not between", value1, value2, "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameIsNull() {
            addCriterion("sig_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameIsNotNull() {
            addCriterion("sig_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameEqualTo(String value) {
            addCriterion("sig_update_method_name =", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameNotEqualTo(String value) {
            addCriterion("sig_update_method_name <>", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameGreaterThan(String value) {
            addCriterion("sig_update_method_name >", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("sig_update_method_name >=", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLessThan(String value) {
            addCriterion("sig_update_method_name <", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("sig_update_method_name <=", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLike(String value) {
            addCriterion("sig_update_method_name like", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameNotLike(String value) {
            addCriterion("sig_update_method_name not like", value, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameIn(List<String> values) {
            addCriterion("sig_update_method_name in", values, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameNotIn(List<String> values) {
            addCriterion("sig_update_method_name not in", values, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("sig_update_method_name between", value1, value2, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("sig_update_method_name not between", value1, value2, "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnIsNull() {
            addCriterion("sig_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnIsNotNull() {
            addCriterion("sig_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnEqualTo(String value) {
            addCriterion("sig_update_crud_kbn =", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("sig_update_crud_kbn <>", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnGreaterThan(String value) {
            addCriterion("sig_update_crud_kbn >", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("sig_update_crud_kbn >=", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLessThan(String value) {
            addCriterion("sig_update_crud_kbn <", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("sig_update_crud_kbn <=", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLike(String value) {
            addCriterion("sig_update_crud_kbn like", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnNotLike(String value) {
            addCriterion("sig_update_crud_kbn not like", value, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnIn(List<String> values) {
            addCriterion("sig_update_crud_kbn in", values, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("sig_update_crud_kbn not in", values, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("sig_update_crud_kbn between", value1, value2, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("sig_update_crud_kbn not between", value1, value2, "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksIsNull() {
            addCriterion("sig_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksIsNotNull() {
            addCriterion("sig_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksEqualTo(String value) {
            addCriterion("sig_sys_remarks =", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksNotEqualTo(String value) {
            addCriterion("sig_sys_remarks <>", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksNotEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksGreaterThan(String value) {
            addCriterion("sig_sys_remarks >", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksGreaterThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("sig_sys_remarks >=", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksGreaterThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLessThan(String value) {
            addCriterion("sig_sys_remarks <", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLessThanColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("sig_sys_remarks <=", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLessThanOrEqualToColumn(SignageMst.Column column) {
            addCriterion(new StringBuilder("sig_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLike(String value) {
            addCriterion("sig_sys_remarks like", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksNotLike(String value) {
            addCriterion("sig_sys_remarks not like", value, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksIn(List<String> values) {
            addCriterion("sig_sys_remarks in", values, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksNotIn(List<String> values) {
            addCriterion("sig_sys_remarks not in", values, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksBetween(String value1, String value2) {
            addCriterion("sig_sys_remarks between", value1, value2, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksNotBetween(String value1, String value2) {
            addCriterion("sig_sys_remarks not between", value1, value2, "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria andSigImagePathLikeInsensitive(String value) {
            addCriterion("upper(sig_image_path) like", value.toUpperCase(), "sigImagePath");
            return (Criteria) this;
        }

        public Criteria andSigDelFlgLikeInsensitive(String value) {
            addCriterion("upper(sig_del_flg) like", value.toUpperCase(), "sigDelFlg");
            return (Criteria) this;
        }

        public Criteria andSigUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(sig_update_sys_name) like", value.toUpperCase(), "sigUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(sig_update_class_name) like", value.toUpperCase(), "sigUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(sig_update_method_name) like", value.toUpperCase(), "sigUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andSigUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(sig_update_crud_kbn) like", value.toUpperCase(), "sigUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andSigSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(sig_sys_remarks) like", value.toUpperCase(), "sigSysRemarks");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SignageMstCriteria example;

        protected Criteria(SignageMstCriteria example) {
            super();
            this.example = example;
        }

        public SignageMstCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.SignageMstCriteria example);
    }
}