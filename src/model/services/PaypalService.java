package model.services;

public class PaypalService {

	public double paymentFee(double amount) {

		double result = amount * 1.02;

		return result;
	}

	public double interest(double amount, int months) {
		double result = 0;

		if (months == 1) {
			result = amount * 1.01;
		} else if (months >= 2) {
			for (int i = 1; i <= months; i++) {
				result = amount * (1 + (0.01 * i));
			}
		} else {
			System.out.println("Valor inserido incorretamente.");
		}

		return result;
	}
}
