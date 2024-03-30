package funcao;

public class funcao {
	
	public static void main(String [] args) {
		
		int a = 10, b = 20, result;
		result = soma(a,b);
		System.out.println(result);
	}

	public static int soma (int a, int b) {
		int resultado = a + b;
		return resultado;
	}
}