package com.spike.console;

import com.spike.main;
import com.spike.screen.Screen;

public class Console {
	private Screen s = main.getScreen();
	// private static char[][] console = new char[s.width][s.height];
	public Cursor cursor = new Cursor();
	private boolean LineWrap = true;

	public void print(String line) {
		int x = this.cursor.x;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) != '\n') {
				boolean end = this.s.setPixel(i + x, this.cursor.y, line.charAt(i));
				if (end) {
					this.cursor.x++;
				} else {
					if (LineWrap)
						break;
					this.cursor.y++;
					this.cursor.x = 0;
					x = -i;
					this.s.setPixel(0, this.cursor.y, line.charAt(i));
				}
			} else {
				this.cursor.y++;
				this.cursor.x=0;
				x = -i-1;
			}

		}
		s.render();
	}

	public void printAtPos(int x, int y, String line) {
		this.cursor.setPos(x, y);

		this.print(line);
	}

	public void lineWrap(boolean lw) {
		this.LineWrap = lw;
	}

}
