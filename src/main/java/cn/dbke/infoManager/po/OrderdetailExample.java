package cn.dbke.infoManager.po;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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

        public Criteria andOrderdetailIdIsNull() {
            addCriterion("orderdetail_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdIsNotNull() {
            addCriterion("orderdetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdEqualTo(Integer value) {
            addCriterion("orderdetail_id =", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdNotEqualTo(Integer value) {
            addCriterion("orderdetail_id <>", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdGreaterThan(Integer value) {
            addCriterion("orderdetail_id >", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderdetail_id >=", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdLessThan(Integer value) {
            addCriterion("orderdetail_id <", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderdetail_id <=", value, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdIn(List<Integer> values) {
            addCriterion("orderdetail_id in", values, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdNotIn(List<Integer> values) {
            addCriterion("orderdetail_id not in", values, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("orderdetail_id between", value1, value2, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andOrderdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderdetail_id not between", value1, value2, "orderdetailId");
            return (Criteria) this;
        }

        public Criteria andItemsNumberIsNull() {
            addCriterion("items_number is null");
            return (Criteria) this;
        }

        public Criteria andItemsNumberIsNotNull() {
            addCriterion("items_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemsNumberEqualTo(Integer value) {
            addCriterion("items_number =", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberNotEqualTo(Integer value) {
            addCriterion("items_number <>", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberGreaterThan(Integer value) {
            addCriterion("items_number >", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("items_number >=", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberLessThan(Integer value) {
            addCriterion("items_number <", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("items_number <=", value, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberIn(List<Integer> values) {
            addCriterion("items_number in", values, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberNotIn(List<Integer> values) {
            addCriterion("items_number not in", values, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberBetween(Integer value1, Integer value2) {
            addCriterion("items_number between", value1, value2, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andItemsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("items_number not between", value1, value2, "itemsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andItemsIdIsNull() {
            addCriterion("items_id is null");
            return (Criteria) this;
        }

        public Criteria andItemsIdIsNotNull() {
            addCriterion("items_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemsIdEqualTo(String value) {
            addCriterion("items_id =", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotEqualTo(String value) {
            addCriterion("items_id <>", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThan(String value) {
            addCriterion("items_id >", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThanOrEqualTo(String value) {
            addCriterion("items_id >=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThan(String value) {
            addCriterion("items_id <", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThanOrEqualTo(String value) {
            addCriterion("items_id <=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLike(String value) {
            addCriterion("items_id like", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotLike(String value) {
            addCriterion("items_id not like", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdIn(List<String> values) {
            addCriterion("items_id in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotIn(List<String> values) {
            addCriterion("items_id not in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdBetween(String value1, String value2) {
            addCriterion("items_id between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotBetween(String value1, String value2) {
            addCriterion("items_id not between", value1, value2, "itemsId");
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