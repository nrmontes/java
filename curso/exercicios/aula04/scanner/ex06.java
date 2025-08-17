package aula04.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio,areaQuadrado, areaRetangulo, pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        areaTriangulo = (A*C)/2;
        areaCirculo = pi*C*C;
        areaTrapezio = ((A+B)*C)/2;
        areaQuadrado = B*B;
        areaRetangulo = A*B;
        
        System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
        
        sc.close();
	}

}
