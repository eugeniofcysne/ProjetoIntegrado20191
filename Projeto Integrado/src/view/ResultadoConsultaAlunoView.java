package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class ResultadoConsultaAlunoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ResultadoConsultaAlunoView(String resultadoAluno) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Resultado Consulta Aluno");
		JTextPane txtpnAaaa = new JTextPane();
		txtpnAaaa.setText("Resultado da consulta: \n"+resultadoAluno);
		txtpnAaaa.setBounds(12, 13, 408, 227);
		contentPane.add(txtpnAaaa);
		this.setVisible(true);
	}
}
