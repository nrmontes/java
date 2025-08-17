package aula16.problema2.exfixacao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aula16.problema2.exfixacao.entities.Contract;
import aula16.problema2.exfixacao.entities.Installment;
import aula16.problema2.exfixacao.services.ContractService;
import aula16.problema2.exfixacao.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Input contract data: ");
		System.out.print("Contract number: ");
		int contractNumber = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(contractNumber, date, contractValue);
		
		System.out.print("Number of installments: ");
		int numberOfInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContact(contract, numberOfInstallments);
		
		System.out.println("Installments: ");
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
