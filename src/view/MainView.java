package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTabbedPane abas;
	
	
	public MainView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainView.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setTitle("Project Apolo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblSistemaPja = new JLabel("ACESSO PJA");
		lblSistemaPja.setFont(new Font("Trajan Pro", Font.PLAIN, 25));
		lblSistemaPja.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSistemaPja, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		abas = new JTabbedPane();
		ViewAluno viewAluno = new ViewAluno();
		ViewProfessor viewProfessor = new ViewProfessor();
		ViewSecretario viewSecretario = new ViewSecretario();
		Sobre sobre = new Sobre();
		abas.add("Aluno", viewAluno);
		abas.add("Professor", viewProfessor);
		abas.add("Secretário", viewSecretario);
		abas.add("Sobre", sobre);
		contentPane.add(abas);
		
		JLabel lblDesenvolvidoPedroH = new JLabel("Desenvolvido: Pedro H. Lacerda");
		lblDesenvolvidoPedroH.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDesenvolvidoPedroH, BorderLayout.SOUTH);
		
		
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
