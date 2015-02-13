<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neil.beans.*" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			SimpleBean simple=new SimpleBean();
			simple.setName("LiXingHua");
			simple.setAge(30);
		%>
		<h3>name : <%=simple.getName() %></h3>
		<h3>age : <%=simple.getAge() %></h3>
	</body>
</html>