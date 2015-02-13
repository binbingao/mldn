package com.neil.dao.test;
import java.util.*;
import com.neil.factory.*;
import com.neil.vo.*;
public class TestDAOSelect {
	public static void main(String[] args)throws Exception{
		List<Emp> all=DAOFactory.getEmpDAOInstance().findAll("");
		Iterator<Emp> iter=all.iterator();
		while(iter.hasNext()){
			Emp emp=iter.next();
			System.out.println("name : "+emp.getEname()+ "no : "+emp.getEmpno());
		}
	}
}
