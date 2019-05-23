package model;

public class Pessoa {

	// criar atributos: nome, idade, ...
	// para acessar atributos, como nao sao publicos, so há duas opçoes: construtor ou get/set
	//construtor quando nao for permitido fazer edicao
	private String nome;
	private String CPF;
	private String RG;
	private String dataNascimento;
	
	public Pessoa(String nome, String CPF, String RG, String dataNascimento) {
		this.nome=nome;
		this.CPF=CPF;
		this.RG=RG;
		this.dataNascimento=dataNascimento;
	}
	public Pessoa(String nome, String RG, String dataNascimento) {
		this.nome=nome;
		// this.CPF=null;
		this.RG=RG;
		this.dataNascimento=dataNascimento;
	}
	
	
}
