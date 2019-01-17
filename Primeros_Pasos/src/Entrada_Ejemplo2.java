import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		
		int edad1 = Integer.parseInt(edad);
		
		System.out.println("Hola "+nom+". Tienes "+edad+(" años."));
		
		System.out.println("Hola "+nom+". El año que viene tendrás "+(edad1+1)+(" años."));
	}

}
