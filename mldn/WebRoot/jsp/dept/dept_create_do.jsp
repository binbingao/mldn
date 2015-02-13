<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neilpro.vo.Dept,com.neilpro.factory.*" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<body>
		<% 
			Dept dept=new Dept();
			dept.setDeptno(Integer.parseInt(request.getParameter("deptno")));
			dept.setDname(request.getParameter("dname"));
			dept.setLoc(request.getParameter("loc"));
			try{
			if(DAOFactory.getIDeptDAOInstance().doCreate(dept)){
		%>
				<h3>add success!</h3>
		<%
			}
			else{
		%>
				<h3>add Fail!</h3>
		<%
			}
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</body>
</html>