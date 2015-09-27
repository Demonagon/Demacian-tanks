package thinktank.javabot.physics;

import java.awt.Color;

public class Dtank extends Tank {
	
	
	private Color color;
	private String script_path;

	public Dtank (Terrain map, String filepath, Color color, String script_path ){
		super(map, filepath);
		this.script_path=script_path;
		this.color= color;	
	}
	
	public Dtank (Terrain map, Color color, String script_path){
		super(map);
		this.color= color;
		this.script_path=script_path;
	}
	
	public Dtank (int x, int y, Terrain map, Color color, String script_path){
		super(x,y,map);
		this.color= color;
		this.script_path=script_path;
	}
	
	public Color getColor() {
		return color;
	}
	 
	public String getScript_path(){
		return script_path;
	}
	
}

