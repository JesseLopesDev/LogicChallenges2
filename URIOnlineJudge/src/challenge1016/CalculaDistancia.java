package challenge1016;

import javax.swing.JOptionPane;

public class CalculaDistancia {

	public static void main(String[] args) {
		
		int distanciaEmKm;
		int tempo = 60;
		int distanciaCarroY = 30;
		int tempoNecessario;

		distanciaEmKm = Integer.parseInt(JOptionPane.showInputDialog("Distância em km:"));
		
		tempoNecessario = (tempo * distanciaEmKm) / distanciaCarroY;
		
		JOptionPane.showMessageDialog(null, tempoNecessario + " minutos");
	}
}
