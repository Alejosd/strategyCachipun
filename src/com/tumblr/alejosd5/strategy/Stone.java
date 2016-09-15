package com.tumblr.alejosd5.strategy;

public class Stone implements IPlay {

	@Override
	public int play(IPlay v) {
		// TODO Auto-generated method stub
		return v.playWithStone(this);
	}

	@Override
	public int playWithStone(Stone stone) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int playWithPaper(Paper paper) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int playWithScissor(Scissor scissor) {
		// TODO Auto-generated method stub
		return 1;
	}

}
