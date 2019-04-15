package cn.pao.pojo;

public class TUserAddress {
    private Integer addressId;

    private Integer userId;

    private String userAddressCrownland;

    private String userAddressCity;

    private String userAddressArea;

    private String userAddressList;

    private String userReceiver;

    private String userReceiverTel;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAddressCrownland() {
        return userAddressCrownland;
    }

    public void setUserAddressCrownland(String userAddressCrownland) {
        this.userAddressCrownland = userAddressCrownland == null ? null : userAddressCrownland.trim();
    }

    public String getUserAddressCity() {
        return userAddressCity;
    }

    public void setUserAddressCity(String userAddressCity) {
        this.userAddressCity = userAddressCity == null ? null : userAddressCity.trim();
    }

    public String getUserAddressArea() {
        return userAddressArea;
    }

    public void setUserAddressArea(String userAddressArea) {
        this.userAddressArea = userAddressArea == null ? null : userAddressArea.trim();
    }

    public String getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(String userAddressList) {
        this.userAddressList = userAddressList == null ? null : userAddressList.trim();
    }

    public String getUserReceiver() {
        return userReceiver;
    }

    public void setUserReceiver(String userReceiver) {
        this.userReceiver = userReceiver == null ? null : userReceiver.trim();
    }

    public String getUserReceiverTel() {
        return userReceiverTel;
    }

    public void setUserReceiverTel(String userReceiverTel) {
        this.userReceiverTel = userReceiverTel == null ? null : userReceiverTel.trim();
    }
}