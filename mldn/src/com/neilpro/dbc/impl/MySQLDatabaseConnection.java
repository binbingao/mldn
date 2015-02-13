package com.neilpro.dbc.impl;

import java.sql.Connection;
import java.sql.*;
import com.neilpro.dbc.DatabaseConnection;

public class MySQLDatabaseConnection implements DatabaseConnection{
	private static final String DBDRIVER="org.gjt.mm.mysql.Driver";
	private static final String BDURL="jdbc:mysql://localhost:3306/mldn";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="mysql";
	private Connection conn=null;
	public MySQLDatabaseConnection() throws Exception{
		try{
			Class.forName(DBDRIVER);
			this.conn=DriverManager.getConnection(BDURL,DBUSER,DBPASSWORD);
		}catch(Exception e){
			throw e;
		}
	}
	public Connection getConnection() {
		return this.conn;
	}

	@Override
	public void close() throws Exception{
		if(this.conn!=null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}

}
