package challenge1005;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat outputValue = new DecimalFormat("#.#####");
		
		double notaA;
		double notaB;
		double media;
		
		double pesoNotaA = 3.5;
		double pesoNotaB = 7.5;
		double somaPesos = pesoNotaA + pesoNotaB;
		
		System.out.print("Primeira nota: ");
		notaA = input.nextDouble();
		
		System.out.print("Segunda nota: ");
		notaB = input.nextDouble();
		
		media = ((notaA * pesoNotaA) + (notaB * pesoNotaB)) / somaPesos;
		
		System.out.println("\nMEDIA = " + outputValue.format(media).replace(",", "."));
		
		input.close();
	}
}
