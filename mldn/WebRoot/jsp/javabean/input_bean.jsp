<%@ page contentType="text/html" pageEncoding="GBK" %>
<jsp:useBean id="simple" scope="page" class="com.neil.beans.SimpleBean"/>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			simple.setName(request.getParameter("name"));
			simple.setAge(Integer.parseInt(request.getParameter("age")));
		%>
		<h3>name : <%=simple.getName() %></h3>
		<h3>age : <%=simple.getAge() %></h3>
	</body>
</html>
