package com.projeto.conta;

public class Conta {
	
	private int numeroConta;
	private double saldo = 100;
	
	protected String minhaPropriedadeProtegida;
	
	public void depositar(double valorDepositar){
		
		this.saldo = saldo + valorDepositar;
	}
	
	public void sacar(double valorSacar){
		
		this.saldo = saldo - valorSacar; 
	}

	public double retonaSaldo(){
		return this.saldo;
	}
	
}
