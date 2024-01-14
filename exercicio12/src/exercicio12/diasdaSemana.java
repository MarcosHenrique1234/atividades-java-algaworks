package exercicio12;
//Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
// Dependendo do número informado você deve imprimir o nome desse dia.
//Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.

import java.util.Scanner;

public class diasdaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe um numero equivalente a um dia da semana :");
		int dia = scanner.nextInt();
		
		switch (dia) {
		case 1: System.out.print("Domingo");
			break;
		case 2: System.out.print("Segunda-feira");
			break;
		case 3: System.out.print("Terça-feira");
			break;
		case 4: System.out.print("Quarta-feira");
		 	break;
		case 5: System.out.print("Quinta-feira");
			break;
		case 6: System.out.print("Sexta-feira");
			break;
		case 7: System.out.print("Sábado");
			break;
		
		default: 
			System.err.println("Digite um dia válido!");
			System.exit(1);
			
		}
		scanner.close();
	}

}
