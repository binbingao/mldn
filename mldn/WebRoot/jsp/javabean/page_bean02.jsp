<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<jsp:useBean id="cou" scope="page" class="com.neil.beans.Count"/>
	<body>
		<h3>the <jsp:getProperty name="cou" property="count"/>ths request.</h3>
	</body>
</html>