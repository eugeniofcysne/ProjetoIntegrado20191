package controller;

import model.Aluno;
import model.Responsavel;
import repository.AlunoRepository;
import repository.ResponsavelRepository;

public class AlunoController {

private AlunoRepository repository;
	
	public AlunoController() {
		this.repository=new AlunoRepository();
	}
		
	public void persistir(Aluno aluno) {
		this.repository.persistir(aluno);
	}
	public Aluno consultar (int id) {
		return null;
	}
	public void remover (int id){
		
	}
}

