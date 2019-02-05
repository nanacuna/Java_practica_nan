package a_text_builder_1_7;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.event.*;

public class Layer extends JPanel {
	//Colores
	private Color red = new Color(247, 143, 143);
	private Color green = new Color(186, 224, 189);
	private Color blue = new Color(139, 183, 240);
	private Color yellow = new Color(255, 238, 163);
	
	
	private JPanel layer_menu = new JPanel();
	private JMenuBar menu_bar = new JMenuBar();
		private JMenu menu_font = new JMenu("Fonts");
			private JMenuItem font_arial = new JMenuItem(new StyledEditorKit.FontFamilyAction("Arial", "Arial"));
			private JMenuItem font_courier = new JMenuItem(new StyledEditorKit.FontFamilyAction("Courier", "Courier"));
			private JMenuItem font_verdana = new JMenuItem(new StyledEditorKit.FontFamilyAction("Verdana", "Verdana"));
		private JMenu style = new JMenu("Style");
			private JCheckBoxMenuItem bold = new JCheckBoxMenuItem(new Bold(true));
			private JCheckBoxMenuItem italic = new JCheckBoxMenuItem(new Italic(true));
		private JMenu size_letter = new JMenu("Size");
			private JRadioButtonMenuItem size_1 = new JRadioButtonMenuItem(new StyledEditorKit.FontSizeAction("12", 12));
			private JRadioButtonMenuItem size_2 = new JRadioButtonMenuItem(new StyledEditorKit.FontSizeAction("16", 16));
			private JRadioButtonMenuItem size_3 = new JRadioButtonMenuItem(new StyledEditorKit.FontSizeAction("20", 20));
			private JRadioButtonMenuItem size_4 = new JRadioButtonMenuItem(new StyledEditorKit.FontSizeAction("24", 24));
	private JPopupMenu options = new JPopupMenu();
		private JMenuItem bold_emergent = new JMenuItem(new Bold());
		private JMenuItem italic_emergent = new JMenuItem(new Italic());
	private JToolBar tool_bar = new JToolBar();
	//-------------------------------------------------------------------------------------------------------------------
	private JTextPane text = new JTextPane();
	private ButtonGroup  group_size = new ButtonGroup();
	
	//Constructor
	public Layer () {
		setLayout(new BorderLayout());
		
		text.setText("Debe ser que me pediste un día una canción que fuera del corazón");
		text.setBackground(new Color(47, 47, 47));
		text.setForeground(new Color(220, 220, 220));
		
		menu_bar.add(menu_font);
			menu_font.add(font_arial);
			menu_font.add(font_courier);
			menu_font.add(font_verdana);
			//-----------------------------------------------------------------------------------------------------------
		menu_bar.add(style);
			style.add(bold);
			style.add(italic);
			//-----------------------------------------------------------------------------------------------------------
		menu_bar.add(size_letter);
			group_size.add(size_1);
			group_size.add(size_2);
			group_size.add(size_3);
			group_size.add(size_4);
			size_letter.add(size_1);
			size_letter.add(size_2);
			size_letter.add(size_3);
			size_letter.add(size_4);
			//-----------------------------------------------------------------------------------------------------------
		layer_menu.add(menu_bar);
		add(layer_menu, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		//---------------------------------------------------------------------------------------------------------------
		options.add(bold_emergent);
		options.add(italic_emergent);
		text.setComponentPopupMenu(options);
		
		//tool bar
		tool_bar.add(new Bold(true));
		tool_bar.add(new Italic(true));
		tool_bar.add(new UnderLine(true));
		tool_bar.addSeparator();
		tool_bar.add(new ChangeColor("Red", red, "red.png"));	
		tool_bar.add(new ChangeColor("Green", green, "green.png"));
		tool_bar.add(new ChangeColor("Blue", blue, "blue.png"));
		tool_bar.add(new ChangeColor("Yellow", yellow, "yellow.png"));
		tool_bar.addSeparator();
		tool_bar.add(new ChangeAlign("Left", 0, "left.png"));
		tool_bar.add(new ChangeAlign("Center", 1, "center.png"));
		tool_bar.add(new ChangeAlign("Right", 2, "right.png"));
		tool_bar.add(new ChangeAlign("Justify", 3, "justify.png"));
		add(tool_bar, BorderLayout.WEST);
		tool_bar.setOrientation(JToolBar.VERTICAL);
	}
	
	
	
	/////////METHODS
	private class Bold extends StyledEditorKit.BoldAction{
		public Bold () {			
			putValue(NAME, "Bold");
		}
		public Bold (boolean bool) {			
			putValue(NAME, "Bold");
			putValue(SMALL_ICON, new ImageIcon ("assets/theme/bold.png"));
		}
		
	}
	private class Italic extends StyledEditorKit.ItalicAction{
		public Italic() {			
			putValue(NAME, "Italic");
		}
		public Italic(boolean bool) {			
			putValue(NAME, "Italic");
			putValue(SMALL_ICON, new ImageIcon ("assets/theme/italic.png"));
		}
	}
	private class UnderLine extends StyledEditorKit.UnderlineAction{
		public UnderLine() {			
			putValue(NAME, "UnderLine");
		}
		public UnderLine(boolean bool) {			
			putValue(NAME, "UnderLine");
			putValue(SMALL_ICON, new ImageIcon ("assets/theme/underline.png"));
		}
	}
	private class ChangeColor extends StyledEditorKit.ForegroundAction{
		public ChangeColor(String name, Color color, String icon) {
			super(name, color);
			putValue(SMALL_ICON, new ImageIcon ("assets/theme/"+icon));
		}
	}
	private class ChangeAlign extends StyledEditorKit.AlignmentAction{
		public ChangeAlign(String name, int align, String icon) {
			super(name, align);
			putValue(SMALL_ICON, new ImageIcon ("assets/theme/"+icon));
		}
	}
}
