package funçoes;

import java.util.Scanner;

public class atividade3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		boolean funcao;
		
		System.out.println("escreva um número inteiro");
		num = sc.nextInt();
		
		funcao = parImpar(num);
				
	}
	public static boolean parImpar(int num) {
		
		boolean i = false;
		if(num % 2 == 0) {
			i = true;
		}
		if(i == true ) {
			System.out.println("par");
			
		}
		else {
			System.out.println("impar");
		}
		return i;
	}
}