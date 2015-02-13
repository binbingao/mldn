package com.neilpro.dao.test;

import com.neilpro.vo.Dept;
import com.neilpro.factory.*;
public class TestDoCreate {
	public static void main(String[] args)throws Exception{
		Dept dept=null;
		for(int i=1;i<11;i++){
			dept=new Dept();
			dept.setDeptno(i);
			dept.setDname("Test"+i);
			dept.setLoc("TestLoc"+i);
			DAOFactory.getIDeptDAOInstance().doCreate(dept);
		}
	}
}
