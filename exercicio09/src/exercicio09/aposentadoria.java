package exercicio09;

//Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência, depois verifique se ela pode aposentar ou não.
//Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
// Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.

import java.util.Scanner;

public class aposentadoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("informe sua idade :");
		double idade = scanner.nextDouble();
		
		System.out.print("informe seu tempo de contribuição :");
		double contribuição = scanner.nextDouble();
		
		boolean Pode_se_Aposentar = idade >= 55 && contribuição >= 25;
		
		if(Pode_se_Aposentar) {
			System.out.print("Sim! pode se aposentar.");
		}
		else {
			System.out.print("Não! Infelizmente, não pode se aposentar.");
		}
		
		

	}

}
