package com.member.factory;
import com.member.dbc.DatabaseConnection;
import com.member.dbc.impl.MySQLDatabaseConnection;

public class DatabaseFactory {
	public static DatabaseConnection getMySQLDatabaseConnection() throws Exception{
		return new MySQLDatabaseConnection();
	}
}
