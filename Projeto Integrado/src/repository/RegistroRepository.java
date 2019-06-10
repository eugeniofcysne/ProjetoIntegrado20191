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
		  sql = "insert into registro values (null, '";		  
		  sql = sql.concat(registro.getEntradaSaida()); 
		  sql = sql.concat("','"); 
		  sql = sql.concat(registro.getData()); 
		  sql = sql.concat("','"); 
		  sql = sql.concat(registro.getHora()); 
		  sql = sql.concat("','"); 
			  
		  sql = sql.concat(Integer.toString(registro.getCodOperador()));
		  sql = sql.concat("','");
		  
		  sql = sql.concat(Integer.toString(registro.getCodAutorizacao()));
		  sql = sql.concat("','");

		  sql = sql.concat(Integer.toString(registro.getCodAluno()));
		  
		  sql = sql.concat("');");
		  
	
		 System.out.println(sql);

		
		  try { stmtUpdate = conn.createStatement(); stmtUpdate.executeUpdate(sql); }
		  catch (SQLException e1) { e1.printStackTrace(); }
		 

		ConexaoDB.fechaConexao(conn);
	}

	public void consultar (int codRegistro) {
		
		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from registro where codRegistro =";
		sql = sql.concat(Integer.toString(codRegistro));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("codRegistro"));// irá imprimir os valores da coluna cod
				System.out.println(rs.getString("entradaSaida"));// irá imprimir os valores da coluna nome
				System.out.println(rs.getString("data"));// irá imprimir os valores da coluna cpf
				System.out.println(rs.getString("hora"));// irá imprimir os valores da coluna rg
				System.out.println(rs.getString("operador_codOperador"));// irá imprimir os valores da coluna datanascimento
				System.out.println(rs.getString("Autorizacao_codAutorizacao"));// irá imprimir os valores da coluna telefone
				System.out.println(rs.getString("Aluno_codAluno"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);

	}
	}

