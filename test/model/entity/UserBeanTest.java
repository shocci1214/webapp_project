/*
 * WebApp_Project
 * model.entity.UserBeanTest.java
 */
package model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ユーザのテストクラス
 * @author Shohei Yamamoto
 */
class UserBeanTest {

    @Test
    @DisplayName("ユーザIDのgetter/setterのチェック")
    void testGetterAndSetterOfUserId() {
        UserBean ub = new UserBean();
        ub.setUserId("U0001");

        // 検証
        assertEquals(ub.getUserId(), "U0001");
    }

    @Test
    @DisplayName("パスワードのgetter/setterのチェック")
    void testGetterAndSetterOfSectionName() {
        UserBean ub = new UserBean();
        ub.setPassword("password");

        // 検証
        assertEquals(ub.getPassword(), "password");
    }

    @Test
    @DisplayName("更新日時のgetter/setterのチェック")
    void testGetterAndSetterOfUpdateDateTime() {
        UserBean ub = new UserBean();
        ub.setUpdateDateTime("2020-05-14 9:00:00");

        // 検証
        assertEquals(ub.getUpdateDateTime(), "2020-05-14 9:00:00");
    }

}
