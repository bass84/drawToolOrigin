package pages;

import pages.IGamePage;

public abstract class PlayPage extends IGamePage{

	public final static int block = 40;
	
	public abstract void increaseTotalScore(int score); 
	
}
