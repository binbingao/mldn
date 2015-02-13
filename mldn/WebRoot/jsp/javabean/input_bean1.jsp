<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<% 
		request.setCharacterEncoding("GBK");
	%>
	<jsp:useBean id="simple" scope="page" class="com.neil.beans.SimpleBean"/>
	<jsp:setProperty property="*" name="simple"/>
	<body>
	<h3>name : <%=simple.getName() %></h3>
	<h3>age : <%=simple.getAge() %></h3>
		
	</body>
</html>