package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;

public class LoginDao {
	public String authenticateUser(LoginBean loginBean)
	{
		String userName = loginBean.getUserName(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword();
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String userNameDB = "";
		String passwordDB = "";
		try	{
			con = DBConnection.createConnection(); //establishing connection
			if( null== con){//Quiere decir que la base esta abajo
				return "Actualmente hay problemas con la base de datos";
			}
			con.setAutoCommit(false);
			statement = con.prepareStatement("select user,pass from usuarioslogin where user = ? and pass = ?");
			statement.setString(1, userName);
			statement.setString(2, password);
			resultSet = statement.executeQuery(); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
			while(resultSet.next()) // Until next row is present otherwise it return false
			{
				userNameDB = resultSet.getString("user"); //fetch the values present in database
				passwordDB = resultSet.getString("pass");
				if(userName.equals(userNameDB) && password.equals(passwordDB))	{
					return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
				}
			}}catch(SQLException e)	{
				e.printStackTrace();
			}
			return "Invalid user credentials"; // Just returning appropriate message otherwise
		}
	}