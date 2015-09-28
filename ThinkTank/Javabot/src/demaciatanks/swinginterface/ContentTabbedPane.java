package demaciatanks.swinginterface;

import javax.swing.JTabbedPane;

import thinktank.javabot.physics.SmartCursor;

public class ContentTabbedPane extends JTabbedPane {

	private static final long serialVersionUID = 6180643756314548263L;

	GraphicArenaPanel arena_panel;
	ScriptEditorPanel editor_panel;
	
	public ContentTabbedPane(SmartCursor cursor) {
		arena_panel = new GraphicArenaPanel(cursor);
		editor_panel = new ScriptEditorPanel();
		
		this.addTab("Arène", arena_panel);
		this.addTab("Éditeur", editor_panel);
	}

}
