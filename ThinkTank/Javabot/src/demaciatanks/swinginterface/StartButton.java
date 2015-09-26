package demaciatanks.swinginterface;

import javax.swing.JButton;

public class StartButton extends JButton {
	
	private static final long serialVersionUID = -2934554054003374998L;

	public StartButton() {
		setStartText();
	}
	
	public void setStartText() {
		this.setText("Lancer");
	}

	public void setStopText() {
		this.setText("Arrêter");
	}
}
