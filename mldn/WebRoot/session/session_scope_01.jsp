<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			session.setAttribute("name", "LiXingHua");
			session.setAttribute("birthday", new Date());
		%>
		<a href="session_scope_02.jsp">Link</a>
	</body>
</html>