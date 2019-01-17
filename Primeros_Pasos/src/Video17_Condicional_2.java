import java.util.*;
import javax.swing.*;

public class Video17_Condicional_2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		System.out.println("Elige una opci�n: \n1) Cuadrado \n2) Rect�ngulo \n3) Tri�ngulo \n4) C�rculo");
		
		int opcion = entrada.nextInt();
		
		switch (opcion){
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el lado"));
			System.out.println("El �rea del cuadrado es: " + Math.pow(lado, 2) + " cm�");
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alt = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El �rea del rect�ngulo es: " + base*alt + " cm�");
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog ("Introduce la base"));
			alt = Integer.parseInt(JOptionPane.showInputDialog ("INtroduce la altura"));
			
			System.out.println("El �rea del tri�ngulo es: " +(base*alt)/2 + " cm�");
			break;
		case 4:
			int radio = Integer.parseInt (JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.printf("El �rea del c�rculo es: %.2f cm�", Math.PI * (Math.pow(radio, 2)));
			break;
		default:
			System.out.println ("La opci�n elegida es incorrecta");
			break;
		}
	}

}
