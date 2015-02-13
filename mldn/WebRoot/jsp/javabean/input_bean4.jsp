<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<% 
		request.setCharacterEncoding("GBK");
	%>
	<jsp:useBean id="simple" scope="page" class="com.neil.beans.SimpleBean"/>
	<jsp:setProperty property="*" name="simple"/>
	<body>
		<h3>name : <jsp:getProperty name="simple" property="name"/></h3>
		<h3>age : <jsp:getProperty name="simple" property="age"/></h3>
	</body>
</html>