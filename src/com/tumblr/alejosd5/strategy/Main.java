package com.tumblr.alejosd5.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context cachipun = new Context();
		Stone stone = new Stone();
		Paper paper = new Paper();
		cachipun.setStrategy(stone);
		int result = cachipun.gaming(paper);
		System.out.println(result);

	}
}
