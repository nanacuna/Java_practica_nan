package a_multiple_events;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multiple_Events extends JPanel {
	public Multiple_Events() {
		Color_Action action_red = new Color_Action("Red", new ImageIcon("imagenes/red.png"), Color.RED);
		Color_Action action_green = new Color_Action("Green", new ImageIcon("imagenes/green.png"), Color.GREEN);
		Color_Action action_blue = new Color_Action("Blue", new ImageIcon("imagenes/blue.png"), Color.BLUE);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		add(new JButton (action_red));
		add (new JButton (action_green));
		add (new JButton (action_blue));
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////CLASE 1: MAPA DE ENTRADA/////////////////////////////////////
		InputMap EntryMap = getInputMap (WHEN_IN_FOCUSED_WINDOW);
		//////////////CLASE 2: COMBINACI�N DE TECLAS/////////////////////////////////////
		//KeyStroke KeyRed = KeyStroke.getKeyStroke("ctrl R");
		/////////////CLASE 3: AGREGA V�NCULO ENTRE  LA COMMBINACI�N DE TECLAS Y LA ACCI�N/////////////////////////////////////
		EntryMap.put(KeyStroke.getKeyStroke("ctrl R"), "Background Red");
		EntryMap.put(KeyStroke.getKeyStroke("ctrl G"), "Background Green");
		EntryMap.put(KeyStroke.getKeyStroke("ctrl B"), "Background Blue");
		/////////////CLASE 4: CREA MAPA DE ACCI�N PARA  LUEGO USAR EL  M�TODO "PUT" QUEE CREA EL V�NCULO
		/////////////ENTRE EL OBJETO CREADO Y LA ACCI�N EN S� MISMA///////////////////////////////////////////////
		ActionMap  Map = getActionMap();
		Map.put("Background Red", action_red);
		Map.put("Background Green", action_green);
		Map.put("Background Blue", action_blue);
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
			System.out.println("Nombre: "+getValue(Action.NAME)
			+ "\nDescripción: "+getValue(Action.SHORT_DESCRIPTION));
		}
	}
}
