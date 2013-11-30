package model;

public class Pessoa {

	private String nome;
	private String email;
	private String senha;
	private String endereco;
	private String cargo;
	private long telefone;
	private long cpf;

	public Pessoa(){
		this.nome = "";
		this.email = "";
		this.senha = "";
		this.endereco = "";
		this.cargo = "";
		this.telefone = 0;
		this.cpf = 0;


	}
	public Pessoa(String nome, String email, String senha, String endereco, String cargo,long telefone, long cpf){
		setNome(nome);
		setCpf(cpf);
		setSenha(senha);
		setEndereco(endereco);
		setCargo(cargo);
		setTelefone(telefone);
		setCpf(cpf);

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}








}
