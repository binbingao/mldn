<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			request.setCharacterEncoding("GBK");
			String id=request.getParameter("id");
			String uname=request.getParameter("uname");
			String inst[]=request.getParameterValues("inst");
		%>
		<h3>id:<%=id %></h3>
		<h3>name:<%=uname %></h3>
		<% 
			if(inst!=null){
			
		%>
			<h3>hobby:
		<% 
			for(int i=0;i<inst.length;i++){
		%>
				<%=inst[i]%>
		<%
			}
		%>
		</h3>
		<%
		}
		%>
	</body>
</html>