package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResponsavelRepository {
	public static void persistir() {
		Connection conn = ConexaoDB.getConexao();
		String sql = "SELECT * FROM responsavel;"; // esta query inicial é só para ver se está funcionando a conexão.
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("nome"));// irá imprimir os valores da coluna nome
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		Statement stmtUpdate;
		sql = "insert into responsavel values (null, 0, 1, 2, 3, 4, 5);";
		System.out.println(sql);

		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);
	}

}
