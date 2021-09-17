package com.barclays.fsd.patterns;

interface Visitable { // game
	void accept(Visitor visitor);
}

interface Visitor { // player
	void playGame(Cricket obj);

	void playGame(Hockey obj);

	void playGame(Football obj);
}

class Player implements Visitor {

	@Override
	public void playGame(Cricket obj) {
		System.out.println("Playing cricket...");
	}

	@Override
	public void playGame(Hockey obj) {
		System.out.println("playing hockey...");
	}

	@Override
	public void playGame(Football obj) {
		System.out.println("Playing football...");
	}
	//
}

class Cricket implements Visitable {
	@Override
	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Hockey implements Visitable {
	@Override
	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

class Football implements Visitable {
	@Override
	public void accept(Visitor visitor) {
		visitor.playGame(this);
	}
}

public class VisitorPattern {

	public static void main(String[] args) {

		Visitor player1 = new Player();
		Visitable cricket = new Cricket();
		cricket.accept(player1);

		Visitor player2 = new Player();
		Visitable hockey = new Hockey();
		hockey.accept(player2);

		Visitor player3 = new Player();
		Visitable football = new Football();
		football.accept(player3);
	}
}
