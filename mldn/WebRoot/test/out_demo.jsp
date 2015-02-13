<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			int buffer=out.getBufferSize();
			int available=out.getRemaining();
			int use=buffer-available;
		%>
		<h3>buffer size : <%=buffer %></h3>
		<h3>buffer available size : <%=available %></h3>
		<h3>buffer size in use : <%=use %></h3>
	</body>
</html>