package thinktank.javabot.fileManagement;

import java.io.File;

import javax.swing.JButton;


public class FileBox extends JButton {

	private static final long serialVersionUID = -971009625896928830L;
	private File file; // NE GARDER QUE LE PATH
	
	public FileBox(File file)
	{		
		this.setFile(file);
		this.setText(file.getName());
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}
