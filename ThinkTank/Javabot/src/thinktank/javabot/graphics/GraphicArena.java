package thinktank.javabot.graphics;


import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;

import thinktank.javabot.physics.Dtank;
import thinktank.javabot.physics.ObjetTT;
import thinktank.javabot.physics.Physique;
import thinktank.javabot.physics.SmartCursor;

public class GraphicArena extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Physique physics;
	private Dtank moving_object;
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			if(cursor.isActive()){
				cursor.setCoordMovingObj(arg0.getX(), arg0.getY());
			}
			
		}
		
	}
	
	public GraphicArena(Physique physics, SmartCursor cursor){
		this.physics = physics;
		this.cursor = cursor;
		this.moving_object = cursor.moving_object;
	}
	
	public void addObject(Dtank dTank){
		physics.addTank(dTank);
	}
	public void removeObject(Dtank dTank){
		physics.removeTank(dTank);
	}
	
	public void paintComponent(Graphics g){
		
	}

}
