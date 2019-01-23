package eventos_varios_oyentes;
import javax.swing.*;

public class Several_Listeners extends JFrame {
	public Several_Listeners () {
		setBounds (800, 20, 800, 450);
		setTitle ("Varios Oyentes");
		add (new  Sheet_Listeners());
	}
}
