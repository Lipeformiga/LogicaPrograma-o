package lista4;

import java.util.Scanner;

public class variavelConstante {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int x, y, z;
        
        System.out.println("Qual a posição da pessoa? ");
        x = sc.nextInt();
        
        System.out.println("Onde ela quer chegar? ");
        y = sc.nextInt();
        
        System.out.println("Qual a distância de cada passo?");
        z = sc.nextInt();
        
        System.out.println("A quantidade de passos nescessária é "+ atravessaRua(x, y, z));
    }
    public static int atravessaRua(int x, int y, int z) {
        int cont = 0;
        
            while(x < y){
            cont++;
            x = x + z;
            }
            
        return cont;
    }
}