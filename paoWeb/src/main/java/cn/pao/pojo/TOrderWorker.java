package cn.pao.pojo;

public class TOrderWorker extends TOrderWorkerKey {
    private String orderComment;

    private Integer workerCreditsNum;

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