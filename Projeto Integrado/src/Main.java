import controller.ResponsavelController;
import model.Responsavel;

public class Main {

	public static void main (String[] args) {
		//executarAluno();
		executarResponsavel();
		
	}
	
	
	protected static void executarResponsavel() {
		//criar o objeto Responsável
		Responsavel responsavel = new Responsavel("joao","04813856900" , "5050105", "03/07/1990", 1, "rua joão paulo, 2379", "48 991729832");
		ResponsavelController controller = new ResponsavelController();
		controller.persistir(responsavel);
	}
	protected static void executarAluno() {
		
	}
	
	
}
