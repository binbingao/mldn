<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
  <head>
    <title>My JSP 'page_scope_01.jsp' starting page</title>
  </head>
  
  <body>
		<% 
			pageContext.setAttribute("name", "���˻�");
			pageContext.setAttribute("birthday", new Date());	
		%>
		<%
			String username=(String)pageContext.getAttribute("name");
			Date userbirthday=(Date)pageContext.getAttribute("birthday");
		%>
		<h2>������<%=username %></h2>
		<h2>���գ�<%=userbirthday %></h2>
  </body>
</html>
