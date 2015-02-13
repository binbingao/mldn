package com.neilpro.dao.test;
import com.neilpro.factory.*;
import java.util.*;
import com.neilpro.vo.*;
public class TestFindAll {
	public static void main(String[] args)throws Exception{
		List<Dept> all=null;
		all=DAOFactory.getIDeptDAOInstance().findAll("Neil");
		Iterator<Dept> iter=all.iterator();
		Dept dept=null;
		while(iter.hasNext()){
			dept=iter.next();
			System.out.println(dept.getDeptno()+" "+dept.getDname()+" "+dept.getLoc());
		}
	}
}
