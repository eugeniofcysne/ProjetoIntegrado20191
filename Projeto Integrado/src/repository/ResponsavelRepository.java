package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Responsavel;

public class ResponsavelRepository {

	public void remover(int codResponsavel) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "delete from responsavel where codResponsavel =";
		sql = sql.concat(Integer.toString(codResponsavel));
		sql = sql.concat(";");
		Statement stmtUpdate;
		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);
	}

	public void persistir(Responsavel responsavel) {
		Connection conn = ConexaoDB.getConexao();
		String sql = null;

		Statement stmtUpdate;
	sql = sql.concat(responsavel.getNome());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getCPF());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getRG());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getDataNascimento());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getTelefoneResponsavel());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getEnderecoResponsavel());
		sql = sql.concat("');");
		sql = "insert into responsavel values (null, '";

	

		System.out.println(sql);

		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);
	}

	public void alterar(int codResponsavel, String novoNome) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "update responsavel set nomeResponsavel ='";
		sql = sql.concat(novoNome);
		sql = sql.concat("' where codResponsavel =");
		sql = sql.concat(Integer.toString(codResponsavel));
		sql = sql.concat(";");
		Statement stmtUpdate;
		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	public void consultar(int codResponsavel) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from responsavel where codResponsavel =";
		sql = sql.concat(Integer.toString(codResponsavel));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codResponsavel"));// irá imprimir os valores da coluna cod
				System.out.println(rs.getString("nomeResponsavel"));// irá imprimir os valores da coluna nome
				System.out.println(rs.getString("cpfResponsavel"));// irá imprimir os valores da coluna cpf
				System.out.println(rs.getString("rgResponsavel"));// irá imprimir os valores da coluna rg
				System.out.println(rs.getString("dataNascimento"));// irá imprimir os valores da coluna datanascimento
				System.out.println(rs.getString("telefoneResponsavel"));// irá imprimir os valores da coluna telefone
				System.out.println(rs.getString("enderecoResponsavel"));// irá imprimir os valores da coluna endereco
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);

	}

}
