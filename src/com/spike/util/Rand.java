package com.spike.util;

public class Rand {
	public static java.util.Random random = new java.util.Random();
	
	public static int randInt(int min, int max) {
		int randomNum = random.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
}
