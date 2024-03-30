package matriz3;

import java.util.Scanner;

public class atividade3 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pessoas;
		
		System.out.println("Quantas pessoas você quer cadastrar: ");
		pessoas = sc.nextInt();
		
		String nome [] = new String[pessoas];
		Double salario, inss, imposto, somaSalario = 0.0, somaInss = 0.0, somaImposto = 0.0, salarioL, somaL = 0.0;
		
		for (int cont = 0; cont < pessoas; cont++) {
			System.out.println("Escreva o nome da pessoa "+(cont+1) + ": ");
			nome[cont] = sc.next();
			
			System.out.println("Escreva o salario da pessoa "+(cont+1)+ ":");
			salario = sc.nextDouble();
			somaSalario += salario;
			
			if ( salario < 965.67 ) {
				inss = salario * 0.08;
			}
			else if ( salario > 965.67 && salario <1609.45) {
				inss = salario * 0.09;
			}
			else {
				inss = salario * 0.11;
			}
			if ( salario <= 1434){
				imposto = salario * 0.0;
			}
			else if ( salario > 1434 && salario < 2150) {
				imposto = salario * 0.075;
			}
			else if ( salario >= 2150 && salario < 2886 ) {
				imposto = salario * 0.15;
			}
			else if ( salario >= 2886 && salario < 3582) {
				imposto = salario * 0.225;
			}
			else {
				imposto = salario * 0.275;
			}
			salarioL = salario - (imposto + inss);
			somaL += salarioL;
			somaImposto += imposto;
			somaInss += inss;
		}
		System.out.println("A soma de todos os salarios brutos é: "+ somaSalario);
		System.out.println("O a soma dos descontos do INSS é:"+ somaInss);
		System.out.println("O a soma dos descontos do imposto de renda é:"+ somaImposto);
		System.out.println("A soma de todo os salarios liquidos é: "+ somaL);
	}
}