<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<form action="login.jsp" method="post">
			UserName:<input type="text" name="uname"><br>
			PassWord:<input type="password" name="upass"><br>
			<input type="reset" name="reset">
			<input type="submit" name="submit">
		</form>
		<% 
			String name=request.getParameter("uname");
			String password=request.getParameter("upass");
			if(!(name==null||"".equals(name)||password==null||"".equals(password))){
				if("lixinghua".equals(name)&&"mldn".equals(password)){
					response.setHeader("refresh","2;URL=welcome.jsp");
					session.setAttribute("userid", name);
		%>
					<h3>login success, after 2 seconds to welcome page!</h3>
					<h3>if not going please click <a href="welcome.jsp">Here</a></h3>
		<%
				}
				else{
		%>
					<h3>Login fail!</h3>
		<%
				}
			
			}
		%>
	</body>
</html>