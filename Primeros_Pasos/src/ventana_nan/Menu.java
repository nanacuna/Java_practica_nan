package ventana_nan;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
	public Menu () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension mi_dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = mi_dim.width;
		alto = mi_dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Menú");
		Image button = resolucion.createImage("src/ventana_nan/copia.jpg");
		setIconImage (button);
		
		Capa mi_capa = new Capa ();
		add(mi_capa);
	}
}
