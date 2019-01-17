import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		int ancho = 900, alto = 600;
		
		setSize(ancho, alto);
		setLocation(800-(ancho/2),450-alto/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Nancy");
		
		
	}

}
