package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.AlunoController;
import controller.RegistroController;
import controller.ResponsavelController;
import controller.OperadorController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicialView {

	private JFrame frame;

	private JFrame cadastroResponsavel; // uma tela chamada "cadastroResponsavel"
	private JFrame consultaResponsavel; // uma tela chamada "consultaResponsavel"
	private JFrame alterarResponsavel; // uma tela chamada "alterarResponsavel"
	private JFrame deleteResponsavel; // uma tela chamada "deleteResponsavel"

	private JFrame deleteAluno; // uma tela chamada "deleteAluno"
	private JFrame cadastroAluno; // uma tela chamada "cadastroAluno"
	private JFrame consultaAluno; // uma tela chamada "consultaAluno"
	private JFrame alterarAluno; // uma tela chamada "alterarAluno"

	private JFrame cadastroRegistro; // uma tela chamada "cadastroRegistro"
	private JFrame consultaRegistro; // uma tela chamada "consultaRegistro"

	private JFrame cadastroOperador;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialView window = new TelaInicialView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicialView() {
		initialize();

		AlunoController alunoController = new AlunoController();
		this.cadastroAluno = new CadastroAlunoView(alunoController);
		this.deleteAluno = new DeleteAlunoView(alunoController);
		this.consultaAluno = new ConsultaAlunoView(alunoController);
		this.alterarAluno = new AlteracaoAlunoView(alunoController);

		ResponsavelController responsavelController = new ResponsavelController();
		this.cadastroResponsavel = new CadastroResponsavelView(responsavelController);
		this.deleteResponsavel = new DeleteResponsavelView(responsavelController);
		this.consultaResponsavel = new ConsultaResponsavelView(responsavelController);
		this.alterarResponsavel = new AlteracaoResponsavelView(responsavelController);

		RegistroController registroController = new RegistroController();
		this.cadastroRegistro = new CadastroRegistroView(registroController);
		this.consultaRegistro = new ConsultaRegistroView(registroController);

		OperadorController operadorController = new OperadorController();
		this.cadastroOperador = new CadastroOperadorView(operadorController);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// btnCadastroResponsavel

		JButton btnCadastroResponsavel = new JButton("Cadastro de Responsavel");

		btnCadastroResponsavel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cadastroResponsavel.setVisible(true);
			}
		});

		btnCadastroResponsavel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnCadastroResponsavel.setBounds(12, 40, 215, 25);
		frame.getContentPane().add(btnCadastroResponsavel);

		// btnCadastroAluno.

		JButton btnCadastroAluno = new JButton("Cadastro de aluno");

		btnCadastroAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cadastroAluno.setVisible(true);
			}
		});
		btnCadastroAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastroAluno.setBounds(12, 13, 215, 25);
		frame.getContentPane().add(btnCadastroAluno);

		// btnExclusaoDeAluno

		JButton btnExclusoDeAluno = new JButton("Exclus\u00E3o de aluno");

		btnExclusoDeAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				deleteAluno.setVisible(true);
			}
		});
		btnExclusoDeAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnExclusoDeAluno.setBounds(257, 13, 194, 25);
		frame.getContentPane().add(btnExclusoDeAluno);

		// btnExclusaoDeResponsavel

		JButton btnExclusoDeResponsvel = new JButton("Exclus\u00E3o de Respons\u00E1vel");
		btnExclusoDeResponsvel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				deleteResponsavel.setVisible(true);
			}
		});
		btnExclusoDeResponsvel.setBounds(257, 40, 194, 25);
		frame.getContentPane().add(btnExclusoDeResponsvel);

		// btnConsultaDeAluno

		JButton btnConsultaDeAluno = new JButton("Consulta de Aluno");
		btnConsultaDeAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsultaDeAluno.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				consultaAluno.setVisible(true);
			}
		});
		btnConsultaDeAluno.setBounds(463, 13, 177, 25);
		frame.getContentPane().add(btnConsultaDeAluno);

		// btnAlterarAluno

		JButton btnAlteraoDeAluno = new JButton("Altera\u00E7\u00E3o de Aluno");
		btnAlteraoDeAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlteraoDeAluno.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				alterarAluno.setVisible(true);
			}
		});

		btnAlteraoDeAluno.setBounds(652, 13, 182, 25);
		frame.getContentPane().add(btnAlteraoDeAluno);

		// btnConsultaDeResponsavel

		JButton btnConsultaDeResponsvel = new JButton("Consulta de Respons\u00E1vel");

		btnConsultaDeResponsvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsultaDeResponsvel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				consultaResponsavel.setVisible(true);
			}
		});

		btnConsultaDeResponsvel.setBounds(463, 40, 177, 25);
		frame.getContentPane().add(btnConsultaDeResponsvel);

		// btnAlteracaodeResponsavel

		JButton btnAlteraoDeResponsvel = new JButton("Altera\u00E7\u00E3o de Respons\u00E1vel");

		btnAlteraoDeResponsvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlteraoDeResponsvel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				alterarResponsavel.setVisible(true);
			}
		});

		btnAlteraoDeResponsvel.setBounds(652, 40, 182, 25);
		frame.getContentPane().add(btnAlteraoDeResponsvel);

		// btnCadastroRegistro
		
		JButton btnCadastroRegistro = new JButton("Cadastro de Registro");
		btnCadastroRegistro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cadastroRegistro.setVisible(true);
			}
		});

		btnCadastroRegistro.setBounds(12, 138, 215, 25);
		frame.getContentPane().add(btnCadastroRegistro);

		
		// btnConsultaRegistro
		
		JButton btnConsultaRegistro = new JButton("Consulta de Registro");
		
		btnConsultaRegistro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				consultaRegistro.setVisible(true);
			}
		});
		
		btnConsultaRegistro.setBounds(257, 138, 194, 25);
		frame.getContentPane().add(btnConsultaRegistro);

		// btnCadastroOperador

		JButton btnCadastroDeOperador = new JButton("Cadastro de Operador");
		btnCadastroDeOperador.setBounds(12, 85, 214, 25);
		btnCadastroDeOperador.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				cadastroOperador.setVisible(true);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnCadastroDeOperador);

	}
}
