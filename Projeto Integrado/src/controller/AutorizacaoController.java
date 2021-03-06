package controller;

import model.Autorizacao;
import repository.AutorizacaoRepository;

public class AutorizacaoController {

	private AutorizacaoRepository repository;

	public AutorizacaoController() {
		this.repository = new AutorizacaoRepository();
	}

	public void persistir(Autorizacao autorizacao){
		this.repository.persistir(autorizacao);

	}

	public String consultar(int codAutorizacao) {
		return this.repository.consultar(codAutorizacao);
	}
}
