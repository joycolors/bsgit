package cn.pao.pojo;

public class TWorkerComment {
    private Integer workerOrderId;

    private String workerId;

    private String orderId;

    private String orderComment;

    private Integer workerCreditsNum;

    public Integer getWorkerOrderId() {
        return workerOrderId;
    }

    public void setWorkerOrderId(Integer workerOrderId) {
        this.workerOrderId = workerOrderId;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId == null ? null : workerId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment == null ? null : orderComment.trim();
    }

    public Integer getWorkerCreditsNum() {
        return workerCreditsNum;
    }

    public void setWorkerCreditsNum(Integer workerCreditsNum) {
        this.workerCreditsNum = workerCreditsNum;
    }
}