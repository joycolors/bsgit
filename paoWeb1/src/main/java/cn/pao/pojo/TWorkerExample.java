package cn.pao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWorkerExample() {
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

        public Criteria andWorkerNameIsNull() {
            addCriterion("worker_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("worker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("worker_name =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("worker_name <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("worker_name >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("worker_name >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("worker_name <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("worker_name <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("worker_name like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("worker_name not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("worker_name in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("worker_name not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("worker_name between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("worker_name not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdIsNull() {
            addCriterion("worker_pwd is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdIsNotNull() {
            addCriterion("worker_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdEqualTo(String value) {
            addCriterion("worker_pwd =", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdNotEqualTo(String value) {
            addCriterion("worker_pwd <>", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdGreaterThan(String value) {
            addCriterion("worker_pwd >", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("worker_pwd >=", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdLessThan(String value) {
            addCriterion("worker_pwd <", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdLessThanOrEqualTo(String value) {
            addCriterion("worker_pwd <=", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdLike(String value) {
            addCriterion("worker_pwd like", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdNotLike(String value) {
            addCriterion("worker_pwd not like", value, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdIn(List<String> values) {
            addCriterion("worker_pwd in", values, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdNotIn(List<String> values) {
            addCriterion("worker_pwd not in", values, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdBetween(String value1, String value2) {
            addCriterion("worker_pwd between", value1, value2, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerPwdNotBetween(String value1, String value2) {
            addCriterion("worker_pwd not between", value1, value2, "workerPwd");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNull() {
            addCriterion("worker_tel is null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNotNull() {
            addCriterion("worker_tel is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelEqualTo(String value) {
            addCriterion("worker_tel =", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotEqualTo(String value) {
            addCriterion("worker_tel <>", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThan(String value) {
            addCriterion("worker_tel >", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThanOrEqualTo(String value) {
            addCriterion("worker_tel >=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThan(String value) {
            addCriterion("worker_tel <", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThanOrEqualTo(String value) {
            addCriterion("worker_tel <=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLike(String value) {
            addCriterion("worker_tel like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotLike(String value) {
            addCriterion("worker_tel not like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIn(List<String> values) {
            addCriterion("worker_tel in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotIn(List<String> values) {
            addCriterion("worker_tel not in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelBetween(String value1, String value2) {
            addCriterion("worker_tel between", value1, value2, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotBetween(String value1, String value2) {
            addCriterion("worker_tel not between", value1, value2, "workerTel");
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

        public Criteria andWorkerImgIsNull() {
            addCriterion("worker_img is null");
            return (Criteria) this;
        }

        public Criteria andWorkerImgIsNotNull() {
            addCriterion("worker_img is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerImgEqualTo(String value) {
            addCriterion("worker_img =", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgNotEqualTo(String value) {
            addCriterion("worker_img <>", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgGreaterThan(String value) {
            addCriterion("worker_img >", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgGreaterThanOrEqualTo(String value) {
            addCriterion("worker_img >=", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgLessThan(String value) {
            addCriterion("worker_img <", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgLessThanOrEqualTo(String value) {
            addCriterion("worker_img <=", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgLike(String value) {
            addCriterion("worker_img like", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgNotLike(String value) {
            addCriterion("worker_img not like", value, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgIn(List<String> values) {
            addCriterion("worker_img in", values, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgNotIn(List<String> values) {
            addCriterion("worker_img not in", values, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgBetween(String value1, String value2) {
            addCriterion("worker_img between", value1, value2, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerImgNotBetween(String value1, String value2) {
            addCriterion("worker_img not between", value1, value2, "workerImg");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeIsNull() {
            addCriterion("worker_this_login_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeIsNotNull() {
            addCriterion("worker_this_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeEqualTo(Date value) {
            addCriterion("worker_this_login_time =", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeNotEqualTo(Date value) {
            addCriterion("worker_this_login_time <>", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeGreaterThan(Date value) {
            addCriterion("worker_this_login_time >", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("worker_this_login_time >=", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeLessThan(Date value) {
            addCriterion("worker_this_login_time <", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("worker_this_login_time <=", value, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeIn(List<Date> values) {
            addCriterion("worker_this_login_time in", values, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeNotIn(List<Date> values) {
            addCriterion("worker_this_login_time not in", values, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeBetween(Date value1, Date value2) {
            addCriterion("worker_this_login_time between", value1, value2, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerThisLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("worker_this_login_time not between", value1, value2, "workerThisLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeIsNull() {
            addCriterion("worker_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeIsNotNull() {
            addCriterion("worker_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeEqualTo(Date value) {
            addCriterion("worker_last_login_time =", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeNotEqualTo(Date value) {
            addCriterion("worker_last_login_time <>", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeGreaterThan(Date value) {
            addCriterion("worker_last_login_time >", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("worker_last_login_time >=", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeLessThan(Date value) {
            addCriterion("worker_last_login_time <", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("worker_last_login_time <=", value, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeIn(List<Date> values) {
            addCriterion("worker_last_login_time in", values, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeNotIn(List<Date> values) {
            addCriterion("worker_last_login_time not in", values, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("worker_last_login_time between", value1, value2, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andWorkerLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("worker_last_login_time not between", value1, value2, "workerLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIsNull() {
            addCriterion("validateCode is null");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIsNotNull() {
            addCriterion("validateCode is not null");
            return (Criteria) this;
        }

        public Criteria andValidatecodeEqualTo(String value) {
            addCriterion("validateCode =", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotEqualTo(String value) {
            addCriterion("validateCode <>", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeGreaterThan(String value) {
            addCriterion("validateCode >", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("validateCode >=", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLessThan(String value) {
            addCriterion("validateCode <", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLessThanOrEqualTo(String value) {
            addCriterion("validateCode <=", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeLike(String value) {
            addCriterion("validateCode like", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotLike(String value) {
            addCriterion("validateCode not like", value, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeIn(List<String> values) {
            addCriterion("validateCode in", values, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotIn(List<String> values) {
            addCriterion("validateCode not in", values, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeBetween(String value1, String value2) {
            addCriterion("validateCode between", value1, value2, "validatecode");
            return (Criteria) this;
        }

        public Criteria andValidatecodeNotBetween(String value1, String value2) {
            addCriterion("validateCode not between", value1, value2, "validatecode");
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