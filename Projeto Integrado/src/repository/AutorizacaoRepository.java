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
		sql = sql.concat(autorizacao.getDataAutorizacao());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodAluno()));
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodResponsavel()));
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(autorizacao.getCodOperador()));
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

	public String consultar(int codAutorizacao) {

		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from autorizacao where codAutorizacao =";
		sql = sql.concat(Integer.toString(codAutorizacao));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		String resultadoConsultaAutorizacao = "codAutorizacao: ";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codAutorizacao"));// irá imprimir os valores da coluna cod
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat(rs.getString("codAutorizacao"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat("\nmotivo: ");
				System.out.println(rs.getString("motivo"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat(rs.getString("motivo"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat("\ncodOperador: ");
				System.out.println(rs.getString("operador_codOperador"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao
						.concat(rs.getString("operador_codOperador"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat("\ndataAutorizacao: ");

				System.out.println(rs.getString("dataAutorizacao"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat(rs.getString("dataAutorizacao"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat("\ncodAluno: ");

				System.out.println(rs.getString("Aluno_codAluno"));

				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat(rs.getString("Aluno_codAluno"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao.concat("\ncodResponsavel: ");
				System.out.println(rs.getString("Aluno_codResponsavel"));
				resultadoConsultaAutorizacao = resultadoConsultaAutorizacao
						.concat(rs.getString("Aluno_codResponsavel"));

			}
		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);
		return resultadoConsultaAutorizacao;
	}
}
