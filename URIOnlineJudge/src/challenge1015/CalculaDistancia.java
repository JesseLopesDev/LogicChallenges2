package challenge1015;

import java.util.Scanner;

public class CalculaDistancia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] plano1 = new double[2];
		double[] plano2 = new double[2];
		double distancia;
		
		System.out.print("Valor do eixo X (plano 1): ");
		plano1[0] = input.nextDouble();
		
		System.out.print("\nValor do eixo y (plano 1): ");
		plano1[1] = input.nextDouble();
		
		System.out.print("\nValor do eixo X (plano 2): ");
		plano2[0] = input.nextDouble();
		
		System.out.print("\nValor do eixo y (plano 2): ");
		plano2[1] = input.nextDouble();
		
		distancia = Math.sqrt(Math.pow((plano2[0] - plano1[0]), 2) + Math.pow((plano2[1] - plano1[1]), 2));
		
		System.out.println(String.format("\n%.4f", distancia).replace(",", "."));
		
		input.close();
	}
}
