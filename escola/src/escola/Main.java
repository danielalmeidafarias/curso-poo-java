package escola;

public class Main {

	public static void main(String[] args) {
		Aluno daniel = new Aluno();
		
		daniel.bim1 = 30;
		daniel.bim2 = 50;
		daniel.bim3 = 70;
		daniel.bim4 = 50;
		
		System.out.println(daniel.media());
		System.out.println(daniel.passouDeAno());
	}

}
