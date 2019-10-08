<%--
  Created by IntelliJ IDEA.
  User: Lilly
  Date: 6.10.2019 г.
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <%=request.getAttribute("logged")%>
        <form method="post" action="loginUser">
            Enter username: <input type="text" name="user"><br>
            Enter password: <input type="password" name="pass"><br>
            <br>
            <input type="submit" name="Login">
        </form>
    </body>
</html>
