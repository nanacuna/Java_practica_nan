package components_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayerComponents extends JPanel {
	private JPanel layer2  = new JPanel();
	private JTextField text_field = new JTextField (20);
	private JLabel label = new JLabel("Introduzca su Email: ");
	private JLabel result = new JLabel("",  JLabel.CENTER);
	private GetKey key = new GetKey();
	private JButton btn = new JButton(key);
	private GetText text = new GetText();
	private int at;
	private boolean point;
	private String mail;
	private InputMap entry;
	private ActionMap map;
	//-----------------------------------------
	public LayerComponents () {
		setLayout (new BorderLayout());
		
		add(layer2, BorderLayout.NORTH);
		layer2.setLayout(new FlowLayout());
		
		result.getForeground().getColorSpace();
				
		layer2.add(label);		
		layer2.add (text_field);
		
		add(result, BorderLayout.CENTER);
		
		btn.addActionListener(text);
		
		layer2.add (btn);
		//------------------------------------------
		entry = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		entry.put(KeyStroke.getKeyStroke("ctrl A"), "OK");
		map = getActionMap();
		map.put("OK", key);
	}
	private class GetText implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent e) {
			at = 0;
			mail = text_field.getText().trim();
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
			putValue (Action.SHORT_DESCRIPTION, "Presione el bot�n para ingresar su mail o ENTER");
			putValue("ENTER", key);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String nom = (String) getValue("ENTER");
		}
	}
}
