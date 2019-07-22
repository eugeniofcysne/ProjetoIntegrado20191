package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

import controller.ResponsavelController;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AlteracaoResponsavelView extends JFrame {
	
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
	public AlteracaoResponsavelView(ResponsavelController responsavelController) {
		this.responsavelController = responsavelController;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Alteração Responsavel");
		
		JFormattedTextField frmtdtxtfldDigiteOCdigo = new JFormattedTextField();
		frmtdtxtfldDigiteOCdigo.setText("Digite o c\u00F3digo de Responsavel a ser modificado");
		frmtdtxtfldDigiteOCdigo.setBounds(26, 34, 254, 22);
		contentPane.add(frmtdtxtfldDigiteOCdigo);
		
		JFormattedTextField frmtdtxtfldDigiteONovo = new JFormattedTextField();
		frmtdtxtfldDigiteONovo.setText("Digite o novo nome");
		frmtdtxtfldDigiteONovo.setBounds(67, 102, 192, 22);
		contentPane.add(frmtdtxtfldDigiteONovo);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Alterando responsavel");
				int pegaCodResponsavel = Integer.parseInt(frmtdtxtfldDigiteOCdigo.getText());
				String pegaNovoNome=frmtdtxtfldDigiteONovo.getText();
				String resultadoConsultaResponsavel = responsavelController.alterar(pegaCodResponsavel, pegaNovoNome);
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "alterado com sucesso");
				//JFrame resultadoAlterar = new AlterarResponsavelSucesso(resultadoConsultaResponsavel);
				
				
			}
		});
		btnAlterar.setBounds(111, 169, 97, 25);
		contentPane.add(btnAlterar);
		
		JTextArea txtrAlteradoComSucesso = new JTextArea();
		txtrAlteradoComSucesso.setEditable(false);
		txtrAlteradoComSucesso.setText("Alterado com sucesso!");
		txtrAlteradoComSucesso.setBounds(67, 207, 172, 22);
		contentPane.add(txtrAlteradoComSucesso);
	}
}
