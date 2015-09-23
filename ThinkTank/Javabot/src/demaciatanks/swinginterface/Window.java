package demaciatanks.swinginterface;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final long serialVersionUID = -8179346049381197847L;

	public Window() throws HeadlessException {
		this.setSize(new Dimension(1000, 1000));
		this.setTitle("Demacian Tanks");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		Window window = new Window();
		JPanel panel = new FileBoxesListPanel();
		panel.add(new NewFileButton());
		panel.add(new NewFileButton());
		panel.add(new NewFileButton());
		panel.add(new NewFileButton());
		panel.add(new NewFileButton());
		window.setContentPane(panel);
	}
}
