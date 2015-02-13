<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<jsp:useBean id="con" scope="application" class="com.neil.beans.Count"/>
	<body>
		<h3>the <jsp:getProperty name="con" property="count"/>th request!</h3>
	</body>
</html>