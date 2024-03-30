package funçoes;

import java.util.Scanner;

public class atividade4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		boolean x;
		
		System.out.println("escreva o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("escreva o segundo numero");
		num2 = sc.nextInt();
		
		x = multiplo(num1,num2);
		
		System.out.println("o primeiro é multiplo do segundo: "+ x);
	}
	public static boolean multiplo(int num1, int num2) {
		
		boolean x = false;
		if(num1 % num2 == 0) {
			x = true;
		}
		return x;
	}
}