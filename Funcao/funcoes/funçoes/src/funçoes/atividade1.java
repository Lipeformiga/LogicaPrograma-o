package funçoes;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Qual número você quer a tabuada?");
		num = sc.nextInt();
		
		tabuada(num);
	}
	public static int tabuada(int num2) {
		int n1 = num2 *1, n2 = num2 *2, n3= num2 *3, n4= num2 *4, n5= num2 *5, n6= num2 *6, n7 = num2 *7, n8 = num2 *8, n9 = num2 *9, n10 = num2 *10;
		System.out.println("A tabela do "+ num2 + " é: "+
		"\n"+ num2 +" * 1 = "+ n1 +
		"\n"+num2 +" * 2 = "+ n2 +
		"\n"+num2 +" * 3 = "+ n3 +
		"\n"+num2 +" * 4 = "+ n4 +
		"\n"+num2 +" * 5 = "+ n5 +
		"\n"+num2 +" * 6 = "+ n6 +
		"\n"+num2 +" * 7 = "+ n7 +
		"\n"+num2 +" * 8 = "+ n8 +
		"\n"+num2 +" * 9 = "+ n9 +
		"\n"+num2 +" * 10 = "+ n10);
		
		return num2;
	}

}
