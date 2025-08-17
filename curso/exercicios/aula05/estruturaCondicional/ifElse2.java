package aula05.estruturaCondicional;

import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Que horas são?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.printf("Bom dia! São %d horas", hora);
		} else if (hora < 18) {
			System.out.printf("Boa tarde! São %d horas", hora);
		} else {
			System.out.printf("Boa noite! São %d horas", hora);
		}

		sc.close();
	}

}
