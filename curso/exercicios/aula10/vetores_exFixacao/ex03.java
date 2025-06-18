package vetores_exFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] vetorPessoas = new String[n];
		int[] vetorIdades = new int[n];
		double[] vetorAlturas = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			vetorPessoas[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdades[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetorAlturas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetorAlturas[i];
		}
		double media = soma / vetorAlturas.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		
		int menores16 = 0;		
		for(int i=0; i<n; i++) {
			if(vetorIdades[i] < 16) {
				menores16 += 1;
			}
		}
		
		double porcentagem = menores16 * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		for(int i=0; i<n; i++) {
			if(vetorIdades[i] < 16) {
				System.out.println(vetorPessoas[i]);
			}
		}
		
		sc.close();
	}

}
