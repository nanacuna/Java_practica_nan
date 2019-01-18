package practica_con_agus;
import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {
	public Marco () {
		setVisible (true);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Agregando mis propios botones");
		Capa mi_capa = new Capa ();
		add(mi_capa);
		mi_capa.setBackground(SystemColor.DARK_GRAY);
		mi_capa.setForeground(Color.BLACK);
	}
}
