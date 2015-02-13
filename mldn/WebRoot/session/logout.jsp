<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<%
			response.setHeader("refresh", "2;URL=login.jsp");
			session.invalidate();
		%>
		<h3>You have been logout, 2seconds to index page!</h3>
		<h3>if not going, please click <a href="login.jsp">Here</a></h3>
	</body>
</html>