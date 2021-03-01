package challenge1013;

import java.util.ArrayList;

public class ImprimeNumeroMaior {

	public static void main(String[] args) {
		
		int maiorEntreAB;
		int maiorEntreXC;

		ArrayList<Integer> valores = new ArrayList<Integer>(3);

		valores.add(0, 7);
		valores.add(1, 14);
		valores.add(2, 106);
		
		maiorEntreAB = (valores.get(0) + valores.get(1) + Math.abs(valores.get(0) - valores.get(1))) / 2;
		
		maiorEntreXC = (maiorEntreAB + valores.get(2) + Math.abs(maiorEntreAB - valores.get(2))) / 2;
		
		System.out.println(maiorEntreXC + " eh o maior");
	}
}
