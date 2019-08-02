package com.projeto.contrutores;

public class Conta {

	private int numeroConta;
	private double saldo;
	
	public Conta(int nConta){
		
		this.numeroConta = nConta;
		
	}
	
	public void imprimi(){
		
		System.out.println(this.numeroConta);
	}
	
}
