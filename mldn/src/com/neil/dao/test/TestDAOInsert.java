package com.neil.dao.test;
import com.neil.factory.DAOFactory;
import com.neil.vo.Emp;
public class TestDAOInsert {
	public static void main(String[] args)throws Exception{
		Emp emp=null;
		for(int x=0;x<5;x++){
			emp=new Emp();
			emp.setEmpno(1000+x);
			emp.setEname("XingHua-"+x);
			emp.setJob("pro-"+x);
			emp.setHiredate(new java.util.Date());
			emp.setSal(500*x);
			DAOFactory.getEmpDAOInstance().doCreate(emp);
		}
	}
}
