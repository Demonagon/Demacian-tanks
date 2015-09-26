package demaciatanks.swinginterface;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class FileBoxesScrollListPanel extends JPanel {
	
	private static final long serialVersionUID = 219557202734968426L;

	private FileBoxesScrollPane scroll_pane;
	
	public FileBoxesScrollListPanel() {
		this.setLayout(new BorderLayout());
		scroll_pane = new FileBoxesScrollPane();
		this.add(scroll_pane);
	}
	
	FileBoxesScrollPane getScrollPane() {
		return scroll_pane;
	}

}
