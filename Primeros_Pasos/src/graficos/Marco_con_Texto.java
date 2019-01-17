package graficos;
import javax.swing.*;
import java.awt.*;

public class Marco_con_Texto extends JFrame{
	public Marco_con_Texto() {
		setVisible (true);
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dimen = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dimen.width;
		alto = dimen.height;
		setSize (ancho/2, alto/2);
		setLocation (ancho/4, alto/4);
		
		/*setSize(600,450);
		setLocation(400,200);*/
		
		Image miImagen = resolucion.getImage("src/graficos/panda.jpg");
		setIconImage(miImagen);
		
		setTitle ("Texto");
		
		Cristal miCristal = new Cristal();
		add(miCristal);
	}
}
