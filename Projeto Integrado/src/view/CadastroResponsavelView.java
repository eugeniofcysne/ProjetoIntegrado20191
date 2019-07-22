package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoController;
import controller.ResponsavelController;
import model.Aluno;
import model.Responsavel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class CadastroResponsavelView extends JFrame {

	private JPanel contentPane;
	private ResponsavelController responsavelController;


	/**
	 * Create the frame.
	 */
	public CadastroResponsavelView(ResponsavelController responsavelController) {
		this.responsavelController=responsavelController;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 465, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Cadastro Responsavel");
		
		
		
		JFormattedTextField frmtdtxtfldNomeResponsavel = new JFormattedTextField();
		frmtdtxtfldNomeResponsavel.setText("nomeResponsavel");
		frmtdtxtfldNomeResponsavel.setBounds(12, 48, 137, 22);
		contentPane.add(frmtdtxtfldNomeResponsavel);
		
		JFormattedTextField  frmtdtxtfldCpfResponsavel = new JFormattedTextField();
		frmtdtxtfldCpfResponsavel.setText("cpfResponsavel");
		frmtdtxtfldCpfResponsavel.setBounds(12, 83, 137, 22);
		contentPane.add(frmtdtxtfldCpfResponsavel);
		
		JFormattedTextField frmtdtxtfldRgResponsavel = new JFormattedTextField();
		frmtdtxtfldRgResponsavel.setText("rgResponsavel");
		frmtdtxtfldRgResponsavel.setBounds(12, 118, 137, 22);
		contentPane.add(frmtdtxtfldRgResponsavel);
		
		JFormattedTextField frmtdtxtfldTelefoneResponsavel = new JFormattedTextField();
		frmtdtxtfldTelefoneResponsavel.setText("telefoneResponsavel");
		frmtdtxtfldTelefoneResponsavel.setBounds(12, 153, 137, 22);
		contentPane.add(frmtdtxtfldTelefoneResponsavel);
		
		JFormattedTextField frmtdtxtfldCelularResponsavel = new JFormattedTextField();
		frmtdtxtfldCelularResponsavel.setText("celularResponsavel");
		frmtdtxtfldCelularResponsavel.setBounds(12, 188, 137, 22);
		contentPane.add(frmtdtxtfldCelularResponsavel);
		
		JFormattedTextField frmtdtxtfldEnderecoResponsavel = new JFormattedTextField();
		frmtdtxtfldEnderecoResponsavel.setText("enderecoResponsavel");
		frmtdtxtfldEnderecoResponsavel.setBounds(12, 223, 137, 22);
		contentPane.add(frmtdtxtfldEnderecoResponsavel);
		
		JFormattedTextField frmtdtxtfldDataNascimento = new JFormattedTextField();
		frmtdtxtfldDataNascimento.setText("dataNascimento");
		frmtdtxtfldDataNascimento.setBounds(12, 258, 137, 22);
		contentPane.add(frmtdtxtfldDataNascimento);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("deu certo responsavel");
				String pegaNome = frmtdtxtfldNomeResponsavel.getText();
				String pegaRg = frmtdtxtfldRgResponsavel.getText();
				String pegaCpf=frmtdtxtfldCpfResponsavel.getText();
				String pegaDataNascimento = frmtdtxtfldDataNascimento.getText();
				String pegaTelefone = frmtdtxtfldTelefoneResponsavel.getText();
				String pegaCelular = frmtdtxtfldCelularResponsavel.getText();
				String pegaEndereco = frmtdtxtfldEnderecoResponsavel.getText();
				int codResp=1;
								
				Responsavel responsavel= new Responsavel(pegaNome, pegaCpf, pegaRg, pegaDataNascimento, codResp, pegaEndereco, pegaTelefone, pegaCelular);
				responsavelController.persistir(responsavel);
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "cadastrado com sucesso");
			}
		});
		btnCadastrar.setBounds(323, 91, 97, 25);
		contentPane.add(btnCadastrar);
		
		
	}
}
