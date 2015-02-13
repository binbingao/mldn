<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neil.factory.*,com.neil.vo.*"%>
<%@ page import="java.text.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<body>
		<% 
			Emp emp=new Emp();
			emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
			emp.setEname(request.getParameter("ename"));
			emp.setJob(request.getParameter("job"));
			emp.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
			emp.setSal(Float.parseFloat(request.getParameter("sal")));
			System.out.println(emp);
			try{
				if(DAOFactory.getEmpDAOInstance().doCreate(emp)){
			%>
			
					<h3>add success!</h3>
			<%	
				}else{
			%>
					<h3>add fail!</h3>
			<%
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</body>
</html>