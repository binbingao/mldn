<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			pageContext.setAttribute("name", "LiXingHua");
			pageContext.setAttribute("birthday", new Date());
		%>
		<jsp:forward page="page_scope_03.jsp"></jsp:forward>
	</body>
</html>