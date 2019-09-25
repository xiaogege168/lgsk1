package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SkStuOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkStuOrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("orderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("orderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("orderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("orderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("orderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("orderTime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("orderTime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("orderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("orderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("orderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("orderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andTeachcommentIsNull() {
            addCriterion("teachComment is null");
            return (Criteria) this;
        }

        public Criteria andTeachcommentIsNotNull() {
            addCriterion("teachComment is not null");
            return (Criteria) this;
        }

        public Criteria andTeachcommentEqualTo(String value) {
            addCriterion("teachComment =", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentNotEqualTo(String value) {
            addCriterion("teachComment <>", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentGreaterThan(String value) {
            addCriterion("teachComment >", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentGreaterThanOrEqualTo(String value) {
            addCriterion("teachComment >=", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentLessThan(String value) {
            addCriterion("teachComment <", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentLessThanOrEqualTo(String value) {
            addCriterion("teachComment <=", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentLike(String value) {
            addCriterion("teachComment like", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentNotLike(String value) {
            addCriterion("teachComment not like", value, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentIn(List<String> values) {
            addCriterion("teachComment in", values, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentNotIn(List<String> values) {
            addCriterion("teachComment not in", values, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentBetween(String value1, String value2) {
            addCriterion("teachComment between", value1, value2, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andTeachcommentNotBetween(String value1, String value2) {
            addCriterion("teachComment not between", value1, value2, "teachcomment");
            return (Criteria) this;
        }

        public Criteria andAmpmIsNull() {
            addCriterion("ampm is null");
            return (Criteria) this;
        }

        public Criteria andAmpmIsNotNull() {
            addCriterion("ampm is not null");
            return (Criteria) this;
        }

        public Criteria andAmpmEqualTo(String value) {
            addCriterion("ampm =", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotEqualTo(String value) {
            addCriterion("ampm <>", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmGreaterThan(String value) {
            addCriterion("ampm >", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmGreaterThanOrEqualTo(String value) {
            addCriterion("ampm >=", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLessThan(String value) {
            addCriterion("ampm <", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLessThanOrEqualTo(String value) {
            addCriterion("ampm <=", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLike(String value) {
            addCriterion("ampm like", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotLike(String value) {
            addCriterion("ampm not like", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmIn(List<String> values) {
            addCriterion("ampm in", values, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotIn(List<String> values) {
            addCriterion("ampm not in", values, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmBetween(String value1, String value2) {
            addCriterion("ampm between", value1, value2, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotBetween(String value1, String value2) {
            addCriterion("ampm not between", value1, value2, "ampm");
            return (Criteria) this;
        }

        public Criteria andTodayIsNull() {
            addCriterion("today is null");
            return (Criteria) this;
        }

        public Criteria andTodayIsNotNull() {
            addCriterion("today is not null");
            return (Criteria) this;
        }

        public Criteria andTodayEqualTo(String value) {
            addCriterion("today =", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotEqualTo(String value) {
            addCriterion("today <>", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThan(String value) {
            addCriterion("today >", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThanOrEqualTo(String value) {
            addCriterion("today >=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThan(String value) {
            addCriterion("today <", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThanOrEqualTo(String value) {
            addCriterion("today <=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLike(String value) {
            addCriterion("today like", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotLike(String value) {
            addCriterion("today not like", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayIn(List<String> values) {
            addCriterion("today in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotIn(List<String> values) {
            addCriterion("today not in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayBetween(String value1, String value2) {
            addCriterion("today between", value1, value2, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotBetween(String value1, String value2) {
            addCriterion("today not between", value1, value2, "today");
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