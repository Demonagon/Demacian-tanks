package demaciatanks.swinginterface;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	private static final long serialVersionUID = -8179346049381197847L;

	private JFrame frame;
	
	public Window() throws HeadlessException {
		frame = new JFrame();
		frame.setTitle("Demacian Tanks");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void setContent(JPanel panel) {
		getFrame().setContentPane(panel);
		getFrame().pack();
		getFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
		getFrame().setVisible(true);
	}
	
	public static void main(String args[]) {
		Window window = new Window();
		/*FileBoxesScrollListPanel panel = new FileBoxesScrollListPanel();
		panel.getScrollPane().getContent().add(new NewFileButton());
		panel.getScrollPane().getContent().add(new NewFileButton());
		panel.getScrollPane().getContent().add(new NewFileButton());
		panel.getScrollPane().getContent().add(new NewFileButton());
		panel.getScrollPane().getContent().add(new NewFileButton());
		panel.getScrollPane().getContent().add(new NewFileButton());*/
		//LeftPanel panel = new LeftPanel();
		//ContentPanel panel = new ContentPanel();
		//BlueSelectionPanel panel = new BlueSelectionPanel();
		//ColorSelectionPanel panel = new ColorSelectionPanel();
		//ColorPanel panel = new ColorPanel();
		//GraphicArenaToolsPanel panel = new GraphicArenaToolsPanel();
		//GraphicArenaPanel panel = new GraphicArenaPanel();
		//ScriptEditorToolsPanel panel = new ScriptEditorToolsPanel();
		//ScriptEditorPanel panel = new ScriptEditorPanel();
		MainPanel panel = new MainPanel();
		window.setContent(panel);
		
		
	}
}
