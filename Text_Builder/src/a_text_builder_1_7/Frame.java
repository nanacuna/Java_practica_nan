package a_text_builder_1_7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
	private JPanel layer = new JPanel();
	private JMenu my_menu = new JMenu("Color");
	private JMenuBar menu_bar = new JMenuBar();
	private Color_Action action_red = new Color_Action("Red", new ImageIcon("../Primeros_Pasos/imagenes/red.png"), new Color(221, 79, 67));
	private Action action_green = new Color_Action("Green", new ImageIcon("../Primeros_Pasos/imagenes/green.png"), new Color(23, 160, 93));
	private Action action_blue = new Color_Action("Blue", new ImageIcon("../Primeros_Pasos/imagenes/blue.png"), new Color(75, 139, 244));
	public Frame () {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle ("Eventos Multiples");
		add (layer);
		//---------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------
		/*InputMap EntryMap = getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW);
		EntryMap.put(KeyStroke.getKeyStroke("ctrl R"), "Background Red");
		EntryMap.put(KeyStroke.getKeyStroke("ctrl G"), "Background Green");
		EntryMap.put(KeyStroke.getKeyStroke("ctrl B"), "Background Blue");
		ActionMap  Map = getActionMap();
		Map.put("Background Red", action_red);
		Map.put("Background Green", action_green);
		Map.put("Background Blue", action_blue);*/
		//---------------------------------------------------------------------------------------------------------------------------------------
		my_menu.add(action_red);
		my_menu.add(action_green);
		my_menu.add(action_blue);
		//---------------------------------------------------------------------------------------------------------------------------------------
		menu_bar.add(my_menu);
		setJMenuBar(menu_bar);
	}
////////////Clase Interna////////////////////////////////////////
	private class Color_Action extends AbstractAction {
		public Color_Action (String nombre, Icon icono, Color color) {
			putValue (Action.NAME, nombre);
			putValue (Action.SMALL_ICON, icono);
			putValue (Action.SHORT_DESCRIPTION, "Puts the color sheet "+nombre);
			putValue ("Background_color ", color);
		}
		public void actionPerformed(ActionEvent e){
			Color c = (Color) getValue("Background_color ");
			setBackground (c);
		}
	}
}
