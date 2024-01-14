package exercicio15;

//Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
// Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] Atividades = new String[6];
		
		for(int i = 1; i < Atividades.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			Atividades[i] = scanner.nextLine();
		}
		
		
		System.out.println("Suas tarefas são: ");
		for(int i = 1; i < Atividades.length; i++) {
			System.out.println(i + ": " + Atividades[i]);
		}
		
		scanner.close();
	

	}

}
