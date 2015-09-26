package demaciatanks.swinginterface;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class ContentTabbedPane extends JTabbedPane {

	private static final long serialVersionUID = 6180643756314548263L;

	GraphicArenaPanel arena_panel;
	ScriptEditorPanel editor_panel;
	
	public ContentTabbedPane() {
		arena_panel = new GraphicArenaPanel();
		editor_panel = new ScriptEditorPanel();
		
		this.addTab("Arène", arena_panel);
		this.addTab("Éditeur", editor_panel);
	}

}
