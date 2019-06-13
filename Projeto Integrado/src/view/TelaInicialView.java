package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controller.AlunoController;
import controller.ResponsavelController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicialView {

	private JFrame frame;
	private JFrame cadastroAluno; //uma tela chamada "cadastroAluno"
	private JFrame cadastroResponsavel; //uma tela chamada "cadastroAluno"

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
		//AlunoController alunoController = new AlunoController();
		//this.cadastroAluno = new CadastroAlunoView();
		//this.cadastroAluno = new CadastroAlunoView(alunoController);
		AlunoController alunoController = new AlunoController();
		this.cadastroAluno = new CadastroAlunoView(alunoController);
		ResponsavelController responsavelController = new ResponsavelController();
		this.cadastroResponsavel = new CadastroResponsavelView(responsavelController);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//btnCadastroAluno.
		
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
		btnCadastroAluno.setBounds(71, 39, 227, 32);
		frame.getContentPane().add(btnCadastroAluno);
		
		//btnCadastroResponsavel
		
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
		btnCadastroResponsavel.setBounds(63, 100, 205, 25);
		frame.getContentPane().add(btnCadastroResponsavel);
	}
}
