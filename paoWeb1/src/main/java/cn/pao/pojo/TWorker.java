package cn.pao.pojo;

import java.util.Date;

public class TWorker {
    private Integer workerId;

    private String workerName;

    private String workerPwd;

    private String workerTel;

    private Integer workerCreditsNum;

    private String workerImg;

    private Date workerThisLoginTime;

    private Date workerLastLoginTime;

    private Integer status;

    private String validatecode;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerPwd() {
        return workerPwd;
    }

    public void setWorkerPwd(String workerPwd) {
        this.workerPwd = workerPwd == null ? null : workerPwd.trim();
    }

    public String getWorkerTel() {
        return workerTel;
    }

    public void setWorkerTel(String workerTel) {
        this.workerTel = workerTel == null ? null : workerTel.trim();
    }

    public Integer getWorkerCreditsNum() {
        return workerCreditsNum;
    }

    public void setWorkerCreditsNum(Integer workerCreditsNum) {
        this.workerCreditsNum = workerCreditsNum;
    }

    public String getWorkerImg() {
        return workerImg;
    }

    public void setWorkerImg(String workerImg) {
        this.workerImg = workerImg == null ? null : workerImg.trim();
    }

    public Date getWorkerThisLoginTime() {
        return workerThisLoginTime;
    }

    public void setWorkerThisLoginTime(Date workerThisLoginTime) {
        this.workerThisLoginTime = workerThisLoginTime;
    }

    public Date getWorkerLastLoginTime() {
        return workerLastLoginTime;
    }

    public void setWorkerLastLoginTime(Date workerLastLoginTime) {
        this.workerLastLoginTime = workerLastLoginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode == null ? null : validatecode.trim();
    }
}