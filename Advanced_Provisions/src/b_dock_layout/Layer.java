package b_dock_layout;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JButton btn_1 = new JButton("Button 1");
	private JButton btn_2 = new JButton("Button 2");
	private JButton btn_3 = new JButton("Button 3");
	private SpringLayout layer = new SpringLayout();
	private Spring my_dock = Spring.constant(0, 10, 100);
	private Spring rigid_dock = Spring.constant(5);
	public Layer () {
		setLayout(layer);
		add(btn_1);
		add(btn_2);
		add(btn_3);
		layer.putConstraint(SpringLayout.WEST, btn_1, my_dock, SpringLayout.WEST, this);
		layer.putConstraint(SpringLayout.WEST, btn_2, rigid_dock, SpringLayout.EAST, btn_1);
		layer.putConstraint(SpringLayout.WEST, btn_3, rigid_dock, SpringLayout.EAST, btn_2);
		layer.putConstraint(SpringLayout.EAST, this, my_dock, SpringLayout.EAST, btn_3);
		
	}
}
