package pages;

import navigator.Navigator;

public abstract class IGamePage {
	
	public Navigator navigator;
	
	public Navigator getNavigator() {
		return this.navigator;
	}
	
	public abstract void drawPage(Object pApplet, Object mono) throws Exception;
	
	public abstract void keyPressed (int keyCode);
	
}
