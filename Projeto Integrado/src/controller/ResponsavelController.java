package controller;
import model.Responsavel;
import repository.ResponsavelRepository;


public class ResponsavelController {
	/**
	 * m�todo para salvar o respons�vel no reposit�rio
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
