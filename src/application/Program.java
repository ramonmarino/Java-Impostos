package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.TaxPayer;
import entities.individual;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<TaxPayer> list = new ArrayList<>(); // lista vazia

		System.out.print("Entre com o número de contribuintes: ");
		int numeroContribuintes = input.nextInt();
		for (int i = 1; i <= numeroContribuintes; i++) {
			System.out.println(" Contribuinte " + i + " Dados: ");
			System.out.print("É pessoa física ou Jurídica? (f/j): ");
			char resp = input.next().charAt(0);
			System.out.print("Nome: ");
			String nome = input.next(); // só aceita uma palavra sem espaço 
			System.out.print("rendimento anual: ");
			double rendimento = input.nextDouble();
			if (resp == 'f') {
				System.out.print("Quanto foi seu gasto com Saúde: ");
				double gastoSaude = input.nextDouble();
				list.add(new individual(nome, rendimento, gastoSaude));

			} else if(resp == 'j') {
				System.out.println("Numero de funcinários: ");
				int numeroF = input.nextInt();
				list.add(new Company(nome, rendimento, numeroF));

			}
			

		}
		System.out.println();
		
		System.out.println("Impostos pagos: "); // Só para exibir
		for(TaxPayer verificar: list) {
			System.out.println(verificar.getName() + ": $ " + String.format("%.2f", verificar.tax())); // não esquecer formatar 
		}
		
		System.out.println();
		double soma = 0.0;
		for(TaxPayer total: list) { // cada for ter somente uma funcionalidade.
			soma += total.tax();
			
		}
		
		System.out.print("Total pago:  $ " + String.format("%.2f", soma));
		

		input.close();
	}

}
