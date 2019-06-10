package controller;
import model.Registro;
import repository.RegistroRepository;


public class RegistroController {
	/**
	 * método para salvar o responsável no repositório
	 * @param responsavel
	 */

	
	private RegistroRepository repository;
	
	public RegistroController() {
		this.repository=new RegistroRepository();
	}
		
	public void persistir(Registro registro) {
		this.repository.persistir(registro);
	
	
	}
	public void consultar (int codRegistro){
		this.repository.consultar(codRegistro);
	}
}

