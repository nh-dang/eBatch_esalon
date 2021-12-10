package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChkoutHdrFilCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChkoutHdrFilCriteria() {
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

    public ChkoutHdrFilCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ChkoutHdrFilCriteria orderBy(String ... orderByClauses) {
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
        ChkoutHdrFilCriteria example = new ChkoutHdrFilCriteria();
        return example.createCriteria();
    }

    public ChkoutHdrFilCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ChkoutHdrFilCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andCohIdIsNull() {
            addCriterion("coh_id is null");
            return (Criteria) this;
        }

        public Criteria andCohIdIsNotNull() {
            addCriterion("coh_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohIdEqualTo(Long value) {
            addCriterion("coh_id =", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdNotEqualTo(Long value) {
            addCriterion("coh_id <>", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdGreaterThan(Long value) {
            addCriterion("coh_id >", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_id >=", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdLessThan(Long value) {
            addCriterion("coh_id <", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_id <=", value, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohIdIn(List<Long> values) {
            addCriterion("coh_id in", values, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdNotIn(List<Long> values) {
            addCriterion("coh_id not in", values, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdBetween(Long value1, Long value2) {
            addCriterion("coh_id between", value1, value2, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_id not between", value1, value2, "cohId");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnIsNull() {
            addCriterion("coh_sts_kbn is null");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnIsNotNull() {
            addCriterion("coh_sts_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnEqualTo(String value) {
            addCriterion("coh_sts_kbn =", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnNotEqualTo(String value) {
            addCriterion("coh_sts_kbn <>", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnGreaterThan(String value) {
            addCriterion("coh_sts_kbn >", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnGreaterThanOrEqualTo(String value) {
            addCriterion("coh_sts_kbn >=", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLessThan(String value) {
            addCriterion("coh_sts_kbn <", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLessThanOrEqualTo(String value) {
            addCriterion("coh_sts_kbn <=", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sts_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLike(String value) {
            addCriterion("coh_sts_kbn like", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnNotLike(String value) {
            addCriterion("coh_sts_kbn not like", value, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnIn(List<String> values) {
            addCriterion("coh_sts_kbn in", values, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnNotIn(List<String> values) {
            addCriterion("coh_sts_kbn not in", values, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnBetween(String value1, String value2) {
            addCriterion("coh_sts_kbn between", value1, value2, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnNotBetween(String value1, String value2) {
            addCriterion("coh_sts_kbn not between", value1, value2, "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohDateIsNull() {
            addCriterion("coh_date is null");
            return (Criteria) this;
        }

        public Criteria andCohDateIsNotNull() {
            addCriterion("coh_date is not null");
            return (Criteria) this;
        }

        public Criteria andCohDateEqualTo(Date value) {
            addCriterionForJDBCDate("coh_date =", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("coh_date <>", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateGreaterThan(Date value) {
            addCriterionForJDBCDate("coh_date >", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_date >=", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateLessThan(Date value) {
            addCriterionForJDBCDate("coh_date <", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_date <=", value, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDateIn(List<Date> values) {
            addCriterionForJDBCDate("coh_date in", values, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("coh_date not in", values, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_date between", value1, value2, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_date not between", value1, value2, "cohDate");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeIsNull() {
            addCriterion("coh_ent_time is null");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeIsNotNull() {
            addCriterion("coh_ent_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ent_time =", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ent_time <>", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_ent_time >", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ent_time >=", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_ent_time <", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ent_time <=", value, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ent_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEntTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_ent_time in", values, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_ent_time not in", values, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_ent_time between", value1, value2, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohEntTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_ent_time not between", value1, value2, "cohEntTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeIsNull() {
            addCriterion("coh_wait_time is null");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeIsNotNull() {
            addCriterion("coh_wait_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeEqualTo(Integer value) {
            addCriterion("coh_wait_time =", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeNotEqualTo(Integer value) {
            addCriterion("coh_wait_time <>", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeGreaterThan(Integer value) {
            addCriterion("coh_wait_time >", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coh_wait_time >=", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeLessThan(Integer value) {
            addCriterion("coh_wait_time <", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("coh_wait_time <=", value, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_wait_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeIn(List<Integer> values) {
            addCriterion("coh_wait_time in", values, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeNotIn(List<Integer> values) {
            addCriterion("coh_wait_time not in", values, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeBetween(Integer value1, Integer value2) {
            addCriterion("coh_wait_time between", value1, value2, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohWaitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("coh_wait_time not between", value1, value2, "cohWaitTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeIsNull() {
            addCriterion("coh_str_time is null");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeIsNotNull() {
            addCriterion("coh_str_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_str_time =", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_str_time <>", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_str_time >", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_str_time >=", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_str_time <", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_str_time <=", value, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_str_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStrTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_str_time in", values, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_str_time not in", values, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_str_time between", value1, value2, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohStrTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_str_time not between", value1, value2, "cohStrTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeIsNull() {
            addCriterion("coh_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeIsNotNull() {
            addCriterion("coh_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_end_time =", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_end_time <>", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_end_time >", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_end_time >=", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_end_time <", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_end_time <=", value, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_end_time in", values, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_end_time not in", values, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_end_time between", value1, value2, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_end_time not between", value1, value2, "cohEndTime");
            return (Criteria) this;
        }

        public Criteria andCohShpIdIsNull() {
            addCriterion("coh_shp_id is null");
            return (Criteria) this;
        }

        public Criteria andCohShpIdIsNotNull() {
            addCriterion("coh_shp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohShpIdEqualTo(Long value) {
            addCriterion("coh_shp_id =", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdNotEqualTo(Long value) {
            addCriterion("coh_shp_id <>", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdGreaterThan(Long value) {
            addCriterion("coh_shp_id >", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_shp_id >=", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdLessThan(Long value) {
            addCriterion("coh_shp_id <", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_shp_id <=", value, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_shp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohShpIdIn(List<Long> values) {
            addCriterion("coh_shp_id in", values, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdNotIn(List<Long> values) {
            addCriterion("coh_shp_id not in", values, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdBetween(Long value1, Long value2) {
            addCriterion("coh_shp_id between", value1, value2, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohShpIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_shp_id not between", value1, value2, "cohShpId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdIsNull() {
            addCriterion("coh_cst_id is null");
            return (Criteria) this;
        }

        public Criteria andCohCstIdIsNotNull() {
            addCriterion("coh_cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohCstIdEqualTo(Long value) {
            addCriterion("coh_cst_id =", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdNotEqualTo(Long value) {
            addCriterion("coh_cst_id <>", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdGreaterThan(Long value) {
            addCriterion("coh_cst_id >", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_cst_id >=", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdLessThan(Long value) {
            addCriterion("coh_cst_id <", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_cst_id <=", value, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstIdIn(List<Long> values) {
            addCriterion("coh_cst_id in", values, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdNotIn(List<Long> values) {
            addCriterion("coh_cst_id not in", values, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdBetween(Long value1, Long value2) {
            addCriterion("coh_cst_id between", value1, value2, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohCstIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_cst_id not between", value1, value2, "cohCstId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdIsNull() {
            addCriterion("coh_stf_id is null");
            return (Criteria) this;
        }

        public Criteria andCohStfIdIsNotNull() {
            addCriterion("coh_stf_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohStfIdEqualTo(Long value) {
            addCriterion("coh_stf_id =", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdNotEqualTo(Long value) {
            addCriterion("coh_stf_id <>", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdGreaterThan(Long value) {
            addCriterion("coh_stf_id >", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_stf_id >=", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdLessThan(Long value) {
            addCriterion("coh_stf_id <", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_stf_id <=", value, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_stf_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohStfIdIn(List<Long> values) {
            addCriterion("coh_stf_id in", values, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdNotIn(List<Long> values) {
            addCriterion("coh_stf_id not in", values, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdBetween(Long value1, Long value2) {
            addCriterion("coh_stf_id between", value1, value2, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohStfIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_stf_id not between", value1, value2, "cohStfId");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgIsNull() {
            addCriterion("coh_apnt_flg is null");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgIsNotNull() {
            addCriterion("coh_apnt_flg is not null");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgEqualTo(String value) {
            addCriterion("coh_apnt_flg =", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgNotEqualTo(String value) {
            addCriterion("coh_apnt_flg <>", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgGreaterThan(String value) {
            addCriterion("coh_apnt_flg >", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgGreaterThanOrEqualTo(String value) {
            addCriterion("coh_apnt_flg >=", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLessThan(String value) {
            addCriterion("coh_apnt_flg <", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLessThanOrEqualTo(String value) {
            addCriterion("coh_apnt_flg <=", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_apnt_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLike(String value) {
            addCriterion("coh_apnt_flg like", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgNotLike(String value) {
            addCriterion("coh_apnt_flg not like", value, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgIn(List<String> values) {
            addCriterion("coh_apnt_flg in", values, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgNotIn(List<String> values) {
            addCriterion("coh_apnt_flg not in", values, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgBetween(String value1, String value2) {
            addCriterion("coh_apnt_flg between", value1, value2, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgNotBetween(String value1, String value2) {
            addCriterion("coh_apnt_flg not between", value1, value2, "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnIsNull() {
            addCriterion("coh_cst_kbn is null");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnIsNotNull() {
            addCriterion("coh_cst_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnEqualTo(String value) {
            addCriterion("coh_cst_kbn =", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnNotEqualTo(String value) {
            addCriterion("coh_cst_kbn <>", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnGreaterThan(String value) {
            addCriterion("coh_cst_kbn >", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnGreaterThanOrEqualTo(String value) {
            addCriterion("coh_cst_kbn >=", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLessThan(String value) {
            addCriterion("coh_cst_kbn <", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLessThanOrEqualTo(String value) {
            addCriterion("coh_cst_kbn <=", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cst_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLike(String value) {
            addCriterion("coh_cst_kbn like", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnNotLike(String value) {
            addCriterion("coh_cst_kbn not like", value, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnIn(List<String> values) {
            addCriterion("coh_cst_kbn in", values, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnNotIn(List<String> values) {
            addCriterion("coh_cst_kbn not in", values, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnBetween(String value1, String value2) {
            addCriterion("coh_cst_kbn between", value1, value2, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnNotBetween(String value1, String value2) {
            addCriterion("coh_cst_kbn not between", value1, value2, "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohTagNoIsNull() {
            addCriterion("coh_tag_no is null");
            return (Criteria) this;
        }

        public Criteria andCohTagNoIsNotNull() {
            addCriterion("coh_tag_no is not null");
            return (Criteria) this;
        }

        public Criteria andCohTagNoEqualTo(String value) {
            addCriterion("coh_tag_no =", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoNotEqualTo(String value) {
            addCriterion("coh_tag_no <>", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoGreaterThan(String value) {
            addCriterion("coh_tag_no >", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoGreaterThanOrEqualTo(String value) {
            addCriterion("coh_tag_no >=", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoLessThan(String value) {
            addCriterion("coh_tag_no <", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoLessThanOrEqualTo(String value) {
            addCriterion("coh_tag_no <=", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_tag_no <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTagNoLike(String value) {
            addCriterion("coh_tag_no like", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoNotLike(String value) {
            addCriterion("coh_tag_no not like", value, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoIn(List<String> values) {
            addCriterion("coh_tag_no in", values, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoNotIn(List<String> values) {
            addCriterion("coh_tag_no not in", values, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoBetween(String value1, String value2) {
            addCriterion("coh_tag_no between", value1, value2, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTagNoNotBetween(String value1, String value2) {
            addCriterion("coh_tag_no not between", value1, value2, "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceIsNull() {
            addCriterion("coh_total_price is null");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceIsNotNull() {
            addCriterion("coh_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceEqualTo(Long value) {
            addCriterion("coh_total_price =", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceNotEqualTo(Long value) {
            addCriterion("coh_total_price <>", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceGreaterThan(Long value) {
            addCriterion("coh_total_price >", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_total_price >=", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceLessThan(Long value) {
            addCriterion("coh_total_price <", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("coh_total_price <=", value, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceIn(List<Long> values) {
            addCriterion("coh_total_price in", values, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceNotIn(List<Long> values) {
            addCriterion("coh_total_price not in", values, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceBetween(Long value1, Long value2) {
            addCriterion("coh_total_price between", value1, value2, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("coh_total_price not between", value1, value2, "cohTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxIsNull() {
            addCriterion("coh_total_tax is null");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxIsNotNull() {
            addCriterion("coh_total_tax is not null");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxEqualTo(Long value) {
            addCriterion("coh_total_tax =", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxNotEqualTo(Long value) {
            addCriterion("coh_total_tax <>", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxGreaterThan(Long value) {
            addCriterion("coh_total_tax >", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_total_tax >=", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxLessThan(Long value) {
            addCriterion("coh_total_tax <", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxLessThanOrEqualTo(Long value) {
            addCriterion("coh_total_tax <=", value, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_total_tax <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxIn(List<Long> values) {
            addCriterion("coh_total_tax in", values, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxNotIn(List<Long> values) {
            addCriterion("coh_total_tax not in", values, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxBetween(Long value1, Long value2) {
            addCriterion("coh_total_tax between", value1, value2, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohTotalTaxNotBetween(Long value1, Long value2) {
            addCriterion("coh_total_tax not between", value1, value2, "cohTotalTax");
            return (Criteria) this;
        }

        public Criteria andCohRemarksIsNull() {
            addCriterion("coh_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCohRemarksIsNotNull() {
            addCriterion("coh_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCohRemarksEqualTo(String value) {
            addCriterion("coh_remarks =", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksNotEqualTo(String value) {
            addCriterion("coh_remarks <>", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksGreaterThan(String value) {
            addCriterion("coh_remarks >", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("coh_remarks >=", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksLessThan(String value) {
            addCriterion("coh_remarks <", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksLessThanOrEqualTo(String value) {
            addCriterion("coh_remarks <=", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRemarksLike(String value) {
            addCriterion("coh_remarks like", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksNotLike(String value) {
            addCriterion("coh_remarks not like", value, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksIn(List<String> values) {
            addCriterion("coh_remarks in", values, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksNotIn(List<String> values) {
            addCriterion("coh_remarks not in", values, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksBetween(String value1, String value2) {
            addCriterion("coh_remarks between", value1, value2, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohRemarksNotBetween(String value1, String value2) {
            addCriterion("coh_remarks not between", value1, value2, "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrIsNull() {
            addCriterion("coh_avl_date_fr is null");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrIsNotNull() {
            addCriterion("coh_avl_date_fr is not null");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr =", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrNotEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr <>", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrGreaterThan(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr >", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr >=", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrLessThan(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr <", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_fr <=", value, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_fr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrIn(List<Date> values) {
            addCriterionForJDBCDate("coh_avl_date_fr in", values, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrNotIn(List<Date> values) {
            addCriterionForJDBCDate("coh_avl_date_fr not in", values, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_avl_date_fr between", value1, value2, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateFrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_avl_date_fr not between", value1, value2, "cohAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToIsNull() {
            addCriterion("coh_avl_date_to is null");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToIsNotNull() {
            addCriterion("coh_avl_date_to is not null");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to =", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToNotEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to <>", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToGreaterThan(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to >", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to >=", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToLessThan(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to <", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_avl_date_to <=", value, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_avl_date_to <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToIn(List<Date> values) {
            addCriterionForJDBCDate("coh_avl_date_to in", values, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToNotIn(List<Date> values) {
            addCriterionForJDBCDate("coh_avl_date_to not in", values, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_avl_date_to between", value1, value2, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohAvlDateToNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_avl_date_to not between", value1, value2, "cohAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgIsNull() {
            addCriterion("coh_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgIsNotNull() {
            addCriterion("coh_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgEqualTo(String value) {
            addCriterion("coh_del_flg =", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgNotEqualTo(String value) {
            addCriterion("coh_del_flg <>", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgGreaterThan(String value) {
            addCriterion("coh_del_flg >", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("coh_del_flg >=", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLessThan(String value) {
            addCriterion("coh_del_flg <", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLessThanOrEqualTo(String value) {
            addCriterion("coh_del_flg <=", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLike(String value) {
            addCriterion("coh_del_flg like", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgNotLike(String value) {
            addCriterion("coh_del_flg not like", value, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgIn(List<String> values) {
            addCriterion("coh_del_flg in", values, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgNotIn(List<String> values) {
            addCriterion("coh_del_flg not in", values, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgBetween(String value1, String value2) {
            addCriterion("coh_del_flg between", value1, value2, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgNotBetween(String value1, String value2) {
            addCriterion("coh_del_flg not between", value1, value2, "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohCdateIsNull() {
            addCriterion("coh_cdate is null");
            return (Criteria) this;
        }

        public Criteria andCohCdateIsNotNull() {
            addCriterion("coh_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCohCdateEqualTo(Date value) {
            addCriterionForJDBCDate("coh_cdate =", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("coh_cdate <>", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("coh_cdate >", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_cdate >=", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateLessThan(Date value) {
            addCriterionForJDBCDate("coh_cdate <", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_cdate <=", value, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCdateIn(List<Date> values) {
            addCriterionForJDBCDate("coh_cdate in", values, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("coh_cdate not in", values, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_cdate between", value1, value2, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_cdate not between", value1, value2, "cohCdate");
            return (Criteria) this;
        }

        public Criteria andCohCtimeIsNull() {
            addCriterion("coh_ctime is null");
            return (Criteria) this;
        }

        public Criteria andCohCtimeIsNotNull() {
            addCriterion("coh_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCohCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ctime =", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ctime <>", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_ctime >", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ctime >=", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_ctime <", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_ctime <=", value, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_ctime in", values, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_ctime not in", values, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_ctime between", value1, value2, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_ctime not between", value1, value2, "cohCtime");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampIsNull() {
            addCriterion("coh_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampIsNotNull() {
            addCriterion("coh_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampEqualTo(Date value) {
            addCriterion("coh_ctimestamp =", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampNotEqualTo(Date value) {
            addCriterion("coh_ctimestamp <>", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampGreaterThan(Date value) {
            addCriterion("coh_ctimestamp >", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("coh_ctimestamp >=", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampLessThan(Date value) {
            addCriterion("coh_ctimestamp <", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("coh_ctimestamp <=", value, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohCtimestampIn(List<Date> values) {
            addCriterion("coh_ctimestamp in", values, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampNotIn(List<Date> values) {
            addCriterion("coh_ctimestamp not in", values, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampBetween(Date value1, Date value2) {
            addCriterion("coh_ctimestamp between", value1, value2, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("coh_ctimestamp not between", value1, value2, "cohCtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUdateIsNull() {
            addCriterion("coh_udate is null");
            return (Criteria) this;
        }

        public Criteria andCohUdateIsNotNull() {
            addCriterion("coh_udate is not null");
            return (Criteria) this;
        }

        public Criteria andCohUdateEqualTo(Date value) {
            addCriterionForJDBCDate("coh_udate =", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("coh_udate <>", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("coh_udate >", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_udate >=", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateLessThan(Date value) {
            addCriterionForJDBCDate("coh_udate <", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coh_udate <=", value, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUdateIn(List<Date> values) {
            addCriterionForJDBCDate("coh_udate in", values, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("coh_udate not in", values, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_udate between", value1, value2, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coh_udate not between", value1, value2, "cohUdate");
            return (Criteria) this;
        }

        public Criteria andCohUtimeIsNull() {
            addCriterion("coh_utime is null");
            return (Criteria) this;
        }

        public Criteria andCohUtimeIsNotNull() {
            addCriterion("coh_utime is not null");
            return (Criteria) this;
        }

        public Criteria andCohUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_utime =", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_utime <>", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_utime >", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_utime >=", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_utime <", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_utime <=", value, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_utime in", values, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_utime not in", values, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_utime between", value1, value2, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_utime not between", value1, value2, "cohUtime");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampIsNull() {
            addCriterion("coh_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampIsNotNull() {
            addCriterion("coh_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampEqualTo(Date value) {
            addCriterion("coh_utimestamp =", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampNotEqualTo(Date value) {
            addCriterion("coh_utimestamp <>", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampGreaterThan(Date value) {
            addCriterion("coh_utimestamp >", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("coh_utimestamp >=", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampLessThan(Date value) {
            addCriterion("coh_utimestamp <", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("coh_utimestamp <=", value, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUtimestampIn(List<Date> values) {
            addCriterion("coh_utimestamp in", values, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampNotIn(List<Date> values) {
            addCriterion("coh_utimestamp not in", values, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampBetween(Date value1, Date value2) {
            addCriterion("coh_utimestamp between", value1, value2, "cohUtimestamp");
            return (Criteria) this;
        }

        public Criteria andCohUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("coh_utimestamp not between", value1, value2, "cohUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
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

        public Criteria andCohUpdateUserIsNull() {
            addCriterion("coh_update_user is null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserIsNotNull() {
            addCriterion("coh_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserEqualTo(Long value) {
            addCriterion("coh_update_user =", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserNotEqualTo(Long value) {
            addCriterion("coh_update_user <>", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserGreaterThan(Long value) {
            addCriterion("coh_update_user >", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_update_user >=", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserLessThan(Long value) {
            addCriterion("coh_update_user <", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("coh_update_user <=", value, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserIn(List<Long> values) {
            addCriterion("coh_update_user in", values, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserNotIn(List<Long> values) {
            addCriterion("coh_update_user not in", values, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserBetween(Long value1, Long value2) {
            addCriterion("coh_update_user between", value1, value2, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("coh_update_user not between", value1, value2, "cohUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameIsNull() {
            addCriterion("coh_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameIsNotNull() {
            addCriterion("coh_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameEqualTo(String value) {
            addCriterion("coh_update_sys_name =", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameNotEqualTo(String value) {
            addCriterion("coh_update_sys_name <>", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameGreaterThan(String value) {
            addCriterion("coh_update_sys_name >", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("coh_update_sys_name >=", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLessThan(String value) {
            addCriterion("coh_update_sys_name <", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("coh_update_sys_name <=", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLike(String value) {
            addCriterion("coh_update_sys_name like", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameNotLike(String value) {
            addCriterion("coh_update_sys_name not like", value, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameIn(List<String> values) {
            addCriterion("coh_update_sys_name in", values, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameNotIn(List<String> values) {
            addCriterion("coh_update_sys_name not in", values, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameBetween(String value1, String value2) {
            addCriterion("coh_update_sys_name between", value1, value2, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("coh_update_sys_name not between", value1, value2, "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameIsNull() {
            addCriterion("coh_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameIsNotNull() {
            addCriterion("coh_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameEqualTo(String value) {
            addCriterion("coh_update_class_name =", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameNotEqualTo(String value) {
            addCriterion("coh_update_class_name <>", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameGreaterThan(String value) {
            addCriterion("coh_update_class_name >", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("coh_update_class_name >=", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLessThan(String value) {
            addCriterion("coh_update_class_name <", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("coh_update_class_name <=", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLike(String value) {
            addCriterion("coh_update_class_name like", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameNotLike(String value) {
            addCriterion("coh_update_class_name not like", value, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameIn(List<String> values) {
            addCriterion("coh_update_class_name in", values, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameNotIn(List<String> values) {
            addCriterion("coh_update_class_name not in", values, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameBetween(String value1, String value2) {
            addCriterion("coh_update_class_name between", value1, value2, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("coh_update_class_name not between", value1, value2, "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameIsNull() {
            addCriterion("coh_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameIsNotNull() {
            addCriterion("coh_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameEqualTo(String value) {
            addCriterion("coh_update_method_name =", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameNotEqualTo(String value) {
            addCriterion("coh_update_method_name <>", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameGreaterThan(String value) {
            addCriterion("coh_update_method_name >", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("coh_update_method_name >=", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLessThan(String value) {
            addCriterion("coh_update_method_name <", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("coh_update_method_name <=", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLike(String value) {
            addCriterion("coh_update_method_name like", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameNotLike(String value) {
            addCriterion("coh_update_method_name not like", value, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameIn(List<String> values) {
            addCriterion("coh_update_method_name in", values, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameNotIn(List<String> values) {
            addCriterion("coh_update_method_name not in", values, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("coh_update_method_name between", value1, value2, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("coh_update_method_name not between", value1, value2, "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnIsNull() {
            addCriterion("coh_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnIsNotNull() {
            addCriterion("coh_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnEqualTo(String value) {
            addCriterion("coh_update_crud_kbn =", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("coh_update_crud_kbn <>", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnGreaterThan(String value) {
            addCriterion("coh_update_crud_kbn >", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("coh_update_crud_kbn >=", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLessThan(String value) {
            addCriterion("coh_update_crud_kbn <", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("coh_update_crud_kbn <=", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLike(String value) {
            addCriterion("coh_update_crud_kbn like", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnNotLike(String value) {
            addCriterion("coh_update_crud_kbn not like", value, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnIn(List<String> values) {
            addCriterion("coh_update_crud_kbn in", values, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("coh_update_crud_kbn not in", values, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("coh_update_crud_kbn between", value1, value2, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("coh_update_crud_kbn not between", value1, value2, "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksIsNull() {
            addCriterion("coh_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksIsNotNull() {
            addCriterion("coh_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksEqualTo(String value) {
            addCriterion("coh_sys_remarks =", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksNotEqualTo(String value) {
            addCriterion("coh_sys_remarks <>", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksGreaterThan(String value) {
            addCriterion("coh_sys_remarks >", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("coh_sys_remarks >=", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLessThan(String value) {
            addCriterion("coh_sys_remarks <", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("coh_sys_remarks <=", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLike(String value) {
            addCriterion("coh_sys_remarks like", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksNotLike(String value) {
            addCriterion("coh_sys_remarks not like", value, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksIn(List<String> values) {
            addCriterion("coh_sys_remarks in", values, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksNotIn(List<String> values) {
            addCriterion("coh_sys_remarks not in", values, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksBetween(String value1, String value2) {
            addCriterion("coh_sys_remarks between", value1, value2, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksNotBetween(String value1, String value2) {
            addCriterion("coh_sys_remarks not between", value1, value2, "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohBefIdIsNull() {
            addCriterion("coh_bef_id is null");
            return (Criteria) this;
        }

        public Criteria andCohBefIdIsNotNull() {
            addCriterion("coh_bef_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohBefIdEqualTo(Long value) {
            addCriterion("coh_bef_id =", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdNotEqualTo(Long value) {
            addCriterion("coh_bef_id <>", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdGreaterThan(Long value) {
            addCriterion("coh_bef_id >", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_bef_id >=", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdLessThan(Long value) {
            addCriterion("coh_bef_id <", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_bef_id <=", value, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_bef_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohBefIdIn(List<Long> values) {
            addCriterion("coh_bef_id in", values, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdNotIn(List<Long> values) {
            addCriterion("coh_bef_id not in", values, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdBetween(Long value1, Long value2) {
            addCriterion("coh_bef_id between", value1, value2, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohBefIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_bef_id not between", value1, value2, "cohBefId");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeIsNull() {
            addCriterion("coh_reserv_str_time is null");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeIsNotNull() {
            addCriterion("coh_reserv_str_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time =", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time <>", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time >", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time >=", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time <", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_str_time <=", value, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_str_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_reserv_str_time in", values, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_reserv_str_time not in", values, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_reserv_str_time between", value1, value2, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservStrTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_reserv_str_time not between", value1, value2, "cohReservStrTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeIsNull() {
            addCriterion("coh_reserv_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeIsNotNull() {
            addCriterion("coh_reserv_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time =", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time <>", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time >", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time >=", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time <", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_reserv_end_time <=", value, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_reserv_end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_reserv_end_time in", values, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_reserv_end_time not in", values, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_reserv_end_time between", value1, value2, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohReservEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_reserv_end_time not between", value1, value2, "cohReservEndTime");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuIsNull() {
            addCriterion("coh_raiten_kaisu is null");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuIsNotNull() {
            addCriterion("coh_raiten_kaisu is not null");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuEqualTo(Integer value) {
            addCriterion("coh_raiten_kaisu =", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuNotEqualTo(Integer value) {
            addCriterion("coh_raiten_kaisu <>", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuGreaterThan(Integer value) {
            addCriterion("coh_raiten_kaisu >", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuGreaterThanOrEqualTo(Integer value) {
            addCriterion("coh_raiten_kaisu >=", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuLessThan(Integer value) {
            addCriterion("coh_raiten_kaisu <", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuLessThanOrEqualTo(Integer value) {
            addCriterion("coh_raiten_kaisu <=", value, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kaisu <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuIn(List<Integer> values) {
            addCriterion("coh_raiten_kaisu in", values, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuNotIn(List<Integer> values) {
            addCriterion("coh_raiten_kaisu not in", values, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuBetween(Integer value1, Integer value2) {
            addCriterion("coh_raiten_kaisu between", value1, value2, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKaisuNotBetween(Integer value1, Integer value2) {
            addCriterion("coh_raiten_kaisu not between", value1, value2, "cohRaitenKaisu");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuIsNull() {
            addCriterion("coh_raiten_kankaku is null");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuIsNotNull() {
            addCriterion("coh_raiten_kankaku is not null");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuEqualTo(Long value) {
            addCriterion("coh_raiten_kankaku =", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuNotEqualTo(Long value) {
            addCriterion("coh_raiten_kankaku <>", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuGreaterThan(Long value) {
            addCriterion("coh_raiten_kankaku >", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_raiten_kankaku >=", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuLessThan(Long value) {
            addCriterion("coh_raiten_kankaku <", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuLessThanOrEqualTo(Long value) {
            addCriterion("coh_raiten_kankaku <=", value, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_raiten_kankaku <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuIn(List<Long> values) {
            addCriterion("coh_raiten_kankaku in", values, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuNotIn(List<Long> values) {
            addCriterion("coh_raiten_kankaku not in", values, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuBetween(Long value1, Long value2) {
            addCriterion("coh_raiten_kankaku between", value1, value2, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohRaitenKankakuNotBetween(Long value1, Long value2) {
            addCriterion("coh_raiten_kankaku not between", value1, value2, "cohRaitenKankaku");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksIsNull() {
            addCriterion("coh_receipt_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksIsNotNull() {
            addCriterion("coh_receipt_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksEqualTo(String value) {
            addCriterion("coh_receipt_remarks =", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksNotEqualTo(String value) {
            addCriterion("coh_receipt_remarks <>", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksGreaterThan(String value) {
            addCriterion("coh_receipt_remarks >", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("coh_receipt_remarks >=", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLessThan(String value) {
            addCriterion("coh_receipt_remarks <", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLessThanOrEqualTo(String value) {
            addCriterion("coh_receipt_remarks <=", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_receipt_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLike(String value) {
            addCriterion("coh_receipt_remarks like", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksNotLike(String value) {
            addCriterion("coh_receipt_remarks not like", value, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksIn(List<String> values) {
            addCriterion("coh_receipt_remarks in", values, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksNotIn(List<String> values) {
            addCriterion("coh_receipt_remarks not in", values, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksBetween(String value1, String value2) {
            addCriterion("coh_receipt_remarks between", value1, value2, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksNotBetween(String value1, String value2) {
            addCriterion("coh_receipt_remarks not between", value1, value2, "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksIsNull() {
            addCriterion("coh_kaijyo_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksIsNotNull() {
            addCriterion("coh_kaijyo_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksEqualTo(String value) {
            addCriterion("coh_kaijyo_remarks =", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksNotEqualTo(String value) {
            addCriterion("coh_kaijyo_remarks <>", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksGreaterThan(String value) {
            addCriterion("coh_kaijyo_remarks >", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("coh_kaijyo_remarks >=", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLessThan(String value) {
            addCriterion("coh_kaijyo_remarks <", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLessThanOrEqualTo(String value) {
            addCriterion("coh_kaijyo_remarks <=", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_kaijyo_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLike(String value) {
            addCriterion("coh_kaijyo_remarks like", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksNotLike(String value) {
            addCriterion("coh_kaijyo_remarks not like", value, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksIn(List<String> values) {
            addCriterion("coh_kaijyo_remarks in", values, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksNotIn(List<String> values) {
            addCriterion("coh_kaijyo_remarks not in", values, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksBetween(String value1, String value2) {
            addCriterion("coh_kaijyo_remarks between", value1, value2, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksNotBetween(String value1, String value2) {
            addCriterion("coh_kaijyo_remarks not between", value1, value2, "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeIsNull() {
            addCriterion("coh_expt_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeIsNotNull() {
            addCriterion("coh_expt_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeEqualTo(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time =", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time <>", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time >", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time >=", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeLessThan(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time <", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("coh_expt_finish_time <=", value, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_expt_finish_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeIn(List<Date> values) {
            addCriterionForJDBCTime("coh_expt_finish_time in", values, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("coh_expt_finish_time not in", values, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_expt_finish_time between", value1, value2, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohExptFinishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("coh_expt_finish_time not between", value1, value2, "cohExptFinishTime");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotIsNull() {
            addCriterion("coh_visit_mot is null");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotIsNotNull() {
            addCriterion("coh_visit_mot is not null");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotEqualTo(String value) {
            addCriterion("coh_visit_mot =", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotNotEqualTo(String value) {
            addCriterion("coh_visit_mot <>", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotGreaterThan(String value) {
            addCriterion("coh_visit_mot >", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotGreaterThanOrEqualTo(String value) {
            addCriterion("coh_visit_mot >=", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLessThan(String value) {
            addCriterion("coh_visit_mot <", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLessThanOrEqualTo(String value) {
            addCriterion("coh_visit_mot <=", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_visit_mot <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLike(String value) {
            addCriterion("coh_visit_mot like", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotNotLike(String value) {
            addCriterion("coh_visit_mot not like", value, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotIn(List<String> values) {
            addCriterion("coh_visit_mot in", values, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotNotIn(List<String> values) {
            addCriterion("coh_visit_mot not in", values, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotBetween(String value1, String value2) {
            addCriterion("coh_visit_mot between", value1, value2, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotNotBetween(String value1, String value2) {
            addCriterion("coh_visit_mot not between", value1, value2, "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdIsNull() {
            addCriterion("coh_rsv_id is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdIsNotNull() {
            addCriterion("coh_rsv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdEqualTo(Long value) {
            addCriterion("coh_rsv_id =", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdNotEqualTo(Long value) {
            addCriterion("coh_rsv_id <>", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdGreaterThan(Long value) {
            addCriterion("coh_rsv_id >", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_rsv_id >=", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdLessThan(Long value) {
            addCriterion("coh_rsv_id <", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_rsv_id <=", value, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvIdIn(List<Long> values) {
            addCriterion("coh_rsv_id in", values, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdNotIn(List<Long> values) {
            addCriterion("coh_rsv_id not in", values, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdBetween(Long value1, Long value2) {
            addCriterion("coh_rsv_id between", value1, value2, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_rsv_id not between", value1, value2, "cohRsvId");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtIsNull() {
            addCriterion("coh_rsv_rte_sbt is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtIsNotNull() {
            addCriterion("coh_rsv_rte_sbt is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtEqualTo(String value) {
            addCriterion("coh_rsv_rte_sbt =", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtNotEqualTo(String value) {
            addCriterion("coh_rsv_rte_sbt <>", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtGreaterThan(String value) {
            addCriterion("coh_rsv_rte_sbt >", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtGreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_rte_sbt >=", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLessThan(String value) {
            addCriterion("coh_rsv_rte_sbt <", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_rte_sbt <=", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_rte_sbt <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLike(String value) {
            addCriterion("coh_rsv_rte_sbt like", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtNotLike(String value) {
            addCriterion("coh_rsv_rte_sbt not like", value, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtIn(List<String> values) {
            addCriterion("coh_rsv_rte_sbt in", values, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtNotIn(List<String> values) {
            addCriterion("coh_rsv_rte_sbt not in", values, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtBetween(String value1, String value2) {
            addCriterion("coh_rsv_rte_sbt between", value1, value2, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtNotBetween(String value1, String value2) {
            addCriterion("coh_rsv_rte_sbt not between", value1, value2, "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01IsNull() {
            addCriterion("coh_rsv_tel_01 is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01IsNotNull() {
            addCriterion("coh_rsv_tel_01 is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01EqualTo(String value) {
            addCriterion("coh_rsv_tel_01 =", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01EqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01NotEqualTo(String value) {
            addCriterion("coh_rsv_tel_01 <>", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01NotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01GreaterThan(String value) {
            addCriterion("coh_rsv_tel_01 >", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01GreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01GreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_01 >=", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01GreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01LessThan(String value) {
            addCriterion("coh_rsv_tel_01 <", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01LessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01LessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_01 <=", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01LessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01Like(String value) {
            addCriterion("coh_rsv_tel_01 like", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01NotLike(String value) {
            addCriterion("coh_rsv_tel_01 not like", value, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01In(List<String> values) {
            addCriterion("coh_rsv_tel_01 in", values, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01NotIn(List<String> values) {
            addCriterion("coh_rsv_tel_01 not in", values, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01Between(String value1, String value2) {
            addCriterion("coh_rsv_tel_01 between", value1, value2, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01NotBetween(String value1, String value2) {
            addCriterion("coh_rsv_tel_01 not between", value1, value2, "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02IsNull() {
            addCriterion("coh_rsv_tel_02 is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02IsNotNull() {
            addCriterion("coh_rsv_tel_02 is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02EqualTo(String value) {
            addCriterion("coh_rsv_tel_02 =", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02EqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02NotEqualTo(String value) {
            addCriterion("coh_rsv_tel_02 <>", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02NotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02GreaterThan(String value) {
            addCriterion("coh_rsv_tel_02 >", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02GreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02GreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_02 >=", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02GreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02LessThan(String value) {
            addCriterion("coh_rsv_tel_02 <", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02LessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02LessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_02 <=", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02LessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02Like(String value) {
            addCriterion("coh_rsv_tel_02 like", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02NotLike(String value) {
            addCriterion("coh_rsv_tel_02 not like", value, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02In(List<String> values) {
            addCriterion("coh_rsv_tel_02 in", values, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02NotIn(List<String> values) {
            addCriterion("coh_rsv_tel_02 not in", values, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02Between(String value1, String value2) {
            addCriterion("coh_rsv_tel_02 between", value1, value2, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02NotBetween(String value1, String value2) {
            addCriterion("coh_rsv_tel_02 not between", value1, value2, "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03IsNull() {
            addCriterion("coh_rsv_tel_03 is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03IsNotNull() {
            addCriterion("coh_rsv_tel_03 is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03EqualTo(String value) {
            addCriterion("coh_rsv_tel_03 =", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03EqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03NotEqualTo(String value) {
            addCriterion("coh_rsv_tel_03 <>", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03NotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03GreaterThan(String value) {
            addCriterion("coh_rsv_tel_03 >", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03GreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03GreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_03 >=", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03GreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03LessThan(String value) {
            addCriterion("coh_rsv_tel_03 <", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03LessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03LessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_tel_03 <=", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03LessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_tel_03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03Like(String value) {
            addCriterion("coh_rsv_tel_03 like", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03NotLike(String value) {
            addCriterion("coh_rsv_tel_03 not like", value, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03In(List<String> values) {
            addCriterion("coh_rsv_tel_03 in", values, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03NotIn(List<String> values) {
            addCriterion("coh_rsv_tel_03 not in", values, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03Between(String value1, String value2) {
            addCriterion("coh_rsv_tel_03 between", value1, value2, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03NotBetween(String value1, String value2) {
            addCriterion("coh_rsv_tel_03 not between", value1, value2, "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrIsNull() {
            addCriterion("coh_rsv_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrIsNotNull() {
            addCriterion("coh_rsv_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrEqualTo(String value) {
            addCriterion("coh_rsv_ml_addr =", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrNotEqualTo(String value) {
            addCriterion("coh_rsv_ml_addr <>", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrGreaterThan(String value) {
            addCriterion("coh_rsv_ml_addr >", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_ml_addr >=", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLessThan(String value) {
            addCriterion("coh_rsv_ml_addr <", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_ml_addr <=", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLike(String value) {
            addCriterion("coh_rsv_ml_addr like", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrNotLike(String value) {
            addCriterion("coh_rsv_ml_addr not like", value, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrIn(List<String> values) {
            addCriterion("coh_rsv_ml_addr in", values, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrNotIn(List<String> values) {
            addCriterion("coh_rsv_ml_addr not in", values, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrBetween(String value1, String value2) {
            addCriterion("coh_rsv_ml_addr between", value1, value2, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrNotBetween(String value1, String value2) {
            addCriterion("coh_rsv_ml_addr not between", value1, value2, "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsIsNull() {
            addCriterion("coh_rsv_qst_ans is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsIsNotNull() {
            addCriterion("coh_rsv_qst_ans is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsEqualTo(String value) {
            addCriterion("coh_rsv_qst_ans =", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsNotEqualTo(String value) {
            addCriterion("coh_rsv_qst_ans <>", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsGreaterThan(String value) {
            addCriterion("coh_rsv_qst_ans >", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsGreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_qst_ans >=", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLessThan(String value) {
            addCriterion("coh_rsv_qst_ans <", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_qst_ans <=", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_qst_ans <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLike(String value) {
            addCriterion("coh_rsv_qst_ans like", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsNotLike(String value) {
            addCriterion("coh_rsv_qst_ans not like", value, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsIn(List<String> values) {
            addCriterion("coh_rsv_qst_ans in", values, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsNotIn(List<String> values) {
            addCriterion("coh_rsv_qst_ans not in", values, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsBetween(String value1, String value2) {
            addCriterion("coh_rsv_qst_ans between", value1, value2, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsNotBetween(String value1, String value2) {
            addCriterion("coh_rsv_qst_ans not between", value1, value2, "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsIsNull() {
            addCriterion("coh_rsv_req_cns is null");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsIsNotNull() {
            addCriterion("coh_rsv_req_cns is not null");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsEqualTo(String value) {
            addCriterion("coh_rsv_req_cns =", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsNotEqualTo(String value) {
            addCriterion("coh_rsv_req_cns <>", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsGreaterThan(String value) {
            addCriterion("coh_rsv_req_cns >", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsGreaterThanOrEqualTo(String value) {
            addCriterion("coh_rsv_req_cns >=", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLessThan(String value) {
            addCriterion("coh_rsv_req_cns <", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLessThanOrEqualTo(String value) {
            addCriterion("coh_rsv_req_cns <=", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_rsv_req_cns <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLike(String value) {
            addCriterion("coh_rsv_req_cns like", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsNotLike(String value) {
            addCriterion("coh_rsv_req_cns not like", value, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsIn(List<String> values) {
            addCriterion("coh_rsv_req_cns in", values, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsNotIn(List<String> values) {
            addCriterion("coh_rsv_req_cns not in", values, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsBetween(String value1, String value2) {
            addCriterion("coh_rsv_req_cns between", value1, value2, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsNotBetween(String value1, String value2) {
            addCriterion("coh_rsv_req_cns not between", value1, value2, "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceIsNull() {
            addCriterion("coh_pre_paid_price is null");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceIsNotNull() {
            addCriterion("coh_pre_paid_price is not null");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceEqualTo(Long value) {
            addCriterion("coh_pre_paid_price =", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceNotEqualTo(Long value) {
            addCriterion("coh_pre_paid_price <>", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceGreaterThan(Long value) {
            addCriterion("coh_pre_paid_price >", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_pre_paid_price >=", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceLessThan(Long value) {
            addCriterion("coh_pre_paid_price <", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceLessThanOrEqualTo(Long value) {
            addCriterion("coh_pre_paid_price <=", value, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_pre_paid_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceIn(List<Long> values) {
            addCriterion("coh_pre_paid_price in", values, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceNotIn(List<Long> values) {
            addCriterion("coh_pre_paid_price not in", values, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceBetween(Long value1, Long value2) {
            addCriterion("coh_pre_paid_price between", value1, value2, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohPrePaidPriceNotBetween(Long value1, Long value2) {
            addCriterion("coh_pre_paid_price not between", value1, value2, "cohPrePaidPrice");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdIsNull() {
            addCriterion("coh_seat_id is null");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdIsNotNull() {
            addCriterion("coh_seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdEqualTo(Long value) {
            addCriterion("coh_seat_id =", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdNotEqualTo(Long value) {
            addCriterion("coh_seat_id <>", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdNotEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdGreaterThan(Long value) {
            addCriterion("coh_seat_id >", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdGreaterThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coh_seat_id >=", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdGreaterThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdLessThan(Long value) {
            addCriterion("coh_seat_id <", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdLessThanColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdLessThanOrEqualTo(Long value) {
            addCriterion("coh_seat_id <=", value, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdLessThanOrEqualToColumn(ChkoutHdrFil.Column column) {
            addCriterion(new StringBuilder("coh_seat_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCohSeatIdIn(List<Long> values) {
            addCriterion("coh_seat_id in", values, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdNotIn(List<Long> values) {
            addCriterion("coh_seat_id not in", values, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdBetween(Long value1, Long value2) {
            addCriterion("coh_seat_id between", value1, value2, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohSeatIdNotBetween(Long value1, Long value2) {
            addCriterion("coh_seat_id not between", value1, value2, "cohSeatId");
            return (Criteria) this;
        }

        public Criteria andCohStsKbnLikeInsensitive(String value) {
            addCriterion("upper(coh_sts_kbn) like", value.toUpperCase(), "cohStsKbn");
            return (Criteria) this;
        }

        public Criteria andCohApntFlgLikeInsensitive(String value) {
            addCriterion("upper(coh_apnt_flg) like", value.toUpperCase(), "cohApntFlg");
            return (Criteria) this;
        }

        public Criteria andCohCstKbnLikeInsensitive(String value) {
            addCriterion("upper(coh_cst_kbn) like", value.toUpperCase(), "cohCstKbn");
            return (Criteria) this;
        }

        public Criteria andCohTagNoLikeInsensitive(String value) {
            addCriterion("upper(coh_tag_no) like", value.toUpperCase(), "cohTagNo");
            return (Criteria) this;
        }

        public Criteria andCohRemarksLikeInsensitive(String value) {
            addCriterion("upper(coh_remarks) like", value.toUpperCase(), "cohRemarks");
            return (Criteria) this;
        }

        public Criteria andCohDelFlgLikeInsensitive(String value) {
            addCriterion("upper(coh_del_flg) like", value.toUpperCase(), "cohDelFlg");
            return (Criteria) this;
        }

        public Criteria andCohUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(coh_update_sys_name) like", value.toUpperCase(), "cohUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(coh_update_class_name) like", value.toUpperCase(), "cohUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(coh_update_method_name) like", value.toUpperCase(), "cohUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andCohUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(coh_update_crud_kbn) like", value.toUpperCase(), "cohUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andCohSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(coh_sys_remarks) like", value.toUpperCase(), "cohSysRemarks");
            return (Criteria) this;
        }

        public Criteria andCohReceiptRemarksLikeInsensitive(String value) {
            addCriterion("upper(coh_receipt_remarks) like", value.toUpperCase(), "cohReceiptRemarks");
            return (Criteria) this;
        }

        public Criteria andCohKaijyoRemarksLikeInsensitive(String value) {
            addCriterion("upper(coh_kaijyo_remarks) like", value.toUpperCase(), "cohKaijyoRemarks");
            return (Criteria) this;
        }

        public Criteria andCohVisitMotLikeInsensitive(String value) {
            addCriterion("upper(coh_visit_mot) like", value.toUpperCase(), "cohVisitMot");
            return (Criteria) this;
        }

        public Criteria andCohRsvRteSbtLikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_rte_sbt) like", value.toUpperCase(), "cohRsvRteSbt");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel01LikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_tel_01) like", value.toUpperCase(), "cohRsvTel01");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel02LikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_tel_02) like", value.toUpperCase(), "cohRsvTel02");
            return (Criteria) this;
        }

        public Criteria andCohRsvTel03LikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_tel_03) like", value.toUpperCase(), "cohRsvTel03");
            return (Criteria) this;
        }

        public Criteria andCohRsvMlAddrLikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_ml_addr) like", value.toUpperCase(), "cohRsvMlAddr");
            return (Criteria) this;
        }

        public Criteria andCohRsvQstAnsLikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_qst_ans) like", value.toUpperCase(), "cohRsvQstAns");
            return (Criteria) this;
        }

        public Criteria andCohRsvReqCnsLikeInsensitive(String value) {
            addCriterion("upper(coh_rsv_req_cns) like", value.toUpperCase(), "cohRsvReqCns");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ChkoutHdrFilCriteria example;

        protected Criteria(ChkoutHdrFilCriteria example) {
            super();
            this.example = example;
        }

        public ChkoutHdrFilCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.ChkoutHdrFilCriteria example);
    }
}