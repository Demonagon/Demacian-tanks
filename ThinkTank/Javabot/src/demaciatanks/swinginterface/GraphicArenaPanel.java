package demaciatanks.swinginterface;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicArenaPanel extends JPanel {

	private static final long serialVersionUID = -2388067953901947017L;

	//GraphicArena arena;
	DummyGraphicArena temp_arena;
	GraphicArenaToolsPanel tools_panel;
	
	public GraphicArenaPanel() {
		temp_arena = new DummyGraphicArena();
		tools_panel = new GraphicArenaToolsPanel();
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(temp_arena);
		this.add(Box.createRigidArea(new Dimension(0, 5)));
		this.add(tools_panel);
		this.add(Box.createRigidArea(new Dimension(0, 5)));
	}

}
