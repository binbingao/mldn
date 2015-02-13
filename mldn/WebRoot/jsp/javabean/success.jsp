<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<jsp:useBean id="reg" scope="request" class="com.neil.beans.Register"/>
	<body>
		name:<jsp:getProperty property="name" name="reg"/><br>
		age:<jsp:getProperty property="age" name="reg"/><br>
		email:<jsp:getProperty property="email" name="reg"/>
		
	</body>
</html>