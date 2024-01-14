package exercicio11;

import java.util.Scanner;

public class bonusdoFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double metadaEmpresa = 36000;
		double mediaSalarial = 1200;
		double aumentodeOitentaPorcento = (mediaSalarial*80) / 100;

		System.out.print("informe o faturamento da empresa no ano que passou :");
		double FaturamentoReal = scanner.nextDouble();
		
		boolean metaAtingida = FaturamentoReal >=  metadaEmpresa;
		boolean oitenta_porcento_da_meta = FaturamentoReal >= (metadaEmpresa*80) / 100;
		boolean meta_não_alcançada = FaturamentoReal < (metadaEmpresa*80) / 100;
		
		if(metaAtingida) {
			System.out.print("O funcionario receberá um bonus de :" + mediaSalarial +"R$");
		}
		else if(oitenta_porcento_da_meta) {
			System.out.print("O funcionario receberá um bonus de :" + aumentodeOitentaPorcento +"R$");
		}
		else if(meta_não_alcançada) {
			System.out.print("A empresa não bateu a meta.");
		}
		scanner.close();

	}

}
