package demaciatanks.swinginterface;

import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class NewFileButton extends JButton {

	public NewFileButton() {
		this.setText("Cr�er nouveau");
		this.setPreferredSize(new Dimension(100, 120));
		this.setMaximumSize(new Dimension(100, 120));
	}

}
