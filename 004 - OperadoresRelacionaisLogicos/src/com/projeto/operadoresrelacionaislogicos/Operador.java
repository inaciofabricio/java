package com.projeto.operadoresrelacionaislogicos;

public class Operador {

	public static void main(String[] args) {
		
		boolean resultado;
		
		//Igual (==) 
		resultado = 5 == 5;
		System.out.println(resultado);
		
		//Diferente (!=)
		resultado = 5 != 6;
		System.out.println(resultado);

		//Maior (>)
		resultado = 5 > 6;
		System.out.println(resultado);

		//Menor (<)
		resultado = 5 < 6;
		System.out.println(resultado);

		//Maior/Igual (>=)
		resultado = 5 >= 6;
		System.out.println(resultado);
		

		//Menor/Igual (<=)
		resultado = 5 <= 6;
		System.out.println(resultado);

		//e (&&)
		resultado = true && true;
		System.out.println(resultado);
		
		//ou (||)
		resultado = true || true;
		System.out.println(resultado);
		
		
	}

}
