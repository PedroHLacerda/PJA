package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TesteTabela extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteTabela frame = new TesteTabela();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TesteTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Container c = getContentPane(); 
		
		String colunas[] = {
			"nome",
			"idade",
			"altura"
		};
		Object dados[][] = {
				{"thiago", "Pedro","sdas"},
				{"thiago", "Pedro","sdas"},
				{"thiago", "Pedro","sdas"}
		};
		
		model = new DefaultTableModel(dados, colunas);
		
		JTable tabela = new JTable(model);
		JScrollPane scroll = new JScrollPane(tabela);
		
		
		
		
		
		c.add(scroll);
		
		
		
		ViewAcessoAluno teste = new ViewAcessoAluno();
		

		
	}
	
	public void deletarlinha(){
		model.removeRow(2);
	}
	
	public void addlinha(){
		model.addRow(new String[]  {"asdas","asdasd","asdas"});
		
	}
	

}
