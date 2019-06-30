package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;

public class ConsultaAlunoView extends JFrame {

	private JPanel contentPane;
	private AlunoController alunoController;



	/**
	 * Create the frame.
	 */
	public ConsultaAlunoView(AlunoController alunoController) {
		this.alunoController = alunoController;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField frmtdtxtfldCodigoParaConsultar = new JFormattedTextField();
		frmtdtxtfldCodigoParaConsultar.setText("Digite o c\u00F3digo do aluno a ser consultado. ");
		frmtdtxtfldCodigoParaConsultar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaConsultar);
		
		JButton btnConsultaAluno = new JButton("Consultar");
		btnConsultaAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Consultando aluno");
				int pegaCodAluno = Integer.parseInt(frmtdtxtfldCodigoParaConsultar.getText());
				String resultadoConsultaAluno = alunoController.consultar(pegaCodAluno);
				JFrame resultadoConsulta = new ResultadoConsultaAlunoView(resultadoConsultaAluno);
				
				System.out.println(resultadoConsultaAluno);
				
			}
		});
		btnConsultaAluno.setBounds(28, 117, 97, 25);
		contentPane.add(btnConsultaAluno);

	}
}
