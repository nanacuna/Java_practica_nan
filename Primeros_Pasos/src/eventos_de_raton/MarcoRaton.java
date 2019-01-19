package eventos_de_raton;
import javax.swing.*;
import java.awt.*;

public class MarcoRaton extends JFrame {
	public MarcoRaton() {
		setVisible (true);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Eventos de raton");
		addMouseListener (new EventosDelRaton());
	}
}
