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

	static String fileName = "script3.py";
	static String fileExtension = ".py";
	
	public static List<File> getListFile(String directoryPath)
	{
		List<File> filesInFolder = null;
		
		try {
			filesInFolder = Files.walk(Paths.get(directoryPath))
			       .filter(Files::isRegularFile)
			       .map(Path::toFile)
			       .collect(Collectors.toList());
		} catch (IOException e) { // ICI SELECTIONE FICHIER PYTHON UNIQUEMENT
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filesInFolder;
	}
	
	public static void saveFile(String directoryPath, String newText)
	{
		try (
			Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(directoryPath), "utf-8"))) {
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
	
	public static void createFile(String directoryPath, String fileName, String textToWrite)
	{
		try (
			Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(directoryPath + "/" + fileName), "utf-8"))) {
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
	
	public static String readFile(String path)
	{
		byte[] encoded = null;
		String fileContent = null;
		
		try {
			encoded = Files.readAllBytes(Paths.get(path));
		} catch (IOException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fileContent = new String(encoded, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileContent;
	}
}