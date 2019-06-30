package controller;

import model.Operador;
import model.Pessoa;
import repository.OperadorRepository;

public class OperadorController {

	private OperadorRepository repository;
	
	public OperadorController () {
		this.repository=new OperadorRepository();
	}

	public void consultar(int codOperador) {
		// TODO Auto-generated method stub
		
	}
		

	public void remover() {
		// TODO Auto-generated method stub
		
	}

	public void persistir(Operador operador) {
		this.repository.persistir(operador);
		
	}

	public void alterar(int codOperador, String novoNome) {
		this.repository.alterar(codOperador, novoNome);
		
	}
}
