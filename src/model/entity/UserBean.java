/*
 * WebApp_Project
 * model.entity.UserBean.java
 */
package model.entity;

/**
 * ユーザ（システムの利用者）を表します
 * m_userのDTOであり、Beanオブジェクトです。
 * @author Shohei Yamamoto
 */
public class UserBean {

    /**
     * ユーザID
     */
    private String userId;

    /**
     * パスワード
     */
    private String password;

    /**
     * 更新日時
     */
    private String updateDateTime;

    /**
     * フィールドuserIDを取得します。
     * @return userID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * フィールドuserIDを設定します。
     * @param userID ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * フィールドpasswordを取得します。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * フィールドpasswordを設定します。
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * フィールドupdateDateTimeを取得します。
     * @return updateDateTime
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * フィールドupdateDateTimeを設定します。
     * @param updateDateTime 更新日時
     */
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

}
