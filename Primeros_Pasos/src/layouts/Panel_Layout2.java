package layouts;
import javax.swing.*;
import java.awt.*;

public class Panel_Layout2 extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	}
	public Panel_Layout2 () {
		//Doy posici�n a los botones
		setLayout (new BorderLayout ());
		add (new JButton ("Red"), BorderLayout.WEST);
		add (new JButton ("Green"), BorderLayout.EAST);
		add (new JButton ("Blue"));
	}
}
