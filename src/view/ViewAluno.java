package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ViewAluno extends JPanel {
	private JTextField emailA;
	private JPasswordField senhaA;

	
	public ViewAluno() {
		setLayout(null);
		
		JLabel lblLoginA = new JLabel("Login: ");
		lblLoginA.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblLoginA.setBounds(93, 116, 72, 20);
		add(lblLoginA);
		
		emailA = new JTextField();
		emailA.setToolTipText("Digite seu email");
		emailA.setHorizontalAlignment(SwingConstants.CENTER);
		emailA.setBounds(223, 116, 212, 20);
		add(emailA);
		emailA.setColumns(10);
		
		JLabel lblSenhaA = new JLabel("Senha:");
		lblSenhaA.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblSenhaA.setBounds(93, 195, 72, 20);
		add(lblSenhaA);
		
		senhaA = new JPasswordField();
		senhaA.setToolTipText("Digite sua senha");
		senhaA.setHorizontalAlignment(SwingConstants.CENTER);
		senhaA.setBounds(223, 195, 212, 20);
		add(senhaA);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		btnLogin.setBounds(435, 311, 89, 23);
		add(btnLogin);

	}
}
