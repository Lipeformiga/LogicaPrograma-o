package funçoes;

import java.util.Scanner;

public class atividade8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int posicao;
		int[] funcao;
		
		System.out.println("escreva a posição que você quer saber ");
		posicao = sc.nextInt();
		
		funcao = fibonnaci(posicao);
		
		System.out.println (funcao[posicao-1]);
	}
	public static int fibonacci(int posicao) {
		
		int fibonacci[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
		
		return fibonacci;
	}
}