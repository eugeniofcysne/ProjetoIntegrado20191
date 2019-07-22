package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;

public class RelatorioRepository {

	// criar o método para gravar()

	public void gravar(File arquivo) {
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		// quem saiu com autorizacao e qual foi o motivo

		sql = "select a.nomeAluno, c.motivo, b.data, b.hora from aluno a, registro b, autorizacao c where a.codAluno "
				+ "= b.Aluno_codAluno and b.Autorizacao_codAutorizacao is not null and b.Autorizacao_codAutorizacao=c.codAutorizacao;";

		try (FileWriter fw = new FileWriter(arquivo)) {

			stmtUpdate = conn.createStatement();
			ResultSet rs;
			rs = stmtUpdate.executeQuery(sql); // RS=RESULT SET

			fw.write("nomeAluno; motivo; data; hora\r\n");
			while (rs.next()) {

				fw.write(rs.getString("nomeAluno") + ";" + rs.getString("motivo") + ";" + rs.getString("data") + ";"
						+ ("hora") + "\r\n");

				fw.flush();

			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	public void gravar2(File arquivo, String pegaNome) {

		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		// Entrada e Saída por Aluno

		sql = "select a.entradaSaida, a.data, a.hora, b.nomeAluno from Registro a, aluno b where a.aluno_codAluno=b.codAluno and b.nomeAluno='";
		sql = sql.concat(pegaNome);
		sql = sql.concat("';");

		try (FileWriter fw = new FileWriter(arquivo)) {

			stmtUpdate = conn.createStatement();
			ResultSet rs;
			rs = stmtUpdate.executeQuery(sql); // RS=RESULT SET

			fw.write("entradaSaida; data; hora; nomeAluno\r\n");
			while (rs.next()) {

				fw.write(rs.getString("entradaSaida") + ";" + rs.getString("data") + ";" + rs.getString("hora") + ";"
						+ rs.getString("nomeAluno") + "\r\n");

				fw.flush();

			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	public void gravar3(File arquivo) {

		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		// Quantidade de Entradas e Saídas Irregulares

		sql = "select count(*) as entradaSaida\r\n" + "from registro\r\n" + "where \r\n" + "hora <>\"07:30\" and  \r\n"
				+ "hora <> \"11:30\" and Autorizacao_codAutorizacao is null;";

		try (FileWriter fw = new FileWriter(arquivo)) {

			stmtUpdate = conn.createStatement();
			ResultSet rs;
			rs = stmtUpdate.executeQuery(sql); // RS=RESULT SET

			fw.write("entradaSaida\r\n");
			while (rs.next()) {

				fw.write(rs.getString("entradaSaida") + "\r\n");

				fw.flush();

			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	public void gravar4(File arquivo) {
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		// quais os nomes dos responsaveis de cada aluno

		sql = "select a.nomeAluno, b.nomeResponsavel from aluno a, responsavel b where a.Responsavel_codResponsavel = b.codResponsavel;";

		try (FileWriter fw = new FileWriter(arquivo)) {

			stmtUpdate = conn.createStatement();
			ResultSet rs;
			rs = stmtUpdate.executeQuery(sql); // RS=RESULT SET

			fw.write("nomeAluno; nomeResponsavel\r\n");
			while (rs.next()) {

				fw.write(rs.getString("nomeAluno") + ";" + rs.getString("nomeResponsavel") + "\r\n");

				fw.flush();

			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

	public void gravar6(File arquivo, String pegaNome1) {
		Connection conn = ConexaoDB.getConexao();
		String sql;

		Statement stmtUpdate;

		// quais os nomes dos alunos que sairam com o operador x

		sql = "select a.nomeAluno, b.data, b.entradaSaida, c.nomeOperador from aluno a, registro b, operador c\r\n"
				+ "where a.codAluno = b.Aluno_codAluno \r\n"
				+ "and b.Operador_codOperador = c.codOperador and c.nomeOperador='";
		sql = sql.concat(pegaNome1);
		sql = sql.concat("';");

		try (FileWriter fw = new FileWriter(arquivo)) {

			stmtUpdate = conn.createStatement();
			ResultSet rs;
			rs = stmtUpdate.executeQuery(sql); // RS=RESULT SET

			fw.write("nomeAluno; data; entradaSaida; nomeOperador\r\n");
			while (rs.next()) {

				fw.write(rs.getString("nomeAluno") + ";" + rs.getString("data") + ";" + rs.getString("entradaSaida")
						+ ";" + rs.getString("nomeOperador") + "\r\n");

				fw.flush();

			}

		}

		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		ConexaoDB.fechaConexao(conn);

	}

}
