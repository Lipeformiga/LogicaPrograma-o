package matriz2;

import java.util.Scanner;

public class atividade5 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		double matriz [][] = new double [3][4];
		double superior = 0, inferior = 0;
		
		for (int cont = 0; cont < 3; cont++) {
			for (int cont2 = 0; cont2 < 4; cont2++) {
				System.out.println("escreva os números da matriz: "+ "["+(cont+1)+"]"+"["+(cont2+1)+"]");
				matriz [cont][cont2] = sc.nextInt();
				
				if ( cont == 0 && cont2 == 0) {
					superior = matriz[cont][cont2];
				}
				if ( cont == 2 && cont2 == 0) {
					inferior = matriz[cont][cont2];
				}
			}
		}
		System.out.println("O número superior esquerdo é: "+ superior);
		System.out.println("O número inferior esquerdo é: "+ inferior);
		sc.close();
	}
}