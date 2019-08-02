package com.projeto.loops;

public class LoopsPrincipal {

	public static void main(String[] args) {
		
		System.out.println("While");
		int numero = 0;
		
		while(numero < 5){
			
			System.out.println("loop: " + numero );
			numero++;
			
		}
		
		System.out.println("");
		
		System.out.println("Do While");
		numero = 0;
		
		do{
			
			System.out.println("loop: " + numero );
			numero++;
			
		}while(numero < 5);
		
		System.out.println("");
		
		System.out.println("For");
		numero = 5;
		
		for (int i = 0; i < numero; i++) {
			
			System.out.println("loop: " + i );
		}

	}

}
