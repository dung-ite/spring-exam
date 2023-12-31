package vn.com.vti.bookshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderHeaderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public OrderHeaderExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
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
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIsNull() {
            addCriterion("order_datetime is null");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIsNotNull() {
            addCriterion("order_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeEqualTo(Date value) {
            addCriterion("order_datetime =", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotEqualTo(Date value) {
            addCriterion("order_datetime <>", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeGreaterThan(Date value) {
            addCriterion("order_datetime >", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_datetime >=", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeLessThan(Date value) {
            addCriterion("order_datetime <", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_datetime <=", value, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeIn(List<Date> values) {
            addCriterion("order_datetime in", values, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotIn(List<Date> values) {
            addCriterion("order_datetime not in", values, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeBetween(Date value1, Date value2) {
            addCriterion("order_datetime between", value1, value2, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andOrderDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_datetime not between", value1, value2, "orderDatetime");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIsNull() {
            addCriterion("member_card_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIsNotNull() {
            addCriterion("member_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdEqualTo(Integer value) {
            addCriterion("member_card_id =", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotEqualTo(Integer value) {
            addCriterion("member_card_id <>", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdGreaterThan(Integer value) {
            addCriterion("member_card_id >", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_card_id >=", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdLessThan(Integer value) {
            addCriterion("member_card_id <", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_card_id <=", value, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdIn(List<Integer> values) {
            addCriterion("member_card_id in", values, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotIn(List<Integer> values) {
            addCriterion("member_card_id not in", values, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdBetween(Integer value1, Integer value2) {
            addCriterion("member_card_id between", value1, value2, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_card_id not between", value1, value2, "memberCardId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.order_header
     *
     * @mbg.generated do_not_delete_during_merge Sun May 24 00:30:09 JST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.order_header
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
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