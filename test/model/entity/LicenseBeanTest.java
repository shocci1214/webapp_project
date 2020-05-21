/*
 * WebApp_Project
 * model.entity.LicenseBeanTest.java
 */
package model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 資格情報のテストクラス
 * @author Shohei Yamamoto
 */
class LicenseBeanTest {

    @Test
    @DisplayName("資格コードのgetter/setterのチェック")
    void testGetterAndSetterOflicenseCode() {
        LicenseBean lb = new LicenseBean();
        lb.setLicenseCode("L0001");

        // 検証
        assertEquals(lb.getLicenseCode(), "L0001");
    }

    @Test
    @DisplayName("資格名のgetter/setterのチェック")
    void testGetterAndSetterOflicenseName() {
        LicenseBean lb = new LicenseBean();
        lb.setLicenseName("ITパスポート");

        // 検証
        assertEquals(lb.getLicenseName(), "ITパスポート");
    }

}
