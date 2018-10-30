package controller;

import model.Dimensao;
import enums.Tipo;

public class CalculoFrete {
	int distancia;
	int peso;
	Dimensao dimensao;
	Tipo tipo;
	double fatormult;

	public CalculoFrete(int distancia, int peso, Dimensao dimensao, Tipo tipo) {
		this.distancia = distancia;
		this.peso = peso;
		this.dimensao = dimensao;
		this.tipo = tipo;
		this.fatormult = fatormult;
	}

	public double calcularFrete() {
		if (tipo == tipo.NORMAL) {
			fatormult = 0.5;
			
		} else {
			fatormult = 0.7;
		}
		return (distancia+peso+dimensao.calcVolume())*fatormult;
	}

}
