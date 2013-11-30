package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ViewProfessor extends JPanel {
	private JTextField emailP;
	private JPasswordField senhaP;

	public ViewProfessor() {
		setLayout(null);
		
		JLabel lblLoginP = new JLabel("Login");
		lblLoginP.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblLoginP.setBounds(93, 116, 72, 20);
		add(lblLoginP);
		
		JLabel lblSenhaP = new JLabel("Senha");
		lblSenhaP.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblSenhaP.setBounds(93, 195, 72, 20);
		add(lblSenhaP);
		
		emailP = new JTextField();
		emailP.setToolTipText("Digite seu email");
		emailP.setHorizontalAlignment(SwingConstants.CENTER);
		emailP.setBounds(223, 116, 212, 20);
		add(emailP);
		emailP.setColumns(10);
		
		senhaP = new JPasswordField();
		senhaP.setToolTipText("Digite sua senha");
		senhaP.setBounds(223, 195, 212, 20);
		add(senhaP);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		btnLogin.setBounds(435, 311, 89, 23);
		add(btnLogin);

	}

}
