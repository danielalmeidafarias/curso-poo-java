package banco;

public class Cliente {
	void constructor(String nome, int documento, int idade) {
		this.nome = nome;
		this.documento = documento;
		this.idade = idade;
	}

	String nome;
	int documento;
	int idade;
}
