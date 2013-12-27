package com.mbl111.rpg.engine;

public class MainComponent implements Runnable{

	
	
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
		while (true){
			
		}
	}
	
	public static void main(String[] args) {
		BaseGame game = new BaseGame();
		
		
		MainComponent component = new MainComponent();
		component.setGame(game);
		component.start();
	}

}
