package exercicio23;

public class dadosPedido {

	public static void main(String[] args) {
		pedido pedido = new pedido();
		pedido.codigo = 2;
		pedido.subtotal = 150;
		pedido.desconto = 5;
		
		System.out.print("Código :" +  pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + 
				", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());

	}

}
