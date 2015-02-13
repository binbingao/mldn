<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			if(session.getAttribute("userid")!=null){
		%>
				<h3>welcome <%=session.getAttribute("userid") %> to this System <a href="logout.jsp">Logout</a></h3>
		<%
			}else{
		%>
				<h3>Please login first <a href="login.jsp">Login</a></h3>
		<%
			}
		%>
	</body>
</html>