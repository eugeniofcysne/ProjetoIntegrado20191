package controller;

import model.Aluno;
import repository.AlunoRepository;

public class AlunoController {
private AlunoRepository repository;
public AlunoController(AlunoController alunoController) {
		this.repository=new AlunoRepository();
	}
		
	public AlunoController() {
		// TODO Auto-generated constructor stub
	}

	public void persistir(Aluno aluno) {
		this.repository.persistir(aluno);
	}

	public void remover (int codAluno){
		this.repository.remover(codAluno);
	}
	
	public void alterar (int codAluno, String novoNome){
		this.repository.alterar(codAluno, novoNome);
	}
	public void consultar (int codAluno){
		this.repository.consultar(codAluno);
	}
}


