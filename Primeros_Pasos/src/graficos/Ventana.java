package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;


public class Ventana extends JFrame {
	public Ventana () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension mi_dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = mi_dim.width;
		alto = mi_dim.height;
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Nancy");
		Image mi_im = resolucion.getImage("src/ventana_nan/gonzalo.jpg");
		setIconImage(mi_im);
		Dibujo mi_dib = new Dibujo();
		add(mi_dib);
	}
}
