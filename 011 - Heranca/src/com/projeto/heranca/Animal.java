package com.projeto.heranca;

public class Animal {

	private String tamanho;
	private double peso;
	private String cor;
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void correr(){
		
		System.out.println("Correr como Animal");
	}
	
}
