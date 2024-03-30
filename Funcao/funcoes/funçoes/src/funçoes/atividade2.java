package funçoes;

import java.util.Scanner;

public class atividade2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double num;
		
		System.out.println("escrevao número que você quer absoluto: ");
		num = sc.nextDouble();
		
		absoluto(num);
	}
	public static Double absoluto(Double num) {
		if ( num < 0) {
			num = num * -1;
			System.out.println("o número absoluto é: "+ num);
		}
		else {
			System.out.println("o número absoluto é: "+ num);
		}
		return num;
	}

}
