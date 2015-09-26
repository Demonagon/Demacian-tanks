package demaciatanks.swinginterface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class DummyGraphicArena extends JComponent {

	private static final long serialVersionUID = -24716940083400908L;

	public DummyGraphicArena() {}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

}
