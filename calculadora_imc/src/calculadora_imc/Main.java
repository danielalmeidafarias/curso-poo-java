package calculadora_imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		double altura;
		double resultado;
		String diagnostico;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora de IMC");
		System.out.println("Digite seu peso(em gramas)");
		peso = scanner.nextDouble();
		System.out.println("Agora digite sua altura(em metros)");
		altura = scanner.nextDouble();
		
		Calculadora calculadora = new Calculadora(peso, altura);
		
		resultado = calculadora.calcularIMC(peso, altura);
		diagnostico = calculadora.diagostico(resultado);
		
		System.out.println("Seu imc é de " + resultado);
		System.out.println("Diagnóstico: " + diagnostico);
		
	}

}
