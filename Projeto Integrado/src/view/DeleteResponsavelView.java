package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ResponsavelController;
import model.Responsavel;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteResponsavelView extends JFrame {

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
	public DeleteResponsavelView(ResponsavelController responsavelController) {
		this.responsavelController = responsavelController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField frmtdtxtfldCodigoParaDeletar = new JFormattedTextField();
		frmtdtxtfldCodigoParaDeletar.setText("Digite o c\u00F3digo do responsavel a ser exclu\u00EDdo. ");
		frmtdtxtfldCodigoParaDeletar.setBounds(28, 31, 310, 22);
		contentPane.add(frmtdtxtfldCodigoParaDeletar);
		
		JButton btnDeleteResponsavel = new JButton("Excluir");
		btnDeleteResponsavel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("excluindo responsavel");
				int pegaCodResponsavel = Integer.parseInt(frmtdtxtfldCodigoParaDeletar.getText());
				responsavelController.remover(pegaCodResponsavel);
				System.out.println("responsavel cód "+ pegaCodResponsavel + " excluído com sucesso.");
			}
		});
		btnDeleteResponsavel.setBounds(28, 117, 97, 25);
		contentPane.add(btnDeleteResponsavel);

	}
}
