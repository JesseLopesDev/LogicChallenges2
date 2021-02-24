package challenge1008;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculaSalario {

	public static void main(String[] args) {

		DecimalFormat outputValue = new DecimalFormat("##,###.00");

		int idFuncionario;
		double horasTrabalhadas;
		double valorHoraTrabalhada;
		double salario;
		
		idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Número de indentificação:"));
		
		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas:"));
		
		valorHoraTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Valor recebido por hora trabalhada:"));
		
		salario = horasTrabalhadas * valorHoraTrabalhada;
		
		JOptionPane.showMessageDialog(null, "NUMBER = " + idFuncionario
			+ "\nSALARY = U$ " + outputValue.format(salario).replace(",", "."));
	}
}
