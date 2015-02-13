package com.neilpro.dao.test;
import com.neilpro.factory.*;
import com.neilpro.vo.*;
public class TestFindById {
	public static void main(String[] args)throws Exception{
		Dept dept=null;
		for(int i=1;i<10;i++){
			dept=DAOFactory.getIDeptDAOInstance().findById(i);
			System.out.println(dept.getDeptno()+" "+dept.getDname()+" "+dept.getLoc());
		}
	}
}
