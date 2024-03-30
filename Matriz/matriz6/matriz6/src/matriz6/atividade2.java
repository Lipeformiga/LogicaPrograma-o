package matriz6;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String [] aargs) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanho;
		
		System.out.println("Qual o tamanho da matriz quadrada você quer: ");
		tamanho = sc.nextInt();
		
		int matriz[][] = new int [tamanho][tamanho];
		
		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna < tamanho; coluna++) {
				System.out.println("escrava o valor da matriz: "+ "["+(linha+1)+"]"+"["+(coluna+1)+"]");
				matriz [linha][coluna] = sc.nextInt();				
			}
		}
		for (int linha = 0; linha < tamanho; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < tamanho; coluna++) {
				System.out.print(matriz[coluna][linha]+ " ");
								
			}
		}
		sc.close();
	}
}