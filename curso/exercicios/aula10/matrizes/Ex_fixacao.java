package aula10.matrizes;

import java.util.Scanner;

public class Ex_fixacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Arranjo bidimensional - matriz necessita de dois [][]
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz [i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Main diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		int contador = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println("Numeros negatvos: " + contador);
		sc.close();
		
	}

}
