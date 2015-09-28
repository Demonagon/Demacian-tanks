package demaciatanks.scripteditor;

import java.io.File;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

public class ScriptEditor extends RSyntaxTextArea {

	private static final long serialVersionUID = -3906130901413802324L;
	
	File editing_file;

	public ScriptEditor() {
	      setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
	      setCodeFoldingEnabled(true);
	      editing_file = null;
	}
	
	public void openFile(File file) {
		editing_file = file;
		//String content = FileExplorer.open(path);
		//setText(content);
	}
	
	public File getFile() {
		return editing_file;
	}

}
