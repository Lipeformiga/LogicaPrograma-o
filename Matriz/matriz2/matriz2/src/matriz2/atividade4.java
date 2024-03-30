package matriz2;

import java.util.Scanner;

public class atividade4 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [5][5];
		int matriz2[][] = new int [5][5];

		for (int cont = 0; cont < 5; cont++) {
			for (int cont2 = 0; cont2 < 5; cont2++) {
				System.out.println("escreva os números da matriz: ");
				matriz [cont][cont2] = sc.nextInt();
				matriz2 [cont][cont2] = matriz [cont][cont2] * matriz [cont][cont2] * matriz [cont][cont2];
			}
		}
		for (int cont3 = 0; cont3 < 5; cont3++) {
			System.out.println();
			for (int cont4 = 0; cont4 < 5; cont4++) {
				System.out.print(matriz2[cont3][cont4]+ " ");
			}
		}
		sc.close();
	}
}