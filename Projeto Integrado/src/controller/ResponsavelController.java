package controller;
import model.Pessoa;
import model.Responsavel;
import repository.ResponsavelRepository;


public class ResponsavelController {
	/**
	 * método para salvar o responsável no repositório
	 * @param responsavel
	 */

	
	private ResponsavelRepository repository;
	
	public ResponsavelController() {
		this.repository=new ResponsavelRepository();
	}
		
	public void persistir(Responsavel responsavel) {
		this.repository.persistir(responsavel);
	}
	public Responsavel consultar (int id) {
		return null;
	}
	public void remover (int id){
		
	}
}
