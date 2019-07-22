package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class ResultadoConsultaAutorizacaoView extends JFrame {
	
	private JPanel contentPane;
	public ResultadoConsultaAutorizacaoView(String resultadoAutorizacao) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Resultado Consulta Autorizacao");
		JTextPane txtpnAaaa = new JTextPane();
		txtpnAaaa.setText("Resultado da consulta: \n"+resultadoAutorizacao);
		txtpnAaaa.setBounds(12, 13, 408, 227);
		contentPane.add(txtpnAaaa);
		this.setVisible(true);
	}
}
