package thinktank.javabot.fileManagement;


public class FileBox {

	private String fileContent = null;
	private String name = null;
	
	public FileBox(String name, String fileContent)
	{
		this.setFileContent(fileContent);
		this.setName(name);
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
