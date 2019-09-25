package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SkRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkRecordsExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andRecordsidIsNull() {
            addCriterion("recordsId is null");
            return (Criteria) this;
        }

        public Criteria andRecordsidIsNotNull() {
            addCriterion("recordsId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordsidEqualTo(Integer value) {
            addCriterion("recordsId =", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidNotEqualTo(Integer value) {
            addCriterion("recordsId <>", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidGreaterThan(Integer value) {
            addCriterion("recordsId >", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordsId >=", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidLessThan(Integer value) {
            addCriterion("recordsId <", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidLessThanOrEqualTo(Integer value) {
            addCriterion("recordsId <=", value, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidIn(List<Integer> values) {
            addCriterion("recordsId in", values, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidNotIn(List<Integer> values) {
            addCriterion("recordsId not in", values, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidBetween(Integer value1, Integer value2) {
            addCriterion("recordsId between", value1, value2, "recordsid");
            return (Criteria) this;
        }

        public Criteria andRecordsidNotBetween(Integer value1, Integer value2) {
            addCriterion("recordsId not between", value1, value2, "recordsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPlusmountIsNull() {
            addCriterion("plusMount is null");
            return (Criteria) this;
        }

        public Criteria andPlusmountIsNotNull() {
            addCriterion("plusMount is not null");
            return (Criteria) this;
        }

        public Criteria andPlusmountEqualTo(Integer value) {
            addCriterion("plusMount =", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountNotEqualTo(Integer value) {
            addCriterion("plusMount <>", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountGreaterThan(Integer value) {
            addCriterion("plusMount >", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("plusMount >=", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountLessThan(Integer value) {
            addCriterion("plusMount <", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountLessThanOrEqualTo(Integer value) {
            addCriterion("plusMount <=", value, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountIn(List<Integer> values) {
            addCriterion("plusMount in", values, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountNotIn(List<Integer> values) {
            addCriterion("plusMount not in", values, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountBetween(Integer value1, Integer value2) {
            addCriterion("plusMount between", value1, value2, "plusmount");
            return (Criteria) this;
        }

        public Criteria andPlusmountNotBetween(Integer value1, Integer value2) {
            addCriterion("plusMount not between", value1, value2, "plusmount");
            return (Criteria) this;
        }

        public Criteria andSubmountIsNull() {
            addCriterion("subMount is null");
            return (Criteria) this;
        }

        public Criteria andSubmountIsNotNull() {
            addCriterion("subMount is not null");
            return (Criteria) this;
        }

        public Criteria andSubmountEqualTo(Integer value) {
            addCriterion("subMount =", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountNotEqualTo(Integer value) {
            addCriterion("subMount <>", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountGreaterThan(Integer value) {
            addCriterion("subMount >", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("subMount >=", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountLessThan(Integer value) {
            addCriterion("subMount <", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountLessThanOrEqualTo(Integer value) {
            addCriterion("subMount <=", value, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountIn(List<Integer> values) {
            addCriterion("subMount in", values, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountNotIn(List<Integer> values) {
            addCriterion("subMount not in", values, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountBetween(Integer value1, Integer value2) {
            addCriterion("subMount between", value1, value2, "submount");
            return (Criteria) this;
        }

        public Criteria andSubmountNotBetween(Integer value1, Integer value2) {
            addCriterion("subMount not between", value1, value2, "submount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}