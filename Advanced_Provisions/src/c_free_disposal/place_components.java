package c_free_disposal;
import java.awt.*;

public class place_components implements LayoutManager {
	private int x;
	private int y=20;
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		
	}
	@Override
	public void layoutContainer(Container parent) {
		int counter=0, n=parent.getComponentCount(), d= parent.getWidth();
		Component c;
		x = d/2;
		for (int i=0; i<n; i++) {
			counter++;
			c = parent.getComponent(i);
			c.setBounds(x-150, y, 150, 20);
			x += 100;
			if (counter % 2 == 0) {
				x = d/2;
				y += 30;
			}
		}
	}
	@Override
	public Dimension minimumLayoutSize(Container parent) {
		return null;
	}
	@Override
	public Dimension preferredLayoutSize(Container parent) {
		return null;
	}
	public void removeLayoutComponent(Component comp) {
		
	}

}
