package funçoes;

import java.util.Scanner;

public class atividade7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, x;
		
		System.out.println("escreva um número:");
		num = sc.nextInt();
		
		x = funcao(num);
		
		System.out.println("o valor fatorial é: " + x);
		
	}
	public static int funcao(int num) {
		int x = 0, y = num -1;
		for(int cont = y; cont > 1; cont--) {
			if(x == 0) {
				x = num * cont;
			}
			else if (x > 0) {
				x = x * cont;
			}
		}
		if(num == 2) {
			x = 2;
		}
		else if ( num == 1 ) {
			x = 1;
		}
		return x;
	}
}