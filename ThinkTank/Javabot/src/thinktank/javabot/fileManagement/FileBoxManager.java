package thinktank.javabot.fileManagement;

import java.io.File;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import demaciatanks.scripteditor.ScriptEditor;
import thinktank.javabot.graphics.ImageLoader;
import thinktank.javabot.physics.SmartCursor;


public class FileBoxManager extends JPanel {

	private static final long serialVersionUID = -4841135013487590132L;
	static String directoryPath = "scripts";
	ImageLoader img;
	SmartCursor cursor;
	ScriptEditor editor;
	
	public FileBoxManager(ImageLoader img, SmartCursor cursor, ScriptEditor editor) {
		
		List<File> filesInFolder = FileExplorer.getListFile(directoryPath);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.img = img;
		this.cursor = cursor;
		this.editor = editor;
		
		for(File file : filesInFolder) {
		   
			this.add(new FileBox(file, img, cursor, editor));
		}
	}
	
	public void addFileBox(File file) {
		
		this.add(new FileBox(file, img, cursor, editor));
	}

}