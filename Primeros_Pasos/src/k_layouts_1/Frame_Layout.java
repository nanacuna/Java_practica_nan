package k_layouts_1;
import javax.swing.*;
import java.awt.*;

public class Frame_Layout extends JFrame{
	public Frame_Layout  () {
		Toolkit  resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho  = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle  ("Layouts");
		//Instancio la clase FlowLayout
		Panel_Layout1 sheet = new Panel_Layout1();
		add (sheet, BorderLayout.NORTH);
		/*FlowLayout provision = new FlowLayout(FlowLayout.LEFT);
		sheet.setLayout (provision);*/
		//Forma abreviada de instanciar la clase y darle posición
		add (new Panel_Layout2 (), BorderLayout.SOUTH);
	}
}
