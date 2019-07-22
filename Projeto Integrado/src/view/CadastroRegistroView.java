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

import controller.RegistroController;
import model.Registro;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class CadastroRegistroView extends JFrame {

	private JPanel contentPane;
	private RegistroController registroController;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CadastroRegistroView(RegistroController registroController) {
		this.registroController = registroController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Cadastro Registro");
		
		
		JFormattedTextField frmtdtxtfldEntSai = new JFormattedTextField();
		frmtdtxtfldEntSai.setText("entrada/sa\u00EDda");
		frmtdtxtfldEntSai.setToolTipText("entrada/sa\u00EDda");
		frmtdtxtfldEntSai.setBounds(42, 13, 107, 22);
		contentPane.add(frmtdtxtfldEntSai);
		
		JFormattedTextField frmtdtxtfldHora = new JFormattedTextField();
		frmtdtxtfldHora.setText("Hora (HH:MM)");
		frmtdtxtfldHora.setBounds(42, 92, 107, 22);
		contentPane.add(frmtdtxtfldHora);
		
		JFormattedTextField frmtdtxtfldData = new JFormattedTextField();
		frmtdtxtfldData.setText("Data");
		frmtdtxtfldData.setBounds(42, 57, 107, 22);
		contentPane.add(frmtdtxtfldData);
		
		JFormattedTextField frmtdtxtfldCodOperador = new JFormattedTextField();
		frmtdtxtfldCodOperador.setText("CodOperador");
		frmtdtxtfldCodOperador.setBounds(42, 130, 107, 22);
		contentPane.add(frmtdtxtfldCodOperador);
		
		JFormattedTextField frmtdtxtfldCodAutorizacao = new JFormattedTextField();
		frmtdtxtfldCodAutorizacao.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldCodAutorizacao.setToolTipText("CodAutorizacao");
		frmtdtxtfldCodAutorizacao.setText("CodAutorizacao");
		frmtdtxtfldCodAutorizacao.setBounds(42, 165, 107, 22);
		contentPane.add(frmtdtxtfldCodAutorizacao);
		
		JFormattedTextField formattedCodAluno = new JFormattedTextField();
		formattedCodAluno.setToolTipText("CodAluno");
		formattedCodAluno.setText("CodAluno");
		formattedCodAluno.setHorizontalAlignment(SwingConstants.LEFT);
		formattedCodAluno.setBounds(42, 200, 107, 22);
		contentPane.add(formattedCodAluno);

		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("deu certo");
				String entSai = frmtdtxtfldEntSai.getText();
				String dat = frmtdtxtfldData.getText();
				int codAutor=Integer.parseInt(frmtdtxtfldCodAutorizacao.getText());
				int codOper = Integer.parseInt(frmtdtxtfldCodOperador.getText());
				
				String hor = frmtdtxtfldHora.getText();
				int codAlu=Integer.parseInt(formattedCodAluno.getText());
				//String entradaSaida, String data, String hora, int codOperador, int codAutorizacao, int codAluno
				
				Registro registro = new Registro(entSai, dat, hor, codOper, codAutor, codAlu);
				registroController.persistir(registro);
				
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "cadastrado com sucesso");
				//executarRegistro(
			}
		});
		btnCadastrar.setBounds(323, 91, 97, 25);
		contentPane.add(btnCadastrar);
		
	
	}
}
