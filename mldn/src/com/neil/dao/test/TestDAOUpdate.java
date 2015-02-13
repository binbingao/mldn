package com.neil.dao.test;
import java.util.*;
import com.neil.factory.*;
import com.neil.vo.*;
public class TestDAOUpdate {
	public static void main(String[] args)throws Exception{
		Emp emp=null;
		List<Emp> all=DAOFactory.getEmpDAOInstance().findAll("");
		Iterator<Emp> iter=all.iterator();
		int i=1;
		while(iter.hasNext()){
			emp=iter.next();
			emp.setSal(1000f*i);
			i++;
			DAOFactory.getEmpDAOInstance().doUpdate(emp);
		}
	}
}
