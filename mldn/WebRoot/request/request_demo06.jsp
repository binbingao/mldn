<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			String method=request.getMethod();
			String ip=request.getRemoteAddr();
			String path=request.getServletPath();
			String contextPath=request.getContextPath();
		%>
		<h3>method:<%=method %></h3>
		<h3>ip:<%=ip %></h3>
		<h3>path:<%=path %></h3>
		<h3>contextpath:<%=contextPath %></h3>
	</body>
</html>