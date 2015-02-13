package com.member.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.member.dao.IDAOMember;
import com.member.vo.Member;
import java.sql.*;
public class DAOMemberImpl implements IDAOMember{
	private Connection conn=null;
	private PreparedStatement pstm=null;
	public DAOMemberImpl(Connection conn){
		this.conn=conn;
	}
	@Override
	public boolean doInsert(Member member) throws Exception {
		boolean flag=false;
		String sql="insert into memebr (mids,pword,name,address,telephone,zipcode,lastdate) values (?,?,?,?,?,?,?)";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, member.getMids());
		this.pstm.setString(2, member.getPword());
		this.pstm.setString(3, member.getName());
		this.pstm.setString(4, member.getAddress());
		this.pstm.setString(5, member.getTelephone());
		this.pstm.setString(6, member.getZipcode());
		this.pstm.setDate(7, new java.sql.Date(member.getLastdate().getTime()));
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Member> findAll(String keyWord) throws Exception {
		List<Member> all=new ArrayList<Member>();
		Member member=null;
		String sql="select mids,pword,name,address,telephone,zipcode,lastdate from members where mids like ?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, "%"+keyWord+"%");
		ResultSet rs=this.pstm.executeQuery();
		while(rs.next()){
			member=new Member();
			member.setMids(rs.getString(1));
			member.setPword(rs.getString(2));
			member.setName(rs.getString(3));
			member.setAddress(rs.getString(4));
			member.setTelephone(rs.getString(5));
			member.setZipcode(rs.getString(6));
			member.setLastdate(rs.getDate(7));
			all.add(member);
		}
		return null;
	}

	@Override
	public Member findById(String mids) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdate(Member member) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doDelete(String mids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDate(String mids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
