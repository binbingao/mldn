package com.neil.factory;
import com.neil.dao.*;
import com.neil.dao.proxy.IEmpDAOProxy;
public class DAOFactory {
	public static IEmpDAO getEmpDAOInstance() throws Exception{
		return new IEmpDAOProxy();
	}
}
