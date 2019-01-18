package eventos_ventana;

import javax.swing.JFrame;

public class Menu {

	public static void main(String[] args) {
		MarcoConAdaptador marco1 = new MarcoConAdaptador();
		MarcoConAdaptador marco2 = new MarcoConAdaptador();
		
		marco1.setTitle("Primera Ventana de Prueba");
		marco1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		marco2.setTitle("Segunda Ventana de Prueba");
		marco2.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
		marco2.setBounds(50, 50, 533, 300);
	}

}
