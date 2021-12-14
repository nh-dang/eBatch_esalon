package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LayoutMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LayoutMstCriteria() {
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

    public LayoutMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public LayoutMstCriteria orderBy(String ... orderByClauses) {
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
        LayoutMstCriteria example = new LayoutMstCriteria();
        return example.createCriteria();
    }

    public LayoutMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public LayoutMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andLayIdIsNull() {
            addCriterion("lay_id is null");
            return (Criteria) this;
        }

        public Criteria andLayIdIsNotNull() {
            addCriterion("lay_id is not null");
            return (Criteria) this;
        }

        public Criteria andLayIdEqualTo(Long value) {
            addCriterion("lay_id =", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdNotEqualTo(Long value) {
            addCriterion("lay_id <>", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdGreaterThan(Long value) {
            addCriterion("lay_id >", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lay_id >=", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdLessThan(Long value) {
            addCriterion("lay_id <", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdLessThanOrEqualTo(Long value) {
            addCriterion("lay_id <=", value, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayIdIn(List<Long> values) {
            addCriterion("lay_id in", values, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdNotIn(List<Long> values) {
            addCriterion("lay_id not in", values, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdBetween(Long value1, Long value2) {
            addCriterion("lay_id between", value1, value2, "layId");
            return (Criteria) this;
        }

        public Criteria andLayIdNotBetween(Long value1, Long value2) {
            addCriterion("lay_id not between", value1, value2, "layId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdIsNull() {
            addCriterion("lay_shp_id is null");
            return (Criteria) this;
        }

        public Criteria andLayShpIdIsNotNull() {
            addCriterion("lay_shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andLayShpIdEqualTo(Long value) {
            addCriterion("lay_shp_id =", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdNotEqualTo(Long value) {
            addCriterion("lay_shp_id <>", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdGreaterThan(Long value) {
            addCriterion("lay_shp_id >", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lay_shp_id >=", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdLessThan(Long value) {
            addCriterion("lay_shp_id <", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdLessThanOrEqualTo(Long value) {
            addCriterion("lay_shp_id <=", value, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_shp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayShpIdIn(List<Long> values) {
            addCriterion("lay_shp_id in", values, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdNotIn(List<Long> values) {
            addCriterion("lay_shp_id not in", values, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdBetween(Long value1, Long value2) {
            addCriterion("lay_shp_id between", value1, value2, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayShpIdNotBetween(Long value1, Long value2) {
            addCriterion("lay_shp_id not between", value1, value2, "layShpId");
            return (Criteria) this;
        }

        public Criteria andLayContentIsNull() {
            addCriterion("lay_content is null");
            return (Criteria) this;
        }

        public Criteria andLayContentIsNotNull() {
            addCriterion("lay_content is not null");
            return (Criteria) this;
        }

        public Criteria andLayContentEqualTo(String value) {
            addCriterion("lay_content =", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentNotEqualTo(String value) {
            addCriterion("lay_content <>", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentGreaterThan(String value) {
            addCriterion("lay_content >", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentGreaterThanOrEqualTo(String value) {
            addCriterion("lay_content >=", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentLessThan(String value) {
            addCriterion("lay_content <", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentLessThanOrEqualTo(String value) {
            addCriterion("lay_content <=", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayContentLike(String value) {
            addCriterion("lay_content like", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentNotLike(String value) {
            addCriterion("lay_content not like", value, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentIn(List<String> values) {
            addCriterion("lay_content in", values, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentNotIn(List<String> values) {
            addCriterion("lay_content not in", values, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentBetween(String value1, String value2) {
            addCriterion("lay_content between", value1, value2, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayContentNotBetween(String value1, String value2) {
            addCriterion("lay_content not between", value1, value2, "layContent");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgIsNull() {
            addCriterion("lay_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgIsNotNull() {
            addCriterion("lay_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgEqualTo(String value) {
            addCriterion("lay_del_flg =", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgNotEqualTo(String value) {
            addCriterion("lay_del_flg <>", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgGreaterThan(String value) {
            addCriterion("lay_del_flg >", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("lay_del_flg >=", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLessThan(String value) {
            addCriterion("lay_del_flg <", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLessThanOrEqualTo(String value) {
            addCriterion("lay_del_flg <=", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLike(String value) {
            addCriterion("lay_del_flg like", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgNotLike(String value) {
            addCriterion("lay_del_flg not like", value, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgIn(List<String> values) {
            addCriterion("lay_del_flg in", values, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgNotIn(List<String> values) {
            addCriterion("lay_del_flg not in", values, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgBetween(String value1, String value2) {
            addCriterion("lay_del_flg between", value1, value2, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgNotBetween(String value1, String value2) {
            addCriterion("lay_del_flg not between", value1, value2, "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayCdateIsNull() {
            addCriterion("lay_cdate is null");
            return (Criteria) this;
        }

        public Criteria andLayCdateIsNotNull() {
            addCriterion("lay_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andLayCdateEqualTo(Date value) {
            addCriterionForJDBCDate("lay_cdate =", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lay_cdate <>", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lay_cdate >", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lay_cdate >=", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateLessThan(Date value) {
            addCriterionForJDBCDate("lay_cdate <", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lay_cdate <=", value, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCdateIn(List<Date> values) {
            addCriterionForJDBCDate("lay_cdate in", values, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lay_cdate not in", values, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lay_cdate between", value1, value2, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lay_cdate not between", value1, value2, "layCdate");
            return (Criteria) this;
        }

        public Criteria andLayCtimeIsNull() {
            addCriterion("lay_ctime is null");
            return (Criteria) this;
        }

        public Criteria andLayCtimeIsNotNull() {
            addCriterion("lay_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andLayCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("lay_ctime =", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lay_ctime <>", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lay_ctime >", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lay_ctime >=", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeLessThan(Date value) {
            addCriterionForJDBCTime("lay_ctime <", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lay_ctime <=", value, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("lay_ctime in", values, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lay_ctime not in", values, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lay_ctime between", value1, value2, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lay_ctime not between", value1, value2, "layCtime");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampIsNull() {
            addCriterion("lay_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampIsNotNull() {
            addCriterion("lay_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampEqualTo(Date value) {
            addCriterion("lay_ctimestamp =", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampNotEqualTo(Date value) {
            addCriterion("lay_ctimestamp <>", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampGreaterThan(Date value) {
            addCriterion("lay_ctimestamp >", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("lay_ctimestamp >=", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampLessThan(Date value) {
            addCriterion("lay_ctimestamp <", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("lay_ctimestamp <=", value, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayCtimestampIn(List<Date> values) {
            addCriterion("lay_ctimestamp in", values, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampNotIn(List<Date> values) {
            addCriterion("lay_ctimestamp not in", values, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampBetween(Date value1, Date value2) {
            addCriterion("lay_ctimestamp between", value1, value2, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("lay_ctimestamp not between", value1, value2, "layCtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUdateIsNull() {
            addCriterion("lay_udate is null");
            return (Criteria) this;
        }

        public Criteria andLayUdateIsNotNull() {
            addCriterion("lay_udate is not null");
            return (Criteria) this;
        }

        public Criteria andLayUdateEqualTo(Date value) {
            addCriterionForJDBCDate("lay_udate =", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lay_udate <>", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lay_udate >", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lay_udate >=", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateLessThan(Date value) {
            addCriterionForJDBCDate("lay_udate <", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lay_udate <=", value, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUdateIn(List<Date> values) {
            addCriterionForJDBCDate("lay_udate in", values, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lay_udate not in", values, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lay_udate between", value1, value2, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lay_udate not between", value1, value2, "layUdate");
            return (Criteria) this;
        }

        public Criteria andLayUtimeIsNull() {
            addCriterion("lay_utime is null");
            return (Criteria) this;
        }

        public Criteria andLayUtimeIsNotNull() {
            addCriterion("lay_utime is not null");
            return (Criteria) this;
        }

        public Criteria andLayUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("lay_utime =", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lay_utime <>", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lay_utime >", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lay_utime >=", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeLessThan(Date value) {
            addCriterionForJDBCTime("lay_utime <", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lay_utime <=", value, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("lay_utime in", values, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lay_utime not in", values, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lay_utime between", value1, value2, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lay_utime not between", value1, value2, "layUtime");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampIsNull() {
            addCriterion("lay_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampIsNotNull() {
            addCriterion("lay_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampEqualTo(Date value) {
            addCriterion("lay_utimestamp =", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampNotEqualTo(Date value) {
            addCriterion("lay_utimestamp <>", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampGreaterThan(Date value) {
            addCriterion("lay_utimestamp >", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("lay_utimestamp >=", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampLessThan(Date value) {
            addCriterion("lay_utimestamp <", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("lay_utimestamp <=", value, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUtimestampIn(List<Date> values) {
            addCriterion("lay_utimestamp in", values, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampNotIn(List<Date> values) {
            addCriterion("lay_utimestamp not in", values, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampBetween(Date value1, Date value2) {
            addCriterion("lay_utimestamp between", value1, value2, "layUtimestamp");
            return (Criteria) this;
        }

        public Criteria andLayUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("lay_utimestamp not between", value1, value2, "layUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(LayoutMst.Column column) {
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

        public Criteria andLayUpdateUserIsNull() {
            addCriterion("lay_update_user is null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserIsNotNull() {
            addCriterion("lay_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserEqualTo(Long value) {
            addCriterion("lay_update_user =", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserNotEqualTo(Long value) {
            addCriterion("lay_update_user <>", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserGreaterThan(Long value) {
            addCriterion("lay_update_user >", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("lay_update_user >=", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserLessThan(Long value) {
            addCriterion("lay_update_user <", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("lay_update_user <=", value, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserIn(List<Long> values) {
            addCriterion("lay_update_user in", values, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserNotIn(List<Long> values) {
            addCriterion("lay_update_user not in", values, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserBetween(Long value1, Long value2) {
            addCriterion("lay_update_user between", value1, value2, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("lay_update_user not between", value1, value2, "layUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameIsNull() {
            addCriterion("lay_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameIsNotNull() {
            addCriterion("lay_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameEqualTo(String value) {
            addCriterion("lay_update_sys_name =", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameNotEqualTo(String value) {
            addCriterion("lay_update_sys_name <>", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameGreaterThan(String value) {
            addCriterion("lay_update_sys_name >", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("lay_update_sys_name >=", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLessThan(String value) {
            addCriterion("lay_update_sys_name <", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("lay_update_sys_name <=", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLike(String value) {
            addCriterion("lay_update_sys_name like", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameNotLike(String value) {
            addCriterion("lay_update_sys_name not like", value, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameIn(List<String> values) {
            addCriterion("lay_update_sys_name in", values, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameNotIn(List<String> values) {
            addCriterion("lay_update_sys_name not in", values, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameBetween(String value1, String value2) {
            addCriterion("lay_update_sys_name between", value1, value2, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("lay_update_sys_name not between", value1, value2, "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameIsNull() {
            addCriterion("lay_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameIsNotNull() {
            addCriterion("lay_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameEqualTo(String value) {
            addCriterion("lay_update_class_name =", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameNotEqualTo(String value) {
            addCriterion("lay_update_class_name <>", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameGreaterThan(String value) {
            addCriterion("lay_update_class_name >", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("lay_update_class_name >=", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLessThan(String value) {
            addCriterion("lay_update_class_name <", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("lay_update_class_name <=", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLike(String value) {
            addCriterion("lay_update_class_name like", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameNotLike(String value) {
            addCriterion("lay_update_class_name not like", value, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameIn(List<String> values) {
            addCriterion("lay_update_class_name in", values, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameNotIn(List<String> values) {
            addCriterion("lay_update_class_name not in", values, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameBetween(String value1, String value2) {
            addCriterion("lay_update_class_name between", value1, value2, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("lay_update_class_name not between", value1, value2, "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameIsNull() {
            addCriterion("lay_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameIsNotNull() {
            addCriterion("lay_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameEqualTo(String value) {
            addCriterion("lay_update_method_name =", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameNotEqualTo(String value) {
            addCriterion("lay_update_method_name <>", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameGreaterThan(String value) {
            addCriterion("lay_update_method_name >", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("lay_update_method_name >=", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLessThan(String value) {
            addCriterion("lay_update_method_name <", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("lay_update_method_name <=", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLike(String value) {
            addCriterion("lay_update_method_name like", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameNotLike(String value) {
            addCriterion("lay_update_method_name not like", value, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameIn(List<String> values) {
            addCriterion("lay_update_method_name in", values, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameNotIn(List<String> values) {
            addCriterion("lay_update_method_name not in", values, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("lay_update_method_name between", value1, value2, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("lay_update_method_name not between", value1, value2, "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnIsNull() {
            addCriterion("lay_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnIsNotNull() {
            addCriterion("lay_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnEqualTo(String value) {
            addCriterion("lay_update_crud_kbn =", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("lay_update_crud_kbn <>", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnGreaterThan(String value) {
            addCriterion("lay_update_crud_kbn >", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("lay_update_crud_kbn >=", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLessThan(String value) {
            addCriterion("lay_update_crud_kbn <", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("lay_update_crud_kbn <=", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLike(String value) {
            addCriterion("lay_update_crud_kbn like", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnNotLike(String value) {
            addCriterion("lay_update_crud_kbn not like", value, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnIn(List<String> values) {
            addCriterion("lay_update_crud_kbn in", values, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("lay_update_crud_kbn not in", values, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("lay_update_crud_kbn between", value1, value2, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("lay_update_crud_kbn not between", value1, value2, "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksIsNull() {
            addCriterion("lay_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksIsNotNull() {
            addCriterion("lay_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksEqualTo(String value) {
            addCriterion("lay_sys_remarks =", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksNotEqualTo(String value) {
            addCriterion("lay_sys_remarks <>", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksGreaterThan(String value) {
            addCriterion("lay_sys_remarks >", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("lay_sys_remarks >=", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLessThan(String value) {
            addCriterion("lay_sys_remarks <", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLessThanOrEqualTo(String value) {
            addCriterion("lay_sys_remarks <=", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLike(String value) {
            addCriterion("lay_sys_remarks like", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksNotLike(String value) {
            addCriterion("lay_sys_remarks not like", value, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksIn(List<String> values) {
            addCriterion("lay_sys_remarks in", values, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksNotIn(List<String> values) {
            addCriterion("lay_sys_remarks not in", values, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksBetween(String value1, String value2) {
            addCriterion("lay_sys_remarks between", value1, value2, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksNotBetween(String value1, String value2) {
            addCriterion("lay_sys_remarks not between", value1, value2, "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySvgIsNull() {
            addCriterion("lay_svg is null");
            return (Criteria) this;
        }

        public Criteria andLaySvgIsNotNull() {
            addCriterion("lay_svg is not null");
            return (Criteria) this;
        }

        public Criteria andLaySvgEqualTo(String value) {
            addCriterion("lay_svg =", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgNotEqualTo(String value) {
            addCriterion("lay_svg <>", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgNotEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgGreaterThan(String value) {
            addCriterion("lay_svg >", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgGreaterThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgGreaterThanOrEqualTo(String value) {
            addCriterion("lay_svg >=", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgGreaterThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgLessThan(String value) {
            addCriterion("lay_svg <", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgLessThanColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgLessThanOrEqualTo(String value) {
            addCriterion("lay_svg <=", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgLessThanOrEqualToColumn(LayoutMst.Column column) {
            addCriterion(new StringBuilder("lay_svg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLaySvgLike(String value) {
            addCriterion("lay_svg like", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgNotLike(String value) {
            addCriterion("lay_svg not like", value, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgIn(List<String> values) {
            addCriterion("lay_svg in", values, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgNotIn(List<String> values) {
            addCriterion("lay_svg not in", values, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgBetween(String value1, String value2) {
            addCriterion("lay_svg between", value1, value2, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLaySvgNotBetween(String value1, String value2) {
            addCriterion("lay_svg not between", value1, value2, "laySvg");
            return (Criteria) this;
        }

        public Criteria andLayContentLikeInsensitive(String value) {
            addCriterion("upper(lay_content) like", value.toUpperCase(), "layContent");
            return (Criteria) this;
        }

        public Criteria andLayDelFlgLikeInsensitive(String value) {
            addCriterion("upper(lay_del_flg) like", value.toUpperCase(), "layDelFlg");
            return (Criteria) this;
        }

        public Criteria andLayUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(lay_update_sys_name) like", value.toUpperCase(), "layUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(lay_update_class_name) like", value.toUpperCase(), "layUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(lay_update_method_name) like", value.toUpperCase(), "layUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andLayUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(lay_update_crud_kbn) like", value.toUpperCase(), "layUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andLaySysRemarksLikeInsensitive(String value) {
            addCriterion("upper(lay_sys_remarks) like", value.toUpperCase(), "laySysRemarks");
            return (Criteria) this;
        }

        public Criteria andLaySvgLikeInsensitive(String value) {
            addCriterion("upper(lay_svg) like", value.toUpperCase(), "laySvg");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private LayoutMstCriteria example;

        protected Criteria(LayoutMstCriteria example) {
            super();
            this.example = example;
        }

        public LayoutMstCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.LayoutMstCriteria example);
    }
}