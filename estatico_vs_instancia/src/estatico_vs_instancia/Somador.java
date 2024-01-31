package estatico_vs_instancia;

public class Somador {

	String nome;
	int valor_instancia = 0;
	static int valor_estatico = 0;
	
	void somar() {
		valor_instancia++;
		valor_estatico++;
	}
	
	void imprimir() {
		System.out.println("O Somador " + nome + ": instancia = " + valor_instancia + " e estatico = " + valor_estatico);
	}
}
