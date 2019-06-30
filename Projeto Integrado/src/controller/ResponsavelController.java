package controller;

import model.Pessoa;
import model.Responsavel;
import repository.ResponsavelRepository;

public class ResponsavelController {

	private ResponsavelRepository repository;

	public ResponsavelController() {
		this.repository = new ResponsavelRepository();
	}

	public void persistir(Responsavel responsavel) {
		this.repository.persistir(responsavel);
	}

	public void remover(int codResponsavel) {
		this.repository.remover(codResponsavel);
	}

	public String alterar(int codResponsavel, String novoNome) {
		return this.repository.alterar(codResponsavel, novoNome);
	}

	public String consultar(int codResponsavel) {
		return this.repository.consultar(codResponsavel);
	}
}
