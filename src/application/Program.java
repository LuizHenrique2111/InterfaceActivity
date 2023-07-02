package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int installment = sc.nextInt();

		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(obj, installment);
			
		System.out.println("Parcelas:");
		for (Installment installments : obj.getInstallments()) {
			System.out.println(installments);
		}
		
		
		sc.close();
	}

}
