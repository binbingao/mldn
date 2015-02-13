<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String path=this.getServletContext().getRealPath("/");
		%>
		<h3>real path: <%=path %></h3>
	</body>
</html>