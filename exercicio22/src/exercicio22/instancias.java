package exercicio22;



public class instancias {

	public static void main(String[] args) {
		
			produto produto = new produto();
			produto.nome = "Iphone X";
			produto.unidades = 15;
			
			
			System.out.print("o produto " + produto.nome + "precisa repor o estoque ? " + produto.Necessario_Repor(produto));
		}


	}


