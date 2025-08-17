package aula17.exemplo1.hashCodeEquals.application;

import aula17.exemplo1.hashCodeEquals.entities.Client;

public class ProgramHashCodeEquals {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		/*  Porque esse vai dar falso? Porque, embora o conteudo seja o mesmo, ele vai 
		 *  considerar as posicoes de memoria em que as variaveis estão alocadas
		 *  Então, se quisermos comparar o conteúdo de dois objetos, temos de usar hashCode e Equals
		 */
		
		System.out.println(c1 == c2);
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(s1 == s2);
		
		/*
		 *  Porque não dá falso? Porque o compilador trata a expressão literal de forma especial
		 */
	}

}
