package b_clausula_finally;
import java.util.*;

import javax.swing.JOptionPane;

public class Main {
	static int figura;
	public static void main (String [] args) {
		Scanner entry = new Scanner (System.in);
		int lado, base, altura, radio;
		
		System.out.println("Elige una opción: ");
		System.out.println("1. Cuadrado");
		System.out.println("2. Rectángulo");
		System.out.println("3. Triángulo");
		System.out.println("4. Círculo");
		
		try {
			figura = entry.nextInt();
		}catch(Exception e) {
			System.out.println("Debes introducir un número no letras");
		}finally {
			entry.close();
		}
		
		switch (figura) {
		case 1:
			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println(Math.pow(lado, 2));
			break;
		case 2:
			base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base: "));
			altura  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa al altura: "));
			System.out.println("El área del rectángulo es: "+base*altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las base: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Ingressa la altura: "));
			System.out.println("El área del triángulo es: "+(base*altura)/2);
			break;
		case 4:
			radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio: "));
			System.out.print("El área del círculo es: ");
			System.out.println(Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opción elegida es incorrecta");
			break;
		}
		//---------------------------------------------------------------
		altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura: "));
		System.out.println("Si eres hombre tu peso ideal es: "+(altura-110)+" kg.");
		System.out.println("Si eres mujer tu altura ideal es: "+(altura-120)+" kg.");
	}
}
