package graficos;
import java.util.Scanner;

import javax.sswing.*;
import javax.swing.JFrame;

public class Eventos_Ventana {

	public static void main(String[] args) {
		MarcoVentana marco = new MarcoVentana();
		
		
		int num;
		
		num = new Scanner(System.in).nextInt();
		
		marco.setVisible (true);
		marco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}
