package funçoes;

import java.util.Scanner;

public class atividade6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mes;
		
		System.out.println("escreva o número do mês:");
		mes = sc.nextInt();
		
		funcao(mes);
	}
	public static int funcao(int mes) {
		if ( mes == 1 ) {
			System.out.println("janeiro");
		}
		else if ( mes == 2 ) {
			System.out.println("Fevereiro");
		}
		else if ( mes == 3 ) {
			System.out.println("março");
		}
		else if ( mes == 4 ) {
			System.out.println("Abril");
		}
		else if ( mes == 5 ) {
			System.out.println("maio");
		}
		else if ( mes == 6) {
			System.out.println("Junho");
		}
		else if ( mes == 7 ) {
			System.out.println("Julho");
		}
		else if ( mes == 8 ) {
			System.out.println("agosto");
		}
		else if ( mes == 9 ) {
			System.out.println("setembro");
		}
		else if ( mes == 10 ) {
			System.out.println("outubro");
		}
		else if ( mes == 11 ) {
			System.out.println("novembro");
		}
		else if ( mes == 12 ) {
			System.out.println("dezembro");
		}
		else {
			System.out.println("Mês inexistente");
		}
		return mes;
	}
}