package challenge1003;

import javax.swing.JOptionPane;

public class SomaValores {

	public static void main(String[] args) {

		int valorA;
		int valorB;
		int soma;
		
		valorA = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
		
		valorB = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
		
		soma = valorA + valorB;
		
		JOptionPane.showMessageDialog(null, "SOMA = " + soma);
	}
}
