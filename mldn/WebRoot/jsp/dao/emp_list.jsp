<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neil.factory.*,com.neil.vo.*"%>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<body>
		<% 
			try{
				String keyWord=request.getParameter("kw");
				if(keyWord==null){
					keyWord="";
				}
				List<Emp> all=DAOFactory.getEmpDAOInstance().findAll(keyWord);
				Iterator<Emp> iter=all.iterator();
			%>
				<center>
					<form action="emp_list.jsp" method="post">
					Please press keyword<input type="text" name="kw">
					<input type="submit" value="select">
					</form>
					<table border="1" width="80%">
						<tr>
							<td>雇员编号</td>
							<td>雇员姓名</td>
							<td>雇员工作</td>
							<td>雇员工资</td>
							<td>雇佣日期</td>
						</tr>
			<% 
				while(iter.hasNext()){
					Emp emp=iter.next();
			%>
						<tr>
							<td><%=emp.getEmpno() %></td>
							<td><%=emp.getEname() %></td>
							<td><%=emp.getJob() %></td>
							<td><%=emp.getSal() %></td>
							<td><%=emp.getHiredate() %></td>
						</tr>
			<%
				}
			%>
					</table>
				</center>
			<%	
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</body>
</html>