package challenge1012;

import javax.swing.JOptionPane;

public class CalculaAreas {

	public static void main(String[] args) {
		
		double[] valor = new double[3];
		final float PI = 3.14159f;
		double triangulo;
		double circulo;
		double trapezio;
		double quadrado;
		double retangulo;
		
		valor[0] = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor:"));
		valor[1] = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor:"));
		valor[2] = Double.parseDouble(JOptionPane.showInputDialog("Terceiro valor:"));
		
		triangulo = (valor[0] * valor[2]) / 2;
		circulo = PI * Math.pow(valor[2], 2);
		trapezio = ((valor[0] + valor[1]) * valor[2]) / 2;
		quadrado = valor[1] * valor[1];
		retangulo = valor[0] * valor[1];
		
		JOptionPane.showMessageDialog(null, String.format("TRIANGULO: %.3f", triangulo).replace(",", ".")
			+ String.format("\nCIRCULO: %.3f", circulo).replace(",", ".")
			+ String.format("\nTRAPEZIO: %.3f", trapezio).replace(",", ".")
			+ String.format("\nQUADRADO: %.3f", quadrado).replace(",", ".")
			+ String.format("\nRETANGULO: %.3f", retangulo).replace(",", "."));
	}
}
