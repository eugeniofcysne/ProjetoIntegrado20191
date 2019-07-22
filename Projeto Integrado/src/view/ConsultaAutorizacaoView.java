package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AutorizacaoController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaAutorizacaoView extends JFrame {

	private JPanel contentPane;
	private AutorizacaoController autorizacaoController;

	/**
	 * Create the frame.
	 */
	public ConsultaAutorizacaoView(AutorizacaoController autorizacaoController) {
		this.autorizacaoController = autorizacaoController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Consulta Autorizacao");
		JFormattedTextField frmtdtxtfldCodigoParaConsultar = new JFormattedTextField();
		frmtdtxtfldCodigoParaConsultar.setText("Digite o c\u00F3digo da autorizacao a ser consultada. ");
		frmtdtxtfldCodigoParaConsultar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaConsultar);
		
		JButton btnConsultaAutorizacao = new JButton("Consultar");
		
		btnConsultaAutorizacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Consultando autorizacao");
				int pegaCodAutorizacao = Integer.parseInt(frmtdtxtfldCodigoParaConsultar.getText());
				String resultadoConsultaAutorizacao = autorizacaoController.consultar(pegaCodAutorizacao);
				JFrame resultadoConsulta = new ResultadoConsultaAutorizacaoView(resultadoConsultaAutorizacao);
				
				System.out.println(resultadoConsultaAutorizacao);
				
			}
		});
		btnConsultaAutorizacao.setBounds(28, 117, 97, 25);
		contentPane.add(btnConsultaAutorizacao);
		
		
		
	}

}
