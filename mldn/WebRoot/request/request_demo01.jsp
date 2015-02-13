<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 	
			request.setCharacterEncoding("GBK");
			String content=request.getParameter("info");
		%>
		<h1>information: <%=content %></h1>
	</body>
</html>