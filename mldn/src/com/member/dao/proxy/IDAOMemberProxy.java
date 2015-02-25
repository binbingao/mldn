package com.member.dao.proxy;
import java.util.Date;
import java.util.List;

import com.member.dao.*;
import com.member.dao.impl.*;
import com.member.dbc.DatabaseConnection;
import com.member.factory.DatabaseFactory;
import com.member.vo.Member;
public class IDAOMemberProxy implements IDAOMember{
	private DatabaseConnection dbc=null;
	private DAOMemberImpl dao=null;
	public IDAOMemberProxy() throws Exception{
		this.dbc=DatabaseFactory.getMySQLDatabaseConnection();
		this.dao=new DAOMemberImpl(this.dbc.getConnection());
	}

	@Override
	public boolean doInsert(Member member) throws Exception {
		boolean flag=false;
		try{
			if(this.dao.findById(member.getMids())==null){
				flag=this.dao.doInsert(member);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public List<Member> findAll(String keyWord) throws Exception {
		List<Member> all=null;
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
	public Member findById(String mids) throws Exception {
		Member member=null;
		try{
			member=this.dao.findById(mids);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return member;
	}

	@Override
	public boolean doUpdate(Member member) throws Exception {
		boolean flag=false;
		try{
			flag=this.dao.doUpdate(member);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean doDelete(String mids) throws Exception {
		boolean flag=false;
		try{
			flag=this.dao.doDelete(mids);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

	@Override
	public boolean updateDate(String mids, Date lastdate) throws Exception {
		boolean flag=false;
		try{
			flag=this.dao.updateDate(mids, lastdate);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}
}
