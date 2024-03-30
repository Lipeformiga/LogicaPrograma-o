package funcoes3;

import java.util.Scanner;

public class atividade10 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int peso;
		double altura;
		
		System.out.println("Escreva qual o seu peso em Kg: ");
		peso = sc.nextInt();
		
		System.out.println("Escreva a sua altura em Mestros: ");
		altura  =sc.nextDouble();
		
		funcao(peso,altura);
	}
	public static double funcao(int peso, double altura) {
		
		double imc = peso / (altura * altura);
		
		if (imc < 20 ) {
			System.out.println("MAGRO");
		}
		else if ( imc >=20 && imc <= 24 ) {
			System.out.println("NORMAL");
		}
		else if ( imc >24 && imc <= 29 ) {
			System.out.println("ACIMA DO PESO");
		}
		else if ( imc >29 && imc <= 34 ) {
			System.out.println("OBESO");
		}
		else {
			System.out.println("MUITO OBESO");
		}
		return imc;
	}

}
