package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AutorizacaoController;
import model.Autorizacao;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class CadastroAutorizacaoView extends JFrame {

	private JPanel contentPane;
	private AutorizacaoController autorizacaoController;

	/**
	 * Create the frame.
	 */
	public CadastroAutorizacaoView(AutorizacaoController autorizacaoController) {
		this.autorizacaoController = autorizacaoController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Cadastro Autorizacao");

		JFormattedTextField frmtdtxtfldMotivo = new JFormattedTextField();
		frmtdtxtfldMotivo.setToolTipText("motivo");
		frmtdtxtfldMotivo.setText("motivo");
		frmtdtxtfldMotivo.setBounds(12, 13, 123, 22);
		contentPane.add(frmtdtxtfldMotivo);

		JFormattedTextField frmtdtxtfldDataautorizacao = new JFormattedTextField();
		frmtdtxtfldDataautorizacao.setToolTipText("dataAutorizacao");
		frmtdtxtfldDataautorizacao.setText("dataAutorizacao");
		frmtdtxtfldDataautorizacao.setBounds(12, 48, 123, 22);
		contentPane.add(frmtdtxtfldDataautorizacao);

		JFormattedTextField frmtdtxtfldCodaluno = new JFormattedTextField();
		frmtdtxtfldCodaluno.setToolTipText("codAluno");
		frmtdtxtfldCodaluno.setText("codAluno");
		frmtdtxtfldCodaluno.setBounds(12, 83, 123, 22);
		contentPane.add(frmtdtxtfldCodaluno);

		JFormattedTextField frmtdtxtfldCodresponsavel = new JFormattedTextField();
		frmtdtxtfldCodresponsavel.setToolTipText("codResponsavel");
		frmtdtxtfldCodresponsavel.setText("codResponsavel");
		frmtdtxtfldCodresponsavel.setBounds(12, 118, 123, 22);
		contentPane.add(frmtdtxtfldCodresponsavel);

		JFormattedTextField frmtdtxtfldCodoperador = new JFormattedTextField();
		frmtdtxtfldCodoperador.setToolTipText("codOperador");
		frmtdtxtfldCodoperador.setText("codOperador");
		frmtdtxtfldCodoperador.setBounds(12, 157, 123, 22);
		contentPane.add(frmtdtxtfldCodoperador);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("deu certo");
				String pegaMotivo = frmtdtxtfldMotivo.getText();
				String pegaData = frmtdtxtfldDataautorizacao.getText();
				int pegaCodAluno = Integer.parseInt(frmtdtxtfldCodaluno.getText());
				int pegaCodResponsavel = Integer.parseInt(frmtdtxtfldCodresponsavel.getText());
				int pegaCodOperador = Integer.parseInt(frmtdtxtfldCodoperador.getText());
				
				
				Autorizacao autorizacao = new Autorizacao(pegaMotivo, pegaCodOperador, pegaData, pegaCodAluno,pegaCodResponsavel);
				autorizacaoController.persistir(autorizacao);
				
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "cadastrado com sucesso");
			}
		});

		btnCadastrar.setBounds(243, 94, 97, 25);
		contentPane.add(btnCadastrar);
	}
}
