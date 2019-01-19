package eventos_de_raton;
import javax.swing.*;
import java.awt.*;

public class AdaptadorMarcoRaton extends JFrame {
	public AdaptadorMarcoRaton() {
		setVisible (true);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Eventos del mouse");
		//AdaptadorDeEventosDelMouse mouse = new AdaptadorDeEventosDelMouse();
		//addMouseAdapter (new AdaptadorDeEventosDelMouse());
		addMouseListener (new AdaptadorDeEventosDelMouse());
	}
}
