package l_components_swing_2_7;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1){
		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	});
	private Dimension dim = new Dimension(100, 20);
	public Layer () {
		control.setPreferredSize(dim);
		add(control);
	}
}

