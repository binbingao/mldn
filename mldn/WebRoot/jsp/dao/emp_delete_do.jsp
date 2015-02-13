<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neil.factory.*,com.neil.vo.*"%>
<%@ page import="java.text.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			if(DAOFactory.getEmpDAOInstance().doDelete(Integer.parseInt(request.getParameter("empno")))){
		%>
				<h3>Delete success!</h3>
		<%	
			}
			else{
		%>
				<h3>Delete fail!</h3>
		<%
			}
		%>
	</body>
</html>