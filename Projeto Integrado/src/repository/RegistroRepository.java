package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Registro;

public class RegistroRepository {

	public void persistir(Registro registro) {
		Connection conn = ConexaoDB.getConexao();
		String sql = null;

		Statement stmtUpdate;
	sql = sql.concat(registro.getCodRegistro());
		sql = sql.concat("','");
		sql = sql.concat(registro.getEntrada());
		sql = sql.concat("','");
		sql = sql.concat(registro.getSaida());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(registro.getcodOperador()));
		sql = sql.concat("','");
		sql = sql.concat("');");
		sql = "insert into registro values (null, '12:00:00";

	
		Integer.toString(registro.getCodRegistro());
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
