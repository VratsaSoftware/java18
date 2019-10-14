<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<jsp:useBean id="database" class="db.Database"/>

<%
    database.deleteSpam();
    String bookName = request.getParameter("bookName");
    String authorName = request.getParameter("authorName");
    String isbn = request.getParameter("isbn");

    if (bookName != null && authorName != null && isbn != null) {
        database.insertRow(bookName, authorName, isbn);
    }

    List<String> result = database.getData();
%>

<form method="post" action="index.jsp">
    <input type="text" name="bookName"/>
    <input type="text" name="authorName"/>
    <input type="text" name="isbn"/>
    <input type="submit" name="btn"/>
</form>

<% for (String s : result) { %>
    <p><%=s%></p>
<% } %>

</body>
</html>
