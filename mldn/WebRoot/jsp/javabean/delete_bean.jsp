<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<jsp:useBean id="con" scope="session" class="com.neil.beans.Count"/>
	<body>
		<h3>the <jsp:getProperty name="con" property="count"/>the request!</h3>
		<%session.removeAttribute("con") ;%>
	</body>
</html>