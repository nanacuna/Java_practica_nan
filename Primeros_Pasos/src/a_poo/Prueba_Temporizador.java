package a_poo;
import javax.swing.*;

public class Prueba_Temporizador {

	public static void main(String[] args) {
		
		Hora oyente = new Hora();
		Timer mitemp = new Timer(1000, oyente);
		mitemp.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa ok para detenerlo");
		
		System.exit(0);
		
	}

}
