package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Aluno;
import model.Pessoa;
import repositorio.SalvarDados;
import start.Start;

public class ViewCadastro extends JPanel {
	
	Pessoa dadosPessoa = new Pessoa();
	Aluno dadosAluno = new Aluno();
	SalvarDados dadosSalvos = new SalvarDados();

	private JTextField tfnomeC;
	private JTextField tfenderecoC;
	private JTextField tfEmailC;
	private JPasswordField tfSenhaC;
	private JTextField tfCpf;
	private JTextField tfTelefone;
	private JTextField tfnomeDaMaeC;
	private JRadioButton rdbtnAluno;
	private JRadioButton rdbtnProfessor;
	private JRadioButton rdbtnSecretario;
	private JCheckBox chckbxMestrado;
	private JCheckBox chckbxDoutorado;
	private JRadioButton rdbtnRedes;
	private JRadioButton rdbtnEletronica;
	private JCheckBox chckbxSeguranaDeRedes;
	private JCheckBox chckbxEletronicaDigital;
	private  JCheckBox chckbxIngles;
	private JCheckBox chckbxEletricidade;
	private JCheckBox chckbxBancoDeDados;
	private JCheckBox chckbxClp;
	private JRadioButton rdbtnPagante;
	private JRadioButton rdbtnBolsista;
	private JCheckBox chckbxParcial;
	private JCheckBox chckbxTotal;
	private JRadioButton rdbtnConcluido;
	private JRadioButton rdbtnTrancado;
	private JRadioButton rdbtnAndamento;
	private  JButton btnCadastrar;

	private ButtonGroup grupoCadastro;
	private ButtonGroup grupoCursoSelecionar;
	private ButtonGroup grupoPagamento;
	private ButtonGroup grupoCheckPagamento;
	private ButtonGroup grupoSituacaoCurso;


