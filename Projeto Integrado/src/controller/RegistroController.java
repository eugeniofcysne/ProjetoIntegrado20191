package controller;

import model.Registro;
import model.Responsavel;
import repository.RegistroRepository;
import repository.ResponsavelRepository;

public class RegistroController {
private RegistroRepository repository;
	
	public RegistroController() {
		this.repository=new RegistroRepository();
	}
		
	public void persistir(Registro registro) {
		this.repository.persistir(registro);
	}
}
	//public void remover (int codRegistro){
	//	this.repository.remover(codRegistro);
	//}
	
	//public void alterar (int codRegistro, String novoNome){
		//this.repository.alterar(codRegistro, novoNome);
	//}
	//public void consultar (int codRegistro){
	//	this.repository.consultar(codRegistro);
	//}
//}



