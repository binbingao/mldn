<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			request.setCharacterEncoding("GBK");
			String name=request.getParameter("filename");
			String content=request.getParameter("filecontent");
			String fileName=this.getServletContext().getRealPath("/")+"note"+File.separator+name;
			File file=new File(fileName);
			System.out.println(fileName);
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdir();
			}
			PrintStream ps=null;
			ps=new PrintStream(new FileOutputStream(file));
			ps.println(content);
			ps.close();
		%>
		<% 
			Scanner scan=new Scanner(new FileInputStream(file));
			scan.useDelimiter("\n");
			StringBuffer buf=new StringBuffer();
			while(scan.hasNext()){
				buf.append(scan.next()).append("<br>");
			}
			scan.close();
		%>
		<%=buf %>
	</body>
</html>