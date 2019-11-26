package entidades;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import enums.StatusPagamento;

public class PagamentoBoleto extends Pagamento{
	private Date dataVencimento;
	private Date dataPagamento;
	private List<Categoria> categorias = new ArrayList<>();
	
	public PagamentoBoleto() {
		
	}
	
	public PagamentoBoleto(Integer id, StatusPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento, List<Categoria> categorias) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.categorias = categorias;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}	
	
}
