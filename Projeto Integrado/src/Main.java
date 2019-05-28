import controller.AlunoController;
import controller.ResponsavelController;
import model.Aluno;
import model.Responsavel;

public class Main {

	public static void main (String[] args) {
		executarAluno();
		executarResponsavel();
		
	}
	
	
	protected static void executarResponsavel() {
		//criar o objeto Responsável
		Responsavel pai = new Responsavel();
		ResponsavelController controller = new ResponsavelController();
		controller.persistir(pai);
	}
	
	
	protected static void executarAluno() {
		//criar objeto aluno
		Aluno aluno = new Aluno ("Pedro de Souza", "6438838", "06/04/1992", 1, "2", 1);
		AlunoController controller = new AlunoController();
		controller.persistir(aluno);
		
	}
}
