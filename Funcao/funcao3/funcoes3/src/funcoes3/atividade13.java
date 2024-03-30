package funcoes3;

import java.util.Scanner;

public class atividade13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
			int posicao;
			int funcao;
				
			System.out.println("Insira a posição que você gostaria de saber na sequência de fibonacci: ");
			posicao = sc.nextInt();
				
			funcao = sqcFibonacci(posicao);
				
			System.out.println("O número é: "+funcao);
			}
			
		public static int sqcFibonacci(int posicao) {
				
			if (posicao <= 1) {
				return posicao;
				} 
			else {
				int fibAtual = 1;
		        int fibAnterior = 0;

		        for (int cont = 2; cont <= posicao; cont++) {
		        	int temp = fibAtual;
		            fibAtual = fibAtual + fibAnterior;
		            fibAnterior = temp;
		            }
		        return fibAtual;
			}
		}
	}