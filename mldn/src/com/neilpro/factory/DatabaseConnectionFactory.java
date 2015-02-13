package com.neilpro.factory;
import com.neilpro.dbc.*;
import com.neilpro.dbc.impl.*;
public class DatabaseConnectionFactory {
	public static DatabaseConnection getMySQLDatabaseConnection() throws Exception{
		return new MySQLDatabaseConnection();
	}
}
