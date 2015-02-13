<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			if(session.isNew()){
		%>
				<h3>welcome new user to coming!</h3>
		<%
			}else{
		%>
				<h3>you are old user!</h3>
		<%
			
			}
		%>
	</body>
</html>