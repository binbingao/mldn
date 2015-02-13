<%@ page contentType="text/html" pageEncoding="GBK" %>
<%
	long start=session.getCreationTime();
	long end=session.getLastAccessedTime();
	long time=(end-start)/1000;
%>
<h3>you have been stay <%=time %> seconds!</h3>