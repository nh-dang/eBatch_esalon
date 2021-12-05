package jp.co.plussum.ebatch.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserMstCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMstCriteria() {
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

    public UserMstCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public UserMstCriteria orderBy(String ... orderByClauses) {
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
        UserMstCriteria example = new UserMstCriteria();
        return example.createCriteria();
    }

    public UserMstCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public UserMstCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andUsrIdIsNull() {
            addCriterion("usr_id is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(Long value) {
            addCriterion("usr_id =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(Long value) {
            addCriterion("usr_id <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(Long value) {
            addCriterion("usr_id >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("usr_id >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(Long value) {
            addCriterion("usr_id <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(Long value) {
            addCriterion("usr_id <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<Long> values) {
            addCriterion("usr_id in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<Long> values) {
            addCriterion("usr_id not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(Long value1, Long value2) {
            addCriterion("usr_id between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(Long value1, Long value2) {
            addCriterion("usr_id not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrCdIsNull() {
            addCriterion("usr_cd is null");
            return (Criteria) this;
        }

        public Criteria andUsrCdIsNotNull() {
            addCriterion("usr_cd is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCdEqualTo(String value) {
            addCriterion("usr_cd =", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdNotEqualTo(String value) {
            addCriterion("usr_cd <>", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdGreaterThan(String value) {
            addCriterion("usr_cd >", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdGreaterThanOrEqualTo(String value) {
            addCriterion("usr_cd >=", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdLessThan(String value) {
            addCriterion("usr_cd <", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdLessThanOrEqualTo(String value) {
            addCriterion("usr_cd <=", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cd <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdLike(String value) {
            addCriterion("usr_cd like", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdNotLike(String value) {
            addCriterion("usr_cd not like", value, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdIn(List<String> values) {
            addCriterion("usr_cd in", values, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdNotIn(List<String> values) {
            addCriterion("usr_cd not in", values, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdBetween(String value1, String value2) {
            addCriterion("usr_cd between", value1, value2, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrCdNotBetween(String value1, String value2) {
            addCriterion("usr_cd not between", value1, value2, "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("usr_password is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("usr_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("usr_password =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("usr_password <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("usr_password >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("usr_password >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("usr_password <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("usr_password <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_password <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("usr_password like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("usr_password not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("usr_password in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("usr_password not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("usr_password between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("usr_password not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameIsNull() {
            addCriterion("usr_fam_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameIsNotNull() {
            addCriterion("usr_fam_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameEqualTo(String value) {
            addCriterion("usr_fam_name =", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameNotEqualTo(String value) {
            addCriterion("usr_fam_name <>", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameGreaterThan(String value) {
            addCriterion("usr_fam_name >", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_fam_name >=", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLessThan(String value) {
            addCriterion("usr_fam_name <", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLessThanOrEqualTo(String value) {
            addCriterion("usr_fam_name <=", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLike(String value) {
            addCriterion("usr_fam_name like", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameNotLike(String value) {
            addCriterion("usr_fam_name not like", value, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameIn(List<String> values) {
            addCriterion("usr_fam_name in", values, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameNotIn(List<String> values) {
            addCriterion("usr_fam_name not in", values, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameBetween(String value1, String value2) {
            addCriterion("usr_fam_name between", value1, value2, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameNotBetween(String value1, String value2) {
            addCriterion("usr_fam_name not between", value1, value2, "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameIsNull() {
            addCriterion("usr_fst_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameIsNotNull() {
            addCriterion("usr_fst_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameEqualTo(String value) {
            addCriterion("usr_fst_name =", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameNotEqualTo(String value) {
            addCriterion("usr_fst_name <>", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameGreaterThan(String value) {
            addCriterion("usr_fst_name >", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_fst_name >=", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLessThan(String value) {
            addCriterion("usr_fst_name <", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLessThanOrEqualTo(String value) {
            addCriterion("usr_fst_name <=", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLike(String value) {
            addCriterion("usr_fst_name like", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameNotLike(String value) {
            addCriterion("usr_fst_name not like", value, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameIn(List<String> values) {
            addCriterion("usr_fst_name in", values, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameNotIn(List<String> values) {
            addCriterion("usr_fst_name not in", values, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameBetween(String value1, String value2) {
            addCriterion("usr_fst_name between", value1, value2, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameNotBetween(String value1, String value2) {
            addCriterion("usr_fst_name not between", value1, value2, "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaIsNull() {
            addCriterion("usr_fam_name_kana is null");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaIsNotNull() {
            addCriterion("usr_fam_name_kana is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaEqualTo(String value) {
            addCriterion("usr_fam_name_kana =", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaNotEqualTo(String value) {
            addCriterion("usr_fam_name_kana <>", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaGreaterThan(String value) {
            addCriterion("usr_fam_name_kana >", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("usr_fam_name_kana >=", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLessThan(String value) {
            addCriterion("usr_fam_name_kana <", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLessThanOrEqualTo(String value) {
            addCriterion("usr_fam_name_kana <=", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fam_name_kana <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLike(String value) {
            addCriterion("usr_fam_name_kana like", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaNotLike(String value) {
            addCriterion("usr_fam_name_kana not like", value, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaIn(List<String> values) {
            addCriterion("usr_fam_name_kana in", values, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaNotIn(List<String> values) {
            addCriterion("usr_fam_name_kana not in", values, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaBetween(String value1, String value2) {
            addCriterion("usr_fam_name_kana between", value1, value2, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaNotBetween(String value1, String value2) {
            addCriterion("usr_fam_name_kana not between", value1, value2, "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaIsNull() {
            addCriterion("usr_fst_name_kana is null");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaIsNotNull() {
            addCriterion("usr_fst_name_kana is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaEqualTo(String value) {
            addCriterion("usr_fst_name_kana =", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaNotEqualTo(String value) {
            addCriterion("usr_fst_name_kana <>", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaGreaterThan(String value) {
            addCriterion("usr_fst_name_kana >", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("usr_fst_name_kana >=", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLessThan(String value) {
            addCriterion("usr_fst_name_kana <", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLessThanOrEqualTo(String value) {
            addCriterion("usr_fst_name_kana <=", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fst_name_kana <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLike(String value) {
            addCriterion("usr_fst_name_kana like", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaNotLike(String value) {
            addCriterion("usr_fst_name_kana not like", value, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaIn(List<String> values) {
            addCriterion("usr_fst_name_kana in", values, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaNotIn(List<String> values) {
            addCriterion("usr_fst_name_kana not in", values, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaBetween(String value1, String value2) {
            addCriterion("usr_fst_name_kana between", value1, value2, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaNotBetween(String value1, String value2) {
            addCriterion("usr_fst_name_kana not between", value1, value2, "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrTel01IsNull() {
            addCriterion("usr_tel_01 is null");
            return (Criteria) this;
        }

        public Criteria andUsrTel01IsNotNull() {
            addCriterion("usr_tel_01 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTel01EqualTo(String value) {
            addCriterion("usr_tel_01 =", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01NotEqualTo(String value) {
            addCriterion("usr_tel_01 <>", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01GreaterThan(String value) {
            addCriterion("usr_tel_01 >", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01GreaterThanOrEqualTo(String value) {
            addCriterion("usr_tel_01 >=", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01LessThan(String value) {
            addCriterion("usr_tel_01 <", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01LessThanOrEqualTo(String value) {
            addCriterion("usr_tel_01 <=", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel01Like(String value) {
            addCriterion("usr_tel_01 like", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01NotLike(String value) {
            addCriterion("usr_tel_01 not like", value, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01In(List<String> values) {
            addCriterion("usr_tel_01 in", values, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01NotIn(List<String> values) {
            addCriterion("usr_tel_01 not in", values, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01Between(String value1, String value2) {
            addCriterion("usr_tel_01 between", value1, value2, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel01NotBetween(String value1, String value2) {
            addCriterion("usr_tel_01 not between", value1, value2, "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel02IsNull() {
            addCriterion("usr_tel_02 is null");
            return (Criteria) this;
        }

        public Criteria andUsrTel02IsNotNull() {
            addCriterion("usr_tel_02 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTel02EqualTo(String value) {
            addCriterion("usr_tel_02 =", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02NotEqualTo(String value) {
            addCriterion("usr_tel_02 <>", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02GreaterThan(String value) {
            addCriterion("usr_tel_02 >", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02GreaterThanOrEqualTo(String value) {
            addCriterion("usr_tel_02 >=", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02LessThan(String value) {
            addCriterion("usr_tel_02 <", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02LessThanOrEqualTo(String value) {
            addCriterion("usr_tel_02 <=", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel02Like(String value) {
            addCriterion("usr_tel_02 like", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02NotLike(String value) {
            addCriterion("usr_tel_02 not like", value, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02In(List<String> values) {
            addCriterion("usr_tel_02 in", values, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02NotIn(List<String> values) {
            addCriterion("usr_tel_02 not in", values, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02Between(String value1, String value2) {
            addCriterion("usr_tel_02 between", value1, value2, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel02NotBetween(String value1, String value2) {
            addCriterion("usr_tel_02 not between", value1, value2, "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel03IsNull() {
            addCriterion("usr_tel_03 is null");
            return (Criteria) this;
        }

        public Criteria andUsrTel03IsNotNull() {
            addCriterion("usr_tel_03 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrTel03EqualTo(String value) {
            addCriterion("usr_tel_03 =", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03NotEqualTo(String value) {
            addCriterion("usr_tel_03 <>", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03GreaterThan(String value) {
            addCriterion("usr_tel_03 >", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03GreaterThanOrEqualTo(String value) {
            addCriterion("usr_tel_03 >=", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03LessThan(String value) {
            addCriterion("usr_tel_03 <", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03LessThanOrEqualTo(String value) {
            addCriterion("usr_tel_03 <=", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_tel_03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrTel03Like(String value) {
            addCriterion("usr_tel_03 like", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03NotLike(String value) {
            addCriterion("usr_tel_03 not like", value, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03In(List<String> values) {
            addCriterion("usr_tel_03 in", values, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03NotIn(List<String> values) {
            addCriterion("usr_tel_03 not in", values, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03Between(String value1, String value2) {
            addCriterion("usr_tel_03 between", value1, value2, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrTel03NotBetween(String value1, String value2) {
            addCriterion("usr_tel_03 not between", value1, value2, "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrFax01IsNull() {
            addCriterion("usr_fax_01 is null");
            return (Criteria) this;
        }

        public Criteria andUsrFax01IsNotNull() {
            addCriterion("usr_fax_01 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFax01EqualTo(String value) {
            addCriterion("usr_fax_01 =", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01NotEqualTo(String value) {
            addCriterion("usr_fax_01 <>", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01GreaterThan(String value) {
            addCriterion("usr_fax_01 >", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01GreaterThanOrEqualTo(String value) {
            addCriterion("usr_fax_01 >=", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01LessThan(String value) {
            addCriterion("usr_fax_01 <", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01LessThanOrEqualTo(String value) {
            addCriterion("usr_fax_01 <=", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_01 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax01Like(String value) {
            addCriterion("usr_fax_01 like", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01NotLike(String value) {
            addCriterion("usr_fax_01 not like", value, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01In(List<String> values) {
            addCriterion("usr_fax_01 in", values, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01NotIn(List<String> values) {
            addCriterion("usr_fax_01 not in", values, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01Between(String value1, String value2) {
            addCriterion("usr_fax_01 between", value1, value2, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax01NotBetween(String value1, String value2) {
            addCriterion("usr_fax_01 not between", value1, value2, "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax02IsNull() {
            addCriterion("usr_fax_02 is null");
            return (Criteria) this;
        }

        public Criteria andUsrFax02IsNotNull() {
            addCriterion("usr_fax_02 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFax02EqualTo(String value) {
            addCriterion("usr_fax_02 =", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02NotEqualTo(String value) {
            addCriterion("usr_fax_02 <>", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02GreaterThan(String value) {
            addCriterion("usr_fax_02 >", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02GreaterThanOrEqualTo(String value) {
            addCriterion("usr_fax_02 >=", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02LessThan(String value) {
            addCriterion("usr_fax_02 <", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02LessThanOrEqualTo(String value) {
            addCriterion("usr_fax_02 <=", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_02 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax02Like(String value) {
            addCriterion("usr_fax_02 like", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02NotLike(String value) {
            addCriterion("usr_fax_02 not like", value, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02In(List<String> values) {
            addCriterion("usr_fax_02 in", values, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02NotIn(List<String> values) {
            addCriterion("usr_fax_02 not in", values, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02Between(String value1, String value2) {
            addCriterion("usr_fax_02 between", value1, value2, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax02NotBetween(String value1, String value2) {
            addCriterion("usr_fax_02 not between", value1, value2, "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax03IsNull() {
            addCriterion("usr_fax_03 is null");
            return (Criteria) this;
        }

        public Criteria andUsrFax03IsNotNull() {
            addCriterion("usr_fax_03 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFax03EqualTo(String value) {
            addCriterion("usr_fax_03 =", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03EqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03NotEqualTo(String value) {
            addCriterion("usr_fax_03 <>", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03NotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03GreaterThan(String value) {
            addCriterion("usr_fax_03 >", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03GreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03GreaterThanOrEqualTo(String value) {
            addCriterion("usr_fax_03 >=", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03GreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03LessThan(String value) {
            addCriterion("usr_fax_03 <", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03LessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03LessThanOrEqualTo(String value) {
            addCriterion("usr_fax_03 <=", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03LessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_fax_03 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrFax03Like(String value) {
            addCriterion("usr_fax_03 like", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03NotLike(String value) {
            addCriterion("usr_fax_03 not like", value, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03In(List<String> values) {
            addCriterion("usr_fax_03 in", values, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03NotIn(List<String> values) {
            addCriterion("usr_fax_03 not in", values, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03Between(String value1, String value2) {
            addCriterion("usr_fax_03 between", value1, value2, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrFax03NotBetween(String value1, String value2) {
            addCriterion("usr_fax_03 not between", value1, value2, "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrIsNull() {
            addCriterion("usr_pc_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrIsNotNull() {
            addCriterion("usr_pc_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrEqualTo(String value) {
            addCriterion("usr_pc_ml_addr =", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrNotEqualTo(String value) {
            addCriterion("usr_pc_ml_addr <>", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrGreaterThan(String value) {
            addCriterion("usr_pc_ml_addr >", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("usr_pc_ml_addr >=", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLessThan(String value) {
            addCriterion("usr_pc_ml_addr <", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLessThanOrEqualTo(String value) {
            addCriterion("usr_pc_ml_addr <=", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_pc_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLike(String value) {
            addCriterion("usr_pc_ml_addr like", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrNotLike(String value) {
            addCriterion("usr_pc_ml_addr not like", value, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrIn(List<String> values) {
            addCriterion("usr_pc_ml_addr in", values, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrNotIn(List<String> values) {
            addCriterion("usr_pc_ml_addr not in", values, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrBetween(String value1, String value2) {
            addCriterion("usr_pc_ml_addr between", value1, value2, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrNotBetween(String value1, String value2) {
            addCriterion("usr_pc_ml_addr not between", value1, value2, "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrIsNull() {
            addCriterion("usr_mbl_ml_addr is null");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrIsNotNull() {
            addCriterion("usr_mbl_ml_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrEqualTo(String value) {
            addCriterion("usr_mbl_ml_addr =", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrNotEqualTo(String value) {
            addCriterion("usr_mbl_ml_addr <>", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrGreaterThan(String value) {
            addCriterion("usr_mbl_ml_addr >", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("usr_mbl_ml_addr >=", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLessThan(String value) {
            addCriterion("usr_mbl_ml_addr <", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLessThanOrEqualTo(String value) {
            addCriterion("usr_mbl_ml_addr <=", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_mbl_ml_addr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLike(String value) {
            addCriterion("usr_mbl_ml_addr like", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrNotLike(String value) {
            addCriterion("usr_mbl_ml_addr not like", value, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrIn(List<String> values) {
            addCriterion("usr_mbl_ml_addr in", values, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrNotIn(List<String> values) {
            addCriterion("usr_mbl_ml_addr not in", values, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrBetween(String value1, String value2) {
            addCriterion("usr_mbl_ml_addr between", value1, value2, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrNotBetween(String value1, String value2) {
            addCriterion("usr_mbl_ml_addr not between", value1, value2, "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIsNull() {
            addCriterion("usr_remarks is null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIsNotNull() {
            addCriterion("usr_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksEqualTo(String value) {
            addCriterion("usr_remarks =", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotEqualTo(String value) {
            addCriterion("usr_remarks <>", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThan(String value) {
            addCriterion("usr_remarks >", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("usr_remarks >=", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThan(String value) {
            addCriterion("usr_remarks <", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThanOrEqualTo(String value) {
            addCriterion("usr_remarks <=", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLike(String value) {
            addCriterion("usr_remarks like", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotLike(String value) {
            addCriterion("usr_remarks not like", value, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksIn(List<String> values) {
            addCriterion("usr_remarks in", values, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotIn(List<String> values) {
            addCriterion("usr_remarks not in", values, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksBetween(String value1, String value2) {
            addCriterion("usr_remarks between", value1, value2, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksNotBetween(String value1, String value2) {
            addCriterion("usr_remarks not between", value1, value2, "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrIsNull() {
            addCriterion("usr_avl_date_fr is null");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrIsNotNull() {
            addCriterion("usr_avl_date_fr is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr =", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrNotEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr <>", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrGreaterThan(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr >", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr >=", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrLessThan(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr <", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_fr <=", value, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_fr <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrIn(List<Date> values) {
            addCriterionForJDBCDate("usr_avl_date_fr in", values, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrNotIn(List<Date> values) {
            addCriterionForJDBCDate("usr_avl_date_fr not in", values, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_avl_date_fr between", value1, value2, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateFrNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_avl_date_fr not between", value1, value2, "usrAvlDateFr");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToIsNull() {
            addCriterion("usr_avl_date_to is null");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToIsNotNull() {
            addCriterion("usr_avl_date_to is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to =", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToNotEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to <>", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToGreaterThan(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to >", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to >=", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToLessThan(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to <", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_avl_date_to <=", value, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_avl_date_to <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToIn(List<Date> values) {
            addCriterionForJDBCDate("usr_avl_date_to in", values, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToNotIn(List<Date> values) {
            addCriterionForJDBCDate("usr_avl_date_to not in", values, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_avl_date_to between", value1, value2, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrAvlDateToNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_avl_date_to not between", value1, value2, "usrAvlDateTo");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgIsNull() {
            addCriterion("usr_del_flg is null");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgIsNotNull() {
            addCriterion("usr_del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgEqualTo(String value) {
            addCriterion("usr_del_flg =", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgNotEqualTo(String value) {
            addCriterion("usr_del_flg <>", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgGreaterThan(String value) {
            addCriterion("usr_del_flg >", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("usr_del_flg >=", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLessThan(String value) {
            addCriterion("usr_del_flg <", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLessThanOrEqualTo(String value) {
            addCriterion("usr_del_flg <=", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_del_flg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLike(String value) {
            addCriterion("usr_del_flg like", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgNotLike(String value) {
            addCriterion("usr_del_flg not like", value, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgIn(List<String> values) {
            addCriterion("usr_del_flg in", values, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgNotIn(List<String> values) {
            addCriterion("usr_del_flg not in", values, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgBetween(String value1, String value2) {
            addCriterion("usr_del_flg between", value1, value2, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgNotBetween(String value1, String value2) {
            addCriterion("usr_del_flg not between", value1, value2, "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrCdateIsNull() {
            addCriterion("usr_cdate is null");
            return (Criteria) this;
        }

        public Criteria andUsrCdateIsNotNull() {
            addCriterion("usr_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCdateEqualTo(Date value) {
            addCriterionForJDBCDate("usr_cdate =", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("usr_cdate <>", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateGreaterThan(Date value) {
            addCriterionForJDBCDate("usr_cdate >", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_cdate >=", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateLessThan(Date value) {
            addCriterionForJDBCDate("usr_cdate <", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_cdate <=", value, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_cdate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCdateIn(List<Date> values) {
            addCriterionForJDBCDate("usr_cdate in", values, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("usr_cdate not in", values, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_cdate between", value1, value2, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_cdate not between", value1, value2, "usrCdate");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeIsNull() {
            addCriterion("usr_ctime is null");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeIsNotNull() {
            addCriterion("usr_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeEqualTo(Date value) {
            addCriterionForJDBCTime("usr_ctime =", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("usr_ctime <>", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("usr_ctime >", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("usr_ctime >=", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeLessThan(Date value) {
            addCriterionForJDBCTime("usr_ctime <", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("usr_ctime <=", value, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimeIn(List<Date> values) {
            addCriterionForJDBCTime("usr_ctime in", values, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("usr_ctime not in", values, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("usr_ctime between", value1, value2, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("usr_ctime not between", value1, value2, "usrCtime");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampIsNull() {
            addCriterion("usr_ctimestamp is null");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampIsNotNull() {
            addCriterion("usr_ctimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampEqualTo(Date value) {
            addCriterion("usr_ctimestamp =", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampNotEqualTo(Date value) {
            addCriterion("usr_ctimestamp <>", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampGreaterThan(Date value) {
            addCriterion("usr_ctimestamp >", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("usr_ctimestamp >=", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampLessThan(Date value) {
            addCriterion("usr_ctimestamp <", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampLessThanOrEqualTo(Date value) {
            addCriterion("usr_ctimestamp <=", value, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_ctimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampIn(List<Date> values) {
            addCriterion("usr_ctimestamp in", values, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampNotIn(List<Date> values) {
            addCriterion("usr_ctimestamp not in", values, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampBetween(Date value1, Date value2) {
            addCriterion("usr_ctimestamp between", value1, value2, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrCtimestampNotBetween(Date value1, Date value2) {
            addCriterion("usr_ctimestamp not between", value1, value2, "usrCtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUdateIsNull() {
            addCriterion("usr_udate is null");
            return (Criteria) this;
        }

        public Criteria andUsrUdateIsNotNull() {
            addCriterion("usr_udate is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUdateEqualTo(Date value) {
            addCriterionForJDBCDate("usr_udate =", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("usr_udate <>", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateGreaterThan(Date value) {
            addCriterionForJDBCDate("usr_udate >", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_udate >=", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateLessThan(Date value) {
            addCriterionForJDBCDate("usr_udate <", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("usr_udate <=", value, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_udate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUdateIn(List<Date> values) {
            addCriterionForJDBCDate("usr_udate in", values, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("usr_udate not in", values, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_udate between", value1, value2, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("usr_udate not between", value1, value2, "usrUdate");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeIsNull() {
            addCriterion("usr_utime is null");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeIsNotNull() {
            addCriterion("usr_utime is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeEqualTo(Date value) {
            addCriterionForJDBCTime("usr_utime =", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("usr_utime <>", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("usr_utime >", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("usr_utime >=", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeLessThan(Date value) {
            addCriterionForJDBCTime("usr_utime <", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("usr_utime <=", value, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utime <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimeIn(List<Date> values) {
            addCriterionForJDBCTime("usr_utime in", values, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("usr_utime not in", values, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("usr_utime between", value1, value2, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("usr_utime not between", value1, value2, "usrUtime");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampIsNull() {
            addCriterion("usr_utimestamp is null");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampIsNotNull() {
            addCriterion("usr_utimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampEqualTo(Date value) {
            addCriterion("usr_utimestamp =", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampNotEqualTo(Date value) {
            addCriterion("usr_utimestamp <>", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampGreaterThan(Date value) {
            addCriterion("usr_utimestamp >", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("usr_utimestamp >=", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampLessThan(Date value) {
            addCriterion("usr_utimestamp <", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampLessThanOrEqualTo(Date value) {
            addCriterion("usr_utimestamp <=", value, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_utimestamp <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampIn(List<Date> values) {
            addCriterion("usr_utimestamp in", values, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampNotIn(List<Date> values) {
            addCriterion("usr_utimestamp not in", values, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampBetween(Date value1, Date value2) {
            addCriterion("usr_utimestamp between", value1, value2, "usrUtimestamp");
            return (Criteria) this;
        }

        public Criteria andUsrUtimestampNotBetween(Date value1, Date value2) {
            addCriterion("usr_utimestamp not between", value1, value2, "usrUtimestamp");
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

        public Criteria andVersionNoEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("version_no = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Long value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("version_no <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Long value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("version_no > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Long value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("version_no >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Long value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("version_no < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Long value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualToColumn(UserMst.Column column) {
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

        public Criteria andUsrUpdateUserIsNull() {
            addCriterion("usr_update_user is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserIsNotNull() {
            addCriterion("usr_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserEqualTo(Long value) {
            addCriterion("usr_update_user =", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserNotEqualTo(Long value) {
            addCriterion("usr_update_user <>", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserGreaterThan(Long value) {
            addCriterion("usr_update_user >", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("usr_update_user >=", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserLessThan(Long value) {
            addCriterion("usr_update_user <", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("usr_update_user <=", value, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserIn(List<Long> values) {
            addCriterion("usr_update_user in", values, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserNotIn(List<Long> values) {
            addCriterion("usr_update_user not in", values, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserBetween(Long value1, Long value2) {
            addCriterion("usr_update_user between", value1, value2, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("usr_update_user not between", value1, value2, "usrUpdateUser");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameIsNull() {
            addCriterion("usr_update_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameIsNotNull() {
            addCriterion("usr_update_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameEqualTo(String value) {
            addCriterion("usr_update_sys_name =", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameNotEqualTo(String value) {
            addCriterion("usr_update_sys_name <>", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameGreaterThan(String value) {
            addCriterion("usr_update_sys_name >", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_update_sys_name >=", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLessThan(String value) {
            addCriterion("usr_update_sys_name <", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLessThanOrEqualTo(String value) {
            addCriterion("usr_update_sys_name <=", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_sys_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLike(String value) {
            addCriterion("usr_update_sys_name like", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameNotLike(String value) {
            addCriterion("usr_update_sys_name not like", value, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameIn(List<String> values) {
            addCriterion("usr_update_sys_name in", values, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameNotIn(List<String> values) {
            addCriterion("usr_update_sys_name not in", values, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameBetween(String value1, String value2) {
            addCriterion("usr_update_sys_name between", value1, value2, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameNotBetween(String value1, String value2) {
            addCriterion("usr_update_sys_name not between", value1, value2, "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameIsNull() {
            addCriterion("usr_update_class_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameIsNotNull() {
            addCriterion("usr_update_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameEqualTo(String value) {
            addCriterion("usr_update_class_name =", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameNotEqualTo(String value) {
            addCriterion("usr_update_class_name <>", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameGreaterThan(String value) {
            addCriterion("usr_update_class_name >", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_update_class_name >=", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLessThan(String value) {
            addCriterion("usr_update_class_name <", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLessThanOrEqualTo(String value) {
            addCriterion("usr_update_class_name <=", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_class_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLike(String value) {
            addCriterion("usr_update_class_name like", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameNotLike(String value) {
            addCriterion("usr_update_class_name not like", value, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameIn(List<String> values) {
            addCriterion("usr_update_class_name in", values, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameNotIn(List<String> values) {
            addCriterion("usr_update_class_name not in", values, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameBetween(String value1, String value2) {
            addCriterion("usr_update_class_name between", value1, value2, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameNotBetween(String value1, String value2) {
            addCriterion("usr_update_class_name not between", value1, value2, "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameIsNull() {
            addCriterion("usr_update_method_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameIsNotNull() {
            addCriterion("usr_update_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameEqualTo(String value) {
            addCriterion("usr_update_method_name =", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameNotEqualTo(String value) {
            addCriterion("usr_update_method_name <>", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameGreaterThan(String value) {
            addCriterion("usr_update_method_name >", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_update_method_name >=", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLessThan(String value) {
            addCriterion("usr_update_method_name <", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLessThanOrEqualTo(String value) {
            addCriterion("usr_update_method_name <=", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLike(String value) {
            addCriterion("usr_update_method_name like", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameNotLike(String value) {
            addCriterion("usr_update_method_name not like", value, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameIn(List<String> values) {
            addCriterion("usr_update_method_name in", values, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameNotIn(List<String> values) {
            addCriterion("usr_update_method_name not in", values, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameBetween(String value1, String value2) {
            addCriterion("usr_update_method_name between", value1, value2, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameNotBetween(String value1, String value2) {
            addCriterion("usr_update_method_name not between", value1, value2, "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnIsNull() {
            addCriterion("usr_update_crud_kbn is null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnIsNotNull() {
            addCriterion("usr_update_crud_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnEqualTo(String value) {
            addCriterion("usr_update_crud_kbn =", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnNotEqualTo(String value) {
            addCriterion("usr_update_crud_kbn <>", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnGreaterThan(String value) {
            addCriterion("usr_update_crud_kbn >", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnGreaterThanOrEqualTo(String value) {
            addCriterion("usr_update_crud_kbn >=", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLessThan(String value) {
            addCriterion("usr_update_crud_kbn <", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLessThanOrEqualTo(String value) {
            addCriterion("usr_update_crud_kbn <=", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_update_crud_kbn <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLike(String value) {
            addCriterion("usr_update_crud_kbn like", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnNotLike(String value) {
            addCriterion("usr_update_crud_kbn not like", value, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnIn(List<String> values) {
            addCriterion("usr_update_crud_kbn in", values, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnNotIn(List<String> values) {
            addCriterion("usr_update_crud_kbn not in", values, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnBetween(String value1, String value2) {
            addCriterion("usr_update_crud_kbn between", value1, value2, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnNotBetween(String value1, String value2) {
            addCriterion("usr_update_crud_kbn not between", value1, value2, "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksIsNull() {
            addCriterion("usr_sys_remarks is null");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksIsNotNull() {
            addCriterion("usr_sys_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksEqualTo(String value) {
            addCriterion("usr_sys_remarks =", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksNotEqualTo(String value) {
            addCriterion("usr_sys_remarks <>", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksNotEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksGreaterThan(String value) {
            addCriterion("usr_sys_remarks >", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksGreaterThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("usr_sys_remarks >=", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksGreaterThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLessThan(String value) {
            addCriterion("usr_sys_remarks <", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLessThanColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLessThanOrEqualTo(String value) {
            addCriterion("usr_sys_remarks <=", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLessThanOrEqualToColumn(UserMst.Column column) {
            addCriterion(new StringBuilder("usr_sys_remarks <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLike(String value) {
            addCriterion("usr_sys_remarks like", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksNotLike(String value) {
            addCriterion("usr_sys_remarks not like", value, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksIn(List<String> values) {
            addCriterion("usr_sys_remarks in", values, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksNotIn(List<String> values) {
            addCriterion("usr_sys_remarks not in", values, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksBetween(String value1, String value2) {
            addCriterion("usr_sys_remarks between", value1, value2, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksNotBetween(String value1, String value2) {
            addCriterion("usr_sys_remarks not between", value1, value2, "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrCdLikeInsensitive(String value) {
            addCriterion("upper(usr_cd) like", value.toUpperCase(), "usrCd");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLikeInsensitive(String value) {
            addCriterion("upper(usr_password) like", value.toUpperCase(), "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameLikeInsensitive(String value) {
            addCriterion("upper(usr_fam_name) like", value.toUpperCase(), "usrFamName");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameLikeInsensitive(String value) {
            addCriterion("upper(usr_fst_name) like", value.toUpperCase(), "usrFstName");
            return (Criteria) this;
        }

        public Criteria andUsrFamNameKanaLikeInsensitive(String value) {
            addCriterion("upper(usr_fam_name_kana) like", value.toUpperCase(), "usrFamNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrFstNameKanaLikeInsensitive(String value) {
            addCriterion("upper(usr_fst_name_kana) like", value.toUpperCase(), "usrFstNameKana");
            return (Criteria) this;
        }

        public Criteria andUsrTel01LikeInsensitive(String value) {
            addCriterion("upper(usr_tel_01) like", value.toUpperCase(), "usrTel01");
            return (Criteria) this;
        }

        public Criteria andUsrTel02LikeInsensitive(String value) {
            addCriterion("upper(usr_tel_02) like", value.toUpperCase(), "usrTel02");
            return (Criteria) this;
        }

        public Criteria andUsrTel03LikeInsensitive(String value) {
            addCriterion("upper(usr_tel_03) like", value.toUpperCase(), "usrTel03");
            return (Criteria) this;
        }

        public Criteria andUsrFax01LikeInsensitive(String value) {
            addCriterion("upper(usr_fax_01) like", value.toUpperCase(), "usrFax01");
            return (Criteria) this;
        }

        public Criteria andUsrFax02LikeInsensitive(String value) {
            addCriterion("upper(usr_fax_02) like", value.toUpperCase(), "usrFax02");
            return (Criteria) this;
        }

        public Criteria andUsrFax03LikeInsensitive(String value) {
            addCriterion("upper(usr_fax_03) like", value.toUpperCase(), "usrFax03");
            return (Criteria) this;
        }

        public Criteria andUsrPcMlAddrLikeInsensitive(String value) {
            addCriterion("upper(usr_pc_ml_addr) like", value.toUpperCase(), "usrPcMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrMblMlAddrLikeInsensitive(String value) {
            addCriterion("upper(usr_mbl_ml_addr) like", value.toUpperCase(), "usrMblMlAddr");
            return (Criteria) this;
        }

        public Criteria andUsrRemarksLikeInsensitive(String value) {
            addCriterion("upper(usr_remarks) like", value.toUpperCase(), "usrRemarks");
            return (Criteria) this;
        }

        public Criteria andUsrDelFlgLikeInsensitive(String value) {
            addCriterion("upper(usr_del_flg) like", value.toUpperCase(), "usrDelFlg");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateSysNameLikeInsensitive(String value) {
            addCriterion("upper(usr_update_sys_name) like", value.toUpperCase(), "usrUpdateSysName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateClassNameLikeInsensitive(String value) {
            addCriterion("upper(usr_update_class_name) like", value.toUpperCase(), "usrUpdateClassName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateMethodNameLikeInsensitive(String value) {
            addCriterion("upper(usr_update_method_name) like", value.toUpperCase(), "usrUpdateMethodName");
            return (Criteria) this;
        }

        public Criteria andUsrUpdateCrudKbnLikeInsensitive(String value) {
            addCriterion("upper(usr_update_crud_kbn) like", value.toUpperCase(), "usrUpdateCrudKbn");
            return (Criteria) this;
        }

        public Criteria andUsrSysRemarksLikeInsensitive(String value) {
            addCriterion("upper(usr_sys_remarks) like", value.toUpperCase(), "usrSysRemarks");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private UserMstCriteria example;

        protected Criteria(UserMstCriteria example) {
            super();
            this.example = example;
        }

        public UserMstCriteria example() {
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
        void example(jp.co.plussum.ebatch.domain.entity.generator.UserMstCriteria example);
    }
}