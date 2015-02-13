package com.neilpro.dao.test;
import com.neilpro.factory.*;
public class TestDoDelete {
	public static void main(String[] args)throws Exception{
		DAOFactory.getIDeptDAOInstance().doDelete(2);
	}
}
