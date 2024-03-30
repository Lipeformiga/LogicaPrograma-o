package lista4;

import java.util.Scanner;

public class atividade4 {
	
	static char resposta;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Escreva a sua nota: ");
		nota = sc.nextDouble();

		x(nota);
		
		System.out.println(resposta); 
	}
	public static char x(double nota) {
		
		if( nota >= 9 ) {
			resposta = 'A';
		}
		else if ( nota >= 8  ) {
			resposta = 'B';
		}
		else if ( nota >= 7  ) {
			resposta = 'C';
		}
		else if ( nota >= 6 ) {
			resposta = 'D';
		}
		else {
			resposta = 'E';
		}
		return resposta;
	}
}
