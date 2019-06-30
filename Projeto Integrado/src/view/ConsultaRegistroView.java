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

import controller.AlunoController;
import controller.RegistroController;

public class ConsultaRegistroView extends JFrame {

	private JPanel contentPane;
	private RegistroController registroController;



	/**
	 * Create the frame.
	 */
	public ConsultaRegistroView(RegistroController registroController) {
		this.registroController=registroController;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField frmtdtxtfldCodigoParaConsultar = new JFormattedTextField();
		frmtdtxtfldCodigoParaConsultar.setText("Digite o c\u00F3digo do registro a ser consultado. ");
		frmtdtxtfldCodigoParaConsultar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaConsultar);
		
		JButton btnConsultaAluno = new JButton("Consultar");
		btnConsultaAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Consultando registros");
				int pegaCodRegistro = Integer.parseInt(frmtdtxtfldCodigoParaConsultar.getText());
				String resultadoConsultaRegistro = registroController.consultar(pegaCodRegistro);
				JFrame resultadoConsulta = new ResultadoConsultaRegistroView(resultadoConsultaRegistro);
				
				System.out.println(resultadoConsultaRegistro);
				
			}
		});
		btnConsultaAluno.setBounds(28, 117, 97, 25);
		contentPane.add(btnConsultaAluno);

	}

}
