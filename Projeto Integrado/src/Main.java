
import java.util.Scanner;

import controller.AlunoController;
import controller.ResponsavelController;
import model.Aluno;
import model.Responsavel;

public class Main {

	public static void main(String[] args) {
		executarAluno();
		executarResponsavel();
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer apagar. Ou digite 0 para sair");
		int decisaoUser = scanner.nextInt();
		if (decisaoUser != 0) {
			removerResponsavel(decisaoUser);
		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer alterar. Ou digite 0 para sair");
		decisaoUser = scanner2.nextInt();
		if (decisaoUser != 0) {
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("digite o novo nome");
			String novoNome = scanner3.next();
			alterarResponsavel(decisaoUser, novoNome);
		}

		Scanner scanner4 = new Scanner(System.in);
		System.out.println("digite o codResponsavel que quer alterar. Ou digite 0 para sair");
		decisaoUser = scanner4.nextInt();
		if (decisaoUser != 0) {
			consultarResponsavel(decisaoUser);
		}
	}

	protected static void executarResponsavel() {
		// criar o objeto Responsável
		Responsavel responsavel = new Responsavel("joao", "04813856900", "5050105", "03/07/1990", 1,
				"rua joão paulo, 2379", "48 991729832");
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
		// criar objeto aluno
		Aluno aluno = new Aluno("Pedro de Souza", "6438838", "06/04/1992", 1, "2", 1);
		AlunoController controller = new AlunoController();
		controller.persistir(aluno);

	}

}
