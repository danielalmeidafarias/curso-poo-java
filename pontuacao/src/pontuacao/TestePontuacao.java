package pontuacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePontuacao {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Daniel";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}
	
	@Test
	void pontosCriarVipTopico() {
		Usuario u = new Usuario();
		u.nome = "Daniel";
		u.isVip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}
}
