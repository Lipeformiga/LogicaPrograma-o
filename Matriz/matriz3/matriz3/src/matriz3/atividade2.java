package matriz3;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int tamanho;
		System.out.println("qual o tamanho das linhas e colunas da sua matriz: ");
		tamanho = sc.nextInt();
		
		int matriz[][] = new int [tamanho][tamanho];
		
		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna < tamanho; coluna++) {
				System.out.println("Escreva os números da matriz "+ "["+(linha+1)+"]"+ "["+(coluna+1)+"]");
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		for (int linha = 0; linha < tamanho; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < tamanho; coluna++) {
				if(linha == coluna ) {
				}
				else if ( linha + coluna == (tamanho -1)) {
				}
				else {
					matriz[linha][coluna] = 0;
				}
				System.out.print(matriz[linha][coluna]+ " ");
			}
		}
		sc.close();
	}
}