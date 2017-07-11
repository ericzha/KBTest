<%@ page import="com.alibaba.content.webapi.testclass1" %>
<%@ page language="java" contentType="text/html;charset=GBK"%>

<html>
<head>
    <title>Knowledge Management WebApp</title>
</head>

<body>
<h2>Main Page</h2>
<%
    testclass1 t1 = new testclass1();
    String msg = t1.getTestMessage();
%>
<p><%=msg%></p>
</body>
</html>
