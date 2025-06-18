package vetores_exFixacao;

import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
 * depois N números inteiros e armazene-os em um vetor.
 * Em seguida, mostrar na tela todos os números negativos lidos.
 */

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d%n", vect[i]);
			}
		}
		sc.close();
	}

}
