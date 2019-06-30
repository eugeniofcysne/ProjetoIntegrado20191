package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OperadorController;
import model.Aluno;
import model.Operador;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.TextField;
import java.awt.List;
import java.awt.TextArea;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class CadastroOperadorView extends JFrame {

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public CadastroOperadorView(OperadorController operadorController) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(12, 72, 56, 16);
		getContentPane().add(lblNome);
		
		JFormattedTextField frmtdtxtfldDigiteONome = new JFormattedTextField();
		frmtdtxtfldDigiteONome.setText("Digite o nome");
		frmtdtxtfldDigiteONome.setBounds(54, 69, 240, 25);
		getContentPane().add(frmtdtxtfldDigiteONome);
		
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(12, 104, 56, 16);
		getContentPane().add(lblCpf);
		
		JFormattedTextField frmtdtxtfldDigiteOCpf = new JFormattedTextField();
		frmtdtxtfldDigiteOCpf.setText("Digite o cpf");
		frmtdtxtfldDigiteOCpf.setBounds(54, 101, 240, 25);
		getContentPane().add(frmtdtxtfldDigiteOCpf);
		
		
		JLabel lblTurno = new JLabel("Turno: ");
		lblTurno.setBounds(12, 133, 56, 16);
		getContentPane().add(lblTurno);
		
		JFormattedTextField frmtdtxtfldDigiteOTurno = new JFormattedTextField();
		frmtdtxtfldDigiteOTurno.setText("Digite o turno");
		frmtdtxtfldDigiteOTurno.setBounds(54, 129, 228, 25);
		getContentPane().add(frmtdtxtfldDigiteOTurno);
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setBounds(12, 162, 56, 16);
		getContentPane().add(lblSetor);
		
		JFormattedTextField frmtdtxtfldSetor = new JFormattedTextField();
		frmtdtxtfldSetor.setText("Setor");
		frmtdtxtfldSetor.setBounds(54, 159, 232, 22);
		getContentPane().add(frmtdtxtfldSetor);
		
		JButton btnCadastrar_1 = new JButton("Cadastrar_1");
		
		btnCadastrar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("deu certo");
				
				String pegaNome = frmtdtxtfldDigiteONome.getText();
				String pegaCpf = frmtdtxtfldDigiteOCpf.getText();
				String pegaTurno = frmtdtxtfldDigiteOTurno.getText();
				String pegaSetor = frmtdtxtfldSetor.getText();
				
				
				
				Operador operador = new Operador(pegaNome, pegaCpf, pegaTurno, pegaSetor);
				operadorController.persistir(operador);
				
		
	
			}
		});		
		btnCadastrar_1.setBounds(12, 215, 97, 25);
		getContentPane().add(btnCadastrar_1);
		
	
		
		
		
	
	}
}

