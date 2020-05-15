/*
 * WebApp_Project
 * model.entity.LicenseBean.java
 */
package model.entity;

/**
 * 資格情報を表します。
 * m_licenseのDTOであり、Beanオブジェクトです。
 * @author Shohei Yamamoto
 */
public class LicenseBean {
    /**
     * 資格コード
     */
    private String licenseCode;

    /**
     * 資格名
     */
    private String licenseName;

    /**
     * フィールドlicenseCodeを取得します。
     * @return licenseCode
     */
    public String getLicenseCode() {
        return licenseCode;
    }

    /**
     * フィールドlicenseCodeを設定
     * @param licenseCode 資格コード
     */
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    /**
     * フィールドlicenseNameを取得
     * @return licenseName
     */
    public String getLicenseName() {
        return licenseName;
    }

    /**
     * フィールドlicenseNameを設定する
     * @param licenseName 資格名
     */
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

}
