package a_exception_1;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		int [] vect = new int[5];
		String name;
		int age;
		
		for (int i=0; i<5; i++)
			vect[i] = (int) (Math.random()*100);
		for (int i=0; i<5; i++)
			System.out.println("Posición: "+(i+1)+"= "+vect[i]);
		
		//Posición de datos
		name = JOptionPane.showInputDialog("Introduce your name: ");
		age = Integer.parseInt(JOptionPane.showInputDialog("Introduce your age: "));
		System.out.println("Hola "+name+"\nTienes "+age+" años"+"\nEl programa terminó su ejecución.");
	}

}
