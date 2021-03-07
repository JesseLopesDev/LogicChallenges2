package challenge1018;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class VerificaNotas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		DecimalFormat outputValue = new DecimalFormat("##0.00");

		ArrayList<Integer> notas = new ArrayList<Integer>(7);
		
		int valor;
		
		notas.add(0, 100);
		notas.add(1, 50);
		notas.add(2, 20);
		notas.add(3, 10);
		notas.add(4, 5);
		notas.add(5, 2);
		notas.add(6, 1);
		
		System.out.print("Valor a ser verificado: ");
		valor = input.nextInt();
		
		for (int i = 0; i <= notas.get(i); i++) {
			System.out.println(valor / notas.get(i)
				+ " nota(s) de R$ " + outputValue.format(notas.get(i)));
			
			valor = valor % notas.get(i);
		}
		
		input.close();
	}
}
