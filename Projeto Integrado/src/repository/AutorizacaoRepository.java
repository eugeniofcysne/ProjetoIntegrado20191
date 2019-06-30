package repository;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Autorizacao;


public class AutorizacaoRepository {
	
public void persistir(Autorizacao autorizacao) {
		
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		sql = "insert into autorizacao values (null";
		
		
		sql = sql.concat(",'");
		sql = sql.concat(autorizacao.getMotivo());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodOperador()));
		sql = sql.concat("','");
		sql = sql.concat(autorizacao.getDataAutorizacao());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodAluno()));
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodResponsavel()));
		sql = sql.concat("');");

		System.out.println(sql);

		
		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

public void consultar(int codAutorizacao) {

	Connection conn = ConexaoDB.getConexao();
	String sql = "select * from autorizacao where codAutorizacao =";
	sql = sql.concat(Integer.toString(codAutorizacao));
	sql = sql.concat(";");
	Statement stmt;
	ResultSet rs;
	
	try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("codAutorizacao"));
			System.out.println(rs.getString("motivo"));
			System.out.println(rs.getString("codOperador"));
			System.out.println(rs.getString("dataAutorizacao"));
			System.out.println(rs.getString("Aluno_codAluno"));													
			System.out.println(rs.getString("Aluno_codResponsavel"));														
		}
	}

	catch (SQLException e1) {
		e1.printStackTrace();
	} finally { // liberar recursos
	}
	ConexaoDB.fechaConexao(conn);

}
}


