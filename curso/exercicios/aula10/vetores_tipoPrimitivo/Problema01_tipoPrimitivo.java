package vetores_tipoPrimitivo;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e a altura de N 
 * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a 
 * altura média dessas pessoas.
 */
public class Problema01_tipoPrimitivo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroDeAlturas = sc.nextInt();
		double[] vect = new double [numeroDeAlturas];
		
		for (int i=0; i < numeroDeAlturas; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<numeroDeAlturas; i++) {
			soma += vect[i];
		}
		
		double media = soma / numeroDeAlturas;
		System.out.printf("AVERAGE HEIGHT = %.2f", media);
		
		sc.close();
	}

}
