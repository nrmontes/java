package aula04.scanner;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int soma = a + b;

		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
