package layouts;
import javax.swing.*;
import java.awt.*;

public class Panel_Layout1   extends JPanel {
	//M�todo paint de JPanel
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	}
	//Constructor de la clase
	public Panel_Layout1 () {
		//Posici�n de los botoones
		setLayout(new GridLayout());
		//A�adir nuevos botones
		add (new  JButton ("Pink"));
		add (new  JButton ("Yellow"));
	}
}
