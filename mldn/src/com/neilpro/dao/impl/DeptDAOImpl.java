package com.neilpro.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neilpro.dao.IDeptDAO;
import com.neilpro.vo.Dept;

public class DeptDAOImpl implements IDeptDAO{
	private Connection conn=null;
	private PreparedStatement pstm=null;
	public DeptDAOImpl(Connection conn){
		this.conn=conn;
	}
	@Override
	public boolean doCreate(Dept dept) throws Exception {
		boolean flag=false;
		String sql="insert into dept (deptno,dname,loc) values (?,?,?)";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, dept.getDeptno());
		this.pstm.setString(2, dept.getDname());
		this.pstm.setString(3, dept.getLoc());
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

	@Override
	public List<Dept> findAll(String keyWord) throws Exception {
		List<Dept> all=new ArrayList<Dept>();
		String sql="select deptno,dname,loc from dept where dname like ?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, "%"+keyWord+"%");
		ResultSet result=this.pstm.executeQuery();
		Dept dept=null;
		while(result.next()){
			dept=new Dept();
			dept.setDeptno(result.getInt(1));
			dept.setDname(result.getString(2));
			dept.setLoc(result.getString(3));
			all.add(dept);
		}
		this.pstm.close();
		return all;
	}

	@Override
	public Dept findById(int deptno) throws Exception {
		Dept dept=null;
		String sql="select deptno,dname,loc from dept where deptno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, deptno);
		ResultSet rs=this.pstm.executeQuery();
		while(rs.next()){
			dept=new Dept();
			dept.setDeptno(rs.getInt(1));
			dept.setDname(rs.getString(2));
			dept.setLoc(rs.getString(3));
		}
		this.pstm.close();
		return dept;
	}

	@Override
	public boolean doUpdate(Dept dept) throws Exception {
		boolean flag=false;
		String sql="update dept set dname=?,loc=? where deptno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, dept.getDname());
		this.pstm.setString(2, dept.getLoc());
		this.pstm.setInt(3, dept.getDeptno());
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

	@Override
	public boolean doDelete(int deptno) throws Exception {
		boolean flag=false;
		String sql="delete from dept where deptno=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setInt(1, deptno);
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

}
