import java.util.*;
import javax.swing.*;

public class Video17_Condicional_2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		System.out.println("Elige una opción: \n1) Cuadrado \n2) Rectángulo \n3) Triángulo \n4) Círculo");
		
		int opcion = entrada.nextInt();
		
		switch (opcion){
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el lado"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2) + " cm²");
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int alt = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es: " + base*alt + " cm²");
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog ("Introduce la base"));
			alt = Integer.parseInt(JOptionPane.showInputDialog ("INtroduce la altura"));
			
			System.out.println("El área del triángulo es: " +(base*alt)/2 + " cm²");
			break;
		case 4:
			int radio = Integer.parseInt (JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.printf("El área del círculo es: %.2f cm²", Math.PI * (Math.pow(radio, 2)));
			break;
		default:
			System.out.println ("La opción elegida es incorrecta");
			break;
		}
	}

}
