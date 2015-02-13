<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="com.neil.factory.*,com.neil.vo.*"%>
<%@ page import="java.text.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<%request.setCharacterEncoding("GBK"); %>
	<body>
		<form action="emp_update_do.jsp" method="post">
			empno:<input type="text" name="empno"><br>
			ename:<input type="text" name="ename"><br>
			job:<input type="text" name="job"><br>
			hiredate:<input type="text" name="hiredate"><br>
			sal:<input type="text" name="sal"><br>
			<input type="reset" value="reset">
			<input type="submit" value="submit">
		</form>
	</body>
</html>