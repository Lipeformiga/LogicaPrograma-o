package matriz3;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int [4][4];
		int num[] = new int [4];
		int x = 0, y = 0;
		int num2[] = new int [12];
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Escreva os números da matriz "+ "["+(linha+1)+"]"+ "["+(coluna+1)+"]");
				matriz[linha][coluna] = sc.nextInt();
				
				if(linha == coluna) {
					num[x] = matriz[linha][coluna];
					x++;
				}
				else {
					num2[y] = matriz[linha][coluna];
					y++;
				}
			}
		}
		System.out.println("Os números da diagonal princpal são:");
		for (int cont = 0; cont < x; cont++) {
			System.out.println(num[cont]);
		}
		System.out.println("Os números que não são da diagonal principal são: ");
		for (int cont1 = 0; cont1< y; cont1++) {
			System.out.println(num2[cont1]);
		}
		sc.close();
	}
}
	
		