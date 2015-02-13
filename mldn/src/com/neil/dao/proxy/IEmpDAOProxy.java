package com.neil.dao.proxy;
import java.util.Date;
import java.util.List;
import com.neil.dao.*;
import com.neil.dao.impl.*;
import com.neil.dbc.*;
import com.neil.vo.Emp;
public class IEmpDAOProxy implements IEmpDAO{
	private MyDatabaseConnection dbc=null;
	private IEmpDAO dao=null;
	public IEmpDAOProxy()throws Exception{
		this.dbc=new MyDatabaseConnection();
		this.dao=new EmpDAOImpl(this.dbc.getConnection());
	}
	@Override
	public boolean doCreate(Emp emp) throws Exception {
		boolean flag=false;
		try{
			if(this.dao.findById(emp.getEmpno())==null){
				flag=this.dao.doCreate(emp);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public List<Emp> findAll(String keyWord) throws Exception {
		List<Emp> all=null;
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
	public Emp findById(int empno) throws Exception {
		Emp emp=null;
		try{
			emp=this.dao.findById(empno);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return emp;
	}
	@Override
	public boolean doUpdate(Emp emp) throws Exception {
		boolean flag=false;
		try{
			if(this.dao.findById(emp.getEmpno())!=null){
				flag=this.dao.doUpdate(emp);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}
	@Override
	public boolean doDelete(int empno) throws Exception {
		boolean flag=false;
		try{
			if(this.dao.findById(empno)!=null){
				flag=this.dao.doDelete(empno);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

}
