package funcoes3;

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int numero;
		int numero2;
		int funcao;
		
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println("Insira um número: ");
			numero = sc.nextInt();
			System.out.println("Insira outro número:");
			numero2 = sc.nextInt();
			
			funcao = imparPar(numero, numero2);
			
			System.out.println(funcao);
		}
		
	}
	
	public static int imparPar(int numero, int numero2) {
		int resultadoFinal = 0;
		int resultado1 = numero;
		int resultado2 = numero2;
		
		if(numero % 2 != 0) {
			resultadoFinal = resultadoFinal + numero2;
		}
		
		do {
			if(resultado1 > 1) {
				resultado1 = resultado1/2;
				resultado2 = resultado2 * 2;
				
				if(resultado1 % 2 != 0) {
					resultadoFinal = resultadoFinal + resultado2;
				}
				
			}
			
		} while(resultado1 > 1);
		
		return resultadoFinal;
		
	}

}


