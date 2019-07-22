package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Aluno;

public class AlunoRepository {

	public void persistir(Aluno aluno) {// texto da query
		Connection conn = ConexaoDB.getConexao();
		String sql = "insert into aluno values (null, '";
		sql = sql.concat(aluno.getNome());
		sql = sql.concat("','");
		sql = sql.concat(aluno.getRG());// metodo para converter inteiro e string
		sql = sql.concat("','");
		sql = sql.concat(aluno.getSerieAluno());
		sql = sql.concat("','");
		sql = sql.concat(aluno.getDataNascimento());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(aluno.getCodResponsavel()));// metodo para converter inteiro e string
		sql = sql.concat("');");
		System.out.println(sql);
		Statement stmtUpdate;
		

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

	public String alterar(int codAluno, String novoNome) {
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
		
		String resultado = "Alteração realizada com sucesso.";
		return resultado;

	}

	public String consultar(int codAluno) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from aluno where codAluno =";
		sql = sql.concat(Integer.toString(codAluno));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		String resultadoConsultaAluno = "codAluno: ";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codAluno"));// irá imprimir os valores da coluna cod
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("codAluno"));
				resultadoConsultaAluno = resultadoConsultaAluno.concat("\nnomeAluno: ");
				System.out.println(rs.getString("nomeAluno"));// irá imprimir os valores da coluna nome
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("nomeAluno"));
				resultadoConsultaAluno = resultadoConsultaAluno.concat("\nRG: ");
				System.out.println(rs.getString("RG"));// irá imprimir os valores da coluna rg
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("RG"));
				resultadoConsultaAluno = resultadoConsultaAluno.concat("\nserie: ");
				System.out.println(rs.getString("serie"));// irá imprimir os valores da coluna serie
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("serie"));
				resultadoConsultaAluno = resultadoConsultaAluno.concat("\ndataNascimento: ");

				System.out.println(rs.getString("dataNascimento"));// irá imprimir os valores da coluna datanascimento
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("dataNascimento"));
				resultadoConsultaAluno = resultadoConsultaAluno.concat("\ncodResponsavel: ");

				System.out.println(rs.getString("Responsavel_codResponsavel"));// irá imprimir os valores da coluna
																				// codResponsavel
				resultadoConsultaAluno = resultadoConsultaAluno.concat(rs.getString("Responsavel_codResponsavel"));

			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);
		return resultadoConsultaAluno;
	}
}
