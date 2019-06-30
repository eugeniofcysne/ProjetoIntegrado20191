package model;

public class Responsavel extends Pessoa{
	private int codResponsavel; 
	private String enderecoResponsavel;
	private String telefoneResponsavel;
	private String celularResponsavel;
	
	
	public Responsavel(String nome, String CPF, String RG, String dataNascimento, int codResponsavel, 
			String enderecoResponsavel, String telefoneResponsavel, String celularResponsavel) {
		
		super(nome, CPF, RG, dataNascimento);
		
		this.codResponsavel=codResponsavel;
		this.enderecoResponsavel=enderecoResponsavel;
		this.telefoneResponsavel=telefoneResponsavel;
		this.celularResponsavel=celularResponsavel;
		// TODO Auto-generated constructor stub
	}

	public int getCodResponsavel() {
		return codResponsavel;
	}

	public String getEnderecoResponsavel() {
		return enderecoResponsavel;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public String getCelularResponsavel() {
		return celularResponsavel;
	}

	
}
