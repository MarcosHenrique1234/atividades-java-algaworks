package exercicio08;

import java.util.Scanner;

public class gastos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double GastoMensal =0.0;
		
		System.out.print("informe o valor da conta de luz :");
		GastoMensal += scanner.nextDouble();
		
		System.out.print("informe o valor da conta de água :");
		GastoMensal += scanner.nextDouble();
		
		System.out.print("informe o valor da conta de telefone :");
		GastoMensal += scanner.nextDouble();
		
		System.out.print("informe o valor da conta da escola :");
		GastoMensal += scanner.nextDouble();
		
		System.out.print("informe o valor da fatura do Cartão :");
		GastoMensal += scanner.nextDouble();
		
		System.out.print("informe o valor da conta de mercado :");
		GastoMensal += scanner.nextDouble();
		
		
		System.out.print("O gasto total foi de: " + GastoMensal);
		
		scanner.close();
		
		

	}

}
