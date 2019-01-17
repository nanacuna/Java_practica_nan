package graficos;
import javax.swing.*;
import java.awt.*;

public class MarcoConFuentes extends JFrame {
	public MarcoConFuentes() {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Prueba Fuente");
		Image im = resolucion.createImage("src/graficos/panda.jpg");
		setIconImage(im);
		LaminaConFuente lamina = new LaminaConFuente();
		add(lamina);
		lamina.setForeground(Color.PINK);
	}

}
