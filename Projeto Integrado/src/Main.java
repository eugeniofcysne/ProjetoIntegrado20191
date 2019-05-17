import controller.ResponsavelController;
import model.Responsavel;

public class Main {

	public static void main (String[] args) {
		//executarAluno();
		executarResponsavel();
		
	}
	
	
	protected static void executarResponsavel() {
		//criar o objeto Responsável
		Responsavel pai = new Responsavel();
		ResponsavelController controller = new ResponsavelController();
		controller.persistir(pai);
	}
	protected static void executarAluno() {
		
	}
	
	
}
