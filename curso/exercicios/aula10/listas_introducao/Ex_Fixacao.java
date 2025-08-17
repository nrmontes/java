package aula10.listas_introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex_Fixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Quantos funcionarios serao registrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();

			while (existeId(funcionarios, id)) {
				System.out.print("Id já existe. Tente outro: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			funcionarios.add(new Funcionario(id, nome, salario));
		}

		System.out.println("Insira o id do funcionario que recebera o aumento: ");
		int id = sc.nextInt();
		Funcionario buscaFunc = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (buscaFunc == null) {
			System.out.println("Esse funcionario nao existe! ");
		} else {
			System.out.println("Qual a porcentagem de aumento? ");
			double porcentagem = sc.nextDouble();
			buscaFunc.aumentoSalario(porcentagem);
		}

		sc.close();

		System.out.println();
		System.out.println("Lista de empregados: ");
		for (Funcionario obj : funcionarios) {
			System.out.println(obj);
		}
	}

	public static boolean existeId(List<Funcionario> funcionario, int id) {
		Funcionario func = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
