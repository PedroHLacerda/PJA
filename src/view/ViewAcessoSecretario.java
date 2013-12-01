package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import repositorio.SalvarDados;
import java.awt.Dialog.ModalExclusionType;

public class ViewAcessoSecretario extends JFrame {

	private JPanel contentPane;
	private JTabbedPane abas;
	

	public ViewAcessoSecretario() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Painel Secretario");
		getContentPane().setLayout(null);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		abas = new JTabbedPane();
		ViewCadastro viewCadastro = new ViewCadastro();
		ViewPesquisa viewPesquisa = new ViewPesquisa();
		
		abas.add("Cadastrar",viewCadastro);
		abas.add("Pesquisar", viewPesquisa);
		contentPane.add(abas);
		
	}
	
	public static void main(String[] args) {
		SalvarDados dadosSalvos = new SalvarDados();
		dadosSalvos.retornarAluno();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAcessoSecretario frame = new ViewAcessoSecretario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
