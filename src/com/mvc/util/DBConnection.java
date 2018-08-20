package com.mvc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBConnection {
	public static Connection createConnection()	{
		Properties prop = UtilPropiedades.propiedades();
		Connection con = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver"); //loading mysql driver 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			con = DriverManager.getConnection(prop.getProperty("db.url"), prop.getProperty("db.user"), prop.getProperty("db.password")); //attempting to connect to MySQL database
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con; 
	}
}