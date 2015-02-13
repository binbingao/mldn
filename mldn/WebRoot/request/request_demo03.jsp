<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			request.setCharacterEncoding("GBK");
			String name=request.getParameter("name");
			String pass=request.getParameter("password");
		%>
		<h1>name:<%=name %></h1>
		<h1>password:<%=pass %></h1>
	</body>
</html>