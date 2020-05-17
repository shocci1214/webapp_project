/*
 * WebApp_Project
 * model.dao.EmployeeDAO.java
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.EmployeeBean;

/**
 * m_employeeテーブルのDAOです。
 * @author Shohei Yamamoto
 */
public class EmployeeDAO {
    /**
     * すべての従業員のリストを返します。
     * @return 従業員のリスト
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public List<EmployeeBean> selectAll() throws SQLException, ClassNotFoundException {

        // 従業員のリスト
        List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
        // 実行するSQL文
        String sql = "SELECT * FROM m_employee";

        // データベースへの接続
        try (Connection con = ConnectionManager.getConnection();
                Statement stmt = con.createStatement()) {

            // SQLステートメント(参照系)の実行
            ResultSet res = stmt.executeQuery(sql);

            // 結果の操作
            while (res.next()) {
                EmployeeBean employee = new EmployeeBean();
                employee.setEmployeeCode(res.getString("employee_code"));
                employee.setLastName(res.getString("last_name"));
                employee.setFirstName(res.getString("first_name"));
                employee.setLastKanaName(res.getString("last_kana_name"));
                employee.setFirstKanaName(res.getString("first_kana_name"));
                employee.setGender(res.getInt("gender"));
                employee.setBirthDay(res.getString("birth_day"));
                employee.setSectionCode(res.getString("section_code"));
                employee.setHireDate(res.getString("hire_date"));
                employee.setUpdateDateTime(res.getString("update_datetime"));

                employeeList.add(employee);
            }
        }

        return employeeList;
    }

}
