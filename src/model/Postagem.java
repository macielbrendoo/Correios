package controller;

import model.Enderecamento;

public class Postagem {
	
	private Enderecamento remetente;
	private Enderecamento destinatario;
	
	public Postagem(Enderecamento remetente, Enderecamento destinatario) {
		this.remetente = remetente;
		this.destinatario = destinatario;
	}
	public Enderecamento getRemetente() {
		return remetente;
	}
	public void setRemetente(Enderecamento remetente) {
		this.remetente = remetente;
	}
	public Enderecamento getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Enderecamento destinatario) {
		this.destinatario = destinatario;
	}
	
	public int calcDistancia() {
		return remetente.getCep() - destinatario.getCep();
	}
	

}
