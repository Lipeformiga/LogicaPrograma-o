package funcoes3;

import java.util.Scanner;

public class atividade12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		int funcao;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		funcao = fatoração(num);
		
		System.out.println("A fatoração desse número é: "+funcao);
	}
	
	public static int fatoração(int num) {
		int fator = 1;
		
		for(int cont = 1; cont <= num; cont++) {
			fator = fator * cont;
		}
		return fator;
	}
}