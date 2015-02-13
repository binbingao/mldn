<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<form action="emp_insert_do.jsp" method="post">
			雇员编号：<input type="text" name="empno"><br>
			雇员姓名：<input type="text" name="ename"><br>
			雇员职位：<input type="text" name="job"><br>
			入职时间：<input type="text" name="hiredate"><br>
			雇员薪水：<input type="text" name="sal"><br>
			<input type="reset" value="reset">
			<input type="submit" value="submit">
		</form>
	</body>
</html>