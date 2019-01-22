package multiple_events;
import javax.swing.*;
import java.awt.event.*;

public class Multiple_Events extends JPanel {
	public Multiple_Events() {
		JButton azul = new JButton("Azul");
		JButton rojo = new JButton("Rojo");
		JButton verde = new JButton("Verde");
		add (azul);
		add (rojo);
		add (verde);
	}
}
