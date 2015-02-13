package com.neil.factory;
import com.neil.dbc.*;
import com.neil.dbc.impl.*;
public class DatabaseConnectionFactory {
	public static DatabaseConnection getDatabaseConnection(){
		return new MySQLDatabaseConnection();
	}
}
