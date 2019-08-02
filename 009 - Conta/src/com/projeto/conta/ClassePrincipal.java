package com.projeto.conta;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.depositar(100);
		conta.sacar(50);
		
		System.out.println(conta.retonaSaldo());
		
		conta.minhaPropriedadeProtegida = "Fabricio";
		
		System.out.println(conta.minhaPropriedadeProtegida);

	}

}
