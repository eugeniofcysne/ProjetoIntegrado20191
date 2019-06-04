import java.util.Scanner;

import controller.AlunoController;
import controller.RegistroController;
import controller.ResponsavelController;
import model.Aluno;
import model.Registro;
import model.Responsavel;

public class Main {

	public static void main (String[] args) {
		executarAluno();
		executarResponsavel();
		executarRegistro(); 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer apagar. Ou digite 0 para sair");
		int decisaoUser = scanner.nextInt();
		if (decisaoUser!=0) {
			removerResponsavel(decisaoUser);
		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer alterar. Ou digite 0 para sair");
		decisaoUser = scanner2.nextInt();
		if (decisaoUser!=0) {
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("digite o novo nome");
			String novoNome = scanner3.next();
			alterarResponsavel(decisaoUser, novoNome);
		}
		
		
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer alterar. Ou digite 0 para sair");
		decisaoUser = scanner4.nextInt();
		if (decisaoUser!=0) {
			consultarResponsavel(decisaoUser);
		}
	}
	
	
	protected static void executarResponsavel() {
		//criar o objeto Responsável
		Responsavel responsavel = new Responsavel("joao","04813856900" , "5050105", "03/07/1990", 1, "rua joão paulo, 2379", "48 991729832");
		ResponsavelController controller = new ResponsavelController();
		controller.persistir(responsavel);
	}
	protected static void removerResponsavel(int codResponsavel) {
		ResponsavelController controller = new ResponsavelController();
		controller.remover(codResponsavel);
	}
	
	protected static void alterarResponsavel(int codResponsavel, String novoNome) {
		ResponsavelController controller = new ResponsavelController();
		controller.alterar(codResponsavel, novoNome);
	}
	protected static void consultarResponsavel(int codResponsavel) {
		ResponsavelController controller = new ResponsavelController();
		controller.consultar(codResponsavel);
	}
	
	
	protected static void executarAluno() {
		//criar o objeto Aluni
				Aluno aluno = new Aluno(null, null, null, 0, null, 0);
				AlunoController controller = new AlunoController();
				controller.persistir(aluno);
			}
			protected static void removerAluno(int codAluno) {
				AlunoController controller = new AlunoController();
				controller.remover(codAluno);
			}
			
			protected static void alterarAluno(int codAluno, String novoNome) {
				AlunoController controller = new AlunoController();
				controller.alterar(codAluno, novoNome);
			}
			protected static void consultarAluno1(int codAluno) {
				AlunoController controller = new AlunoController();
				controller.consultar(codAluno);
			}
	

protected static void executarRegistro() {
	//criar o objeto Registro
			Registro registro = new Registro(null, "12:00:00", "15:00:00", 2, 2, 2);
			RegistroController controller = new RegistroController();
			controller.persistir(registro);
		}
}
		//protected static void removerRegistro(int codRegistro) {
			//RegistroController controller = new RegistroController();
			//controller.remover(codRegistro);
		//}
		
		//protected static void alterarRegistro(int codRegistro, String novoNome) {
		//	RegistroController controller = new RegistroController();
		//	controller.alterar(codRegistro, novoNome);
	//	}
	//	protected static void consultarAluno(int codAluno) {
	//		RegistroController controller = new RegistroController();
	//		int codRegistro = 0;
	//		controller.consultar(codRegistro);
		//}
//}
	
