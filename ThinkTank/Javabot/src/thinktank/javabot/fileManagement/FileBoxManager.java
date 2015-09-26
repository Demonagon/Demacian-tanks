package thinktank.javabot.fileManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileBoxManager {

	static String directoryPath = "C:/Users/julien/Google Drive/SampleName/Scripts";
	List<FileBox> fileBoxList = new ArrayList<FileBox>();
	
	public FileBoxManager()
	{
		List<File> filesInFolder = null;
		FileBox newFileBox = null;
		
		filesInFolder = FileExplorer.getListFile(directoryPath);
		
		for(File file : filesInFolder) {
		    if(file.isFile()) {
		    	newFileBox = new FileBox(file.getName(), FileExplorer.readFile(file.getPath()));
		    	fileBoxList.add(newFileBox);
		    }
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileBoxManager FileBoxManager = new FileBoxManager();
		
		for(FileBox fileBox : FileBoxManager.fileBoxList) {
			System.out.println(fileBox.getFileContent());
		}
	}

}
