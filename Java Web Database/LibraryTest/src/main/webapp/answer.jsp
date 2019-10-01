<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>Answer</title></head>

  <body>
    <jsp:useBean id="database" class="com.vso.MySqlTest"/>

    <%
      database.createTable();
      database.insertData();
    %>
  </body>
</html>
