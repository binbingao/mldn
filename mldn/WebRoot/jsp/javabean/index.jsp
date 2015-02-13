<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK") ;%>
	<jsp:useBean id="reg" scope="request" class="com.neil.beans.Register"/>
	<body>
		<form action="check.jsp" method="post">
			name:<input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>">
			<%=reg.getErrorMsg("errname") %><br>
			age :<input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>">
			<%=reg.getErrorMsg("errage") %><br>
			email:<input type="text" name="email" value="<jsp:getProperty name="reg" property="email"/>">
			<%=reg.getErrorMsg("erremail") %><br>
			<input type="reset" value="reset">
			<input type="submit" value="submit">
		</form>
	</body>
</html>