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
		<h3>�Ѿ�������<%=count++ %>�Σ�</h3>
	</body>
</html>