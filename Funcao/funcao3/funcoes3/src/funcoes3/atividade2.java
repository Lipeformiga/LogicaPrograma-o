package funcoes3;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String [] args) {
		
		char cadeia1 [] = new char [5];
		char cadeia2 [] = new char [5];
		
		boolean funcao = false;
		
		Scanner sc = new Scanner(System.in);
		
		
		for ( int cont = 0; cont < 5; cont++ ) {
			System.out.println("Escreva as letras da cadeia1: ");
			cadeia1[cont] = sc.next().charAt(0);
		}
		for ( int cont = 0; cont < 5; cont++ ) {
			System.out.println("Escreva as letras da cadeia2: ");
			cadeia2[cont] = sc.next().charAt(0);
			funcao = verificacao (cadeia1[cont], cadeia2[cont]);
		}	
		System.out.println("são iguais: "+funcao);
	}
	public static boolean verificacao(char cadeia1, char cadeia2) {
		
		boolean verifica = false;
		
		if (cadeia1 == cadeia2) {
			verifica = true;
		}
		return verifica;
	}
}