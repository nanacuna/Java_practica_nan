package action;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame {
	
	JButton btn = new JButton(new Saludo("Saludo 2", "Hola te estoy saludando"));
	
	JPanel layer  = new JPanel();
	////////////////////////////////////////////////////
	public Ventana () {
		Toolkit resolucion =  Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds(ancho/4, alto/4, ancho/3, alto/3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Prueba");
		add(layer);
		layer.add(btn);
		
	}

	class Saludo extends AbstractAction{
		public Saludo(String nombre, String saludo) {
			putValue(NAME, nombre);
			putValue (SHORT_DESCRIPTION, saludo);
		}
		@Override
		public void actionPerformed (ActionEvent e) {
			System.out.println("hola");
		}
	}
}




