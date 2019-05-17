package repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoDB {
	public static  Connection getConexao() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrado?user=root&password=cebola123");
		} catch (SQLException e) {
			// tratar erros
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void fechaConexao(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
