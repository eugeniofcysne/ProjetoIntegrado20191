package model;

public class Aluno extends Pessoa {
	private int codAluno;
	private int serieAluno;
	private int codResponsavel;

	public Aluno(String nome, String RG, int codResponsavel, String serie, String dataNascimento, int codAluno, int serieAluno) {

		super(nome, RG, dataNascimento);

		this.codAluno = codAluno;
		this.serieAluno = serieAluno;
		this.codResponsavel = codResponsavel;

	}

	public int getCodResponsavel() {
		return codResponsavel;
	}

	public int getcodAluno() {
		return codAluno;

	}

	public int getSerieAluno() {
		return serieAluno;
	}

}