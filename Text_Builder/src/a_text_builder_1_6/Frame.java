package a_text_builder_1_6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
	private JPanel layer = new JPanel();
	private JMenu my_menu = new JMenu("Color");
	private JMenuBar menu_bar = new JMenuBar();
	private ColorAction action_red = new ColorAction("Red", new ImageIcon("../Primeros_Pasos/imagenes/red.png"), new Color(221, 79, 67));
	private ColorAction action_green = new ColorAction("Green", new ImageIcon("../Primeros_Pasos/imagenes/green.png"), new Color(23, 160, 93));
	private ColorAction action_blue = new ColorAction("Blue", new ImageIcon("../Primeros_Pasos/imagenes/blue.png"), new Color(75, 139, 244));
	private JToolBar tool_bar = new JToolBar();
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
		InputMap entryMap = layer.getInputMap (JPanel.WHEN_IN_FOCUSED_WINDOW);
		entryMap.put(KeyStroke.getKeyStroke("ctrl R"), "Background Red");
		entryMap.put(KeyStroke.getKeyStroke("ctrl G"), "Background Green");
		entryMap.put(KeyStroke.getKeyStroke("ctrl B"), "Background Blue");
		ActionMap  map = layer.getActionMap();
		map.put("Background Red", action_red);
		map.put("Background Green", action_green);
		map.put("Background Blue", action_blue);
		//---------------------------------------------------------------------------------------------------------------------------------------
		my_menu.add(action_red);
		my_menu.add(action_green);
		my_menu.add(action_blue);
		//---------------------------------------------------------------------------------------------------------------------------------------
		menu_bar.add(my_menu);
		setJMenuBar(menu_bar);
		//---------------------------------------------------------------------------------------------------------------------------------------
		tool_bar.add(action_red);
		tool_bar.add(action_green);
		tool_bar.add(action_blue);
		tool_bar.addSeparator();
		tool_bar.add(new CloseWindow());
		add(tool_bar, BorderLayout.NORTH);
		
	}
////////////Clase Interna////////////////////////////////////////
	private class ColorAction extends AbstractAction {
		public ColorAction (String nombre, Icon icono, Color color) {
			putValue (Action.NAME, nombre);
			putValue (Action.SMALL_ICON, icono);
			putValue (Action.SHORT_DESCRIPTION, "Puts the color sheet "+nombre);
			putValue ("Background_color ", color);
		}
		public void actionPerformed(ActionEvent e){
			Color c = (Color) getValue("Background_color ");
			layer.setBackground (c);
		}
	}
	private class CloseWindow extends AbstractAction{
		CloseWindow(){
			putValue(SHORT_DESCRIPTION, "Cerrar Ventana");
			putValue(SMALL_ICON, new ImageIcon("assets/theme/close.png"));
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	}
}
