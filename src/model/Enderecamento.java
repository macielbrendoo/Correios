package model;

public class Enderecamento {
	
	private String nome;
	private int cep;
	private int numero;
	
	public Enderecamento(String nome, int cep, int numero) {
		this.nome = nome;
		this.cep = cep;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
