package thinktank.javabot.graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;

import thinktank.javabot.physics.ObjetTT;
import thinktank.javabot.physics.Physique;

public class GraphicArena extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Physique physics;
	private ObjetTT moving_object;
	private SmartCursor cursor;
	
	class GraphicArenaMouseListener 
		implements MouseListener, MouseMotionListener{
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(physics.caseContent(arg0.getX(), arg0.getY()) == Physique.type.tank){
				//Highlight
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			if(cursor.isActive){
				addObject(cursor.getTank());
			}
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			if(cursor.isActive){
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			if(cursor.isActive()){
				//change coordonnées du tank de smartcursor
			}
			
		}
		
	}
	
	public GraphicArena(Physique physics, Smartcursor cursor){
		this.physics = physics;
		this.cursor = cursor;
	}
	
	public void addObject(DTank dTank){
		physics.addTank(dTank.getTank());
	}
	public void removeObject(DTank dTank){
		physics.removeTank(dTank.getTank());
	}
	
	public void paintComponent(Graphics g){
		
	}

}
