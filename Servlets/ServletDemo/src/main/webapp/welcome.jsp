<%--
  Created by IntelliJ IDEA.
  User: Lilly
  Date: 6.10.2019 г.
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome <%=request.getAttribute("logged")%>!</h1>
    </body>
</html>
