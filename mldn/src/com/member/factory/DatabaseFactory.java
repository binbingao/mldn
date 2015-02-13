package com.member.factory;

import java.sql.Connection;

import com.member.dbc.impl.MySQLDatabaseConnection;

public class DatabaseFactory {
	public static Connection getMySQLDatabaseConnection() throws Exception{
		return new MySQLDatabaseConnection().getConnection();
	}
}
