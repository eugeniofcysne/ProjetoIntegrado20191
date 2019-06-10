package View;

import java.awt.EventQueue;
//usando awt por baixo pra fazer comunicação com maqna


import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.AlunoController;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicialView {

	private JFrame frame;
	//criar o segundo frama, que é o cadastro do usuário
	private JFrame cadastroaluno;
	private JFrame cadastroresponsavel;
	private CadastroAlunoView cadastroAluno;

	public TelaInicialView() {
		initialize();
		//criar construtor
		AlunoController alunoController = new AlunoController(alunoController);
		this.cadastroAluno = new CadastroAlunoView ();
		
		//ResponsavelController responsavelController = new ResponsavelController();
		//this.cadastroResponsavel = new CadastroResponsavelView (cadastroResponsavel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastroDeAluno = new JButton("Cadastro de Aluno");
		btnCadastroDeAluno.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cadastroaluno.setVisible(true);
			}
		});
		btnCadastroDeAluno.setBounds(12, 13, 168, 33);
		frame.getContentPane().add(btnCadastroDeAluno);
	}
}
