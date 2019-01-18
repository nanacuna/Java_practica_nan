package eventos_ventana;
import javax.swing.*;
import java.awt.*;

public class MarcoConAdaptador extends JFrame {
	public MarcoConAdaptador () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/3, alto/3);
		setVisible (true);
		/*CapaConAdaptador capa1 = new CapaConAdaptador();
		addWindowListener(capa1);*/
		addWindowListener(new CapaConAdaptador());
	}
}
