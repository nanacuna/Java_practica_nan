package l_components_swing_2_2;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private Color red =  new Color (220, 77, 65);
	private JSlider control = new JSlider(SwingConstants.VERTICAL, 0, 100, 25);
	public Layer () {
		// setLayout(new BorderLayout());
		control.setOrientation(SwingConstants.HORIZONTAL);
		control.getColorModel();
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		control.setPaintTicks(true);
		control.setFont(new Font ("Foret", Font.ITALIC, 18));
		control.setPaintLabels(true);
		//control.setSnapToTicks(true);
		add(control);
	}
}
