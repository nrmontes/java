package scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, numPeca1, numPeca2;
        double preco1, preco2, valorFinal;
        
        cod1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        preco1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        preco2 = sc.nextDouble();
        
        valorFinal = numPeca1*preco1+numPeca2*preco2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);
        
        sc.close();
	}

}
