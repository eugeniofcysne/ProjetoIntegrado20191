package controller;
import model.Pessoa;
import model.Responsavel;
import repository.ResponsavelRepository;


public class ResponsavelController {
	/**
	 * m�todo para salvar o respons�vel no reposit�rio
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
