package thinktank.javabot.graphics;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;





import thinktank.javabot.physics.DTank;
import thinktank.javabot.physics.ObjetTT;
import thinktank.javabot.physics.Physique;
import thinktank.javabot.physics.SmartCursor;
import thinktank.javabot.physics.Tank;

public class GraphicArena extends JComponent{
	
	private static final long serialVersionUID = 7631207807087148459L;
	private Physique physics;
	private Tank highlightTank;
	private SmartCursor cursor;
	public final static int tailleCase = 24;
	public final static ImageLoader imgLoader = new ImageLoader();
	
	class GraphicArenaMouseListener 
		implements MouseListener, MouseMotionListener{
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ObjetTT contenu;
			int i = arg0.getX()*tailleCase;
			int j = arg0.getY()*tailleCase;
			contenu = physics.detail(i, j);
			if(contenu.getType()==Physique.type.tank){
				highlightTank = (Tank) contenu;
			}
			else
				highlightTank = null;
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			if(cursor.isActive()){
				addObject(cursor.getTank());
			}
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			if(cursor.isActive()){
				removeObject(cursor.getTank());
			}
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			if(cursor.isActive()){
				cursor.setCoordMovingObj(arg0.getX(), arg0.getY());
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			
		}
		
	}
	
	public GraphicArena(Physique physics, SmartCursor cursor){
		this.physics = physics;
		this.cursor = cursor;
	}
	
	public void addObject(DTank dTank){
		physics.addTank(dTank);
	}
	public void removeObject(DTank dTank){
		physics.removeTank(dTank);
	}
	
	public void paintHighlight(Graphics g,int x,int y){
		g.drawImage(imgLoader.getSprite(ImageLoader.SpriteName.HIGHLIGHT.ordinal()), x, y, null);
	}
	
	@Override
	public void paintComponent(Graphics g){    
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		int lx = 42;
		int ly = 24;
		ObjetTT contenu;	
		
		for(int i = 0; i < lx; i++)
			for(int j = 0; j< ly; j++){
				int x = i*tailleCase;
				int y = j*tailleCase;
				contenu = physics.detail(i, j);
				contenu.paint(g, x, y); 
				if(highlightTank == contenu){
					paintHighlight(g,x,y);
				}
			}
	}
}
