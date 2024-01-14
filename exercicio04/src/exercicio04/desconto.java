package exercicio04;
//Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
//Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe o preço do produto :");
		Double PreçoProduto = scanner.nextDouble();
		
		System.out.print("informe quantas unidades do produto :");
		Double unidades = scanner.nextDouble();
		
		Double valorSubtotal = PreçoProduto * unidades;
		
		
		boolean descontoporunidade = unidades >=10;
		
		
		Double percentualDesconto = 0.0;
		
		if(descontoporunidade) {percentualDesconto = 10.0;
		}
		Double desconto = valorSubtotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor total a pagar: " + valorTotalComDesconto);
		
		
		scanner.close();

	}

}
