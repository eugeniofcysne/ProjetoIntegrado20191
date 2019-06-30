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
		String sql;

		Statement stmtUpdate;

		sql = "insert into responsavel values (null, '";

		sql = sql.concat(responsavel.getNome());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getCPF());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getRG());
		sql = sql.concat("','");
		
		sql = sql.concat(responsavel.getTelefoneResponsavel());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getCelularResponsavel());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getEnderecoResponsavel());
		sql = sql.concat("','");
		sql = sql.concat(responsavel.getDataNascimento());
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

	public String alterar(int codResponsavel, String novoNome) {
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
		String resultado = "Alteração realizada com sucesso.";
		return resultado;
	}

	public String consultar(int codResponsavel) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from responsavel where codResponsavel =";
		sql = sql.concat(Integer.toString(codResponsavel));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		String resultadoConsultaResponsavel = "codResponsavel: ";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codResponsavel"));// irá imprimir os valores da coluna cod
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("codResponsavel"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\nnomeResponsavel: ");
								
				System.out.println(rs.getString("nomeResponsavel"));// irá imprimir os valores da coluna nome
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("nomeResponsavel"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\ncpfResponsavel: ");
				
				System.out.println(rs.getString("cpfResponsavel"));// irá imprimir os valores da coluna cpf
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("cpfResponsavel"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\nrgResponsavel: ");
				
				System.out.println(rs.getString("rgResponsavel"));// irá imprimir os valores da coluna rg
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("rgResponsavel"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\ndataNascimento: ");
								
				System.out.println(rs.getString("dataNascimento"));// irá imprimir os valores da coluna datanascimento
				
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("dataNascimento"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\ntelefoneResponsavel: ");
				
				System.out.println(rs.getString("telefoneResponsavel"));// irá imprimir os valores da coluna telefone
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat(rs.getString("telefoneResponsavel"));
				resultadoConsultaResponsavel = resultadoConsultaResponsavel.concat("\nenderecoResponsavel: ");
				
				System.out.println(rs.getString("enderecoResponsavel"));// irá imprimir os valores da coluna endereco
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);
		return resultadoConsultaResponsavel;
	}

}
