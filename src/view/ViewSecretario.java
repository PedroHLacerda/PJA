package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewSecretario extends JPanel {
	private JTextField emailS;
	private JPasswordField senhaS;

	public ViewSecretario() {
		setLayout(null);
		
		JLabel lblLoginS = new JLabel("Login:");
		lblLoginS.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblLoginS.setBounds(93, 116, 72, 20);
		add(lblLoginS);
		
		JLabel lblSenhaS = new JLabel("Senha:");
		lblSenhaS.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblSenhaS.setBounds(93, 195, 72, 20);
		add(lblSenhaS);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		btnLogin.setBounds(435, 311, 89, 23);
		add(btnLogin);
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new ViewAcessoSecretario().main(null);
				
			}
		});
		emailS = new JTextField();
		emailS.setBounds(223, 116, 212, 20);
		add(emailS);
		emailS.setColumns(10);
		
		senhaS = new JPasswordField();
		senhaS.setBounds(223, 195, 212, 20);
		add(senhaS);

	}

}
