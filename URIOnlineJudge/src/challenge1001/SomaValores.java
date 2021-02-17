package challenge1001;

import java.util.Scanner;

public class SomaValores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valorA;
		int valorB;
		int soma;
		
		System.out.print("Primeiro valor: ");
		valorA = input.nextInt();
		
		System.out.print("Segundo valor: ");
		valorB = input.nextInt();
		
		soma = valorA + valorB;
		
		System.out.println("\nX = " + soma);
		
		input.close();
	}
}
