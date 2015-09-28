package demaciatanks.swinginterface;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import thinktank.javabot.physics.SmartCursor;

public class MainPanel extends JPanel {
	
	private static final long serialVersionUID = 5131738883703122146L;

	FilePanel file_panel;
	ContentPanel content_panel;
	SmartCursor cursor;
	
	public MainPanel() {
		file_panel = new FilePanel();
		cursor = new SmartCursor();
		content_panel = new ContentPanel(cursor);
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.add(file_panel);
		this.add(content_panel);
	}

}
