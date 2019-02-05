package a_exception_2;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class Layer extends JPanel {
	private Image imagen;
	public Layer() {
		try {
			imagen = ImageIO.read(new File ("../Text_Builder/assets/theme/red.png"));
		}catch(IOException e) {
			System.out.println("Error al buscar la imagen");
		}
	}
	public void paintComponent (Graphics g) throws NullPointerException{
		
		super.paintComponent(g);
		
		try {
			int ancho = imagen.getWidth(this);
			int alto = imagen.getHeight(this);
			g.drawImage(imagen, 0, 0, null);
			for (int i=0; i<1600; i++) {
				for (int j=0; j< 900; j++) {
					if (i+j > 0)
						g.copyArea(0, 0, ancho, alto, ancho*i, alto*j);
				}
			}		
		}catch(NullPointerException e) {
			g.drawString("No es posible cargar la imagen", 10, 20);
		}
	}
}
