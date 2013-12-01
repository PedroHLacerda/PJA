package repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Pessoa;
import model.Professor;
import model.Secretario;

public class SalvarDados {
	
	
	Professor dadosProfessor = new Professor();
	Secretario dadosSecretario = new Secretario();
	Pessoa dadosPe = new Pessoa();
	
	List<Pessoa>dados = new ArrayList<Pessoa>();
	List<Aluno>dadosA = new ArrayList<Aluno>();
	List<Professor>dadosP = new ArrayList<Professor>();
	List<Secretario>dadosS = new ArrayList<Secretario>();
	

	
	public void salvamento(Aluno aluno){
		
	
		dadosA.add(aluno);
		
		}
	
	
	public void  retornarAluno(){
		
	  JOptionPane.showMessageDialog(null," "+dadosA.isEmpty());
	  JOptionPane.showMessageDialog(null," "+dadosA.size());
		for(Aluno aluno : dadosA){
			JOptionPane.showMessageDialog(null,"dadosA:\n "+aluno);
		}
		
	}
	
	

	
}
