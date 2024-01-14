package exercicio23;

public class pedido {
	Integer codigo;
	double subtotal;
	double desconto;
	
	double getTotal() {
		
		return subtotal - desconto;
	}
	void setTotal() {
		
	}
	Integer getCodigo() {
		return codigo;
	}

	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	Double getSubtotal() {
		return subtotal;
	}

	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	Double getDesconto() {
		return desconto;
	}

	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}	
}