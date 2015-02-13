<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			application.setAttribute("name", "LiXingHua");
			application.setAttribute("birthday", new Date());
		%>
		<a href="application_scope_02.jsp">link</a>
	</body>
</html>