package estruturaCondicional;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Que horas são?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.printf("Bom dia! São %d horas da manhã", hora);
		} else {
			System.out.printf("Boa tarde! São %d horas da tarde", hora);
		}

		sc.close();
	}

}
