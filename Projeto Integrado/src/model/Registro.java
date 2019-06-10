package model;

public class Registro {
	private int codRegistro;
	private String entradaSaida;
	private String data;
	private String hora;
	private int codOperador;
	private int codAutorizacao;
	private int codAluno;
	
	public Registro(String entradaSaida, String data, String hora, int codOperador, int codAutorizacao, int codAluno)
	
	
	{
		
	
		//this.codRegistro;
		this.entradaSaida=entradaSaida;
		this.data=data;
		this.hora=hora;
		this.codOperador=codOperador;
		this.codAutorizacao=codAutorizacao;
		this.codAluno=codAluno;
		
		// TODO Auto-generated constructor stub
	
}



	public int getCodRegistro() {
		return codRegistro;
	}

	public String getEntradaSaida() {
		return entradaSaida;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}

	public int getCodOperador() {
		return codOperador;
	}

	public int getCodAutorizacao() {
		return codAutorizacao;
	}

	public int getCodAluno() {
		return codAluno;
	}
}
	

	