package funcoes3;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char [] letras = new char [5];
		boolean funcao = false;
		
		for(int cont = 0; cont < 5; cont++) {
			System.out.println("Insira uma letra: ");
			letras[cont] = sc.next().charAt(0);
			funcao = verificação(letras[cont]);	
		}
		System.out.println("Os números são todos minúsculos? "+funcao);
	}
	public static boolean verificação(char letras) {
		
		boolean verifica = false;
	
		for(int cont = 0; cont <= 5; cont++) {
			if ((letras >= 'a' && letras <= 'z') || letras == 'ç') {
				verifica = true;
			} else {
				verifica = false;
			}
		}
		return verifica;
	}
}