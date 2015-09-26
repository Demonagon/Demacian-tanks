package thinktank.javabot.fileManagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileExplorer {

	static List<File> filesInFolder = null;
	static String filePath = "C:/Users/julien/Google Drive/SampleName/Scripts";
	static String fileName = "script3.py";
	
	public static List<File> getListFile(String filePath)
	{
		try {
			filesInFolder = Files.walk(Paths.get(filePath))
			        .filter(Files::isRegularFile)
			        .map(Path::toFile)
			        .collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filesInFolder;
	}
	
	public static void saveFile(String filePath, String newText)
	{
		try (
			Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(filePath), "utf-8"))) {
			writer.write(newText);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void createFile(String filePath, String fileName, String textToWrite)
	{
		try (
			Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(filePath + "/" + fileName), "utf-8"))) {
			writer.write(textToWrite);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		createFile(filePath, fileName, "Bonjour, je suis un script =D");
		getListFile(filePath);
		
		for (File file : filesInFolder) {
		    if (file.isFile()) {
		    	System.out.println(file.getPath());
		    	
		        try {
					saveFile(file.getCanonicalPath(), "Bonjour " + file.getPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	}
}
