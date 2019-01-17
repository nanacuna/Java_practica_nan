package ventana_nan;
import javax.swing.*;
import java.awt.*;

public class Creando1 extends JFrame {
	public Creando1 () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Nancy");
		Image im = resolucion.createImage("src/ventana_nan/menu.jpg");
		setIconImage (im);
		Creando2 crear = new Creando2();
		add(crear);
		//crear.setBackground(SystemColor.window);
		crear.setBackground(Color.CYAN);
		crear.setForeground(Color.RED);
	}
}
