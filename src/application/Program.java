package application;

import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		/*Locale.setDefault(Locale.US);
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
		
		System.out.println("Parcelas:");*/
		
		PaypalService service = new PaypalService();
		
		double result = service.interest(200, 1);
		double result2 = service.interest(200, 3);
		double newResult = service.paymentFee(result);
		double newResult2 = service.paymentFee(result2);
		
		System.out.println(result + " " + newResult + "\n" + result2 + " " + newResult2);
		
		
		//sc.close();
	}

}
