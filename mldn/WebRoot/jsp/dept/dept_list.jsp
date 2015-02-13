<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="com.neilpro.vo.Dept,com.neilpro.factory.*"%>
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
				List<Dept> all=DAOFactory.getIDeptDAOInstance().findAll(keyWord);
				Iterator<Dept> iter=all.iterator();
				
				
			%>
				<center>
					<form action="dept_list.jsp" method="post">
						Press keyWord to Search:<input type="text" name="kw">
						<input type="submit" value="Search">
					</form>
					<table border="1" width="80%">
						<tr>
							<td>ID</td>
							<td>Name</td>
							<td>Local</td>
						</tr>
						<% 
							while(iter.hasNext()){
								Dept dept=iter.next();
						%>
								<tr>
									<td><%=dept.getDeptno() %></td>
									<td><%=dept.getDname() %></td>
									<td><%=dept.getLoc() %></td>
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