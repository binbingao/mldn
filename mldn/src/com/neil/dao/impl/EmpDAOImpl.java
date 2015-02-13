package com.neil.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.neil.dao.*;
import com.neil.vo.*;
public class EmpDAOImpl implements IEmpDAO{
	private Connection conn=null;
	private PreparedStatement pstm=null;
	public EmpDAOImpl(Connection conn){
		this.conn=conn;
	}
	@Override
	public boolean doCreate(Emp emp) throws Exception {
		boolean flag=false;
		String sql="INSERT INTO emp(empno,ename,job,hiredate,sal)VALUES(?,?,?,?,?)";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, emp.getEmpno());
		this.pstm.setString(2, emp.getEname());
		this.pstm.setString(3, emp.getJob());
		this.pstm.setDate(4, new java.sql.Date(emp.getHiredate().getTime()));
		this.pstm.setFloat(5, emp.getSal());
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

	@Override
	public List<Emp> findAll(String keyWord) throws Exception {
		List<Emp> all=new ArrayList<Emp>();
		String sql="SELECT empno,ename,job,hiredate,sal FROM emp WHERE ename LIKE ? OR job LIKE ?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, "%"+keyWord+"%");
		this.pstm.setString(2, "%"+keyWord+"%");
		ResultSet rs=this.pstm.executeQuery();
		Emp emp=null;
		while(rs.next()){
			emp=new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
			all.add(emp);
		}
		this.pstm.close();
		return all;
	}

	@Override
	public Emp findById(int empno) throws Exception {
		Emp emp=null;
		String sql="SELECT empno,ename,job,hiredate,sal FROM emp WHERE empno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, empno);
		ResultSet rs=this.pstm.executeQuery();
		while(rs.next()){
			emp=new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
		}
		this.pstm.close();
		return emp;
	}
	@Override
	public boolean doUpdate(Emp emp) throws Exception {
		boolean flag=false;
		String sql="update emp set ename=?,job=?,hiredate=?,sal=? where empno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, emp.getEname());
		this.pstm.setString(2, emp.getJob());
		this.pstm.setDate(3, new java.sql.Date(emp.getHiredate().getTime()));
		this.pstm.setFloat(4, emp.getSal());
		this.pstm.setInt(5, emp.getEmpno());
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}
	@Override
	public boolean doDelete(int empno) throws Exception {
		boolean flag=false;
		String sql="delete from emp where empno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, empno);
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}
	
}
