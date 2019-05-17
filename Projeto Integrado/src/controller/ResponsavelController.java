package controller;
import model.Responsavel;
import repository.ResponsavelRepository;


public class ResponsavelController {
	/**
	 * método para salvar o responsável no repositório
	 * @param responsavel
	 */
	
	
		
	public void persistir(Responsavel responsavel) {
		ResponsavelRepository.persistir();
	}
	public Responsavel consultar (int id) {
		return null;
	}
	public void remover (int id){
		
	}
}
