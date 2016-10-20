package com.spike;

import java.util.concurrent.TimeUnit;

import com.spike.console.Console;
import com.spike.screen.Graphics;
import com.spike.screen.Screen;
import com.spike.util.Rand;

public class main {
	private static Screen s = new Screen(20*2,20);
	private static Console c = new Console();
	private static Graphics g = new Graphics();
	private static Rand r = new Rand();
	public static void main(String[] args) {
		
		g.drawRect(0, 0, 40, 20, '*');
		g.drawCircle(20, 10, 19, 9, '#');
		g.drawLine(0, 0, 40, 20, '$');
		//while (true){
			
			//s.render();
			/*try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		//}
	}
	public static Screen getScreen(){
		return s;
	}
}
