package eventos_varios_oyentes;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Several_Listeners listeners = new Several_Listeners();
		listeners.setVisible(true);
		listeners.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