	public ViewCadastro() {
		setSize(725, 515);
		setLayout(null);


		JLabel lblNomeC = new JLabel("Nome: ");
		lblNomeC.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeC.setBounds(47, 96, 46, 14);
		add(lblNomeC);

		JLabel lblEmailC = new JLabel("Email: ");
		lblEmailC.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailC.setBounds(47, 164, 46, 14);
		add(lblEmailC);

		JLabel lblSenhaC = new JLabel("Senha: ");
		lblSenhaC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaC.setBounds(47, 202, 46, 14);
		add(lblSenhaC);

		JLabel lblEnderecoC = new JLabel("Endere\u00E7o: ");
		lblEnderecoC.setBounds(47, 133, 81, 14);
		add(lblEnderecoC);

		tfnomeC = new JTextField();
		tfnomeC.setHorizontalAlignment(SwingConstants.CENTER);
		tfnomeC.setBounds(156, 93, 170, 20);
		add(tfnomeC);
		tfnomeC.setColumns(10);

		tfenderecoC = new JTextField();
		tfenderecoC.setHorizontalAlignment(SwingConstants.CENTER);
		tfenderecoC.setBounds(156, 130, 170, 20);
		add(tfenderecoC);
		tfenderecoC.setColumns(10);

		tfEmailC = new JTextField();
		tfEmailC.setHorizontalAlignment(SwingConstants.CENTER);
		tfEmailC.setBounds(156, 161, 170, 20);
		add(tfEmailC);
		tfEmailC.setColumns(10);

		tfSenhaC = new JPasswordField();
		tfSenhaC.setBounds(156, 199, 170, 20);
		add(tfSenhaC);

		rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setBounds(104, 44, 61, 23);
		add(rdbtnAluno);
		rdbtnAluno.addActionListener(new ActionButtons());

		rdbtnProfessor = new JRadioButton("Professor");
		rdbtnProfessor.setBounds(195, 44, 94, 23);
		add(rdbtnProfessor);
		rdbtnProfessor.addActionListener(new ActionButtons());

		rdbtnSecretario = new JRadioButton("Secretario");
		rdbtnSecretario.setBounds(325, 44, 86, 23);
		add(rdbtnSecretario);
		rdbtnSecretario.addActionListener(new ActionButtons());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(582, 279, -360, 105);
		add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(383, 96, 1, 178);
		add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(383, 271, 283, 3);
		add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(665, 96, 1, 178);
		add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(175, 33, 1, 38);
		add(separator_5);

		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(295, 35, 1, 38);
		add(separator_6);

		chckbxMestrado = new JCheckBox("Mestrado");
		chckbxMestrado.setBounds(393, 110, 97, 23);
		add(chckbxMestrado);

		chckbxDoutorado = new JCheckBox("Doutorado");
		chckbxDoutorado.setBounds(514, 110, 97, 23);
		add(chckbxDoutorado);

		JLabel lblProfessorC = new JLabel("Professor");
		lblProfessorC.setBounds(492, 89, 83, 14);
		add(lblProfessorC);

		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(47, 319, 11, 147);
		add(separator_7);

		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(47, 467, 589, 14);
		add(separator_8);

		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(633, 319, 11, 147);
		add(separator_9);

		JLabel lblAlunoC = new JLabel("Aluno");
		lblAlunoC.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlunoC.setBounds(310, 312, 46, 14);
		add(lblAlunoC);

		rdbtnRedes = new JRadioButton("Redes");
		rdbtnRedes.setBounds(338, 416, 61, 23);
		add(rdbtnRedes);
		rdbtnRedes.addActionListener(new ActionButtons());

		rdbtnEletronica = new JRadioButton("Eletronica");
		rdbtnEletronica.setBounds(247, 416, 86, 23);
		add(rdbtnEletronica);
		rdbtnEletronica.addActionListener(new ActionButtons());

		JLabel lblCpfC = new JLabel("Cpf: ");
		lblCpfC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpfC.setBounds(47, 230, 46, 14);
		add(lblCpfC);

		tfCpf = new JTextField();
		tfCpf.setBounds(156, 230, 170, 20);
		add(tfCpf);
		tfCpf.setColumns(10);

		JLabel lblTelefoneC = new JLabel("Telefone:");
		lblTelefoneC.setBounds(47, 268, 46, 14);
		add(lblTelefoneC);

		tfTelefone = new JTextField();
		tfTelefone.setBounds(156, 265, 170, 20);
		add(tfTelefone);
		tfTelefone.setColumns(10);

		chckbxSeguranaDeRedes = new JCheckBox("Seguran\u00E7a de Redes");
		chckbxSeguranaDeRedes.setBounds(390, 178, 146, 23);
		add(chckbxSeguranaDeRedes);

		chckbxEletronicaDigital = new JCheckBox("Eletronica Digital");
		chckbxEletronicaDigital.setBounds(534, 178, 125, 23);
		add(chckbxEletronicaDigital);

		chckbxIngles = new JCheckBox("Ingl\u00EAs");
		chckbxIngles.setBounds(391, 212, 81, 23);
		add(chckbxIngles);

		chckbxEletricidade = new JCheckBox("Eletricidade");
		chckbxEletricidade.setBounds(535, 212, 97, 23);
		add(chckbxEletricidade);

		chckbxBancoDeDados = new JCheckBox("Banco de Dados");
		chckbxBancoDeDados.setBounds(390, 245, 118, 23);
		add(chckbxBancoDeDados);

		chckbxClp = new JCheckBox("CLP");
		chckbxClp.setBounds(535, 245, 97, 23);
		add(chckbxClp);

		JLabel lblCadeirasC = new JLabel("Cadeiras");
		lblCadeirasC.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadeirasC.setBounds(466, 155, 125, 14);
		add(lblCadeirasC);

		JLabel lblNomeDaMaeC = new JLabel("Nome Da Mae:");
		lblNomeDaMaeC.setBounds(57, 337, 89, 14);
		add(lblNomeDaMaeC);

		tfnomeDaMaeC = new JTextField();
		tfnomeDaMaeC.setBounds(156, 337, 170, 20);
		add(tfnomeDaMaeC);
		tfnomeDaMaeC.setColumns(10);

		rdbtnPagante = new JRadioButton("Pagante");
		rdbtnPagante.setBounds(56, 404, 81, 23);
		add(rdbtnPagante);
		rdbtnPagante.addActionListener(new ActionButtons());

		rdbtnBolsista = new JRadioButton("Bolsista");
		rdbtnBolsista.setBounds(145, 404, 81, 23);
		add(rdbtnBolsista);
		rdbtnBolsista.addActionListener(new ActionButtons());

		chckbxParcial = new JCheckBox("Parcial");
		chckbxParcial.setBounds(66, 430, 71, 23);
		chckbxParcial.setEnabled(false);
		add(chckbxParcial);

		chckbxTotal = new JCheckBox("Total");
		chckbxTotal.setBounds(155, 430, 61, 23);
		chckbxTotal.setEnabled(false);
		add(chckbxTotal);

		JLabel lblPagamentoC = new JLabel("Pagamento");
		lblPagamentoC.setBounds(104, 382, 81, 14);
		add(lblPagamentoC);

		JLabel lblCursoC = new JLabel("Curso");
		lblCursoC.setBounds(304, 382, 46, 14);
		add(lblCursoC);

		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(230, 382, 11, 84);
		add(separator_11);

		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(411, 382, 11, 84);
		add(separator_12);

		JLabel lblSituacaoDoCursoC = new JLabel("Situacao Do Curso");
		lblSituacaoDoCursoC.setBounds(481, 382, 110, 14);
		add(lblSituacaoDoCursoC);

		rdbtnConcluido = new JRadioButton("Concluido");
		rdbtnConcluido.setBounds(429, 416, 86, 23);
		add(rdbtnConcluido);

		rdbtnTrancado = new JRadioButton("Trancado");
		rdbtnTrancado.setBounds(527, 416, 86, 23);
		add(rdbtnTrancado);

		rdbtnAndamento = new JRadioButton("Andamento");
		rdbtnAndamento.setBounds(478, 442, 97, 23);
		add(rdbtnAndamento);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(ViewCadastro.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		btnCadastrar.setBounds(527, 481, 117, 23);
		add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionButtons());

		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(358, 319, 274, 7);
		add(separator_10);

		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(47, 319, 261, 7);
		add(separator_13);

		JSeparator separator = new JSeparator();
		separator.setBounds(557, 96, 109, 7);
		add(separator);

		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(383, 96, 101, 7);
		add(separator_14);

		grupoCadastro = new ButtonGroup();
		grupoCadastro.add(rdbtnAluno);
		grupoCadastro.add(rdbtnProfessor);
		grupoCadastro.add(rdbtnSecretario);

		grupoPagamento = new ButtonGroup();
		grupoPagamento.add(rdbtnPagante);
		grupoPagamento.add(rdbtnBolsista);

		grupoCheckPagamento = new ButtonGroup();
		grupoCheckPagamento.add(chckbxParcial);
		grupoCheckPagamento.add(chckbxTotal);

		grupoCursoSelecionar = new ButtonGroup();
		grupoCursoSelecionar.add(rdbtnEletronica);
		grupoCursoSelecionar.add(rdbtnRedes);

		grupoSituacaoCurso = new ButtonGroup();
		grupoSituacaoCurso.add(rdbtnAndamento);
		grupoSituacaoCurso.add(rdbtnTrancado);
		grupoSituacaoCurso.add(rdbtnConcluido);
	}

