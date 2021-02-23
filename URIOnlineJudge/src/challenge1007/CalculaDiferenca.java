package challenge1007;

import java.util.Scanner;

public class CalculaDiferenca {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] valores = new int[4];
		int diferenca;

		for (int index = 0; index < valores.length; index += 1) {
			
			System.out.print("Valor " + index + ": ");
			valores[index] = input.nextInt();
		}

		diferenca = ((valores[0] * valores[1]) - (valores[2] * valores[3]));

		System.out.println("\nDIFERENCA = " + diferenca);
		
		input.close();
	}
}
