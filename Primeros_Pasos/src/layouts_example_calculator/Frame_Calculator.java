package layouts_example_calculator;
import javax.swing.*;
import java.awt.*;

public class Frame_Calculator extends JFrame{
	public Frame_Calculator () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int  ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		Image im = resolucion.getImage("imagenes/red.png");
		setIconImage (im);
		setTitle ("Calculator");
		//Instancio la primer lámina
		Sheet_Calculator1 sheet1 = new Sheet_Calculator1 ();
		//Agrego la primer lámina
		add (sheet1, BorderLayout.NORTH);
		//Le  doy color de fondo a la primer lámina
		sheet1.setBackground(SystemColor.window);
	}
}
