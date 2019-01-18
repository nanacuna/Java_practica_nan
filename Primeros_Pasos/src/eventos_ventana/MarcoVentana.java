package eventos_ventana;
import javax.swing.*;
import java.awt.*;

public class MarcoVentana extends JFrame {
	public MarcoVentana() {
		//Instancio la clase de la ventana 1
		CapaVentana1 capa1 = new CapaVentana1();
		addWindowListener (capa1);
		//Hago visible la ventana en la pantalla
		setVisible (true);
		//Establezco que hacer cuando se cierra la ventana
		setDefaultCloseOperation (DISPOSE_ON_CLOSE);
		//Creo un marco según la resolucion del monitor.
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		//Establezco las dimensiones
		Dimension dim = resolucion.getScreenSize();
		//Creo 2 variables para guarar el alto y el ancho del marco
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		//Con las variables establezco los puntos de inicio
		//y de localizacion de la ventana.
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
	}
}
