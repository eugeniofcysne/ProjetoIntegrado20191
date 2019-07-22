package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OperadorController;
import controller.RelatorioController;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class RelatorioView extends JFrame {

	private JPanel contentPane;
	private RelatorioController relatorioController;

	public RelatorioView(RelatorioController relatorioController) {
		this.relatorioController = relatorioController;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 646, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Relatórios");

		// bnt Relatorio1

		JButton btnRelatorio = new JButton("Relatorio 1");
		btnRelatorio.setBackground(UIManager.getColor("Button.background"));
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio = fc.getSelectedFile();
					relatorioController.gravar(relatorio);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Relatório gerado com sucesso!");
				}
			}
		});

		btnRelatorio.setBounds(519, 13, 97, 25);
		contentPane.add(btnRelatorio);

		// bnt Relatorio2
		
		//inserir nome
		JFormattedTextField frmtdtxtfldDigiteONome = new JFormattedTextField();
		frmtdtxtfldDigiteONome.setText("Digite o nome do aluno");
		frmtdtxtfldDigiteONome.setBounds(342, 64, 165, 25);
		contentPane.add(frmtdtxtfldDigiteONome);

		//gerar relatorio
		JButton btnRelatorio2 = new JButton("Relatorio 2");
		btnRelatorio2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pegaNome = frmtdtxtfldDigiteONome.getText();
				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio = fc.getSelectedFile();
					relatorioController.gravar2(relatorio, pegaNome);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Relatório gerado com sucesso!");
				}
			}
		});

		btnRelatorio2.setBounds(519, 64, 97, 25);
		contentPane.add(btnRelatorio2);
		
		
		//bnt Relatório 3
		JButton btnRelatorio3 = new JButton("Relatorio 3");
		btnRelatorio3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio = fc.getSelectedFile();
					relatorioController.gravar3(relatorio);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Relatório gerado com sucesso!");
				}
			}
		});
		
		btnRelatorio3.setBounds(519, 118, 97, 25);
		contentPane.add(btnRelatorio3);
		
		
		
		//btn Relatorio 4
		JButton btnRelatorio4 = new JButton("Relatorio 4");
		
		btnRelatorio4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio = fc.getSelectedFile();
					relatorioController.gravar4(relatorio);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Relatório gerado com sucesso!");
				}
			}
		});
		
		
		btnRelatorio4.setBounds(519, 166, 97, 25);
		contentPane.add(btnRelatorio4);
		
		
		
		//inserir operador
		JFormattedTextField frmtdtxtfldDigiteONome1 = new JFormattedTextField();
		frmtdtxtfldDigiteONome1.setText("Digite o nome do operador");
		frmtdtxtfldDigiteONome1.setBounds(342, 215, 165, 25);
		contentPane.add(frmtdtxtfldDigiteONome1);
		
		//botao gerar relatorio
		JButton btnRelatorio5 = new JButton("Relatorio 5");
		
		btnRelatorio5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pegaNome1 = frmtdtxtfldDigiteONome1.getText();
				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio = fc.getSelectedFile();
					relatorioController.gravar6(relatorio, pegaNome1);
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "Relatório gerado com sucesso!");
				}
			}
		});
		
		
		
		btnRelatorio5.setBounds(519, 215, 97, 25);
		contentPane.add(btnRelatorio5);
		
		JTextPane txtpnAlunosComAutorizaes = new JTextPane();
		txtpnAlunosComAutorizaes.setText("Alunos com Autoriza\u00E7\u00F5es para entrada e sa\u00EDda");
		txtpnAlunosComAutorizaes.setBounds(12, 20, 285, 22);
		contentPane.add(txtpnAlunosComAutorizaes);
		
		JTextPane txtpnEntradaESada = new JTextPane();
		txtpnEntradaESada.setText("Entrada e Sa\u00EDda por Aluno");
		txtpnEntradaESada.setBounds(12, 67, 285, 22);
		contentPane.add(txtpnEntradaESada);
		
		JTextPane txtpnQuantidadeDeSadas = new JTextPane();
		txtpnQuantidadeDeSadas.setText("Quantidade de Sa\u00EDdas Irregulares");
		txtpnQuantidadeDeSadas.setBounds(12, 118, 285, 22);
		contentPane.add(txtpnQuantidadeDeSadas);
		
		JTextPane txtpnNomesDosAlunos = new JTextPane();
		txtpnNomesDosAlunos.setText("Nomes dos Alunos e Seus Respons\u00E1veis");
		txtpnNomesDosAlunos.setBounds(12, 169, 285, 22);
		contentPane.add(txtpnNomesDosAlunos);
		
		JTextPane txtpnNomeDeAlunos = new JTextPane();
		txtpnNomeDeAlunos.setText("Nome de Alunos com Sa\u00EDda pelo Operador desejado:");
		txtpnNomeDeAlunos.setBounds(12, 215, 285, 22);
		contentPane.add(txtpnNomeDeAlunos);
		
//		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Alunos com Autoriza\u00E7\u00F5es para Sa\u00EDda e Motivo;");
//		lblNewJgoodiesTitle.setBounds(12, 17, 317, 25);
//		contentPane.add(lblNewJgoodiesTitle);
//		
//		JLabel lblEntradaESada = DefaultComponentFactory.getInstance().createTitle("Entrada e Sa\u00EDda por Aluno;");
//		lblEntradaESada.setBounds(12, 51, 393, 25);
//		contentPane.add(lblEntradaESada);
//		
//		JLabel lblQuantidadeDeEntradas = DefaultComponentFactory.getInstance().createTitle("Quantidade de Entradas e Sa\u00EDdas Irregulares;");
//		lblQuantidadeDeEntradas.setBounds(12, 113, 382, 16);
//		contentPane.add(lblQuantidadeDeEntradas);
//		
//		JLabel lblQuaisOsNomes = DefaultComponentFactory.getInstance().createTitle("Nome dos Alunos e seus Respectivos Respons\u00E1veis;");
//		lblQuaisOsNomes.setBounds(12, 151, 317, 17);
//		contentPane.add(lblQuaisOsNomes);
//		
//		JLabel lblQuaisOsNomes_1 = DefaultComponentFactory.getInstance().createTitle("Nomes dos Alunos com Registro de Sa\u00EDdas Feito pelo Operador: ");
//		lblQuaisOsNomes_1.setBounds(12, 194, 408, 16);
//		contentPane.add(lblQuaisOsNomes_1);
//		
		
		
		
	}
}

