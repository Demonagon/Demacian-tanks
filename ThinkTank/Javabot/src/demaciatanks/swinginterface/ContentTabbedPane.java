package demaciatanks.swinginterface;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class ContentTabbedPane extends JTabbedPane {

	private static final long serialVersionUID = 6180643756314548263L;

	GraphicArenaPanel arena_panel;
	
	public ContentTabbedPane() {
		arena_panel = new GraphicArenaPanel();
		
		this.addTab("Ar�ne", arena_panel);
		JLabel temp2 = new JLabel("�diteur");
		this.addTab("�diteur", temp2);
	}

}
