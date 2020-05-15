/*
 * WebApp_Project
 * model.entity.SectionBean.java
 */
package model.entity;

import java.io.Serializable;

/**
 * 部署を表します。
 * m_sectionのDTOであり、Beanオブジェクトです。
 * @author Shohei Yamamoto
 */
public class SectionBean implements Serializable {

    /**
     * 部署コード
     */
    private String sectionCode;

    /**
     * 部署名
     */
    private String sectionName;

    /**
     * 更新日時
     */
    private String updateDateTime;

    /**
     * フィールドsectionCode
     * @return sectionCode
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * フィールドsectionCodeの値を設定します。
     * @param sectionCode 部署コード
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * フィールドsectionNameの値を取得します。
     * @return sectionName
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * フィールドsectionNameの値を設定します。
     * @param name
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * フィールドupdateDateTimeの値を取得します。
     * @return updateDateTime
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * フィールドupdateDateTimeの値を設定します。
     * @param updateDateTime 更新日時
     */
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

}
