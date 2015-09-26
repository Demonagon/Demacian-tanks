package demaciatanks.swinginterface;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class GraphicArenaToolsPanel extends JPanel {
	
	private static final long serialVersionUID = -7552492479405461674L;
	
	StartButton button;
	ColorPanel color_selector;
	
	public GraphicArenaToolsPanel() {
		button = new StartButton();
		color_selector = new ColorPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.add(Box.createRigidArea(new Dimension(5, 0)));
		this.add(color_selector);
		this.add(Box.createRigidArea(new Dimension(5, 0)));
		this.add(Box.createHorizontalGlue());
		this.add(button);
		this.add(Box.createRigidArea(new Dimension(5, 0)));
	}

}
