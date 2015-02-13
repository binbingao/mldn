<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			Cookie c1=new Cookie("lxh","LiXingHua");
			Cookie c2=new Cookie("mldn","www.mldnjava.cn");
			c1.setMaxAge(60);
			c2.setMaxAge(60);
			response.addCookie(c1);
			response.addCookie(c2);
		%>
	</body>
</html>