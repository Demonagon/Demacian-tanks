package thinktank.javabot.graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	Image img[] = new Image[8];
	
	public enum SpriteName{
		MUR,
		MISSILE,
		SOL,
		TANKH,
		TANKB,
		TANKD,
		TANKG,
		HIGHLIGHT
	}
	
	public ImageLoader(){
		try {
		    img[SpriteName.MUR.ordinal()] = ImageIO.read(new File("ressources/images/mur.png"));
		    img[SpriteName.MISSILE.ordinal()] = ImageIO.read(new File("ressources/images/missile.png"));
		    img[SpriteName.SOL.ordinal()] = ImageIO.read(new File("ressources/images/sol.png"));
		    img[SpriteName.TANKH.ordinal()] = ImageIO.read(new File("ressources/images/tankH.png"));
		    img[SpriteName.TANKB.ordinal()] = ImageIO.read(new File("ressources/images/tankB.png"));
		    img[SpriteName.TANKD.ordinal()] = ImageIO.read(new File("ressources/images/tankD.png"));
		    img[SpriteName.TANKG.ordinal()] = ImageIO.read(new File("ressources/images/tankG.png"));
		    img[SpriteName.HIGHLIGHT.ordinal()] = ImageIO.read(new File("ressources/images/highlight.png"));
		} catch (IOException e) {
		}
	}
	
	public Image getSprite(int sprite){
		return img[sprite];
	}

}
