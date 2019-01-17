package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class LaminaConFiguras extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		//g.drawRect(150, 50, 200, 200);
		//g.drawLine(150, 50, 300, 200);
		//g.drawArc(400, 225, 300, 600, 45, 360);
		//g.draw3DRect(100, 100, 300, 150, false);
		//g.drawOval(150, 100, 200, 100);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.BLACK);
		//g2.fill(rect);
		g2.draw(rect);
		g2.setPaint(Color.RED);
		g2.fill(rect);
		
		//Ellipse2D elipse = new Ellipse2D.Double(100, 100, 200, 150);
		//g2.draw(elipse);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		//g2.setPaint(Color.BLUE);
		Color mi_color = new Color (255, 150, 100);
		g2.setPaint(mi_color);
		elipse.setFrame(rect);
		g2.fill(elipse);
		//g2.draw(elipse);
		
		/*g2.draw(new Line2D.Double(100, 100, 300, 250));
		g2.draw(new Line2D.Double(100, 250, 300, 100));
		//g2.draw(new Line2D.Double(100, 250, 300, 100));
		//g2.draw(new Line2D.Double(300, 250, 100, 100));
		g2.draw(new Line2D.Double(200, 100, 200, 250));
		g2.draw(new Line2D.Double(100, 175, 300, 175));
		
		double centroX = rect.getCenterX();
		double centroY = rect.getCenterY();
		double radio = 125;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);*/
		
	}

}
