package funçoes;

import java.util.Scanner;

public class atividade5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		boolean verifica;
		
		System.out.println("escreva um ano para dizer se é bissexto ou não:");
		ano = sc.nextInt();
		
		verifica = bissexto(ano);
		
		System.out.println("o ano é bissexto: "+ verifica);
	}
	public static Boolean bissexto(int ano) {
		
		boolean verifica = false;
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			verifica = true;
		}
		return verifica;
	}
}