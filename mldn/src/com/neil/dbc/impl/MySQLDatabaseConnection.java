package com.neil.dbc.impl;
import java.sql.*;

import com.neil.dbc.DatabaseConnection;
public class MySQLDatabaseConnection implements DatabaseConnection{
	private static final String DBDRIVER="org.git.mm.mysql.Driver";
	private static final String DBURL="jdbc:mysql://localhost:3306/mldn";
	private static final String DBUSER="root";
	private static final String DBPASSWORD="mysql";
	private Connection conn=null;
	public MySQLDatabaseConnection() {
		try{
			Class.forName(DBDRIVER);
			this.conn=DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		if(this.conn!=null){
			try{
				this.conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
