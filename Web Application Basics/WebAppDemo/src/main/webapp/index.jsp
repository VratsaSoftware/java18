<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>

<form method="post">
  <label for="username">Username: </label>
  <input type="text" name="username" id="username"/>
  <input type="submit" value="Test my name"/>
</form>

<%
  String username = request.getParameter("username");
  String myNewName = "https://google.com/search?q=" + username + "1234";
%>

<a href=<%=myNewName%>>Who am I</a>

</body>
</html>
