package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;

public class AlunoRepository {

	public void persistir(Aluno aluno) {
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		sql = "insert into aluno values (null, '";

		sql = sql.concat(aluno.getNome());
		sql = sql.concat("','");
		sql = sql.concat(aluno.getRG());
		sql = sql.concat("','");
		//sql = sql.concat(aluno.getcodResponsavel());
		//sql = sql.concat("','");
		sql = sql.concat(Integer.toString(aluno.getSerieAluno()));
		sql = sql.concat("');");
		sql = sql.concat(aluno.getDataNascimento());
		sql = sql.concat("','");

		System.out.println(sql);

		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);
		
	}

	public void remover(int codAluno) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "delete from aluno where codAluno =";
		sql = sql.concat(Integer.toString(codAluno));
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
		


	public void alterar(int codAluno, String novoNome) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "update aluno set nomeAluno ='";
		sql = sql.concat(novoNome);
		sql = sql.concat("' where codAluno =");
		sql = sql.concat(Integer.toString(codAluno));
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
		
	

	public void consultar(int codAluno) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from aluno where codAluno =";
		sql = sql.concat(Integer.toString(codAluno));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codAluno"));// irá imprimir os valores da coluna cod
				System.out.println(rs.getString("nomeAluno"));// irá imprimir os valores da coluna nome
				System.out.println(rs.getString("RG"));// irá imprimir os valores da coluna cpf
				System.out.println(rs.getString("codResponsavel"));// irá imprimir os valores da coluna rg
				System.out.println(rs.getString("serie"));// irá imprimir os valores da coluna datanascimento
				System.out.println(rs.getString("dataNascimento"));// irá imprimir os valores da coluna telefone
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);

	}
	}

	
