package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Funcionário #" + i);
			System.out.print("O Funcionário é terceirizado? (s/n):");
			char op = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Hora: ");
			int hora = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();

			/* Verificar se o funcionário é tercerizado ou não */
			if (op == 's') {
				System.out.print("Taxa Adicional: ");
				double adicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, hora, valorPorHora, adicional));
			} else {
				list.add(new Funcionario(nome, hora, valorPorHora));
			}

		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		
		for (Funcionario func: list) {
			System.out.println(func.getNome()+ " - $ "+ String.format("%.2f", func.pagamento()));
		}

		sc.close();

	}

}
