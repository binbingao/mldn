<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			request.setCharacterEncoding("GBK");
		%>
		<center>
			<table border="1">
				<tr>
					<td>argument name</td>
					<td>argument content</td>
				</tr>
				<% 
					Enumeration enu=request.getParameterNames();
					while(enu.hasMoreElements()){
						String paramName=(String)enu.nextElement();
				%>
						<tr>
							<td><%=paramName%></td>
							<td>
				<%
						if(paramName.startsWith("**")){
							String paramValue[]=request.getParameterValues(paramName);
							for(int x=0;x<paramValue.length;x++){
				%>
								<%=paramValue[x]%>
				<%
							}
						}else{
							String paramValue=request.getParameter(paramName);
				%>
							<%=paramValue %>
				<%
						}
				%>
						</td>
						</tr>
				<%
					}
				%>
			</table>
		</center>
	</body>
</html>