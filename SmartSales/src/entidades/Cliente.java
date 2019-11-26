package entidades;

import java.util.List;
import java.util.ArrayList;
import enums.TipoCliente;

public class Cliente {
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	private List<String> telefones = new ArrayList<>();
	private List<String> enderecos = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(int id, String nome, String email, String cpfOuCnpj, TipoCliente tipo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo;
		
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}
	public List<String> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<String> enderecos) {
		this.enderecos = enderecos;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if(this.getId() == ((Cliente)o).getId()) {
			result = true;
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public String toString() {
	  return "ID:"+this.id+"\nNome:"+this.nome+"CPF:"+this.cpfOuCnpj;
	}
}
