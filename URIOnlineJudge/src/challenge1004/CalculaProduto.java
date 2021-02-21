package challenge1004;

import javax.swing.JOptionPane;

public class CalculaProduto {

	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		int produto;
		
		valorA = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
		
		valorB = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
		
		produto = valorA * valorB;
		
		JOptionPane.showMessageDialog(null, "PROD = " + produto);
	}
}
