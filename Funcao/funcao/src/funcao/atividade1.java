package funcao;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor; 
		int moeda;
		
		System.out.println("qual valor você tem em reais");
		valor = sc.nextInt();
		System.out.println("qual mode você quer converter 1 pra USD 2 para JPN");
		moeda = sc.nextInt();
		
		double usd = 0.30, jpn = 30.0;
		
		if ( moeda == 1 ) {
			converter(valor,usd );
		}
		else if (moeda == 2) {
			converter2(valor,jpn);
		}
	}
	public static void converter(double a, double b) {
		double resultado;
		resultado =  a * b;
		System.out.println(resultado);
	}
	public static void converter2(double a, double b) {
		double resultado;
		resultado =  a * b;
		System.out.println(resultado);
	}
}