/*
 * WebApp_Project
 * model.entity.SectionBeanTest.java
 */
package model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 部署情報のテストクラス
 * @author user
 */
class SectionBeanTest {

    @Test
    @DisplayName("部署コードのgetter/setterのチェック")
    void testGetterAndSetterOfSectionCode() {
        SectionBean sb = new SectionBean();
        sb.setSectionCode("S110");

        // 検証
        assertEquals(sb.getSectionCode(), "S110");
    }

    @Test
    @DisplayName("部署名のgetter/setterのチェック")
    void testGetterAndSetterOfSectionName() {
        SectionBean sb = new SectionBean();
        sb.setSectionName("総務部");

        // 検証
        assertEquals(sb.getSectionName(), "総務部");
    }

    @Test
    @DisplayName("更新日時のgetter/setterのチェック")
    void testGetterAndSetterOfUpdateDateTime() {
        SectionBean eb = new SectionBean();
        eb.setUpdateDateTime("2020-05-14 9:00:00");

        // 検証
        assertEquals(eb.getUpdateDateTime(), "2020-05-14 9:00:00");
    }

}
