import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		String nom = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
		
		int edad1 = Integer.parseInt(edad);
		
		System.out.println("Hola "+nom+". Tienes "+edad+(" a�os."));
		
		System.out.println("Hola "+nom+". El a�o que viene tendr�s "+(edad1+1)+(" a�os."));
	}

}
