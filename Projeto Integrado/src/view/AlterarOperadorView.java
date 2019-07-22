package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OperadorController;
import model.Operador;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class AlterarOperadorView extends JFrame {

	private JPanel contentPane;
	private OperadorController operadorController;
	

	
	public AlterarOperadorView(int pegaCodOperador, String pegaNovoNome) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Alteração Operador");

		JFormattedTextField frmtdtxtfldDigiteOCdigo = new JFormattedTextField();
		frmtdtxtfldDigiteOCdigo.setText("Digite o código do operador");
		frmtdtxtfldDigiteOCdigo.setBounds(12, 13, 203, 22);
		contentPane.add(frmtdtxtfldDigiteOCdigo);

		JFormattedTextField frmtdtxtfldNovoNome = new JFormattedTextField();
		frmtdtxtfldNovoNome.setText("Nome");
		frmtdtxtfldNovoNome.setBounds(12, 51, 203, 22);
		contentPane.add(frmtdtxtfldNovoNome);

		
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Alterando operador");
				int pegaCodOperador = Integer.parseInt(frmtdtxtfldDigiteOCdigo.getText());
				String pegaNovoNome = frmtdtxtfldNovoNome.getText();
				// String resultadoConsultaOperador =
				// operadorController.alterar(pegaCodOperador, pegaNovoNome);
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "alterado com sucesso");
				// JFrame resultadoAlterar = new
				// AlterarResponsavelSucesso(resultadoConsultaResponsavel);

			}
		});
		btnAlterar.setBounds(111, 169, 97, 25);
		contentPane.add(btnAlterar);

		JTextArea txtrAlteradoComSucesso = new JTextArea();
		txtrAlteradoComSucesso.setEditable(false);
		txtrAlteradoComSucesso.setText("Alterado com sucesso!");
		txtrAlteradoComSucesso.setBounds(67, 207, 172, 22);
		contentPane.add(txtrAlteradoComSucesso);
	}



}
