<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% System.out.println("before forward");%>
		<jsp:forward page="hello.htm"/>
		<% System.out.println("after forward"); %>
	</body>
</html>