package challenge1017;

import java.util.Scanner;

public class CalculaCombustivel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int consumoMedioDoVeiculo = 12;
		int tempoGastoEmHoras;
		int velocidadeMedia;
		double distanciaPercorrida;
		double combustivelNecessario;
		
		System.out.print("Tempo gasto na viagem (em horas): ");
		tempoGastoEmHoras = input.nextInt();
		
		System.out.print("Velocidade média (em km/h): ");
		velocidadeMedia = input.nextInt();
		
		distanciaPercorrida = tempoGastoEmHoras * velocidadeMedia;
		
		combustivelNecessario = distanciaPercorrida / consumoMedioDoVeiculo;
		
		System.out.println("\n" + String.format("%.3f", combustivelNecessario).replace(",", "."));
		
		input.close();
	}
}
