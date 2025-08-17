package aula10.vetores_exFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double soma = 0.0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		
		System.out.print("VALORES =");	
		for(int i=0; i<n; i++) {
			if(vetor[i] > 0) {
				System.out.printf(" %.1f ", vetor[i]);
			}
		}
		
		double media = soma / vetor.length;
		sc.nextLine();
		System.out.printf("SOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		sc.close();
	}

}
