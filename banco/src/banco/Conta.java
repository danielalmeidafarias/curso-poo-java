package banco;

public class Conta {

	public Conta(Cliente cliente, String senha) {
		this.cliente = cliente;
		this.senha = senha;
		// Construtor de criaçao de conta
		// Em um caso real, esse metodo adicionaria um novo usuario no banco de dados	
	};
	
	public Conta(int numero_conta, String senha) {
		this.numero_conta = numero_conta;
		this.senha = senha;
		// Construtor de acesso a conta
		// Em um caso real haveria acesso ao banco de dados
		// Apos isso os dados seriao verificados e adicionados ao objeto
	};
	
	int GetNumeroConta(Cliente cliente, String senha) {
		return this.numero_conta;
	}
	
	int getSaldo(int numero_conta, String senha) {
		return this.saldo_conta;
	}
	
	void mudarSenha(String senha, String nova_senha) {
		this.senha = nova_senha;
	}
	
	Cliente cliente;
	String senha;
	int numero_conta;
	int saldo_conta;
}
