package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {
	private Integer id;
	private Date instante;
	private List<Produto> itens = new ArrayList<>();
	private Pagamento pagamento;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, Date instante, Pagamento pagamento) {
		this.id = id;
		this.instante = instante;
		this.pagamento = pagamento;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInstante() {
		return instante;
	}
	public void setInstante(Date instante) {
		this.instante = instante;
	}
	public List<Produto> getItens() {
		return itens;
	}
	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
}
