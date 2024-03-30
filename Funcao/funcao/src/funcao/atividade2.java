package funcao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class atividade2 {
	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dias = 0;
        int mes = 0, ano = 0, dia = 0;

        System.out.println("Insira o dia: ");
        dia = sc.nextInt();

        System.out.println("Insira o mês: ");
        mes = sc.nextInt();

        System.out.println("Insira o ano: ");
        ano = sc.nextInt();

        System.out.println("daqui quantos dias quer saber: ");
        dias = sc.nextInt();

        somaTudo(dia, mes, ano, dias);

        sc.close();
    }

    public static void somaTudo(int dia, int mes, int ano, int dias) {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate dataNova = dataAtual.plusDays(dias);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
        String dataFormatada = dataNova.format(formatador);

        System.out.println("Daqui a " + dias + " dias será " + dataFormatada);
    }
}