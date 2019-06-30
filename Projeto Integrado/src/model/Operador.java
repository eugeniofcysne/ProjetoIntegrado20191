package model;

public class Operador extends Pessoa{
	private int codOperador;
	private String turnoOperador;
	private String setorOperador; 	
	
	public Operador(String nome, String CPF, String turnoOperador, String setorOperador) {
		
		super(nome, CPF);
		
		this.codOperador=(Integer) null;
		this.turnoOperador=turnoOperador;
		this.setorOperador=setorOperador;
		
		// TODO Auto-generated constructor stub
	
	}

	public int getCodOperador() {
		return codOperador;
	}

	public String getTurnoOperador() {
		return turnoOperador;
	}

	public String getSetorOperador() {
		return setorOperador;
	}
	
}