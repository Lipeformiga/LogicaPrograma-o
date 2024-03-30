package funçoes;

import java.util.Scanner;

public class atividade10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura;
		int sexo;
		
		System.out.println("qual seu sexo: 1 masculino 2 feminino:");
		sexo = sc.nextInt();
		System.out.println("qual a sua altura: ");
		altura = sc.nextDouble();
		
		funcao(altura, sexo);
	}
	public static double funcao ( double altura, int sexo) {
		
		double pesoIdeal = 0;
		
		if (sexo == 1) {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("O peso ideal é: "+ pesoIdeal);
		}
		else if ( sexo == 2 ) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("O peso ideal é: "+ pesoIdeal);
		}
		return pesoIdeal;
	}

}
