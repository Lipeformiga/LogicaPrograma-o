package matriz2;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz [][] = new int [5][5];
		int y = 0, soma = 0, media = 0;
		
		for (int cont = 0; cont < 5; cont++) {
			for (int cont2 = 0; cont2 < 5; cont2++) {
				System.out.println("escreva os números da matriz: ");
				matriz [cont][cont2] = sc.nextInt();
			}
		}
		for (int cont3 = 0; cont3 < 5; cont3++) {
			for (int cont4 = 0; cont4 < 5; cont4++) {
				if ( matriz [cont3][cont4]  %2 == 0) {
					y++;
					soma = soma + matriz[cont3][cont4];
				}
			}
		}
		media = soma / y;
		System.out.println("A média é "+ media);
		sc.close();
	}
}