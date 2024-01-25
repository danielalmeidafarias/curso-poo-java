package calculadora_imc;

public class Calculadora {
	public Calculadora(double peso, double altura) {
		this.altura = altura;
		this.peso = peso;
	}
	
	double peso;
	double altura;
	
	double calcularIMC(double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	};
	
	String diagostico(double imc) {
		
		String resultado;
		if(imc < 16) {
			resultado = "Baixo peso muito grave";
		} else if(imc > 16 && imc < 16.99) {
			resultado = "Baixo peso grave";
		} else if(imc > 17  && imc < 18.49) {
			resultado = "Baixo peso";
		} else if(imc > 18.50  && imc < 24.99  ) {
			resultado = "Peso normal";
		} else if(imc > 25  && imc < 29.99 ) {
			resultado = "Sobrepeso";
		} else if(imc > 30  && imc < 34.99) {
			resultado = "Obesidade grau I";
		} else if(imc > 35 && imc < 39.99) {
			resultado = "Obesidade grau II";
		} else {
			resultado = "Obesidade grau III (obesidade mórbida)";
		}
		
		return resultado;
	};
}