	class ActionButtons implements ActionListener{
		public void actionPerformed(ActionEvent e){

			if(rdbtnAluno.isSelected()){

				chckbxMestrado.setEnabled(false);
				chckbxDoutorado.setEnabled(false);
				chckbxEletricidade.setEnabled(false);
				chckbxSeguranaDeRedes.setEnabled(false);
				chckbxEletronicaDigital.setEnabled(false);
				chckbxIngles.setEnabled(false);
				chckbxBancoDeDados.setEnabled(false);
				chckbxClp.setEnabled(false);

				tfnomeDaMaeC.setEnabled(true);
				rdbtnPagante.setEnabled(true);
				rdbtnBolsista.setEnabled(true);
				rdbtnEletronica.setEnabled(true);
				rdbtnRedes.setEnabled(true);
				rdbtnAndamento.setEnabled(true);
				rdbtnConcluido.setEnabled(true);
				rdbtnTrancado.setEnabled(true);

				if(e.getSource() == rdbtnBolsista){

					chckbxParcial.setEnabled(true);
					chckbxTotal.setEnabled(true);
				}else if(rdbtnPagante.isSelected()){
					
				
					chckbxTotal.setSelected(false);
					
					
					chckbxParcial.setEnabled(false);
					chckbxTotal.setEnabled(false);
					
					
				}

				if(rdbtnRedes.isSelected()){
					chckbxSeguranaDeRedes.setSelected(true);
					chckbxIngles.setSelected(true);
					chckbxBancoDeDados.setSelected(true);
					
					chckbxEletronicaDigital.setSelected(false);
					chckbxEletricidade.setSelected(false);
					chckbxClp.setSelected(false);
					
				}else if(rdbtnEletronica.isSelected()){
					chckbxEletronicaDigital.setSelected(true);
					chckbxEletricidade.setSelected(true);
					chckbxClp.setSelected(true);
					
					chckbxSeguranaDeRedes.setSelected(false);
					chckbxIngles.setSelected(false);
					chckbxBancoDeDados.setSelected(false);
				}

			}else if(rdbtnProfessor.isSelected()){

				chckbxMestrado.setEnabled(true);
				chckbxDoutorado.setEnabled(true);
				chckbxEletricidade.setEnabled(true);
				chckbxSeguranaDeRedes.setEnabled(true);
				chckbxEletronicaDigital.setEnabled(true);
				chckbxIngles.setEnabled(true);
				chckbxBancoDeDados.setEnabled(true);
				chckbxClp.setEnabled(true);

				tfnomeDaMaeC.setEnabled(false);
				rdbtnPagante.setEnabled(false);
				rdbtnBolsista.setEnabled(false);
				rdbtnEletronica.setEnabled(false);
				rdbtnRedes.setEnabled(false);
				rdbtnAndamento.setEnabled(false);
				rdbtnConcluido.setEnabled(false);
				rdbtnTrancado.setEnabled(false);
				chckbxParcial.setEnabled(false);
				chckbxTotal.setEnabled(false);
				
			}else if(rdbtnSecretario.isSelected()){

				chckbxMestrado.setEnabled(false);
				chckbxDoutorado.setEnabled(false);
				chckbxEletricidade.setEnabled(false);
				chckbxSeguranaDeRedes.setEnabled(false);
				chckbxEletronicaDigital.setEnabled(false);
				chckbxIngles.setEnabled(false);
				chckbxBancoDeDados.setEnabled(false);
				chckbxClp.setEnabled(false);

				tfnomeDaMaeC.setEnabled(false);
				rdbtnPagante.setEnabled(false);
				rdbtnBolsista.setEnabled(false);
				rdbtnEletronica.setEnabled(false);
				rdbtnRedes.setEnabled(false);
				rdbtnAndamento.setEnabled(false);
				rdbtnConcluido.setEnabled(false);
				rdbtnTrancado.setEnabled(false);
				chckbxParcial.setEnabled(false);
				chckbxTotal.setEnabled(false);
			}
			
			if(e.getSource()==btnCadastrar){
				
				dadosAluno.setNome(tfnomeC.getText());
				dadosAluno.setEndereco(tfenderecoC.getText());
				dadosAluno.setEmail(tfEmailC.getText());
				dadosAluno.setSenha(tfSenhaC.getText());
				dadosAluno.setCpf(Integer.parseInt(tfCpf.getText()));
				dadosAluno.setTelefone(Integer.parseInt(tfTelefone.getText()));
				dadosAluno.setNomeDaMae(tfnomeDaMaeC.getText());
				
				
				JOptionPane.showMessageDialog(null,"Dados Cadastrados Com Sucesso !!");
				
			 dadosSalvos.salvamento(dadosAluno);
				dadosSalvos.retornarAluno();
			}
			

		}
	}



}




