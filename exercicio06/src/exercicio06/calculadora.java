package exercicio06;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("digite um numero :");
		double PrimeiroNumero = scanner.nextDouble();
		
		System.out.print("digite a operação, 1 adição, 2 subtração, 3 multiplicação, 4 divisão:");
		Integer operação = scanner.nextInt();
		
		System.out.print("digite um numero :");
		double SegundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (operação.equals(1)) {
			resultado = PrimeiroNumero + SegundoNumero;
		}
		
		if (operação.equals(2)) {
			resultado = PrimeiroNumero - SegundoNumero;			
		}
		
		if (operação.equals(3)) {
			resultado = PrimeiroNumero / SegundoNumero;			
		}
		
		if (operação.equals(4)) {
			resultado = PrimeiroNumero / SegundoNumero;			
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
		
	}

}
