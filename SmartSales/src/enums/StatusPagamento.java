package enums;

public enum StatusPagamento {
	PENDENTE(1), QUITADO(2), CANCELADO(3);
	
	int codigo;
	
	StatusPagamento(int cod){
		this.codigo = cod;
	}
}
