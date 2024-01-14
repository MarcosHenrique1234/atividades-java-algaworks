package exercicio07;
//Crie um programa que receba o valor de um produto e exiba o valor final da compra.
// Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.

//Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.


import java.util.Scanner;

public class desconto {

	//static final int frete = 15;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("digite o valor do produto :");
		Double preço = scanner.nextDouble();
		
		boolean necessarioFrete = preço < 100;
		
		double preçoFinal = preço;
		
		if(necessarioFrete) {
			preçoFinal += 15; 
			
		}
		
		System.out.print("preço final :" + preçoFinal);
		
		scanner.close();

	}

}
