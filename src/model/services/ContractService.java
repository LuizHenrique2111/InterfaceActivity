package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService implements OnlinePaymentService {

	private OnlinePaymentService ops;
	
	public ContractService() {
	}

	public ContractService(OnlinePaymentService ops) {
		super();
		this.ops = ops;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = ops.interest(basicQuota, i);	
			double fee = ops.paymentFee(basicQuota + interest);	
			double quota = basicQuota + interest + fee;

			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}

	@Override
	public double paymentFee(double amount) {
		return 0;
	}

	@Override
	public double interest(double amount, int months) {
		return 0;
	}

}
