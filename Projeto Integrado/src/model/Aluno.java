package model;

public class Aluno extends Pessoa//herdar dados de pessoa
{//nome, rg, data de nascimento, cpf
	private int codAluno; 
	private String serieAluno;
	private int codResponsavel;
	
	public Aluno(String nome, String RG, String dataNascimento, int codResponsavel, String serieAluno, int codAluno) {
		
		super(nome, RG, dataNascimento);
		
		this.codAluno = codAluno;
		this.serieAluno = serieAluno;
		this.codResponsavel = codResponsavel;
		// TODO Auto-generated constructor stub
	

}

	public int getCodAluno() {
		return codAluno;
	}

	public String getSerieAluno() {
		return serieAluno;
	}

	public int getCodResponsavel() {
		return codResponsavel;
	}
}

