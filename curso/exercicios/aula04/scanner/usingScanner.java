package scanner;

import java.util.Scanner;

public class usingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		int b;
		double c;
		char d;

		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc.next().charAt(0);

		System.out.println("Você digitou uma String " + a);
		System.out.println("Você digitou um valor Int " + b);
		System.out.println("Você digitou um valor Double" + c);
		System.out.println("Você digitou um char " + d);

		sc.close();
	}
}