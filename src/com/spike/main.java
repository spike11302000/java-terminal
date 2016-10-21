package com.spike;

import com.spike.console.Console;
import com.spike.console.TextInput;
import com.spike.screen.Graphics;
import com.spike.screen.Screen;
import com.spike.util.Rand;

public class main {
	private static Screen s = new Screen(20 * 2, 20);
	private static Console c = new Console();
	private static Graphics g = new Graphics();
	private static Rand r = new Rand();
	public static TextInput ti = new TextInput();

	public static void main(String[] args) {
		ti.start();
		while (true) {
			if(!ti.checked){
				System.out.println(ti.text);
				ti.checked = true;
			}
			//s.render();
			/*
			 * try { TimeUnit.MILLISECONDS.sleep(50); } catch
			 * (InterruptedException e) { e.printStackTrace(); }
			 */
		}
	}

	public static Screen getScreen() {
		return s;
	}
}
