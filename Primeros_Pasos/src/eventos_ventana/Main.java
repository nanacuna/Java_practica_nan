package eventos_ventana;

public class Main {
	public static void main (String [] args) {
		MarcoVentana marco1 = new MarcoVentana();
		MarcoVentana marco2 = new MarcoVentana();
		marco1.setTitle ("Ventana 1");
		marco2.setTitle("Ventana 2");
		marco1.setBounds(100, 100, 800, 450);
	}
}
