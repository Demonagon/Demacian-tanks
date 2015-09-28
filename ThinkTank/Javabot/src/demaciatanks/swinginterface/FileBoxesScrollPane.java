package demaciatanks.swinginterface;

import javax.swing.JScrollPane;

import thinktank.javabot.fileManagement.FileBoxManager;

public class FileBoxesScrollPane extends JScrollPane {

	private static final long serialVersionUID = -5032055368274982092L;

	FileBoxManager content;
	
	public FileBoxesScrollPane() {
		content = new FileBoxManager();
		getViewport().add(content);
	}

	FileBoxManager getContent() {
		return content;
	}
}
