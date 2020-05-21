/*
 * WebApp_Project
 * model.dao.ConnectionManagerTest.java
 */
package model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * コネクションマネージャのテストクラス
 * @author Shohei Yamamoto
 */
class ConnectionManagerTest {

    @Test
    @DisplayName("データベースへの接続チェック")
    void testGetConnection() {

        // 検証
        try {
            ConnectionManager.getConnection();
        } catch (SQLException | ClassNotFoundException e) {
            fail();
        }
    }

}
