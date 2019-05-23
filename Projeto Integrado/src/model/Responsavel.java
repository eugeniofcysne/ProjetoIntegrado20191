package model;

public class Responsavel extends Pessoa{
	private int codResponsavel; 
	private String enderecoResponsavel;
	private String telefoneResponsavel;
	
	public Responsavel(String nome, String CPF, String RG, String dataNascimento, int codResponsavel, 
			String enderecoResponsavel, String telefoneResponsavel) {
		
		super(nome, CPF, RG, dataNascimento);
		
		this.codResponsavel=codResponsavel;
		this.enderecoResponsavel=enderecoResponsavel;
		this.telefoneResponsavel=telefoneResponsavel;
		// TODO Auto-generated constructor stub
	}

	
}
