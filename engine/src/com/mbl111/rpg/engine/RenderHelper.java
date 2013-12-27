package com.mbl111.rpg.engine;

import org.lwjgl.opengl.GL11;

public class RenderHelper {

	public static void initRendering() {
		GL11.glOrtho(0, Window.getWidth(), Window.getHeight(), 0, 1, -1);
	}
	
}
