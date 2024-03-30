package funçoes;

import java.util.Scanner;

public class atividade9 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int peso;
		int alt;
		int idade;
		int sexo;
		
		System.out.println("Insira o seu sexo (1-FEM) e (2-MASC)");
		sexo = sc.nextInt();
		System.out.println("insira o seu peso: ");
		peso = sc.nextInt();
		System.out.println("Insira a sua altura: ");
		alt = sc.nextInt();
		System.out.println("Insira a sua idade: ");
		idade = sc.nextInt();
		
		gastoEnergéticoBasal(peso, alt, idade, sexo);
	}
	
	public static void gastoEnergéticoBasal(int peso, int alt, int idade, int sexo) {
		
		double GEB;
		
		if(sexo == 1) {
			GEB = 66.47 + (13.75 * peso) + (5 * alt) - (6.76 * idade);
			System.out.println("O seu GEB é de: "+GEB);
		} else if(sexo == 2) {
			GEB = 655.1 + (9.56 * peso) + (1.85 * alt) - (4.67 * idade);
			System.out.println("O seu GEB é de: "+GEB);
		}
	}

}
