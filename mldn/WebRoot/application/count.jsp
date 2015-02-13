<%@ page contentType="text/html" pageEncoding="GBK" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*"%>
<%@ page import="java.math.*" %>
<html>
	<head><title>www.mldnjava.cn</title></head>
	<body>
		<% 
			BigInteger count=null;
		%>
		<%!
			public BigInteger load(File file){
				BigInteger count=null;
				try{
					if(file.exists()){
						Scanner scan=null;
						scan=new Scanner(new FileInputStream(file));
						if(scan.hasNext()){
							count=new BigInteger(scan.next());
						}
						scan.close();
					}else{
						count=new BigInteger("0");
						save(file,count);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				return count;
			}
			public void save(File file,BigInteger count){
				try{
					PrintStream ps=null;
					ps=new PrintStream(new FileOutputStream(file));
					ps.println(count);
					ps.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
		<% 
			String fileName=this.getServletContext().getRealPath("/")+"count.txt";
			File file=new File(fileName);
			if(session.isNew()){
				synchronized(this){
					count=load(file);
					count=count.add(new BigInteger("1"));
					save(file,count);
					session.setAttribute("count", count);
				}
			}else{
				count=(BigInteger)session.getAttribute("count");
			}
		%>
		<h2>you are the <%=count==null?0:count %>th visitor</h2>
	</body>
</html>