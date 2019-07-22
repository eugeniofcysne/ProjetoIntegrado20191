package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ResponsavelController;

public class ConsultaResponsavelView extends JFrame {

	private JPanel contentPane;
	private ResponsavelController responsavelController;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public ConsultaResponsavelView(ResponsavelController responsavelController) {
		this.responsavelController = responsavelController;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Consulta Responsavel");
		
		
		JFormattedTextField frmtdtxtfldCodigoParaConsultar = new JFormattedTextField();
		frmtdtxtfldCodigoParaConsultar.setText("Digite o c\u00F3digo do responsavel a ser consultado. ");
		frmtdtxtfldCodigoParaConsultar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaConsultar);
		
		JButton btnConsultaResponsavel = new JButton("Consultar");
		btnConsultaResponsavel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Consultando responsavel");
				int pegaCodResponsavel = Integer.parseInt(frmtdtxtfldCodigoParaConsultar.getText());
				String resultadoConsultaResponsavel = responsavelController.consultar(pegaCodResponsavel);
				JFrame resultadoConsulta = new ResultadoConsultaAlunoView(resultadoConsultaResponsavel);
				
				System.out.println(resultadoConsultaResponsavel);
				
			}
		});
		btnConsultaResponsavel.setBounds(28, 117, 97, 25);
		contentPane.add(btnConsultaResponsavel);

	}
}
