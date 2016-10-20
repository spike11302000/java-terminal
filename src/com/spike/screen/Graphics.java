package com.spike.screen;

import com.spike.main;

public class Graphics {
	private Screen s = main.getScreen();

	public void drawRect(int x, int y, int w, int h, char c) {
		for (int X = x; X < x + w; X++) {
			for (int Y = y; Y < y + h; Y++) {
				this.s.setPixel(X, Y, c);
			}
		}
		this.s.render();
	}

	public void drawLine(int sX, int sY, int eX, int eY, char c) {
		int dx = Math.abs(eX - sX);
		int dy = Math.abs(eY - sY);

		int sx = (sX < eX) ? 1 : -1;
		int sy = (sY < eY) ? 1 : -1;

		int err = dx - dy;

		while (true) {
			this.s.setPixel(sX, sY, c);

			if (sX == eX && sY == eY) {
				break;
			}

			int e2 = 2 * err;

			if (e2 > -dy) {
				err = err - dy;
				sX = sX + sx;
			}

			if (e2 < dx) {
				err = err + dx;
				sY = sY + sy;
			}
		}
		this.s.render();
	}

	public void drawCircle(int x, int y, int width, int height, char c) {
		for (int i = 0; i < 180; i++) {
			double xx = Math.sin(Math.PI * (i / 90.0)) * 10.0;
			double yy = Math.cos(Math.PI * (i / 90.0)) * 5.0;
			int X = (int) xx + x;
			int Y = (int) yy + y;
			this.s.setPixel(X, Y, c);
		}
		this.s.render();
	}

	public void drawText(int x, int y, String str) {
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != '\n') {
				this.s.setPixel(i + x, y, str.charAt(i));
			} else {
				y++;
				x = 0 - i - 1;
			}
		}
		this.s.render();
	}
}
