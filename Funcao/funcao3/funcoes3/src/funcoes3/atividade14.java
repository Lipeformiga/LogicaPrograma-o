package funcoes3;

import java.util.Scanner;

public class atividade14 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int funcao;
		int nota;
		int notaFinal;
		int notaMaior1 = 0;
		int notaMenor1 = 100;
		
		for(int cont = 0; cont <= 80; cont++) {
			for(int cont1= 0; cont1 <= 3; cont1++) {
				System.out.println("Insira uma nota para as notas de 20 para o 1º semestre: ");
				nota = sc.nextInt();
				
				if(nota < notaMenor1) {
					notaMenor1 = nota;
				}
				notaMaior1 = notaMaior1 + nota;
			}
			notaMaior1 = notaMaior1 - notaMenor1;
			
			System.out.println("Insira sua nota final: ");
			notaFinal = sc.nextInt();
			
			funcao = media(notaMaior1,notaFinal);
			
			System.out.println("Você é o aluno de posição: "+cont+" a sua nota final é: "+funcao);
		}
	}
	public static int media(int notaMaior1, int notaFinal) {
		
		int media = notaMaior1 + notaFinal;
		
		if(media >= 90 && media <= 100) {
			System.out.println("A");
		} else if(media >= 80 && media <= 89) {
			System.out.println("B");
		} else if(media >= 60 && media <= 69) {
			System.out.println("C");
		} else if(media >= 40 && media <= 59) {
			System.out.println("D");
		} else if(media >= 10 && media <= 39) {
			System.out.println("E");
		} else if(media <= 19) {
			System.out.println("F");
		}
		return media;
	}

}
