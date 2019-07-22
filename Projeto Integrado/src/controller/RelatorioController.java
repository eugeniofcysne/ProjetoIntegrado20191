package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import repository.ConexaoDB;
import repository.RelatorioRepository;
import repository.ResponsavelRepository;

public class RelatorioController {

	private RelatorioRepository repository;

	public RelatorioController() {
		this.repository = new RelatorioRepository();

	}

	public void gravar(File arquivo) {
		this.repository.gravar(arquivo);
	}

	public void gravar2(File arquivo, String pegaNome) {
		this.repository.gravar2(arquivo, pegaNome);
	}

	public void gravar3(File arquivo) {
		this.repository.gravar3(arquivo);

	}

	public void gravar4(File arquivo) {
		this.repository.gravar4(arquivo);

	}

	/*
	 * public void gravar5(File arquivo, String pegaNome1, String pegaData) {
	 * this.repository.gravar5(arquivo, pegaNome1, pegaData); }
	 */

	public void gravar6(File arquivo, String pegaNome1) {
		this.repository.gravar6(arquivo, pegaNome1);

	}
}
