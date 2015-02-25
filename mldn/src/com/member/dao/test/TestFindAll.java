package com.member.dao.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.member.factory.DAOFactory;
import com.member.vo.Member;

public class TestFindAll {
	public static void main(String[] args)throws Exception{
		List<Member> all=DAOFactory.getIDAOMemberInstance().findAll("");
		Iterator iter=all.iterator();
		while(iter.hasNext()){
			Member member=(Member)iter.next();
			System.out.println(member);
		}
	}
}
