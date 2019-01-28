package l_components_swing_1_9;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JLabel text = new JLabel("Debe ser que me pediste un día una canción que fuera del corazón, ahí te va");
	private ButtonGroup group = new ButtonGroup();
	private JPanel layer_radio = new JPanel();
	/*private JRadioButton btn_1 = new JRadioButton("Small", false);
	private JRadioButton btn_2 = new JRadioButton("Medium", true);
	private JRadioButton btn_3 = new JRadioButton("Big", false);
	private JRadioButton btn_4 = new JRadioButton("Very Big", false);
	//private Event_radio my_event = new Event_radio();*/
	public Layer () {
		setLayout(new BorderLayout());
		text.setFont(new Font ("Arial", Font.PLAIN, 12));
		add (text, BorderLayout.CENTER);
		putButton ("Small", false, 10);
		putButton ("Madium", true, 12);
		putButton ("Big", false, 18);
		putButton ("Very Big", false, 26);
		add(layer_radio, BorderLayout.SOUTH);
		/*group.add(btn_1);
		group.add(btn_2);
		group.add(btn_3);
		group.add(btn_4);
		layer_radio.add(btn_1);
		layer_radio.add(btn_2);
		layer_radio.add(btn_3);
		layer_radio.add(btn_4);
		add(layer_radio, BorderLayout.SOUTH);
		btn_1.addActionListener(my_event);
		btn_2.addActionListener(my_event);
		btn_3.addActionListener(my_event);
		btn_4.addActionListener(my_event);*/
	}
	public void putButton(String name, boolean selected, final int size) {
		JRadioButton btn = new JRadioButton(name, selected);
		group.add(btn);
		layer_radio.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Arial", Font.PLAIN, size));
			}
		});
	}
}

/*private class Event_radio implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_1)
			text.setFont(new Font ("Arial", Font.PLAIN, 10));
		else if (e.getSource() == btn_2)
			text.setFont(new Font ("Serif", Font.PLAIN, 12));
		else if (e.getSource() == btn_3)
			text.setFont(new Font ("Serif", Font.PLAIN, 18));
		else if (e.getSource() == btn_4)
			text.setFont(new Font ("Serif", Font.PLAIN, 24));
	}
}*/