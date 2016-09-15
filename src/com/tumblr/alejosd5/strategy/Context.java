package com.tumblr.alejosd5.strategy;

public class Context {
	private IPlay game;
	
	public void setStrategy(IPlay game) {
		this.game = game;
		}
	
	public int gaming(IPlay hand){
		return game.play(hand);
		} 
}
