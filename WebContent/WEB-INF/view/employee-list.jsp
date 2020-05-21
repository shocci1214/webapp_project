<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
  import="java.util.List, model.entity.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員情報管理システム - 従業員一覧</title>
</head>
<body>
  <%
      List<EmployeeBean> employeeList = (List<EmployeeBean>) request.getAttribute("employeeList");
  %>
  <h1>従業員一覧</h1>
  <%
      if (employeeList.size() == 0) {
  %>
  <p>データがありません。</p>
  <%
      } else {
  %>
  <table>
    <tr>
      <th>従業員コード</th>
      <th>氏名</th>
      <th>氏名かな</th>
      <th>性別</th>
      <th>部署名</th>
    </tr>

    <%
        for (EmployeeBean employee : employeeList) {
    %>
    <tr>
      <td><%=employee.getEmployeeCode()%></td>
      <td><%=employee.getLastName()%> <%=employee.getFirstName()%></td>
      <td><%=employee.getLastKanaName()%> <%=employee.getFirstKanaName()%></td>
      <%
          if (employee.getGender() == 1) {
      %>
      <td>男</td>
      <%
          } else if (employee.getGender() == 2) {
      %>
      <td>女</td>
      <%
          }
      %>
      <td><%=employee.getSectionName()%></td>
      <td><a href="#">編集</a></td>
      <td><a href="#">削除</a></td>
    </tr>
    <%
        }
    %>
  </table>
  <%
      }
  %>

</body>
</html>