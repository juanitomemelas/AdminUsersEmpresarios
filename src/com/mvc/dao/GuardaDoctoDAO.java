package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.DoctoBean;
import com.mvc.util.DBConnection;

public class GuardaDoctoDAO {
	public static boolean guardaDocto(DoctoBean documentoInicial) {

		Connection con = DBConnection.createConnection(); 
		String insertSQL = "INSERT INTO tbl_doctos ("
				+ "docto_id, docto_titulo, docto_fechainstalacion, docto_user_creador,docto_duracion) "
				+ "VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
			preparedStatement.setString(1, documentoInicial.getElID());
			preparedStatement.setString(2, documentoInicial.getTitulo());
			preparedStatement.setString(3, documentoInicial.getFechaInstalacion());
			preparedStatement.setString(4, documentoInicial.getCreador());
			preparedStatement.setInt(5, documentoInicial.getDuracion());
			preparedStatement.executeUpdate();		
//			Statement statement = con.createStatement(); //Statement is used to write queries. Read more about it.
//			ResultSet resultSet = statement.executeQuery("select user,pass from usuarioslogin");
		} catch (SQLException e) {
			System.out.println("Hubo un problema al realizar el guardado en la base de datos");
			e.printStackTrace();
			return false;
		} 
		
		return true;
	}

}
