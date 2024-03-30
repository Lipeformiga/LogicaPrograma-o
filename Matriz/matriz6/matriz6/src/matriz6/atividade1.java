package matriz6;
import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] aargs) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanho, somaP = 0, somaS = 0;
		
		System.out.println("Qual o tamanho da matriz ");
		tamanho = sc.nextInt();
		
		int matriz [][] = new int [tamanho][tamanho];
		
		for (int linha = 0; linha < tamanho; linha++ ) {
			for (int coluna = 0; coluna < tamanho; coluna++ ) {
				System.out.println("escrava o valor da matriz: "+ "["+(linha+1)+"]"+"["+(coluna+1)+"]");
				matriz [linha][coluna] = sc.nextInt();
				
				if ( linha == coluna ) {
					somaP += matriz[linha][coluna];
				}
				if ( linha + coluna == tamanho - 1 ) {
					somaS += matriz[linha][coluna];
				}
			}
		}
		System.out.println("A soma da diagonal principal é: "+ somaP);
		System.out.println("A soma da diagona secundaria é: "+ somaS);
		sc.close();
	}
}