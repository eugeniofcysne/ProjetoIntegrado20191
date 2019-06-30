package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Operador;

public class OperadorRepository {
	
//método REMOVER
	public void remover(int codOperador) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "delete from operador where codOperador =";
		sql = sql.concat(Integer.toString(codOperador));
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
//método PERSISTIR
	public void persistir(Operador operador) {
		Connection conn = ConexaoDB.getConexao();
		

		Statement stmtUpdate;
		String sql = "insert into operador values (null, '";
		sql = sql.concat(operador.getNome());
		sql = sql.concat("','");
		sql = sql.concat(operador.getCPF());
		sql = sql.concat("','");
		sql = sql.concat(operador.getTurnoOperador());
		sql = sql.concat("','");
		sql = sql.concat(operador.getSetorOperador());
		sql = sql.concat("');");

		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);
	}
	
//método ALTERAR
	public void alterar(int codOperador, String novoNome) {
		
		Connection conn = ConexaoDB.getConexao();
		
		String sql = "update operador set nomeOperador ='";
		sql = sql.concat(novoNome);
		sql = sql.concat("' where codOperador =");
		sql = sql.concat(Integer.toString(codOperador));
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
//método CONSULTAR
	public String consultar(int codOperador) {
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from operador where codOperador =";
		int codResponsavel = 0;//criar variavel local
		sql = sql.concat(Integer.toString(codResponsavel));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codOperador"));// irá imprimir os valores da coluna cod
				System.out.println(rs.getString("nomeOperador"));// irá imprimir os valores da coluna nome
		
				System.out.println(rs.getString("turnoOperador"));// irá imprimir os valores da coluna endereco
				System.out.println(rs.getString("setorOperador"));// irá imprimir os valores da coluna endereco
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);

		String resultado = "Alteração realizada com sucesso.";
		return resultado;
	}

}