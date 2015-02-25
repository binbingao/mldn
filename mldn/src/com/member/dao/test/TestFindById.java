package com.member.dao.test;

import com.member.factory.DAOFactory;
import com.member.vo.Member;

public class TestFindById {
	public static void main(String[] args)throws Exception{
		Member member=DAOFactory.getIDAOMemberInstance().findById("1001");
		System.out.println(member);
	}
}
