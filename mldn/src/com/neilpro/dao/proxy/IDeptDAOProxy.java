package com.neilpro.dao.proxy;

import java.util.List;

import com.neilpro.dao.IDeptDAO;
import com.neilpro.dao.impl.DeptDAOImpl;
import com.neilpro.dbc.*;
import com.neilpro.factory.DatabaseConnectionFactory;
import com.neilpro.vo.Dept;
public class IDeptDAOProxy implements IDeptDAO{
	private DatabaseConnection dbc=null;
	private DeptDAOImpl dao=null;
	public IDeptDAOProxy()throws Exception{
		this.dbc=DatabaseConnectionFactory.getMySQLDatabaseConnection();
		this.dao=new DeptDAOImpl(this.dbc.getConnection());
	}
	@Override
	public boolean doCreate(Dept dept) throws Exception {
		boolean flag=false;
		try{
			if(this.dao.findById(dept.getDeptno())==null){
				flag=this.dao.doCreate(dept);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public List<Dept> findAll(String keyWord) throws Exception {
		List<Dept> all=null;
		try{
			all=this.dao.findAll(keyWord);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return all;
	}

	@Override
	public Dept findById(int deptno) throws Exception {
		Dept dept=null;
		try{
			dept=this.dao.findById(deptno);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return dept;
	}

	@Override
	public boolean doUpdate(Dept dept) throws Exception {
		boolean flag=false;
		try{
			flag=this.dao.doUpdate(dept);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doDelete(int deptno) throws Exception {
		boolean flag=false;
		try{
			flag=this.dao.doDelete(deptno);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}
}
