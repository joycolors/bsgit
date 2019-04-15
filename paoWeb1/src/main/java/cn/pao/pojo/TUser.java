package cn.pao.pojo;

import java.util.Date;

public class TUser {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userTel;

    private Integer userCreditsNum;

    private String userImg;

    private Date userThisLoginTime;

    private Date userLastLoginTime;

    private Integer status;

    private String validatecode;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Integer getUserCreditsNum() {
        return userCreditsNum;
    }

    public void setUserCreditsNum(Integer userCreditsNum) {
        this.userCreditsNum = userCreditsNum;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public Date getUserThisLoginTime() {
        return userThisLoginTime;
    }

    public void setUserThisLoginTime(Date userThisLoginTime) {
        this.userThisLoginTime = userThisLoginTime;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
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