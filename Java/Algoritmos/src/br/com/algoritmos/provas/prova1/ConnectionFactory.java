package br.com.algoritmos.provas.prova1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public static Connection getConnection() {
		  String url = "jdbc:postgresql://localhost:5432/postgres";
		  String usuario = "postgres";
		  String senha = "paulo83";		
		  try {
			return DriverManager.getConnection(url, usuario, senha);
		  } catch (SQLException e) {
			e.printStackTrace();
		  }
		  return null;
	}
	
	public static void fecharConexao(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
