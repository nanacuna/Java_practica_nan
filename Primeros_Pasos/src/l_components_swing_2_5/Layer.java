package l_components_swing_2_5;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JSpinner spinner = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
	Dimension dim = new Dimension(100, 20);
	public Layer () {
		spinner.setPreferredSize(dim);
		add(spinner);
	}
}
