package demaciatanks.swinginterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import thinktank.javabot.fileManagement.FileExplorer;
import demaciatanks.scripteditor.ScriptEditor;

public class SaveButton extends JButton {

	private static final long serialVersionUID = -6935669375135143783L;

	public class SaveButtonListener implements ActionListener {
		
		private ScriptEditor editor;
		
		public SaveButtonListener(ScriptEditor editor) {
			this.editor = editor;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(editor.getPath() == null) return;
			
			FileExplorer.saveFile(editor.getPath(), editor.getText());
		}
	}
	
	public SaveButton(ScriptEditor editor) {
		this.setText("Sauvegarder");
		this.addActionListener(new SaveButtonListener(editor));
	}

}
