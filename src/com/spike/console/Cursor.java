package com.spike.console;

import com.spike.main;
import com.spike.screen.Screen;

public class Cursor {
	public int x = 0;
	public int y = 0;
	private Screen s = main.getScreen();
	public boolean setPos(int xx,int yy){
		if(xx>=s.width || yy>=s.height)
			return false;
		this.x = xx;
		this.y = yy;
		return true;
	}
}
