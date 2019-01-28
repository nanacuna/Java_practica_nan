package l_components_swing_1_8;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private ButtonGroup group_1 = new ButtonGroup();
	private ButtonGroup group_2 = new ButtonGroup();
	private JRadioButton btn_1 = new JRadioButton("Red", true);
	private JRadioButton btn_2 = new JRadioButton("Green", false);
	private JRadioButton btn_3 = new JRadioButton("Blue", false);
	private JRadioButton btn_4 = new JRadioButton("Male", false);
	private JRadioButton btn_5 = new JRadioButton("Female", false);
	public Layer () {
		group_1.add(btn_1);
		group_1.add(btn_2);
		group_1.add(btn_3);
		group_2.add(btn_4);
		group_2.add(btn_5);
		add(btn_1);
		add(btn_2);
		add(btn_3);
		add(btn_4);
		add(btn_5);
	}
}
