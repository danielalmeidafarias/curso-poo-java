package pontuacao;

public class CalculadoraBonus {

	public int bonusDoDia = 1;
	
	public int bonus(Usuario usuario) {
		int multiplicador = bonusDoDia;
		if(usuario.isVip) {
			multiplicador *= 5;	
		}
			
		
		return multiplicador;
	}
	
}
