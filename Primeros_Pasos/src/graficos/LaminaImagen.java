package graficos;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class LaminaImagen extends JPanel {
	public LaminaImagen() {
		try {
			imagen = ImageIO.read(new File ("src/graficos/baila.gif"));
		}
		catch(IOException e) {
			System.out.println("Error al buscar la imagen");
		}
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		/////////////////////////////////////////////////////////
		//File mi_im = new File("src/graficos/baila.gif");
		/////////////////////////////////////////////////////////
		int ancho = imagen.getWidth(this);
		int alto = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for (int i=0; i<1600; i++) {
			for (int j=0; j< 900; j++) {
				if (i+j > 0) {
					g.copyArea(0, 0, ancho, alto, ancho*i, alto*j);
				}
			}
		}	
	}
	private Image imagen;
}
