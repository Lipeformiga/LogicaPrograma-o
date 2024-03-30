package matriz6;

import java.util.Scanner;

public class atividade3 {
	
	public static void main(String [] aargs) {
		
		Scanner sc = new Scanner(System.in);

		int matriz [][] = new int [8][8];
		int barcoL [] = new int [5];
		int barcoC [] = new int [5]; 
		int contador = 0, chuteL, chuteC, repita;
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.print("escolha a linha para colocar o barco: ");
			barcoL[cont] = sc.nextInt();
			System.out.println("escolha a coluna para colocar o barco: ");
			barcoC[cont] = sc.nextInt();
			
			if ( matriz[barcoL[cont]][barcoC[cont]] == 1) {
				cont--;
				System.out.println("Barco ja localizado nessa coordenada repita: ");
			}
			matriz [barcoL[cont]][barcoC[cont]] = 1;
		}
		
		for (int linha = 0; linha < 8; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 8; coluna++) {
				System.out.print(matriz[linha][coluna]+ " ");	
			}
		}
		for (int cont1 = 0; cont1 < 10; cont1++) {
			System.out.println("\naonde você quer tentar acertar (linha): ");
			chuteL = sc.nextInt();
			System.out.println("aonde você quer tentar acertar (coluna): ");
			chuteC = sc.nextInt();
			
			if (matriz[chuteL][chuteC] == 1 ) {
				System.out.println("Você acertou "+(contador+1)+"!");
				contador++;
				matriz[chuteL][chuteC] = 0;
			}
				else {
					System.out.println("Errou");
			}
			if ( contador == 5) {
				System.out.println("Você acertou todos! ");
				break;
			}
		}
		sc.close();
	}
}