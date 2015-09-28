package demaciatanks.swinginterface;

import java.awt.BorderLayout;

import javax.swing.JPanel;


public class ContentPanel extends JPanel {
	
	private static final long serialVersionUID = -3145738724425444248L;

	ContentTabbedPane tabbed_pane;
	
	public ContentPanel() {
		tabbed_pane = new ContentTabbedPane();
		this.setLayout(new BorderLayout());
		this.add(tabbed_pane, BorderLayout.CENTER);
	}
	
	public ContentTabbedPane getTabbedPane() {
		return tabbed_pane;
	}

}
