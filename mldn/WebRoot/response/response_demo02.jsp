<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<h3>3 seconds to hello.htm, if haven't please click<a href="hello.htm">Link</a></h3>
		<% 
			response.setHeader("refresh", "3;URL=hello.htm");
		%>
	</body>
</html>