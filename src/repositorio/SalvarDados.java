package repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Pessoa;
import model.Professor;
import model.Secretario;

public class SalvarDados {
	Aluno dadosAluno = new Aluno();
	Professor dadosProfessor = new Professor();
	Secretario dadosSecretario = new Secretario();
	Pessoa dadosPe = new Pessoa();

	
	List<Pessoa>dados = new ArrayList<Pessoa>();
	List<String>dadosA = new ArrayList<String>();
	List<Professor>dadosP = new ArrayList<Professor>();
	List<Secretario>dadosS = new ArrayList<Secretario>();
	
	public void salvamento(){
		
		
		dadosA.add(dadosAluno.getNome());
		}
	
	
	public void  retornarAluno(){
		JOptionPane.showMessageDialog(null,"dadosA :"+dadosA);
		
	}
	
	
//	public String toString() {
//		
//		return dadosPe.getNome()+dadosPe.getEmail()+dadosPe.getSenha()+dadosPe.getEndereco()+dadosPe.getCargo()+dadosPe.getTelefone()+
//				dadosPe.getCpf();
//	}
	
}
