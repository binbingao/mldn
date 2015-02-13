<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<%
			Cookie c1=new Cookie("lxh","LiXingHua");
			Cookie c2=new Cookie("mldn","www.mldnjava.cn");
			response.addCookie(c1);
			response.addCookie(c2);
		%>
	</body>
</html>