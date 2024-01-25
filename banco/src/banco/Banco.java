package banco;

public class Banco {
	Conta criarConta(Cliente cliente, String senha) {
		Conta nova_conta = new Conta(cliente, senha);
		return nova_conta;
	}
	
	Conta acessarConta(int numero_conta, String senha) {
		Conta conta = new Conta(numero_conta, senha);
		return conta;
	}
}
