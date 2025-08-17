package aula04.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade;
        double horasTrabalhadas, valorHora, salario;
        
        idade = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorHora = sc.nextDouble();
        
        salario = horasTrabalhadas*valorHora;
        System.out.printf("NUMBER = " + idade);
        System.out.printf("%nSALARY = U$ %.2f", salario);
        
        sc.close();
	}

}
