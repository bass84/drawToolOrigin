package pages;

import navigator.Navigator;
import processing.core.PApplet;
import processing.core.PFont;

public abstract class IGamePage {
	
	public Navigator navigator;
	
	public Navigator getNavigator() {
		return this.navigator;
	}
	
	public abstract void drawPage(PApplet pApplet, PFont mono) throws Exception;
	
	public abstract void keyPressed (int keyCode);
	
}
