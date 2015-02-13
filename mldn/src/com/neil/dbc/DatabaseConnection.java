package com.neil.dbc;
import java.sql.*;
public interface DatabaseConnection {
	public Connection getConnection();
	public void close();
}
