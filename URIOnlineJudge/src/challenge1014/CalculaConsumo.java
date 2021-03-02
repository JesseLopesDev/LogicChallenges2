package challenge1014;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaConsumo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat outputValue = new DecimalFormat("###.###");
		
		int distanciaPercorrida;
		double combustivelGasto;
		double consumoMedio;
		
		System.out.print("Distância total percorrida: ");
		distanciaPercorrida = input.nextInt();
		
		System.out.print("Combustível gasto: ");
		combustivelGasto = input.nextDouble();
		
		consumoMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.println("\n" + outputValue.format(consumoMedio).replace(",", ".") + " km/l");
		
		input.close();
	}
}
