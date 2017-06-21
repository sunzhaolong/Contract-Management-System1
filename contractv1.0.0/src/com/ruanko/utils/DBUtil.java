package com.ruanko.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Database tool class
 */
public class DBUtil {

	private static String url = "jdbc:mysql://127.0.0.1:3306/contractdb?useUnicode=true&amp;" +
			"characterEncoding=utf8"; 
	private static String user = "root"; 
	private static String password = "15301047";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("connect success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	public static void closeConnection(Connection conn) {
		try {
			if ((conn != null) && (!conn.isClosed())) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void closeStatement(Statement st) {
		try {
			if ((st != null) && (!st.isClosed())) {
				st.close();
				st = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void closeResultSet(ResultSet rs) {
		try {
			if ((rs != null) && (!rs.isClosed())) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		getConnection();
	}
}
