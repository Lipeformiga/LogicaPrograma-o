package funcoes3;

public class atividade8 {
	
public static void main(String[] args) {
		
		System.out.println ("Os números de 1000 até 9999 que apresentam essa característica são: ");
		
		numeroCaracteristicas (1000, 9999) ; 
	}
	public static void numeroCaracteristicas (int inicio, int limite) {
		
		int contador = 0;  
		int numero1; 
		int numero2;
		int soma; 
		
		for (contador = inicio; contador <= limite ; contador++) {
			
			numero1 = Integer.parseInt(Integer.toString(contador).substring (0, 2)) ;
			numero2 =  Integer.parseInt(Integer.toString(contador).substring (2, 4)) ;
			
			soma = numero1 + numero2; 
			
			if (soma * soma == contador) {
				
				System.out.print (contador + " ") ;
			}	
		}		
	}
}