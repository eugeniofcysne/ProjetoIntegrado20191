package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class ResultadoConsultaRegistroView extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public ResultadoConsultaRegistroView(String resultadoRegistro) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAaaa = new JTextPane();
		txtpnAaaa.setText("Resultado da consulta: \n"+resultadoRegistro);
		txtpnAaaa.setBounds(12, 13, 408, 227);
		contentPane.add(txtpnAaaa);
		this.setVisible(true);
	}

}
