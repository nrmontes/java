package listas_introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas_introducao {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // inclusão em determinado index

		System.out.println(list.size()); //tamanho da lista
	
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');  // remova x, se x que estiver no charAt(0) seja 'M'
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando o item não existe, o retorno é -1
		
		System.out.println("---------------------------");

		//Criamos uma nova lista 'result' para pegar o resultado desejado. Convertemos para 'stream', aplicamos o filtro e então temos que converter novamente para 'lista'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------- Outros tipos de remove ----------------");
		list.remove(1);
		list.remove("Anna");
	
		//Como encontrar o 1o elemento que comece com a letra 'A'. Acha com base no predicado
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
