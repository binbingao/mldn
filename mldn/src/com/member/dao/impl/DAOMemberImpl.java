package com.member.dao.impl;

import java.util.ArrayList;
import java.util.Date;
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
		String sql="insert into member (mids,pword,name,address,telephone,zipcode,lastdate) values (?,?,?,?,?,?,?)";
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
		this.pstm.close();
		return flag;
	}

	@Override
	public List<Member> findAll(String keyWord) throws Exception {
		List<Member> all=new ArrayList<Member>();
		Member member=null;
		String sql="select mids,pword,name,address,telephone,zipcode,lastdate from member where mids like ?";
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
		this.pstm.close();
		return all;
	}

	@Override
	public Member findById(String mids) throws Exception {
		Member member=null;
		String sql="select mids,pword,name,address,telephone,zipcode,lastdate from member where mids=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, mids);
		ResultSet rs=this.pstm.executeQuery();
		if(rs.next()){
			member=new Member();
			member.setMids(rs.getString(1));
			member.setPword(rs.getString(2));
			member.setName(rs.getString(3));
			member.setAddress(rs.getString(4));
			member.setTelephone(rs.getString(5));
			member.setZipcode(rs.getString(6));
			member.setLastdate(rs.getDate(7));
		}
		this.pstm.close();
		return member;
	}
	/*
	 * private String mids;
	private String pword;
	private String name;
	private String address;
	private String telephone;
	private String zipcode;
	private Date lastdate;
	 */

	@Override
	public boolean doUpdate(Member member) throws Exception {
		boolean flag=false;
		String sql="update member set pword=?,name=?,address=?,telephone=?,zipcode=? where mids=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, member.getPword());
		this.pstm.setString(2, member.getName());
		this.pstm.setString(3, member.getAddress());
		this.pstm.setString(4, member.getTelephone());
		this.pstm.setString(5, member.getZipcode());
		this.pstm.setString(6, member.getMids());
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

	@Override
	public boolean doDelete(String mids) throws Exception {
		boolean flag=false;
		String sql="delete from member where mids=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setString(1, mids);
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}

	@Override
	public boolean updateDate(String mids,Date lastdate) throws Exception {
		boolean flag=false;
		String sql="update member set lastdate=? where mids=?";
		this.pstm=this.conn.prepareStatement(sql);
		this.pstm.setDate(1, (java.sql.Date) lastdate);
		this.pstm.setString(2, mids);
		if(this.pstm.executeUpdate()>0){
			flag=true;
		}
		this.pstm.close();
		return flag;
	}
}
