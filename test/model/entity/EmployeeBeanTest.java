/*
 * WebApp_Project
 * model.entity.EmployeeBeanTest.java
 */
package model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 従業員のテストクラス
 * @author Shohei Yamamoto
 */
class EmployeeBeanTest {

    @Test
    @DisplayName("従業員コードのgetter/setterのチェック")
    void testGetterAndSetterOfCode() {
        EmployeeBean eb = new EmployeeBean();
        eb.setEmployeeCode("E9999");

        // 検証
        assertEquals(eb.getEmployeeCode(), "E9999");
    }

    @Test
    @DisplayName("氏のgetter/setterのチェック")
    void testGetterAndSetterOfLastNameOf() {
        EmployeeBean eb = new EmployeeBean();
        eb.setLastName("山田");

        // 検証
        assertEquals(eb.getLastName(), "山田");
    }

    @Test
    @DisplayName("名のgetter/setterのチェック")
    void testGetterAndSetterOfFirstName() {
        EmployeeBean eb = new EmployeeBean();
        eb.setFirstName("太郎");

        // 検証
        assertEquals(eb.getFirstName(), "太郎");
    }

    @Test
    @DisplayName("氏かなのgetter/setterのチェック")
    void testGetterAndSetterOfFirstKanaName() {
        EmployeeBean eb = new EmployeeBean();
        eb.setLastKanaName("やまだ");

        // 検証
        assertEquals(eb.getLastKanaName(), "やまだ");
    }

    @Test
    @DisplayName("名かなのgetter/setterのチェック")
    void testGetterAndSetterOfLastKanaName() {
        EmployeeBean eb = new EmployeeBean();
        eb.setFirstKanaName("たろう");

        // 検証
        assertEquals(eb.getFirstKanaName(), "たろう");
    }

    @Test
    @DisplayName("性別のgetter/setterのチェック")
    void testGetterAndSetterOfGender() {
        EmployeeBean eb = new EmployeeBean();
        eb.setGender(1);

        // 検証
        assertEquals(eb.getGender(), 1);
    }

    @Test
    @DisplayName("生年月日のgetter/setterのチェック")
    void testGetterAndSetterOfBirthDay() {
        EmployeeBean eb = new EmployeeBean();
        eb.setBirthDay("2000-01-01");

        // 検証
        assertEquals(eb.getBirthDay(), "2000-01-01");
    }

    @Test
    @DisplayName("部署コードのgetter/setterのチェック")
    void testGetterAndSetterOfSectionCode() {
        EmployeeBean eb = new EmployeeBean();
        eb.setSectionName("総務部");

        // 検証
        assertEquals(eb.getSectionName(), "総務部");
    }

    @Test
    @DisplayName("入社日のgetter/setterのチェック")
    void testGetterAndSetterOfHireDate() {
        EmployeeBean eb = new EmployeeBean();
        eb.setHireDate("2020-05-14");

        // 検証
        assertEquals(eb.getHireDate(), "2020-05-14");
    }

    @Test
    @DisplayName("更新日時のgetter/setterのチェック")
    void testGetterAndSetterOfUpdateDateTime() {
        EmployeeBean eb = new EmployeeBean();
        eb.setUpdateDateTime("2020-05-14 9:00:00");

        // 検証
        assertEquals(eb.getUpdateDateTime(), "2020-05-14 9:00:00");
    }

}
