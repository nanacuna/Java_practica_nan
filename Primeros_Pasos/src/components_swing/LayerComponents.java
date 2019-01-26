package components_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayerComponents extends JPanel {
	private JPanel layer2;
	private JTextField field;
	private JLabel label;
	private JLabel result;
	private JButton btn;
	private GetText text;
	private int at;
	private boolean point;
	private String mail;
	private InputMap entry;
	private ActionMap map;
	private GetKey key;
	//-----------------------------------------
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	}
	public LayerComponents () {
		setLayout (new BorderLayout());
		//------------------------------------------
		layer2  = new JPanel();
		add(layer2, BorderLayout.NORTH);
		layer2.setLayout(new FlowLayout());
		//-----------------------------------------
		result = new JLabel("",  JLabel.CENTER);
		result.getForeground().getColorSpace()   ;
		//------------------------------------------
		label = new JLabel("Introduzca su Email: ");
		layer2.add(label);
		//------------------------------------------
		field = new JTextField (20);
		layer2.add (field);
		//------------------------------------------
		add(result, BorderLayout.CENTER);
		//-------------------------------------------
		key = new GetKey ();
		//-----------------------------------------
		btn = new JButton(key);
		text = new GetText();
		btn.addActionListener(text);
		layer2.add (btn);
		//------------------------------------------
		entry = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		entry.put(KeyStroke.getKeyStroke("ENTER"), "OK");
		map = getActionMap();
		map.put("OK", key);
	}
	private class GetText implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent e) {
			at = 0;
			mail = field.getText().trim();
			for (int i=0; i<mail.length(); i++) {
				if (mail.charAt(i) == '@')
					at++;
				if (mail.charAt(0)=='.' || mail.charAt(mail.length()-1)=='.')
					point = false;
				else
					point = true;
			}
			//----------------------------------------------------------------
			if ( at != 1  || point == false)
				result.setText("Email Incorrecto");
			else
				result.setText("Email Correcto");
		}
	}
	private class GetKey extends AbstractAction{
		public GetKey () {
			putValue (Action.NAME, "OK");
			putValue (Action.SHORT_DESCRIPTION, "Presione el botón para ingresar su mail o ENTER");
			putValue("ENTER", key);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String nom = (String) getValue("ENTER");
		}
	}
}
