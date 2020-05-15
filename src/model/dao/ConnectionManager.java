/*
 * WebApp_Project
 * model.dao.ConnectionManager.java
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクションマネージャ
 * @author Shohei Yamamoto
 */
public class ConnectionManager {
    /**
     * データベースURL
     */
    private final static String URL = "jdbc:mysql://localhost:3306/emp_sys_db?useSSL=false";

    /**
     * ユーザ
     */
    private final static String USER = "root";

    /**
     * パスワード
     */
    private final static String PASSWORD = "root";

    /**
     * データベースへの接続を取得して返します。
     * @return コネクション
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static final Connection getConnection() throws SQLException, ClassNotFoundException {

        // JDBCドライバの読み込み
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
