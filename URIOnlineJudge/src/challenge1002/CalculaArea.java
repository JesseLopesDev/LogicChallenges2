package challenge1002;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculaArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat outputValue = new DecimalFormat("#0.0000");
		
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.print("Raio: ");
		raio = input.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.println("\nA=" + outputValue.format(area).replace(",", "."));
		
		input.close();
	}
}
