package atividadefuncao2;

import java.util.Random;

import java.util.Scanner;

public class funcao {
	
	public static void main(String [] args) {
		
		int palpite;
		Random random = new Random();
		int num = random.nextInt(1000);
		
		funcao(num);
		
	}
	public static int funcao(int num) {
		
		Scanner sc = new Scanner(System.in);
		
		int palpite = 0;
		int cont = 0;
		
		while ( palpite != num){
			
			System.out.println("digite um número para você tentar acertar: ");
			palpite = sc.nextInt();
			cont ++;
		
			if ( palpite < num ) {
				System.out.println("tente um número mais alto" );
			}
			else if ( palpite > num ) {
				System.out.println("tente um número mais baixo");
			}
		}
		System.out.println("Você acertou! com "+cont+" tentativas O número era "+ num);
		
		return palpite;
	}
}