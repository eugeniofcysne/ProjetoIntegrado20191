package controller;

import model.Aluno;
import repository.AlunoRepository;

public class AlunoController {

	private AlunoRepository repository;

	public AlunoController() {
		this.repository = new AlunoRepository();
	}

	public void persistir(Aluno aluno) {
		this.repository.persistir(aluno);
	}

	public void remover(int codAluno) {
		this.repository.remover(codAluno);
	}

	public String alterar(int codAluno, String novoNome) {
		return this.repository.alterar(codAluno, novoNome);
	}
	
	public String consultar(int codAluno) {
		return this.repository.consultar(codAluno);
	}
}
