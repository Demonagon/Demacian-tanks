package thinktank.javabot.fileManagement;

import java.io.File;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class FileBoxManager extends JPanel {

	private static final long serialVersionUID = -4841135013487590132L;
	static String directoryPath = "scripts";
	//List<FileBox> fileBoxList = new ArrayList<FileBox>();
	
	public FileBoxManager() {
		
		List<File> filesInFolder = FileExplorer.getListFile(directoryPath);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for(File file : filesInFolder) {
		    
	    	this.add(new FileBox(file));
		}
	}
	
	public void addFileBox(File file) {
		
		this.add(new FileBox(file));
	}

}
