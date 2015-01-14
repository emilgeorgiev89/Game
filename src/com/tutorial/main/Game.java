package com.tutorial.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1550691097823471818L;

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12*9;

	private Thread thread;
	private boolean running = false;

	public Game(){
		new Window(WIDTH, HEIGHT, "Let's Play", this);
	}

	public synchronized void start(){
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop(){
		try{
			thread.join();
			running = false;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void run(){
		long lastTime = Ssytem.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / ammountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;

		}
	}

	public static void main(String args[]){
		new Game();
	}

}
