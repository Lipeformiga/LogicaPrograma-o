package matriz2;

import java.util.Scanner;

public class atividade3 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M[][] = new int [5][5];
		int somaL = 0, somaC = 0, somaD = 0, somaS = 0;
		
		for (int cont = 0; cont < 5; cont++) {
			for (int cont2 = 0; cont2 < 5; cont2++) {
				System.out.println("escreva os números da matriz: "+ "["+(cont+1)+"]"+"["+(cont2+1)+"]");
				M [cont][cont2] = sc.nextInt();
				
				if ( cont == 3 ) {
					somaL += M[cont][cont2];
				}
				if ( cont2 == 1 ) {
					somaC += M[cont][cont2];
				}
				if ( cont == cont2 ) {
					somaD += M[cont][cont2];
				}
				if ( cont + cont2 == 4) {
					somaS += M[cont][cont2];
				}
			}
		}
		System.out.println("A soma da linha 4 é: "+ somaL);
		System.out.println("A soma da coluna 2 é: "+ somaC);
		System.out.println("A soma da diagonal principal é: "+ somaD);
		System.out.println("A soma da diagonal secundaria é: "+ somaS);
		
		for (int cont3 = 0; cont3 < 5; cont3++) {
			System.out.println();
			for (int cont4 = 0; cont4 < 5; cont4++) {
				System.out.print(M[cont3][cont4]+ " ");
			}
		}
		sc.close();
	}
}