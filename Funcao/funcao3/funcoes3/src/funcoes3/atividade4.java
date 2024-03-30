package funcoes3;

import java.util.Scanner;

public class atividade4 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escreva um número positivo e inteiro: ");
		num = sc.nextInt();
		
		funcao (num);
		
		System.out.println("A quantidade de digitos é: "+ String.valueOf(num).length());
	}
	public static int funcao (int num ) {
		
		int x;
		x = String.valueOf(num).length(); 
		return x;
	}
}