package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

import controller.AlunoController;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AlteracaoAlunoView extends JFrame {
	
	private JPanel contentPane;
	private AlunoController alunoController;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public AlteracaoAlunoView(AlunoController alunoController) {
		this.alunoController = alunoController;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Alteração Aluno");
		
		JFormattedTextField frmtdtxtfldDigiteOCdigo = new JFormattedTextField();
		frmtdtxtfldDigiteOCdigo.setText("Digite o c\u00F3digo de Aluno a ser modificado");
		frmtdtxtfldDigiteOCdigo.setBounds(26, 34, 254, 22);
		contentPane.add(frmtdtxtfldDigiteOCdigo);
		
		JFormattedTextField frmtdtxtfldDigiteONovo = new JFormattedTextField();
		frmtdtxtfldDigiteONovo.setText("Digite o novo nome");
		frmtdtxtfldDigiteONovo.setBounds(67, 102, 192, 22);
		contentPane.add(frmtdtxtfldDigiteONovo);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Alterando aluno");
				int pegaCodAluno = Integer.parseInt(frmtdtxtfldDigiteOCdigo.getText());
				String pegaNovoNome=frmtdtxtfldDigiteONovo.getText();
				String resultadoConsultaAluno = alunoController.alterar(pegaCodAluno, pegaNovoNome);
				//JFrame resultadoAlterar = new AlterarAlunoSucesso(resultadoConsultaAluno);
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "alterado com sucesso ");
				
			}
		});
		btnAlterar.setBounds(111, 169, 97, 25);
		contentPane.add(btnAlterar);
	}
}
