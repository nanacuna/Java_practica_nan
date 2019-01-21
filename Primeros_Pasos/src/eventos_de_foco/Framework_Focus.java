package eventos_de_foco;
import javax.swing.*;
import java.awt.*;

public class Framework_Focus extends JFrame {
	public Framework_Focus () {
		setVisible (true);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Probando Foco");
		add (new Focus_Event());
	}
}
