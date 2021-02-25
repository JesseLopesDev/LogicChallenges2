package challenge1009;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat outputValue = new DecimalFormat("##,###.00");
		
		String nome;
		double salarioBruto;
		double vendasDoMesEmDinheiro;
		double comissao = 0.15;
		double totalAReceber;
		
		System.out.print("Nome completo: ");
		nome = input.nextLine();
		
		System.out.print("Salário bruto: ");
		salarioBruto = input.nextDouble();
		
		System.out.print("Vendas efetuadas no mês (em dinheiro): ");
		vendasDoMesEmDinheiro = input.nextDouble();

		totalAReceber = (comissao * vendasDoMesEmDinheiro) + salarioBruto;

		System.out.println("\nTOTAL = R$ " + outputValue.format(totalAReceber).replace(",", "."));

		input.close();
	}
}
