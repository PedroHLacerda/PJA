package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.DropMode;

public class Sobre extends JPanel {

	public Sobre() {
		setLayout(null);
		
		JTextPane sobre = new JTextPane();
		sobre.setBackground(SystemColor.menu);
		sobre.setBounds(86, 71, 372, 251);
		add(sobre);
		sobre.setText("\n\n\n\n\n\n Sistema criado com a fun��o de gerenciamento acad�mico, onde h� a busca e implementa��o de dados.");
		sobre.setEditable(false);
	}
}
