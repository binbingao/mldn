<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String username=(String)pageContext.getAttribute("name");
			Date userbirthday=(Date)pageContext.getAttribute("birthday");
		%>
		<h2>������<%=username %></h2>
		<h2>���գ�<%=userbirthday %></h2>
	</body>
</html>