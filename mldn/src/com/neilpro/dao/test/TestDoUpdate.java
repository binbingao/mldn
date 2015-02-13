package com.neilpro.dao.test;
import com.neilpro.vo.*;
import com.neilpro.factory.*;
public class TestDoUpdate {
	public static void main(String[] args)throws Exception{
		Dept dept=new Dept();
		dept.setDeptno(3);
		dept.setDname("Bin");
		dept.setLoc("Neil");
		DAOFactory.getIDeptDAOInstance().doUpdate(dept);
	}
}
