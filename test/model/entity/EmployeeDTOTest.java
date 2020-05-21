/*
 * WebApp_Project
 * model.entity.EmployeeDTOTest.java
 */
package model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 従業員のDTOのテストクラス
 * @author Shohei Yamamoto
 */
class EmployeeDTOTest {

    @Test
    @DisplayName("従業員コードのgetter/setterのチェック")
    void testGetterAndSetterOfCode() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setEmployeeCode("E9999");

        // 検証
        assertEquals(eb.getEmployeeCode(), "E9999");
    }

    @Test
    @DisplayName("氏のgetter/setterのチェック")
    void testGetterAndSetterOfLastNameOf() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setLastName("山田");

        // 検証
        assertEquals(eb.getLastName(), "山田");
    }

    @Test
    @DisplayName("名のgetter/setterのチェック")
    void testGetterAndSetterOfFirstName() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setFirstName("太郎");

        // 検証
        assertEquals(eb.getFirstName(), "太郎");
    }

    @Test
    @DisplayName("氏かなのgetter/setterのチェック")
    void testGetterAndSetterOfFirstKanaName() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setLastKanaName("やまだ");

        // 検証
        assertEquals(eb.getLastKanaName(), "やまだ");
    }

    @Test
    @DisplayName("名かなのgetter/setterのチェック")
    void testGetterAndSetterOfLastKanaName() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setFirstKanaName("たろう");

        // 検証
        assertEquals(eb.getFirstKanaName(), "たろう");
    }

    @Test
    @DisplayName("性別のgetter/setterのチェック")
    void testGetterAndSetterOfGender() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setGender(1);

        // 検証
        assertEquals(eb.getGender(), 1);
    }

    @Test
    @DisplayName("生年月日のgetter/setterのチェック")
    void testGetterAndSetterOfBirthDay() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setBirthDay("2000-01-01");

        // 検証
        assertEquals(eb.getBirthDay(), "2000-01-01");
    }

    @Test
    @DisplayName("部署コードのgetter/setterのチェック")
    void testGetterAndSetterOfSectionCode() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setSectionCode("S001");

        // 検証
        assertEquals(eb.getSectionCode(), "S001");
    }

    @Test
    @DisplayName("入社日のgetter/setterのチェック")
    void testGetterAndSetterOfHireDate() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setHireDate("2020-05-14");

        // 検証
        assertEquals(eb.getHireDate(), "2020-05-14");
    }

    @Test
    @DisplayName("更新日時のgetter/setterのチェック")
    void testGetterAndSetterOfUpdateDateTime() {
        EmployeeDTO eb = new EmployeeDTO();
        eb.setUpdateDateTime("2020-05-14 9:00:00");

        // 検証
        assertEquals(eb.getUpdateDateTime(), "2020-05-14 9:00:00");
    }

}
