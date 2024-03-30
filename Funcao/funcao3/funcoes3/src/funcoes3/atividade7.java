package funcoes3;

import java.util.Scanner;

public class atividade7 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		System.out.println("escreva separadamento os algarismos de um número de 1000 a 9999: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		funcao(num1,num2,num3,num4);
		
	}
	public static int funcao(int num1, int num2, int num3, int num4) {
		
		if ( num1 == num4 && num2 == num3) {
			System.out.println("O número é palidromo");
		}
		
		else {
			System.out.println("não é ");
		}
		return num1;
	}
}