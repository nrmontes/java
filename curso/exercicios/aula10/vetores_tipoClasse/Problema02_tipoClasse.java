package vetores_tipoClasse;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e os dados (nome e 
 * preço) de N Produtos. Armazene os N produtos em um vetor. Em 
 * seguida, mostrar o preço médio dos produtos.
 */
public class Problema02_tipoClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name  =sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", media);
		
		
		sc.close();
	}

}
