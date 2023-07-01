package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int contractNumber = sc.nextInt();
		System.out.print("Data (dd/MM/yyy): ");
		LocalDateTime day = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int installment = sc.nextInt();
		
		System.out.println("Parcelas:");
		
		
		
		sc.close();
	}

}
