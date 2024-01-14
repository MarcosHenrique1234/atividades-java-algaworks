package exercicio18;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("digite um numero : ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.print("escolha uma operação, (1 para +) ou (2 para -):");
		Integer operação = scanner.nextInt();
		
		System.out.print("digite um numero : ");
		double segundoNumero = scanner.nextDouble();
		
		if(operação.equals(1)) {
			//System.out.print("o resuldado da soma é :" +  );
			//adição();
		}
		adição();
		
		
		
		
		scanner.close();

	};

	static double adição (double primeiroNumero, double segundoNumero) {
		return primeiroNumero + segundoNumero ;
	}
	static double subtração (double primeiroNumero, double segundoNumero) {
		return primeiroNumero - segundoNumero ;
	}
	
}

	//static double adiçao (double primeiroNumero, double segundoNumero) {
	//	System.out.println( primeiroNumero + segundoNumero );
