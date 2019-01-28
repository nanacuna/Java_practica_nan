package l_components_swing_1_2;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import java.awt.Color;
import java.awt.event.*;

public class Layer extends JPanel {
	
	Color green = new Color(26, 161, 96);
	Color blue = new Color(75, 139, 244);
	Color red = new Color(221, 83, 71);
	JButton btn_2 = new JButton( new btn_action_2("Nancy", red, "imagenes/red.png") );
	JButton btn_3 = new JButton( new btn_action_2("Nancy green", green, "imagenes/green.png") );
	JButton btn_4 = new JButton( new btn_action_2("Nancy blue", blue, "imagenes/blue.png") );
	
	public Layer () {
		add(btn_2);
		add(btn_3);
		add(btn_4);
	}
	
	
	private class btn_action_2 extends AbstractAction {
		private Color color;
		public btn_action_2(String nom, Color color, String icon) {
			putValue(NAME, nom);
			this.color = color;
			putValue(SMALL_ICON, new ImageIcon(icon) );
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}
		
	}
	
}
