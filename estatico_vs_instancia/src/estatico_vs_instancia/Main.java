package estatico_vs_instancia;

public class Main {
	public static void main(String[] args) {
		Somador s1 = new Somador();
		s1.nome = "somador1";
				
		Somador s2 = new Somador();
		s2.nome = "somador2";
						
		Somador s3 = new Somador();
		s3.nome = "somador3";
		
		for (int i=0; i<3; i++) {
			s1.somar();
			s2.somar();
			s3.somar();
		}
		
		s1.imprimir();
		s2.imprimir();
		s3.imprimir();
	}
}
