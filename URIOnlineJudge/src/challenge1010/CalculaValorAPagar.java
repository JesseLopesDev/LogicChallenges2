package challenge1010;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculaValorAPagar {

	public static void main(String[] args) {

		DecimalFormat outputValue = new DecimalFormat("##.00");

		double[] informacoesPeca1 = new double[3];
		double[] informacoesPeca2 = new double[3];
		double valorAPagar;

		informacoesPeca1[0] = Double.parseDouble(JOptionPane.showInputDialog("Código (peça 1):"));

		informacoesPeca1[1] = Double.parseDouble(JOptionPane.showInputDialog("Quantidade (peça 1):"));
		
		informacoesPeca1[2] = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário (peça 1):"));
		
		informacoesPeca2[0] = Double.parseDouble(JOptionPane.showInputDialog("Código (peça 2):"));
		
		informacoesPeca2[1] = Double.parseDouble(JOptionPane.showInputDialog("Quantidade (peça 2):"));
		
		informacoesPeca2[2] = Double.parseDouble(JOptionPane.showInputDialog("Valor unitário (peça 2):"));

		valorAPagar = (informacoesPeca1[1] * informacoesPeca1[2]) + (informacoesPeca2[1] * informacoesPeca2[2]);
		
		JOptionPane.showMessageDialog(null, "VALOR A PAGAR: R$ " + outputValue.format(valorAPagar).replace(",", "."));
	}
}
