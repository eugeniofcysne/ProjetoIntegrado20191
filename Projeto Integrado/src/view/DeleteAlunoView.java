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

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteAlunoView extends JFrame {

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
	public DeleteAlunoView(AlunoController alunoController) {
		this.alunoController = alunoController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField frmtdtxtfldCodigoParaDeletar = new JFormattedTextField();
		frmtdtxtfldCodigoParaDeletar.setText("Digite o c\u00F3digo do aluno a ser exclu\u00EDdo. ");
		frmtdtxtfldCodigoParaDeletar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaDeletar);
		
		JButton btnDeleteAluno = new JButton("Excluir");
		btnDeleteAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("excluindo aluno");
				int pegaCodAluno = Integer.parseInt(frmtdtxtfldCodigoParaDeletar.getText());
				alunoController.remover(pegaCodAluno);
				System.out.println("aluno cód "+ pegaCodAluno + " excluído com sucesso.");
			}
		});
		btnDeleteAluno.setBounds(28, 117, 97, 25);
		contentPane.add(btnDeleteAluno);

	}
}
