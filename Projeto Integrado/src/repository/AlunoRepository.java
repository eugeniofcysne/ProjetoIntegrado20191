package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;

public class AlunoRepository {
	public void persistir (Aluno aluno) {//texto da query
		Connection conn = ConexaoDB.getConexao();
		String sql = "insert into aluno values (null, '";
		sql = sql.concat(aluno.getNome());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(aluno.getCodResponsavel()));//metodo para converter inteiro e string
		sql = sql.concat("','");
		sql = sql.concat(aluno.getSerieAluno());
		sql = sql.concat("','");
		sql = sql.concat(aluno.getDataNascimento());
		sql = sql.concat("','");
		sql = sql.concat(aluno.getDataNascimento());
		sql = sql.concat("');");
		System.out.println(sql);
		Statement stmtUpdate;
		ResultSet rs;
		
		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ConexaoDB.fechaConexao(conn);
	}
	
	}

