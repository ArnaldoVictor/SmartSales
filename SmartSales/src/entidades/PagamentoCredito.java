package entidades;

import enums.StatusPagamento;

public class PagamentoCredito extends Pagamento {
	private Integer parcelas;
	
	public PagamentoCredito() {
		
	}
	
	public PagamentoCredito(Integer id, StatusPagamento estado, Pedido pedido, Integer parcelas) {
		super(id, estado, pedido);
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}
