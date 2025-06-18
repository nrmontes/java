package exerc.contribuinte.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerc.contribuinte.entities.Pessoa;
import exerc.contribuinte.entities.PessoaFisica;
import exerc.contribuinte.entities.PessoaJuridica;

public class Program8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Insira o numero de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do #" + (i + 1) + " contribuinte:");
			System.out.print("Pessoa física ou jurídica (f/j)?:");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, gastosSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numFunc = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, numFunc));

			}

		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome() + ": $ %.2f" + pessoa.imposto());

		}

		System.out.println();
		double soma = 0.0;
		for (Pessoa pessoa : lista) {
			soma += pessoa.imposto();
		}
		System.out.printf("IMPOSTOS TOTAIS: $ %.2f" + soma);

		sc.close();
	}

}
