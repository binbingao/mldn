<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% System.out.println("before response jump"); %>
		<% response.sendRedirect("hello.htm"); %>
		<% System.out.println("after response jumt"); %>
	</body>
</html>