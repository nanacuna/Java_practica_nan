package l_components_swing_2_4;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private String lista [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	private JSpinner control  = new JSpinner(new SpinnerListModel(lista));
	private Dimension dim = new Dimension(150, 20);
	public Layer () {
		//setLayout(new BorderLayout());
		control.setPreferredSize(dim);
		add(control, BorderLayout.NORTH);
	}
}
