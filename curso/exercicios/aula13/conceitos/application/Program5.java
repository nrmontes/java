package conceitos.application;

import java.util.ArrayList;
import java.util.List;

import conceitos.entities.Account;
import conceitos.entities.BusinessAccount;
import conceitos.entities.SavingsAccount;

public class Program5 {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		/*
		//CLASSE ABSTRATA
		//Reuso e polimorfismo
		Account acc1 = new Account (1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		*/
		
		
		//POLIMORFISMO
		/*
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		*/
		
		
	
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//@OVERRIDE do metodo Withdraw na classe SavingAccount, que nao deve descontar taxa de saque
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//SUPER: Utilizando a palavra super no método Withdraw na classe BusinnesAccount, aplicamos a regra da superclasse + a da classe atual
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		*/
		
		
		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		// BusinessAccount É UMA Account
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		acc1.getBalance();

		// DOWNCASTING

		// A convesão abaixo não é permitida, porque apesar de ter sido instanciada como
		// BA, o tipo de acc2 ainda é Account.
		// Para isso é necessário forçar o casting
		// BusinessAccount acc4 = acc2;
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// Inicialmente o compilador não aponta o erro, mas ao executar, o erro vai
		// aparecer
		// Porque SavingAccount é uma Account, mas não uma BusinessAccount
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Updated balance");
		}
		*/
	}

}
