<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String uname=(String)session.getAttribute("name");
			Date birthdays=(Date)session.getAttribute("birthday");
		%>
		<h1>name:<%=uname %></h1>
		<h1>birthday:<%=birthdays %></h1>
	</body>
</html>