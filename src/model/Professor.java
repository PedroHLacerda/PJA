package model;

public class Professor extends Pessoa{

	private String graduacao;
	private String mestrado;
	private String discipMinistrada;
	
	public Professor(){
		
	}
	
	public Professor(String nome, String email, String senha, String endereco, String cargo, long telefone, long cpf, String graduacao, 
			String mestrado, String discipMinistrada){
		super(nome, email, senha,  endereco, cargo, telefone, cpf);
		
		this.graduacao = graduacao;
		this.mestrado = mestrado;
		this.discipMinistrada = discipMinistrada;
		
		
	}

	
	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getMestrado() {
		return mestrado;
	}

	public void setMestrado(String mestrado) {
		this.mestrado = mestrado;
	}

	public String getDiscipMinistrada() {
		return discipMinistrada;
	}

	public void setDiscipMinistrada(String discipMinistrada) {
		this.discipMinistrada = discipMinistrada;
	}

	
	
	
	
}
