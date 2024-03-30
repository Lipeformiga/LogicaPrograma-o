package matriz2;

import java.util.Scanner;

public class atividade6 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [7][8];
		
		for (int cont = 0; cont < 7; cont++) {
			for (int cont2 = 0; cont2 < 8; cont2++) {
				
				matriz[cont][cont2] = matriz[cont][cont2]+ (cont + cont2);
			}
		}
		for (int cont3 = 0; cont3 < 7; cont3++) {
			System.out.println();
			for (int cont4 = 0; cont4 < 8; cont4++) {
				System.out.print(matriz[cont3][cont4]+ " ");
			}
		}
		sc.close();
	}
}