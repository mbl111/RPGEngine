package com.mbl111.rpg.engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {

	private static int WIDTH = 800;
	private static int HEIGHT = 600;
	
	public static void create() {
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void setDisplayDimensions(int width, int height){
		HEIGHT = height;
		WIDTH = width;
	}
	
}
