package demaciatanks.swinginterface;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class FileBoxesScrollPane extends JScrollPane {

	private static final long serialVersionUID = -5032055368274982092L;

	FileBoxesListPanel content;
	
	public FileBoxesScrollPane() {
		content = new FileBoxesListPanel();
		getViewport().add(content);
	}

	FileBoxesListPanel getContent() {
		return content;
	}
}
