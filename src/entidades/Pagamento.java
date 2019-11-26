package entidades;

import enums.StatusPagamento;

public class Pagamento {
	private Integer id;
	private StatusPagamento estado;
	private Pedido pedido;
	
	public Pagamento() {
		
	}
	
	
	public Pagamento(Integer id, StatusPagamento estado, Pedido pedido) {
		this.id = id;
		this.estado = estado;
		this.pedido = pedido;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public StatusPagamento getEstado() {
		return estado;
	}
	public void setEstado(StatusPagamento estado) {
		this.estado = estado;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
