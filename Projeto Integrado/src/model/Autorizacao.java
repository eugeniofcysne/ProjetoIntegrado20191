package model;

public class Autorizacao {
	

	private String motivo;
	private int codOperador;
	private String dataAutorizacao;
	private int codAluno;
	private int codResponsavel;
	
	//criar uma instância de uma autorizacao
	
	public Autorizacao(String motivo, int codOperador, String dataAutorizacao, int codAluno, int codResponsavel) {

	
	this.motivo=motivo; 
	this.codOperador=codOperador;
	this.dataAutorizacao=dataAutorizacao;
	this.codAluno=codAluno;
	this.codResponsavel=codResponsavel;
	
	}



	public String getMotivo() {
		return motivo;
	}

	public int getCodOperador() {
		return codOperador;
	}

	public String getDataAutorizacao() {
		return dataAutorizacao;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public int getCodResponsavel() {
		return codResponsavel;
	}
}