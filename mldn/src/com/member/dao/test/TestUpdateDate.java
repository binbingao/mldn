package com.member.dao.test;

import java.util.Calendar;
import java.sql.Date;

import com.member.factory.DAOFactory;

public class TestUpdateDate {
	public static void main(String[] args)throws Exception{
		/*Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);
		System.out.println(calendar.get);*/
		DAOFactory.getIDAOMemberInstance().updateDate("1001", new Date(new java.util.Date().getTime()+24*60*60*1000));
	}
}
