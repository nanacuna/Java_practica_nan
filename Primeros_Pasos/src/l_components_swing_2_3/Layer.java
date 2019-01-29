package l_components_swing_2_3;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private JLabel label = new JLabel("Nadie nunca me dió tanta paz");
	private JSlider control = new JSlider(8, 50, 12);
	private JPanel layer_control = new JPanel();
	private ChangeControl change = new ChangeControl();
	private static int counter;
	public Layer () {
		setLayout(new BorderLayout());
		add (label, BorderLayout.CENTER);
		layer_control.setBackground(SystemColor.window);
		layer_control.add(control);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font ("Serif", Font.ITALIC, 10));
		control.addChangeListener(change);
		add(layer_control, BorderLayout.NORTH);
	}
	private class ChangeControl implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			//counter++;
			//stem.out.println("Estas moviendo el Slider: " +control.getValue());
			label.setFont(new Font ("Serif", Font.PLAIN, control.getValue()));
		}
	}
}
