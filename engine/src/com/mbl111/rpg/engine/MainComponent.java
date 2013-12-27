package com.mbl111.rpg.engine;

import org.lwjgl.opengl.Display;

public class MainComponent implements Runnable{

	
	
	private BaseGame game;

	public MainComponent() {
		Window.create();
	}
	
	public MainComponent(int width, int height) {
		Window.setDisplayDimensions(width, height);
		Window.create();
	}
	
	public void start() {
		game.startup();
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while (!Display.isCloseRequested()){
			
		}
	}
	
	public void setGame(BaseGame game) {
		this.game = game;
	}
	
	public static void main(String[] args) {
		BaseGame game = new BaseGame();
		
		
		MainComponent component = new MainComponent();
		component.setGame(game);
		component.start();
	}

}
