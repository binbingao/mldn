package com.member.dao.test;

import com.member.factory.DAOFactory;

public class TestDoDelete {
	public static void main(String[] args)throws Exception{
		DAOFactory.getIDAOMemberInstance().doDelete("1002");
	}
}
