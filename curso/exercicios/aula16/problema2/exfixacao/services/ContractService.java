package aula16.problema2.exfixacao.services;

import java.time.LocalDate;

import aula16.problema2.exfixacao.entities.Contract;
import aula16.problema2.exfixacao.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContact(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;

			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
