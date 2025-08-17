package aula16.problema2.exfixacao.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
