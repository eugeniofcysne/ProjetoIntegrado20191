package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TelaInicialView telaInicial;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tela de login");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JFormattedTextField frmtdtxtfldLogin = new JFormattedTextField();
		frmtdtxtfldLogin.setToolTipText("login");
		frmtdtxtfldLogin.setText("login");
		frmtdtxtfldLogin.setBounds(37, 59, 112, 22);
		contentPane.add(frmtdtxtfldLogin);

		JFormattedTextField frmtdtxtfldSenha = new JFormattedTextField();
		frmtdtxtfldSenha.setToolTipText("senha");
		frmtdtxtfldSenha.setText("senha");
		frmtdtxtfldSenha.setBounds(37, 110, 112, 22);
		contentPane.add(frmtdtxtfldSenha);

		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String login = frmtdtxtfldLogin.getText();
				String senha = frmtdtxtfldSenha.getText();
				
				if (login.equals("admin")&&senha.equals("123456")) {
					telaInicial = new TelaInicialView();
					telaInicial.setVisible(true);
				} else {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "erro no login/senha");
				}
			}

		});

		btnEntrar.setBounds(213, 109, 97, 25);
		contentPane.add(btnEntrar);
	}

}
