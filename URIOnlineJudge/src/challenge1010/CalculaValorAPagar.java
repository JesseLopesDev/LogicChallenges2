package challenge1010;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculaValorAPagar {

	public static void main(String[] args) {

		DecimalFormat outputValue = new DecimalFormat("##.00");

		double[] informacoesPeca1 = new double[3];
		double[] informacoesPeca2 = new double[3];
		double valorAPagar;

		informacoesPeca1[0] = Double.parseDouble(JOptionPane.showInputDialog("C�digo (pe�a 1):"));

		informacoesPeca1[1] = Double.parseDouble(JOptionPane.showInputDialog("Quantidade (pe�a 1):"));
		
		informacoesPeca1[2] = Double.parseDouble(JOptionPane.showInputDialog("Valor unit�rio (pe�a 1):"));
		
		informacoesPeca2[0] = Double.parseDouble(JOptionPane.showInputDialog("C�digo (pe�a 2):"));
		
		informacoesPeca2[1] = Double.parseDouble(JOptionPane.showInputDialog("Quantidade (pe�a 2):"));
		
		informacoesPeca2[2] = Double.parseDouble(JOptionPane.showInputDialog("Valor unit�rio (pe�a 2):"));

		valorAPagar = (informacoesPeca1[1] * informacoesPeca1[2]) + (informacoesPeca2[1] * informacoesPeca2[2]);
		
		JOptionPane.showMessageDialog(null, "VALOR A PAGAR: R$ " + outputValue.format(valorAPagar).replace(",", "."));
	}
}
