package a_poo;
import javax.swing.*;

public class Temporizador {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj ();
		
		mireloj.Corriendo(1000, true);
		
		JOptionPane.showMessageDialog(null, "Ok para finalizar");
		System.exit(0);
	}

}
