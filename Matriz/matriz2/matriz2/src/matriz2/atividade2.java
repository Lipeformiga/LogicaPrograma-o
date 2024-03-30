package matriz2;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz [][] = new int [7][4];
		int menor = 99999, linha = 0, coluna = 0;
		
		for (int cont = 0; cont < 7; cont++) {
			for (int cont2 = 0; cont2 < 4; cont2++) {
				System.out.println("escreva o valor da matriz: "+ "["+(cont+1)+"]"+"["+(cont2+1)+"]");
				matriz [cont][cont2] = sc.nextInt();
				
				if (  matriz[cont][cont2] < menor) {
					menor = matriz[cont][cont2];
					linha = cont;
					coluna = cont2;
				}
			}
		}
		System.out.println("O menor número é: "+menor+ " que esta na posição: "+ "["+(linha+1)+"]"+"["+(coluna+1)+"]");
		sc.close();
	}
}