//import java.util.*;

import javax.swing.JOptionPane;

public class Video22_Condicionantes_9_Factorial {

	//private static Scanner ent;

	public static void main(String[] args) {
		
		/*ent = new Scanner (System.in);
		int i=0, num=0, resul=1;
		
		
		System.out.println("Introduzca un número por favor");
		
		num = ent.nextInt();
		
		//System.out.println("El número ingresado es: "+num);
		
		for (i=1; i<=num; i++) {
			resul*=i;
		}
		
		System.out.println("El resultado del factorial es: "+resul);*/
		
		long resul=1L, i=0;
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número por favor"));
		
		for (i=num; i>0; i--)
			resul *=i;
		
		//System.out.printf ("El factorial de %d es: %d", num, resul);
		System.out.println("El factorial de "+num +" es "+resul);
	}

}
