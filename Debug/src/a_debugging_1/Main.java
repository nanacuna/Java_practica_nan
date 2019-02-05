package a_debugging_1;

import javax.swing.*;

public class Main {
	public static void main (String [] args) {
		int elementos;
		elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los elementos de la matriz"));
		int [] vector = new int[elementos];
		
		for(int i=0; i<vector.length; i++)
			vector[i] = (int) (Math.random()*100);
		
		for (int elem: vector)
			System.out.println(elem);
	}
}
