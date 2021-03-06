package com.nnlightctl.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LightSignalLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LightSignalLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedIsNull() {
            addCriterion("gmt_updated is null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedIsNotNull() {
            addCriterion("gmt_updated is not null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedEqualTo(Date value) {
            addCriterion("gmt_updated =", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedNotEqualTo(Date value) {
            addCriterion("gmt_updated <>", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedGreaterThan(Date value) {
            addCriterion("gmt_updated >", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_updated >=", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedLessThan(Date value) {
            addCriterion("gmt_updated <", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_updated <=", value, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedIn(List<Date> values) {
            addCriterion("gmt_updated in", values, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedNotIn(List<Date> values) {
            addCriterion("gmt_updated not in", values, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedBetween(Date value1, Date value2) {
            addCriterion("gmt_updated between", value1, value2, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andGmtUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_updated not between", value1, value2, "gmtUpdated");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateIsNull() {
            addCriterion("signal_log_date is null");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateIsNotNull() {
            addCriterion("signal_log_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateEqualTo(Date value) {
            addCriterion("signal_log_date =", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateNotEqualTo(Date value) {
            addCriterion("signal_log_date <>", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateGreaterThan(Date value) {
            addCriterion("signal_log_date >", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("signal_log_date >=", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateLessThan(Date value) {
            addCriterion("signal_log_date <", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateLessThanOrEqualTo(Date value) {
            addCriterion("signal_log_date <=", value, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateIn(List<Date> values) {
            addCriterion("signal_log_date in", values, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateNotIn(List<Date> values) {
            addCriterion("signal_log_date not in", values, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateBetween(Date value1, Date value2) {
            addCriterion("signal_log_date between", value1, value2, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andSignalLogDateNotBetween(Date value1, Date value2) {
            addCriterion("signal_log_date not between", value1, value2, "signalLogDate");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityIsNull() {
            addCriterion("signal_intensity is null");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityIsNotNull() {
            addCriterion("signal_intensity is not null");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityEqualTo(BigDecimal value) {
            addCriterion("signal_intensity =", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityNotEqualTo(BigDecimal value) {
            addCriterion("signal_intensity <>", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityGreaterThan(BigDecimal value) {
            addCriterion("signal_intensity >", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("signal_intensity >=", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityLessThan(BigDecimal value) {
            addCriterion("signal_intensity <", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("signal_intensity <=", value, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityIn(List<BigDecimal> values) {
            addCriterion("signal_intensity in", values, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityNotIn(List<BigDecimal> values) {
            addCriterion("signal_intensity not in", values, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signal_intensity between", value1, value2, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andSignalIntensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("signal_intensity not between", value1, value2, "signalIntensity");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andSignalLevelIsNull() {
            addCriterion("signal_level is null");
            return (Criteria) this;
        }

        public Criteria andSignalLevelIsNotNull() {
            addCriterion("signal_level is not null");
            return (Criteria) this;
        }

        public Criteria andSignalLevelEqualTo(Byte value) {
            addCriterion("signal_level =", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotEqualTo(Byte value) {
            addCriterion("signal_level <>", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelGreaterThan(Byte value) {
            addCriterion("signal_level >", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("signal_level >=", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelLessThan(Byte value) {
            addCriterion("signal_level <", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelLessThanOrEqualTo(Byte value) {
            addCriterion("signal_level <=", value, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelIn(List<Byte> values) {
            addCriterion("signal_level in", values, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotIn(List<Byte> values) {
            addCriterion("signal_level not in", values, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelBetween(Byte value1, Byte value2) {
            addCriterion("signal_level between", value1, value2, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andSignalLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("signal_level not between", value1, value2, "signalLevel");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNull() {
            addCriterion("online_state is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNotNull() {
            addCriterion("online_state is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateEqualTo(Byte value) {
            addCriterion("online_state =", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotEqualTo(Byte value) {
            addCriterion("online_state <>", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThan(Byte value) {
            addCriterion("online_state >", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("online_state >=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThan(Byte value) {
            addCriterion("online_state <", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThanOrEqualTo(Byte value) {
            addCriterion("online_state <=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIn(List<Byte> values) {
            addCriterion("online_state in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotIn(List<Byte> values) {
            addCriterion("online_state not in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateBetween(Byte value1, Byte value2) {
            addCriterion("online_state between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotBetween(Byte value1, Byte value2) {
            addCriterion("online_state not between", value1, value2, "onlineState");
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