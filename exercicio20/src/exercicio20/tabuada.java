package exercicio20;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("digite um numero :");
		Integer numero = scanner.nextInt();
		
		exibir_tabuada (numero, 0);

		scanner.close();
	}
	static void exibir_tabuada( Integer numeros, Integer mutiplicador) {
		System.out.print(numeros + " X " + mutiplicador + "=" + (numeros*mutiplicador) );
		
		if(++mutiplicador <= 10) {
			exibir_tabuada(numeros,mutiplicador);
		}
	}
}
