package eventos_botones;
import javax.swing.*;

import java.awt.*;

public class MarcoBoton extends JFrame {
	public MarcoBoton () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto; 
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Botones y Fuentes");
		Image im = resolucion.createImage("src/graficos/gonza.jpg");
		setIconImage (im);
		LaminaBotones lamina = new LaminaBotones ();
		add(lamina);
		lamina.setBackground(SystemColor.window);
	}
}
