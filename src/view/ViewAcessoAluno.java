package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class ViewAcessoAluno extends JFrame {

	private JPanel contentPane;
	private JTable tabelaNotaAluno;
	private JLabel lblMateria;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblMedia;
	private JLabel lblSituacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAcessoAluno frame = new ViewAcessoAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAcessoAluno() {
		setTitle("Painel Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		setSize(725,515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabelaNotaAluno = new JTable();
		tabelaNotaAluno.setForeground(Color.BLACK);
		tabelaNotaAluno.setFillsViewportHeight(true);
		tabelaNotaAluno.setSurrendersFocusOnKeystroke(true);
		tabelaNotaAluno.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"        ID", "     Materia", "     Nota 1", "     Nota 2", "      Media", "   Situacao"
			}
		));
		tabelaNotaAluno.getColumnModel().getColumn(0).setPreferredWidth(87);
		tabelaNotaAluno.setBounds(10, 51, 689, 289);
		contentPane.add(tabelaNotaAluno);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(41, 32, 46, 14);
		contentPane.add(lblId);
		
		lblMateria = new JLabel("Materia");
		lblMateria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateria.setBounds(166, 32, 46, 14);
		contentPane.add(lblMateria);
		
		lblNota1 = new JLabel("Nota 1");
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota1.setBounds(287, 32, 46, 14);
		contentPane.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2");
		lblNota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota2.setBounds(401, 32, 46, 14);
		contentPane.add(lblNota2);
		
		lblMedia = new JLabel("Media");
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setBounds(507, 32, 46, 14);
		contentPane.add(lblMedia);
		
		lblSituacao = new JLabel("Situa\u00E7\u00E3o");
		lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacao.setBounds(619, 32, 59, 14);
		contentPane.add(lblSituacao);
		
		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setBounds(521, 405, 89, 23);
		contentPane.add(btnDeslogar);
	}
}
