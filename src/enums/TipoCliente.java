package enums;

public enum TipoCliente {
	PESSOAFISICA(1), PESSOAJURIDICA(2);
	
	int codigo;
	
	TipoCliente(int cod) {
		this.codigo = cod;
	}
}
