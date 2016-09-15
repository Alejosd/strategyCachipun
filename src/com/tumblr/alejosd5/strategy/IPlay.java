package com.tumblr.alejosd5.strategy;

public interface IPlay {

	int play(IPlay v);
	int playWithStone (Stone stone);
	int playWithPaper (Paper paper);
	int playWithScissor(Scissor scissor);
	
}
