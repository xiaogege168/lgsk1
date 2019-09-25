package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SkCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkCourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNull() {
            addCriterion("courseTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIsNotNull() {
            addCriterion("courseTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetimeEqualTo(String value) {
            addCriterion("courseTime =", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotEqualTo(String value) {
            addCriterion("courseTime <>", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThan(String value) {
            addCriterion("courseTime >", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeGreaterThanOrEqualTo(String value) {
            addCriterion("courseTime >=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThan(String value) {
            addCriterion("courseTime <", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLessThanOrEqualTo(String value) {
            addCriterion("courseTime <=", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeLike(String value) {
            addCriterion("courseTime like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotLike(String value) {
            addCriterion("courseTime not like", value, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeIn(List<String> values) {
            addCriterion("courseTime in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotIn(List<String> values) {
            addCriterion("courseTime not in", values, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeBetween(String value1, String value2) {
            addCriterion("courseTime between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursetimeNotBetween(String value1, String value2) {
            addCriterion("courseTime not between", value1, value2, "coursetime");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNull() {
            addCriterion("coursePrice is null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIsNotNull() {
            addCriterion("coursePrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoursepriceEqualTo(Integer value) {
            addCriterion("coursePrice =", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotEqualTo(Integer value) {
            addCriterion("coursePrice <>", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThan(Integer value) {
            addCriterion("coursePrice >", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursePrice >=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThan(Integer value) {
            addCriterion("coursePrice <", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceLessThanOrEqualTo(Integer value) {
            addCriterion("coursePrice <=", value, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceIn(List<Integer> values) {
            addCriterion("coursePrice in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotIn(List<Integer> values) {
            addCriterion("coursePrice not in", values, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceBetween(Integer value1, Integer value2) {
            addCriterion("coursePrice between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("coursePrice not between", value1, value2, "courseprice");
            return (Criteria) this;
        }

        public Criteria andCoursecontentIsNull() {
            addCriterion("courseContent is null");
            return (Criteria) this;
        }

        public Criteria andCoursecontentIsNotNull() {
            addCriterion("courseContent is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecontentEqualTo(String value) {
            addCriterion("courseContent =", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentNotEqualTo(String value) {
            addCriterion("courseContent <>", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentGreaterThan(String value) {
            addCriterion("courseContent >", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentGreaterThanOrEqualTo(String value) {
            addCriterion("courseContent >=", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentLessThan(String value) {
            addCriterion("courseContent <", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentLessThanOrEqualTo(String value) {
            addCriterion("courseContent <=", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentLike(String value) {
            addCriterion("courseContent like", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentNotLike(String value) {
            addCriterion("courseContent not like", value, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentIn(List<String> values) {
            addCriterion("courseContent in", values, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentNotIn(List<String> values) {
            addCriterion("courseContent not in", values, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentBetween(String value1, String value2) {
            addCriterion("courseContent between", value1, value2, "coursecontent");
            return (Criteria) this;
        }

        public Criteria andCoursecontentNotBetween(String value1, String value2) {
            addCriterion("courseContent not between", value1, value2, "coursecontent");
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