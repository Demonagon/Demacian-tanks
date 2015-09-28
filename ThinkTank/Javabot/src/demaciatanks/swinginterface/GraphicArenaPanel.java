package demaciatanks.swinginterface;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import thinktank.javabot.graphics.GraphicArena;
import thinktank.javabot.physics.SmartCursor;

public class GraphicArenaPanel extends JPanel {

	private static final long serialVersionUID = -2388067953901947017L;

	GraphicArena arena;
	
	GraphicArenaToolsPanel tools_panel;
	
	public GraphicArenaPanel(SmartCursor cursor) {
		arena = new GraphicArena(cursor);
		tools_panel = new GraphicArenaToolsPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(arena);
		this.add(Box.createRigidArea(new Dimension(0, 5)));
		this.add(tools_panel);
		this.add(Box.createRigidArea(new Dimension(0, 5)));
	}

}
