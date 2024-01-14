package exercicio05;

import java.util.Scanner;

	//Volte no exercício 03 desse capítulo e transforme o valor 70 em uma constante.

public class constante {

	static final int NotadeCorte = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		
		System.out.print("informe a nota do aluno :");
		double NotaAluno = scanner.nextDouble();
		
		Boolean NotadeMedia = NotaAluno >= NotadeCorte;
		
		if (NotadeMedia) {
			System.out.print("Sim! o(a) aluno(a) passou.");
		}
		else {
			System.out.print("Não! o(a) aluno(a) não passou.");

		scanner.close();
		}
	}

}
