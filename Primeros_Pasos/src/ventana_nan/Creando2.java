package ventana_nan;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.*;

public class Creando2 extends JPanel {
	
	private Image im;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Dibujando rectangulo con color", 20, 20);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rect = new Rectangle2D.Double(50, 50, 250, 150);
		g2.draw(rect);
		g2.setPaint(Color.ORANGE);
		g2.draw(rect);
		g2.setPaint(Color.GREEN);
		g2.fill(rect);
		//////////////////////////////////////////////////////
		File  arc = new File ("src/ventana_nan/menu.jpg");
		try {
			im = ImageIO.read(arc);
		}
		catch(IOException e){
			System.out.println("Error al crear la imagen");
		}
		g2.drawImage(im, 150, 200, null);
		Font fuente = new Font ("Arial", Font.BOLD, 30);
		g2.setFont(fuente);
		g2.setColor(Color.BLACK);
		g.drawString("Dibujos de Nancy", 200, 30);
	}
}
