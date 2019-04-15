package cn.pao.pojo;

import java.util.ArrayList;
import java.util.List;

public class TUserAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserAddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandIsNull() {
            addCriterion("user_address_crownland is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandIsNotNull() {
            addCriterion("user_address_crownland is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandEqualTo(String value) {
            addCriterion("user_address_crownland =", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandNotEqualTo(String value) {
            addCriterion("user_address_crownland <>", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandGreaterThan(String value) {
            addCriterion("user_address_crownland >", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_crownland >=", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandLessThan(String value) {
            addCriterion("user_address_crownland <", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandLessThanOrEqualTo(String value) {
            addCriterion("user_address_crownland <=", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandLike(String value) {
            addCriterion("user_address_crownland like", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandNotLike(String value) {
            addCriterion("user_address_crownland not like", value, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandIn(List<String> values) {
            addCriterion("user_address_crownland in", values, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandNotIn(List<String> values) {
            addCriterion("user_address_crownland not in", values, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandBetween(String value1, String value2) {
            addCriterion("user_address_crownland between", value1, value2, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCrownlandNotBetween(String value1, String value2) {
            addCriterion("user_address_crownland not between", value1, value2, "userAddressCrownland");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNull() {
            addCriterion("user_address_city is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNotNull() {
            addCriterion("user_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityEqualTo(String value) {
            addCriterion("user_address_city =", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotEqualTo(String value) {
            addCriterion("user_address_city <>", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThan(String value) {
            addCriterion("user_address_city >", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_city >=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThan(String value) {
            addCriterion("user_address_city <", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThanOrEqualTo(String value) {
            addCriterion("user_address_city <=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLike(String value) {
            addCriterion("user_address_city like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotLike(String value) {
            addCriterion("user_address_city not like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIn(List<String> values) {
            addCriterion("user_address_city in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotIn(List<String> values) {
            addCriterion("user_address_city not in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityBetween(String value1, String value2) {
            addCriterion("user_address_city between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotBetween(String value1, String value2) {
            addCriterion("user_address_city not between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIsNull() {
            addCriterion("user_address_area is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIsNotNull() {
            addCriterion("user_address_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaEqualTo(String value) {
            addCriterion("user_address_area =", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotEqualTo(String value) {
            addCriterion("user_address_area <>", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaGreaterThan(String value) {
            addCriterion("user_address_area >", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_area >=", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLessThan(String value) {
            addCriterion("user_address_area <", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("user_address_area <=", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaLike(String value) {
            addCriterion("user_address_area like", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotLike(String value) {
            addCriterion("user_address_area not like", value, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaIn(List<String> values) {
            addCriterion("user_address_area in", values, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotIn(List<String> values) {
            addCriterion("user_address_area not in", values, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaBetween(String value1, String value2) {
            addCriterion("user_address_area between", value1, value2, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressAreaNotBetween(String value1, String value2) {
            addCriterion("user_address_area not between", value1, value2, "userAddressArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressListIsNull() {
            addCriterion("user_address_list is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressListIsNotNull() {
            addCriterion("user_address_list is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressListEqualTo(String value) {
            addCriterion("user_address_list =", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListNotEqualTo(String value) {
            addCriterion("user_address_list <>", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListGreaterThan(String value) {
            addCriterion("user_address_list >", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_list >=", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListLessThan(String value) {
            addCriterion("user_address_list <", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListLessThanOrEqualTo(String value) {
            addCriterion("user_address_list <=", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListLike(String value) {
            addCriterion("user_address_list like", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListNotLike(String value) {
            addCriterion("user_address_list not like", value, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListIn(List<String> values) {
            addCriterion("user_address_list in", values, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListNotIn(List<String> values) {
            addCriterion("user_address_list not in", values, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListBetween(String value1, String value2) {
            addCriterion("user_address_list between", value1, value2, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserAddressListNotBetween(String value1, String value2) {
            addCriterion("user_address_list not between", value1, value2, "userAddressList");
            return (Criteria) this;
        }

        public Criteria andUserReceiverIsNull() {
            addCriterion("user_receiver is null");
            return (Criteria) this;
        }

        public Criteria andUserReceiverIsNotNull() {
            addCriterion("user_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andUserReceiverEqualTo(String value) {
            addCriterion("user_receiver =", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverNotEqualTo(String value) {
            addCriterion("user_receiver <>", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverGreaterThan(String value) {
            addCriterion("user_receiver >", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("user_receiver >=", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverLessThan(String value) {
            addCriterion("user_receiver <", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverLessThanOrEqualTo(String value) {
            addCriterion("user_receiver <=", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverLike(String value) {
            addCriterion("user_receiver like", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverNotLike(String value) {
            addCriterion("user_receiver not like", value, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverIn(List<String> values) {
            addCriterion("user_receiver in", values, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverNotIn(List<String> values) {
            addCriterion("user_receiver not in", values, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverBetween(String value1, String value2) {
            addCriterion("user_receiver between", value1, value2, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverNotBetween(String value1, String value2) {
            addCriterion("user_receiver not between", value1, value2, "userReceiver");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelIsNull() {
            addCriterion("user_receiver_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelIsNotNull() {
            addCriterion("user_receiver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelEqualTo(String value) {
            addCriterion("user_receiver_tel =", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelNotEqualTo(String value) {
            addCriterion("user_receiver_tel <>", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelGreaterThan(String value) {
            addCriterion("user_receiver_tel >", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_receiver_tel >=", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelLessThan(String value) {
            addCriterion("user_receiver_tel <", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelLessThanOrEqualTo(String value) {
            addCriterion("user_receiver_tel <=", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelLike(String value) {
            addCriterion("user_receiver_tel like", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelNotLike(String value) {
            addCriterion("user_receiver_tel not like", value, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelIn(List<String> values) {
            addCriterion("user_receiver_tel in", values, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelNotIn(List<String> values) {
            addCriterion("user_receiver_tel not in", values, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelBetween(String value1, String value2) {
            addCriterion("user_receiver_tel between", value1, value2, "userReceiverTel");
            return (Criteria) this;
        }

        public Criteria andUserReceiverTelNotBetween(String value1, String value2) {
            addCriterion("user_receiver_tel not between", value1, value2, "userReceiverTel");
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