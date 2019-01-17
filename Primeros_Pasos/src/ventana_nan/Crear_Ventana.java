package ventana_nan;
import javax.swing.*;
import java.awt.*;

public class Crear_Ventana extends JFrame{
	
	public Crear_Ventana () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension midim = resolucion.getScreenSize();
		
		int ancho, alto;
		ancho = midim.width;
		alto = midim.height;
		
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		
		setVisible(true);
		setTitle("Ventana de Nancy");
		
		Image mi_imagen = resolucion.createImage("src/ventana_nan/gonzalo.jpg");
		setIconImage(mi_imagen);
		
		Dibujo_Marco mi_marco = new Dibujo_Marco();
		add (mi_marco);
	}

}
