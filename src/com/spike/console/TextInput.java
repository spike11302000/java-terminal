package com.spike.console;

import java.util.Scanner;

public class TextInput extends Thread {
	public String text = "";
	public boolean checked = false;
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		while (true) {
			text = this.scanner.nextLine();
			checked = false;
		}
	}
}
