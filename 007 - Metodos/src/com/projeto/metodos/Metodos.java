package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		
		int resultado = multiplicar(2,9);
		
		System.out.println(resultado);

	}
	
	public static void meuMetodo(){
		
		System.out.println("Esse é meu metodo");
	}
	
	public static int multiplicar(int numero1, int numero2){
		
		return(numero1 * numero2);
	}

}
