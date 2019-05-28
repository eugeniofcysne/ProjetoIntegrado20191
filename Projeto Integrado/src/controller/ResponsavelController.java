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

	public void remover (int codResponsavel){
		this.repository.remover(codResponsavel);
	}
	
	public void alterar (int codResponsavel, String novoNome){
		this.repository.alterar(codResponsavel, novoNome);
	}
	public void consultar (int codResponsavel){
		this.repository.consultar(codResponsavel);
	}
}
