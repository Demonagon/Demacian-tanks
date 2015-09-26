package thinktank.javabot.graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	Image img;
	
	public Sprite(String directoryPath){
		try {
		    img = ImageIO.read(new File(directoryPath));
		} catch (IOException e) {
		}
	}
	
	public Image getImg() {
		return img;
	}
	
}
