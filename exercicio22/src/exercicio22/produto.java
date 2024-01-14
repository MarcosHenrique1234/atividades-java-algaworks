package exercicio22;


public class produto {
	String nome ;
	Integer unidades ;

	static final Integer quantidadeMinima = 10;
	
	boolean Necessario_Repor(produto produto) {
		if(produto.unidades < produto.quantidadeMinima) {
			return true;
		}
		return false;
}
}
