<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			request.setAttribute("name", "LiXingHua");
			request.setAttribute("birthday", new Date());
		%>
		<a href="request_scope_02.jsp">Link</a>
	</body>
</html>