package view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewPesquisa extends JPanel {
	private JTable table;
	private JTextField tfNomeP;


	public ViewPesquisa() {
		setSize(737, 505);
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"         ID", "      Nome", "        CPF", "     Cargo"
			}
		));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setBounds(10, 118, 598, 320);
		add(table);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(ViewPesquisa.class.getResource("/com/sun/java/swing/plaf/windows/icons/ListView.gif")));
		btnPesquisar.setBounds(614, 145, 123, 47);
		add(btnPesquisar);
		
		JLabel lblNomeP = new JLabel("Nome:");
		lblNomeP.setBounds(236, 62, 39, 14);
		add(lblNomeP);
		
		tfNomeP = new JTextField();
		tfNomeP.setBounds(289, 59, 141, 20);
		add(tfNomeP);
		tfNomeP.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(53, 104, 46, 14);
		add(lblId);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(208, 104, 46, 14);
		add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setBounds(360, 104, 46, 14);
		add(lblCpf);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargo.setBounds(514, 104, 46, 14);
		add(lblCargo);
	}
}
