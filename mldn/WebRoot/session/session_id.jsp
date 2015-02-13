<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String id=session.getId();
		%>
		<h3>SESSION ID:<%=id %></h3>
		<h3>SESSION ID Length:<%=id.length() %></h3>
	</body>
</html>