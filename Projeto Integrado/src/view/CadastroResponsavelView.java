package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import controller.ResponsavelController;
import javax.swing.JTextField;

public class CadastroResponsavelView extends JFrame {

	private JPanel contentPane;
	private ResponsavelController responsavelController;
	private JTextField txtCadastroResponsavel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public CadastroResponsavelView(ResponsavelController responsavelController) {
		this.responsavelController=responsavelController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtCadastroResponsavel = new JTextField();
		txtCadastroResponsavel.setText("Cadastro Responsavel");
		contentPane.add(txtCadastroResponsavel, BorderLayout.NORTH);
		txtCadastroResponsavel.setColumns(10);
	}

}
