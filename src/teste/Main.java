package teste;

import entidades.*;
import enums.TipoCliente;

public class Main {
	Cliente cl1 = new Cliente(1, "Zezin da Chica Boa", "jose@gmail.com", "65314725896", PESSOAFISICA);
	Estado est1 = new Estado(1, "Ceara");
	Cidade cd1 = new Cidade(1, "Fortaleza", est1);
	Endereco end1 = new Endereco(1, "Rua 3 de maio", "235", "Casa 3A", "Bela Vista", "60440580", cl1, cd1);
}
