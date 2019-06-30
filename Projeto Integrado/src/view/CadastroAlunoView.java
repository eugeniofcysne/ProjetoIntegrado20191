package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import model.Aluno;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class CadastroAlunoView extends JFrame {

	private JPanel contentPane;
	private AlunoController alunoController;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CadastroAlunoView(AlunoController alunoController) {
		this.alunoController = alunoController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField frmtdtxtfldNome = new JFormattedTextField();
		frmtdtxtfldNome.setText("nome");
		frmtdtxtfldNome.setToolTipText("nome");
		frmtdtxtfldNome.setBounds(42, 13, 107, 22);
		contentPane.add(frmtdtxtfldNome);
		
		JFormattedTextField frmtdtxtfldSerie = new JFormattedTextField();
		frmtdtxtfldSerie.setText("serie");
		frmtdtxtfldSerie.setBounds(42, 92, 107, 22);
		contentPane.add(frmtdtxtfldSerie);
		
		JFormattedTextField frmtdtxtfldCodResponsavel = new JFormattedTextField();
		frmtdtxtfldCodResponsavel.setText("CodResponsavel");
		frmtdtxtfldCodResponsavel.setBounds(42, 57, 107, 22);
		contentPane.add(frmtdtxtfldCodResponsavel);
		
		JFormattedTextField frmtdtxtfldDataNascimento = new JFormattedTextField();
		frmtdtxtfldDataNascimento.setText("dataNascimento");
		frmtdtxtfldDataNascimento.setBounds(42, 130, 107, 22);
		contentPane.add(frmtdtxtfldDataNascimento);
		
		JFormattedTextField frmtdtxtfldRg = new JFormattedTextField();
		frmtdtxtfldRg.setToolTipText("RG");
		frmtdtxtfldRg.setText("RG");
		frmtdtxtfldRg.setBounds(42, 165, 107, 22);
		contentPane.add(frmtdtxtfldRg);
		
		JTextArea txtrXxxxxxxx = new JTextArea();
		txtrXxxxxxxx.setText("xx/xx/xxxx");
		txtrXxxxxxxx.setBounds(161, 130, 126, 22);
		contentPane.add(txtrXxxxxxxx);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("deu certo");
				String pegaNome = frmtdtxtfldNome.getText();
				String pegaRg = frmtdtxtfldRg.getText();
				String pegaDataNascimento = frmtdtxtfldDataNascimento.getText();
				int pegaCodResponsavel = Integer.parseInt(frmtdtxtfldCodResponsavel.getText());
				String pegaSerie = frmtdtxtfldSerie.getText();
				int codAlu=1;
				
				
				Aluno aluno = new Aluno(pegaNome, pegaRg, pegaDataNascimento, pegaCodResponsavel, pegaSerie, codAlu);
				alunoController.persistir(aluno);
				//executarAluno(
			}
		});
		btnCadastrar.setBounds(323, 91, 97, 25);
		contentPane.add(btnCadastrar);

	}
}
