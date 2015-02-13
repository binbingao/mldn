<%@ page contentType="text/html" pageEncoding="GBK" %>
<jsp:useBean id="simple" scope="page" class="com.neil.beans.SimpleBean"/>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			simple.setName("LiLiXingHua");
			simple.setAge(31);
		%>
		<h3>name : <%=simple.getName() %></h3>
		<h3>age : <%=simple.getAge() %></h3>
	</body>
</html>