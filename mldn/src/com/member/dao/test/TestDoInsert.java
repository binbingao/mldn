package com.member.dao.test;
import java.util.Date;

import com.member.factory.*;
import com.member.vo.*;
public class TestDoInsert {
	public static void main(String[] args)throws Exception{
		Member member=new Member();
		member.setMids("1002");
		member.setPword("1001");
		member.setName("Zhenbin");
		member.setAddress("BeiJing");
		member.setTelephone("110");
		member.setZipcode("ABC");
		member.setLastdate(new Date(System.currentTimeMillis()));
		DAOFactory.getIDAOMemberInstance().doInsert(member);
	}
}
