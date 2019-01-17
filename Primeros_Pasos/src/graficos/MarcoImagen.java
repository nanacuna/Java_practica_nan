package graficos;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class MarcoImagen extends JFrame {
	public MarcoImagen() {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Agregando Imagen");
		Image im = resolucion.createImage("src/graficos/panda.jpg");
		setIconImage(im);
		LaminaImagen lamina = new LaminaImagen();
		add(lamina);
		
	}
}
