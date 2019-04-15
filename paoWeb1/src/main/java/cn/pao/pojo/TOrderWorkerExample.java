package cn.pao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TOrderWorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderWorkerExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Integer value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Integer value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Integer value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Integer value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Integer value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Integer> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Integer> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Integer value1, Integer value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNull() {
            addCriterion("order_comment is null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNotNull() {
            addCriterion("order_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentEqualTo(String value) {
            addCriterion("order_comment =", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotEqualTo(String value) {
            addCriterion("order_comment <>", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThan(String value) {
            addCriterion("order_comment >", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThanOrEqualTo(String value) {
            addCriterion("order_comment >=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThan(String value) {
            addCriterion("order_comment <", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThanOrEqualTo(String value) {
            addCriterion("order_comment <=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLike(String value) {
            addCriterion("order_comment like", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotLike(String value) {
            addCriterion("order_comment not like", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIn(List<String> values) {
            addCriterion("order_comment in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotIn(List<String> values) {
            addCriterion("order_comment not in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentBetween(String value1, String value2) {
            addCriterion("order_comment between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotBetween(String value1, String value2) {
            addCriterion("order_comment not between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumIsNull() {
            addCriterion("worker_credits_num is null");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumIsNotNull() {
            addCriterion("worker_credits_num is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumEqualTo(Integer value) {
            addCriterion("worker_credits_num =", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumNotEqualTo(Integer value) {
            addCriterion("worker_credits_num <>", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumGreaterThan(Integer value) {
            addCriterion("worker_credits_num >", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_credits_num >=", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumLessThan(Integer value) {
            addCriterion("worker_credits_num <", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumLessThanOrEqualTo(Integer value) {
            addCriterion("worker_credits_num <=", value, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumIn(List<Integer> values) {
            addCriterion("worker_credits_num in", values, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumNotIn(List<Integer> values) {
            addCriterion("worker_credits_num not in", values, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumBetween(Integer value1, Integer value2) {
            addCriterion("worker_credits_num between", value1, value2, "workerCreditsNum");
            return (Criteria) this;
        }

        public Criteria andWorkerCreditsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_credits_num not between", value1, value2, "workerCreditsNum");
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