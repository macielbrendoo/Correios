package model;

public class Dimensao {

	double altura;
	double largura;
	double profundidade;

	public Dimensao(double altura, double largura, double profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	public double calcVolume() {
		return altura*largura*profundidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

}
