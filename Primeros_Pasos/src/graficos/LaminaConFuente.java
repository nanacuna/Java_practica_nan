package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class LaminaConFuente extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		/////////////////////////////////////////////////
		Font fuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(fuente);
		//g2.setColor(Color.PINK);
		g2.drawString("Nancy", 20, 30);
		///////////////////////////////////////////////
		g2.setFont(new Font ("Arial", Font.ITALIC, 20));
		//g2.setColor(new Color(150,100,150).brighter());
		g2.drawString("Curso de Java", 20, 60);
		
	}

}
