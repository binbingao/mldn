<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
  <head>
    <title>My JSP 'page_scope_01.jsp' starting page</title>
  </head>
  
  <body>
		<% 
			pageContext.setAttribute("name", "李兴华");
			pageContext.setAttribute("birthday", new Date());	
		%>
		<%
			String username=(String)pageContext.getAttribute("name");
			Date userbirthday=(Date)pageContext.getAttribute("birthday");
		%>
		<h2>姓名：<%=username %></h2>
		<h2>生日：<%=userbirthday %></h2>
  </body>
</html>
