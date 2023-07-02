package model.services;

import model.entities.Contract;

public class ContractService implements OnlinePaymentService {

	private OnlinePaymentService ops;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService ops) {
		super();
		this.ops = ops;
	}

	public void processContract(Contract contract, int months) {
		
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
