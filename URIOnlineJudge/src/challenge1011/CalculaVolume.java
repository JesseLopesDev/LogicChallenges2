package challenge1011;

import java.util.Scanner;

public class CalculaVolume {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int raio;
		double volume;
		final float PI = 3.14159F;
		
		System.out.print("Raio da esfera: ");
		raio = input.nextInt();
		
		volume = (4/3.0) * PI * Math.pow(raio, 3);
		
		System.out.println(String.format("\nVOLUME = %.3f", volume).replace(",", "."));
		
		input.close();
	}
}
