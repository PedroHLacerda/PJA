package model;

import repositorio.SalvarDados;

public class Aluno extends Pessoa {
	
  private String nomeDaMae;
  private String curso;
  private String situacaoDoCurso;
  private String modoPagamento;
	
  public Aluno(){
	  
  }
  
	 public Aluno(String nome, String email, String senha, String endereco, String cargo, long telefone, long cpf, String nomeDaMae,
			 	  String curso, String situacaoDoCurso,String modoPagamento ){
		 super(nome, email, senha,  endereco, cargo, telefone, cpf);
		 
		 this.nomeDaMae = nomeDaMae;
		 this.curso = curso;
		 this.situacaoDoCurso = situacaoDoCurso;
		 this.modoPagamento = modoPagamento;
	 }

	 
	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSituacaoDoCurso() {
		return situacaoDoCurso;
	}

	public void setSituacaoDoCurso(String situacaoDoCurso) {
		this.situacaoDoCurso = situacaoDoCurso;
	}

	public String getModoPagamento() {
		return modoPagamento;
	}

	public void setModoPagamento(String modoPagamento) {
		this.modoPagamento = modoPagamento;
	}
	 
	 
	 
	
	public String toString() {
		
		return "nome: "+getNome()+"\n email: "+getEmail()+"\n senha: "+getSenha()+"\n Endereco: "+getEndereco()+"\n cargo: "+getCargo()+"\n telefone: "+getTelefone()+
				"\n cpf: "+getCpf();
	}
	 
	 
	
	 
}
