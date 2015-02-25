package com.member.factory;
import com.member.dao.IDAOMember;
import com.member.dao.proxy.*;
public class DAOFactory {
	public static IDAOMember getIDAOMemberInstance() throws Exception{
		return new IDAOMemberProxy();
	}
}
