<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String uname=(String)application.getAttribute("name");
			Date birthday=(Date)application.getAttribute("birthday");
		%>
		<h1>name:<%=uname %></h1>
		<h1>birthday<%=birthday %></h1>
	</body>
</html>