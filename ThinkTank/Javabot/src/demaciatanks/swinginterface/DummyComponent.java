package demaciatanks.swinginterface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComponent;

public class DummyComponent extends JComponent {
	
	private static final long serialVersionUID = -7976741269835734761L;

	public DummyComponent(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.BLACK);
	}

}
