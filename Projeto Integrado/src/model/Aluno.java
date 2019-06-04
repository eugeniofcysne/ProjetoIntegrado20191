package model;

public class Aluno extends Pessoa {
	private int codAluno;
	private int serieAluno;

	public Aluno(String nome, String RG, String dataNascimento, int codAluno, String enderecoAluno, int serieAluno) {

		super(nome, RG, dataNascimento);

		this.codAluno = codAluno;
		this.serieAluno = serieAluno;

	}

	public int getcodAluno() {
		return codAluno;

	}

	public int getSerieAluno() {
		return serieAluno;
	}

}
