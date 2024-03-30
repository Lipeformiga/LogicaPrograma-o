package funcoes3;

import java.util.Scanner;

public class atividade5 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
	
		System.out.println("Escreve um número entre 10 e 100: ");
		num = sc.nextInt();
		
		funcao(num);
		
		System.out.println("Os números primos são: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.");
		
	}
	public static int funcao(int num) {
		
		
		if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19 || num == 23 || num == 29 || num == 31 || num == 37 || num == 41 || num == 43 || num == 47 || num == 53 || num == 59 || num == 61 || num == 67 || num == 71 || num == 73 || num == 79 || num == 83 || num == 89 || num == 97) {
			System.out.println("O número é primo!");
		}
		else {
			System.out.println("O número não é primo!");
		}
		return num;
	}
}