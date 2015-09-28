package thinktank.javabot.graphics;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

import thinktank.javabot.physics.DTank;
import thinktank.javabot.physics.ObjetTT;
import thinktank.javabot.physics.Physique;
import thinktank.javabot.physics.SmartCursor;
import thinktank.javabot.physics.Tank;
import thinktank.javabot.physics.Terrain;

public class GraphicArena extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 46483486L;
	
	private Physique physics = new Physique();
	private Tank highlightTank;
	private SmartCursor cursor;
	public final static int tailleCase = 32;
	public final static ImageLoader imgLoader = new ImageLoader();
	private AffineTransform transform;
	
	class GraphicComponentListener implements ComponentListener{

		@Override
		public void componentResized(ComponentEvent e) {
			invalidate();
			//centrage();
			
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentShown(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class GraphicArenaMouseListener 
		implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ObjetTT contenu;
			Point2D pointUsable = create_point(arg0.getX(), arg0.getY());
			int i = (int) (pointUsable.getX()/tailleCase);
			int j = (int) (pointUsable.getY()/tailleCase);
			
			contenu = physics.detail(i, j);
			if(contenu.getType()==Physique.type.tank)
				highlightTank = (Tank) contenu;
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
				Point2D pointUsable = create_point(arg0.getX(), arg0.getY());
				int x = (int) (pointUsable.getX()/tailleCase);
				int y = (int) (pointUsable.getY()/tailleCase);
				cursor.setCoordMovingObj(x, y);
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			
		}
		
	}

	public Point2D create_point(int x, int y){
		Point2D point = new Point(x,y), pointUsable = null;
		try {
			transform.createInverse().transform(point, pointUsable);
		} catch (NoninvertibleTransformException e) {}
			// TODO Auto-generated catch block
		return pointUsable;
		
	}
	
	public GraphicArena(SmartCursor cursor){
		this.cursor = cursor;
		addDTank(1, 1);
		addDTank(10, 10);
		addDTank(30, 20);
		addDTank(15, 17);
	}
	
	public void addDTank(int x, int y){
		Color color = null;
		DTank dTank = new DTank(x, y, physics.getMap(), color, null, imgLoader);
		physics.addTank(dTank);
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
	
	public void centrage(Graphics g){
		Graphics2D g2;
		g2 = (Graphics2D) g;
		int largeurAffichage = physics.getLignes() * 32, hauteurAffichage = physics.getColonnes() * 32;
		double diffX = this.getWidth()/(double)largeurAffichage, diffY = this.getHeight()/(double)hauteurAffichage;
		if(diffY > diffX){
			g2.translate(0, Math.max(hauteurAffichage*diffX - this.getHeight(), this.getHeight() - hauteurAffichage*diffX) / 2);
			g2.scale(diffX, diffX);
			transform = g2.getTransform();
		}
		else{
			g2.translate(Math.max(largeurAffichage*diffY-this.getWidth(), this.getWidth()-largeurAffichage*diffY)/2, 0);
			g2.scale(diffY, diffY);
			transform = g2.getTransform();
		}
	}
	
	@Override
	public void paintComponent(Graphics g){   
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		centrage(g);
		ObjetTT contenu;
		
		for(int i = 0; i < physics.getLignes(); i++)
			for(int j = 0; j< physics.getColonnes(); j++){
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
