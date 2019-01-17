//import javax.swing.*;
//import java.lang.*;

public class Video24_Uso_Arrays_2 {

	public static void main(String[] args) {
		
		//String [] paises = new String [8];
		
		int [] num = new int [150];
		int i=0;
		
		/*paises[0] = "Argentina";
		paises[1] = "México";
		paises[2] = "Colombia";
		paises[3] = "Perú";
		paises[4] = "Chile";
		paises[5] = "España";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";*/
		
		/*for (i=0; i<paises.length; i++) {
			System.out.println("País " + (i+1) +": " + paises[i]);
		}*/
		
		/*for (i=0; i<paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce el país " + (i+1));
		}*/
		
		//Bucle FOR EACH
		/*for (String elemento: paises) {
			i++;
			System.out.printf("País %d: %s\n", i, elemento);
			
		}*/
		
		for (i=0; i<num.length; i++) {
			num[i] = (int) Math.round(Math.random()*100);
		}
		
		i=0; 
		
		for (int elem: num) {
			i++;
			System.out.printf("Posición %d: número = %d\n", i, elem);
		}
		
	}

}
