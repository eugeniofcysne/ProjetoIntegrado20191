package controller;

import model.Registro;
import repository.RegistroRepository;

public class RegistroController {
	
	private RegistroRepository repository;
	
	public RegistroController() {
		this.repository=new RegistroRepository();
	}
		
	public void persistir(Registro registro) {
		this.repository.persistir(registro);
	
	
	}
	public String consultar (int codAluno){
		return this.repository.consultar(codAluno);
	}
}

