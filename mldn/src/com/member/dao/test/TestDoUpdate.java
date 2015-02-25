package com.member.dao.test;

import java.util.Date;

import com.member.factory.DAOFactory;
import com.member.vo.Member;

public class TestDoUpdate {
	public static void main(String[] args)throws Exception{
		Member member=new Member();
		member.setMids("1001");
		member.setPword("10011");
		member.setName("Zhenbin1");
		member.setAddress("BeiJing1");
		member.setTelephone("1101");
		member.setZipcode("ABC1");
		member.setLastdate(new Date(System.currentTimeMillis()));
		DAOFactory.getIDAOMemberInstance().doUpdate(member);
	}
}
