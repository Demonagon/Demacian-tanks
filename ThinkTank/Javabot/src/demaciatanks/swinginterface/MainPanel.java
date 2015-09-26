package demaciatanks.swinginterface;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private static final long serialVersionUID = 5131738883703122146L;

	FilePanel file_panel;
	ContentPanel content_panel;
	
	public MainPanel() {
		file_panel = new FilePanel();
		content_panel = new ContentPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.add(file_panel);
		this.add(content_panel);
	}

}
