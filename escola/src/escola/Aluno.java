package escola;

public class Aluno {
	int bim1;
	int bim2;
	int bim3;
	int bim4;
	
	public int media() {
		int media = 0;
		
		media += this.bim1;
		media += this.bim2;
		media += this.bim3;
		media += this.bim4;
		
		return media / 4;
	}
	
	public boolean passouDeAno() {
		if(media() >= 60)
			return true;
		return false;
	}
}
