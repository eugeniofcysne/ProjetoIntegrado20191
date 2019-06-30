package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Registro;

public class RegistroRepository {
	// executar método persistir
	
	public void persistir(Registro registro) {
		
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		sql = "insert into registro values (null, '";
		sql = sql.concat(registro.getEntradaSaida());
		sql = sql.concat("','");
		sql = sql.concat(registro.getData());
		sql = sql.concat("','");
		sql = sql.concat(registro.getHora());
		sql = sql.concat("','");
		sql = sql.concat(Integer.toString(registro.getCodOperador()));
		sql = sql.concat("',");
		if (registro.getCodAutorizacao()==0) {
			sql=sql.concat("null,'");
			sql = sql.concat(Integer.toString(registro.getCodAluno()));
			sql = sql.concat("');");
		}else {
			sql=sql.concat("'");
			sql = sql.concat(Integer.toString(registro.getCodAutorizacao()));
			sql = sql.concat("','");
			sql = sql.concat(Integer.toString(registro.getCodAluno()));
			sql = sql.concat("');");
		}
			
		System.out.println(sql);

		try {
			stmtUpdate = conn.createStatement();
			stmtUpdate.executeUpdate(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	// Executar método consultar
	
	public String consultar(int codRegistro) {

		Connection conn = ConexaoDB.getConexao();
		String sql = "select * from registro where codRegistro =";
		sql = sql.concat(Integer.toString(codRegistro));
		sql = sql.concat(";");
		Statement stmt;
		ResultSet rs;
		String resultadoConsultaRegistro = "codRegistro: ";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("codRegistro"));
				resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\nentradaSaida: ");
				
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("entradaSaida"));
				resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\ndata: ");
												
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("data"));
				resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\nhora: ");
								
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("hora"));
				resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\ncodOperador: ");		
	
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("operador_codOperador"));
				resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\ncodAutorizacao: ");
								
				try{
					resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("Autorizacao_codAutorizacao"));
					resultadoConsultaRegistro = resultadoConsultaRegistro.concat("\ncodAluno: ");
					
				}catch(NullPointerException ex) {

					resultadoConsultaRegistro = resultadoConsultaRegistro.concat("nulo \ncodAluno: ");
					
				}
				resultadoConsultaRegistro=resultadoConsultaRegistro.concat(rs.getString("Aluno_codAluno"));
			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} finally { // liberar recursos
		}
		ConexaoDB.fechaConexao(conn);
		
		return resultadoConsultaRegistro;
	}
}
