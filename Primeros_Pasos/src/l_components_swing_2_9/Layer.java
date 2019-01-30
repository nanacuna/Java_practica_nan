package l_components_swing_2_9;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JPanel layer_1 = new JPanel();
	private JMenuBar my_dates = new JMenuBar();
	private JMenu source = new JMenu("Source");
	private JMenu style = new JMenu("Style");
	private JMenu size = new JMenu("Size");
	private JTextPane text = new JTextPane();
	private JPopupMenu emergent = new JPopupMenu();	
	private JMenuItem option_1 = new JMenuItem("Option 1");
	private JMenuItem option_2 = new JMenuItem("Option 2");
	private JMenuItem option_3 = new JMenuItem("Option 3");
	private JButton btn_1 = new JButton("Save");
	public Layer () {
		setLayout(new BorderLayout());
		my_dates.add(source);
		my_dates.add(style);
		my_dates.add(size);
		layer_1.add(my_dates);
		add(layer_1, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		//---------------------------------------------------
		emergent.add(option_1);
		emergent.add(option_2);
		emergent.add(option_3);
		text.setComponentPopupMenu(emergent);
		add(btn_1, BorderLayout.SOUTH);
	}
}
