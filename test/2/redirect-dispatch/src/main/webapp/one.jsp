<%--
  Created by IntelliJ IDEA.
  User: Ahmad
  Date: 1/14/2022
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>one</title>
</head>
<body>
<%System.out.println("1 Before Redirect");%>
<%request.getRequestDispatcher("WEB-INF/test.jsp").forward(request,response);%>
<%System.out.println("1 After Redirect");%>
<%int a = 5;%>
</body>
</html>
