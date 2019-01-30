package a_text_builder_1_3;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private JMenuBar main_bar = new JMenuBar();
	private JMenu file = new JMenu("File", true);
	private JMenu edition = new JMenu("Edit", true);
	private JMenu options = new JMenu("Options");
	private JMenu tools = new JMenu("Tools", true);
	//------------------------------------------
	private JMenuItem save = new JMenuItem("Save");
	private JMenuItem save_as = new JMenuItem("Save As");
	private JMenuItem cut = new JMenuItem("Cut", new   ImageIcon ("assets/icon/cut.gif"));
	private JMenuItem copy = new JMenuItem("Copy", new   ImageIcon ("assets/icon/copy.gif"));
	private JMenuItem paste = new JMenuItem("Paste", new   ImageIcon ("assets/icon/paste.gif"));
	private JMenuItem general = new JMenuItem("General");
	private JMenuItem configuration = new JMenuItem("Configuration");
	private JMenuItem option_1 = new JMenuItem("Option_1");
	private JMenuItem option_2 = new JMenuItem("Option_2");
	//---------------------------------------------------------------
	public Layer () {
		file.add(save);
		file.add(save_as);
		edition.add(cut);
		edition.add(copy);
		//copy.setHorizontalTextPosition(SwingConstants.LEFT);
		edition.add(paste);
		edition.addSeparator();
		edition.add(options);
		tools.add(general);
		tools.add(configuration);
		options.add(option_1);
		options.add(option_2);
		main_bar.add(file);
		main_bar.add(edition);
		main_bar.add(tools);
		add(main_bar);
	}
}
