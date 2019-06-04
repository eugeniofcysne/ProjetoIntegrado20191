package controller;

import model.Aluno;
import repository.AlunoRepository;

public class AlunoController {
private AlunoRepository repository;
private AlunoController controller;
	
	public AlunoController() {
		this.repository=new AlunoRepository();
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


