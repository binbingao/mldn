<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String username=(String)request.getAttribute("name");
			Date birthday=(Date)request.getAttribute("birthday");
		%>
		<h1>������<%=username %></h1>
		<h1>���գ�<%=birthday %></h1>
	</body>
</html>