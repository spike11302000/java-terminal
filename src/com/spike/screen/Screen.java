package com.spike.screen;

public class Screen {
	public char[][] Screen;
	public int width,height;
	public Screen(){
		Screen = new char[10][10];
		width = 10;
		height = 10;
		clear();
	}
	public Screen(int w,int h){
		Screen = new char[w][h];
		width = w;
		height = h;
		clear();
	}
	public void clear(){
		for(int x = 0;x<width;x++){
			for(int y = 0;y<height;y++){
				Screen[x][y] = ' ';
			}
		}
	}
	public boolean setPixel(int x,int y,char c){
		if(x>=this.width || y>=this.height || x<0 || y<0)
			return false;
		Screen[x][y] = c;
		return true;
	}
	public void render(){
		System.out.println("\n\n\n\n");
		for(int i =0;i<this.width;i++){
			System.out.print("-");
		}
		System.out.print("\n");
		for(int y = 0;y<height;y++){
			for(int x = 0;x<width;x++){
				System.out.write(Screen[x][y]);
			}
			System.out.print("\n");
		}
	}
}
