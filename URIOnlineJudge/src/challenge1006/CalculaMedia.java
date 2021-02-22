package challenge1006;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		double notaA;
		double notaB;
		double notaC;
		double media;
		
		double pesoNotaA = 2.0;
		double pesoNotaB = 3.0;
		double pesoNotaC = 5.0;
		double somaPesos = pesoNotaA + pesoNotaB + pesoNotaC;
		
		notaA = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
		
		notaB = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
		
		notaC = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));

		media = ((notaA * pesoNotaA) + (notaB * pesoNotaB) + (notaC * pesoNotaC)) / somaPesos;
		
		JOptionPane.showMessageDialog(null, "MEDIA = " + media);
	}
}
