package com.neilpro.factory;

import com.neilpro.dao.IDeptDAO;
import com.neilpro.dao.proxy.IDeptDAOProxy;

public class DAOFactory {
	public static IDeptDAO getIDeptDAOInstance()throws Exception{
		return new IDeptDAOProxy();
	}
}
