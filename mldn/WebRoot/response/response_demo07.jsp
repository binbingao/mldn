<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			Cookie c[]=request.getCookies();
			for(int i=0;i<c.length;i++){
		%>
				<h3><%=c[i].getName() %>--><%=c[i].getValue() %></h3>
		<% 
			}
		%>
	</body>
</html>