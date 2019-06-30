package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class RelatoriosView extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public RelatoriosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCriarRelatrio = new JButton("Criar Relat\u00F3rio 1");
		
		btnCriarRelatrio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				File relatorio = null;
				JFileChooser fc = new JFileChooser();
				int resp = fc.showSaveDialog(contentPane);
				if (resp == JFileChooser.APPROVE_OPTION) {
					relatorio=fc.getSelectedFile();
				}
			}
		});

		btnCriarRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		btnCriarRelatrio.setBounds(27, 60, 229, 53);
		contentPane.add(btnCriarRelatrio);
	}
}
