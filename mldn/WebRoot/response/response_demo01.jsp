<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<%! 
			int count=0;
		%>
		<% 
			response.setHeader("refresh", "2");
		%>
		<h3>已经访问了<%=count++ %>次！</h3>
	</body>
</html>