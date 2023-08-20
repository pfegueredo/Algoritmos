package br.com.algoritmos.provas.prova3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String usuario = "postgres";
		String senha = "paulo83";
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			e.getMessage();
		}
		return null;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.getMessage();
		}
		
	}
}
