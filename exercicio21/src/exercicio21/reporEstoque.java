package exercicio21;



public class reporEstoque {

	public static void main(String[] args) {
		produto produto = new produto();
		produto.nome = "Iphone X";
		produto.quantidade = 15;
		
		
		System.out.print("o produto " + produto.nome + "precisa repor o estoque ? " + Necessario_Repor(produto));
	}

	
	static boolean Necessario_Repor(produto produto) {
		if(produto.quantidade < produto.quantidadeMinima) {
			return true;
		}
		return false;
		
	}
}
