package funcoes3;

import java.util.Scanner;

public class atividade11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palavra;
		String funcao;
		
		System.out.println("Insira uma palavra qualquer: ");
		palavra = sc.next();
		
		funcao = criptografia(palavra);
		
		System.out.println("Após a criptografia ficou assim: "+funcao);
	}
	
	public static String criptografia(String palavra) {
		
		char[] arr = palavra.toCharArray();
		
		for(int cont = 0; cont < arr.length; cont++) {
			arr[cont] = (char) (arr[cont] + 5);
		}
		return new String(arr);
	}
}