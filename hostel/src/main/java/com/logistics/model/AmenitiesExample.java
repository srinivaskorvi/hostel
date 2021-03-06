package com.logistics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmenitiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public AmenitiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
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

        public Criteria andAmenitiyIdIsNull() {
            addCriterion("AmenitiyId is null");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdIsNotNull() {
            addCriterion("AmenitiyId is not null");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdEqualTo(Short value) {
            addCriterion("AmenitiyId =", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdNotEqualTo(Short value) {
            addCriterion("AmenitiyId <>", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdGreaterThan(Short value) {
            addCriterion("AmenitiyId >", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdGreaterThanOrEqualTo(Short value) {
            addCriterion("AmenitiyId >=", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdLessThan(Short value) {
            addCriterion("AmenitiyId <", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdLessThanOrEqualTo(Short value) {
            addCriterion("AmenitiyId <=", value, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdIn(List<Short> values) {
            addCriterion("AmenitiyId in", values, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdNotIn(List<Short> values) {
            addCriterion("AmenitiyId not in", values, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdBetween(Short value1, Short value2) {
            addCriterion("AmenitiyId between", value1, value2, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenitiyIdNotBetween(Short value1, Short value2) {
            addCriterion("AmenitiyId not between", value1, value2, "amenitiyId");
            return (Criteria) this;
        }

        public Criteria andAmenityIsNull() {
            addCriterion("Amenity is null");
            return (Criteria) this;
        }

        public Criteria andAmenityIsNotNull() {
            addCriterion("Amenity is not null");
            return (Criteria) this;
        }

        public Criteria andAmenityEqualTo(String value) {
            addCriterion("Amenity =", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityNotEqualTo(String value) {
            addCriterion("Amenity <>", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityGreaterThan(String value) {
            addCriterion("Amenity >", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityGreaterThanOrEqualTo(String value) {
            addCriterion("Amenity >=", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityLessThan(String value) {
            addCriterion("Amenity <", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityLessThanOrEqualTo(String value) {
            addCriterion("Amenity <=", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityLike(String value) {
            addCriterion("Amenity like", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityNotLike(String value) {
            addCriterion("Amenity not like", value, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityIn(List<String> values) {
            addCriterion("Amenity in", values, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityNotIn(List<String> values) {
            addCriterion("Amenity not in", values, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityBetween(String value1, String value2) {
            addCriterion("Amenity between", value1, value2, "amenity");
            return (Criteria) this;
        }

        public Criteria andAmenityNotBetween(String value1, String value2) {
            addCriterion("Amenity not between", value1, value2, "amenity");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IsActive is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IsActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("IsActive =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("IsActive <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("IsActive >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsActive >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("IsActive <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("IsActive <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("IsActive in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("IsActive not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("IsActive between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsActive not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CreatedBy =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CreatedBy <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CreatedBy >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedBy >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CreatedBy <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CreatedBy <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CreatedBy like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CreatedBy not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CreatedBy in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CreatedBy not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CreatedBy between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CreatedDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CreatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CreatedDate =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CreatedDate <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CreatedDate >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedDate >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CreatedDate <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CreatedDate <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CreatedDate in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CreatedDate not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CreatedDate between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CreatedDate not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("ModifiedBy is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("ModifiedBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("ModifiedBy =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("ModifiedBy <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("ModifiedBy >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("ModifiedBy >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("ModifiedBy <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("ModifiedBy <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("ModifiedBy like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("ModifiedBy not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("ModifiedBy in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("ModifiedBy not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("ModifiedBy between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("ModifiedBy not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("ModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("ModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("ModifiedDate =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("ModifiedDate <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("ModifiedDate >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("ModifiedDate <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("ModifiedDate in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("ModifiedDate not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table amenities
     *
     * @mbggenerated do_not_delete_during_merge Wed May 27 11:34:25 PDT 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table amenities
     *
     * @mbggenerated Wed May 27 11:34:25 PDT 2015
     */
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