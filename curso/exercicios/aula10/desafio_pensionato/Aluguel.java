package aula10.desafio_pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Aluguel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		
		Pessoa[] vetorPessoa = new Pessoa[10];
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + (i+1) +": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name  = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetorPessoa[quarto] = new Pessoa(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i=0; i<10; i++) {
			if(vetorPessoa[i] != null) {
				System.out.println(i + ": " + vetorPessoa[i]);
			}
		}
		
		
		sc.close();
	}

}
