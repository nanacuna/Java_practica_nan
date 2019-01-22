package multiple_events;
import javax.swing.*;
import java.awt.*;

public class Frame_Multiple extends JFrame {
	public Frame_Multiple () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Eventos Multiples");
		add (new Multiple_Events());
	}
}
