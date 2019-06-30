package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class AlterarResponsavelSucesso extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public AlterarResponsavelSucesso(String resultadoAlterar) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane txtpnAaaa = new JTextPane();
		txtpnAaaa.setText(resultadoAlterar);
		txtpnAaaa.setBounds(12, 13, 408, 227);
		contentPane.add(txtpnAaaa);
		this.setVisible(true);
	}

}
