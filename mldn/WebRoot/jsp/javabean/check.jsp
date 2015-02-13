<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<jsp:useBean id="reg" scope="request" class="com.neil.beans.Register"/>
	<jsp:setProperty property="*" name="reg"/>
	<body>
	<% 
		if(reg.isValidate()){
	%>
			<jsp:forward page="success.jsp"/>
	<%
		}
		else{
	%>
			<jsp:forward page="index.jsp"/>
	<%
		}
	%>
	</body>
</html>