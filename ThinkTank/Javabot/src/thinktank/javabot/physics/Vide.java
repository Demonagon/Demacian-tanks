package thinktank.javabot.physics;

import java.awt.Graphics;

public class Vide implements ObjetTT{
	final static Vide v = new Vide();

	private Vide(){}

	public static Vide getVide()
	{
		return v;
	}

	public Physique.type getType(){
		return Physique.type.vide;
	}

	@Override
	public void paint(Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	}
}