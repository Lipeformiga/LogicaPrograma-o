package funcoes3;

import java.util.HashSet;

import java.util.Scanner;

public class atividade15 {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Informe as dezenas sorteadas:");
	  
	        int[] dezenasSorteadas = new int[5];
	        
	        for (int i = 0; i < 5; i++) {
	        
	            dezenasSorteadas[i] = sc.nextInt();
	        
	        }

	        int[] apostas = new int[100];
	        int qtdApostas = 0;
	        
	        while ( true ) {
	        
	            System.out.println("Informe o número da aposta (0 para sair):");
	            
	               int numeroAposta = sc.nextInt();
	            
	               if (numeroAposta == 0) {
	            
	                   break;
	            
	               }

	            System.out.println("Informe a quantidade de dezenas apostadas:");
	            
	            int qtdDezenasApostas = sc.nextInt();
	            int[] dezenasApostas = new int[qtdDezenasApostas];
	            
	            for (int i = 0; i < qtdDezenasApostas; i++) {
	            
	                  dezenasApostas[i] = sc.nextInt();
	         
	            }

	            int pontos = contaAcertos(dezenasSorteadas, dezenasApostas);

	            apostas[qtdApostas++] = numeroAposta;

	            System.out.println("Número de pontos da aposta " + numeroAposta + ": " + pontos);
	        
	        }

	        System.out.println("Total de apostas: " + qtdApostas);

	        int[] acertados = new int[3];
	        
	        for (int i = 0; i < qtdApostas; i++) {
	           
	            acertados[avaliaAcertos(apostas[i])]++;
	       
	        }

	        System.out.println("Total de acertos:");
	        System.out.println("Têm: " + acertados[0] + " acertados 3 números");
	        System.out.println("Têm: " + acertados[1] + " acertados 4 números");
	        System.out.println("Têm: " + acertados[2] + " acertados 5 números");
	    }

	    public static int contaAcertos(int[] dezenasSorteadas, int[] dezenasApostas) {
	        
	        HashSet<Integer> dezenasApostasSet = new HashSet<>();
	       
	        for (int dezena : dezenasApostas) {
	        
	            dezenasApostasSet.add(dezena);
	        
	        }

	        int pontos = 0;
	        
	        for (int dezenaSorteada : dezenasSorteadas) {
	           
	            if (dezenasApostasSet.contains(dezenaSorteada)) {
	            
	                pontos++;
	            }
	        }

	        return pontos;
	    
	    }

	    public static int avaliaAcertos(int pontos) {
	       
	        switch (pontos) {
	            
	        case 3:
	        
	            return 0;
	            
	        case 4:
	        
	            return 1;
	            
	        case 5:
	        
	            return 2;
	            
	        default:
	        
	            return -1;
	        }
	        
	    }
	}