package navigator;

import java.util.Stack;

import pages.IGamePage;
import processing.core.PApplet;
import processing.core.PFont;

public class Navigator {

	private Stack<IGamePage> pageStack;
	private IGamePage currentPage;
	private PApplet pApplet;
	private PFont mono;
	
	public Navigator(PApplet pApplet) {
		this.pApplet = pApplet;
		this.pageStack = new Stack<IGamePage>();
	}
	
	public void draw() {
		try {
			this.currentPage.drawPage(this.pApplet, this.mono);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void push(IGamePage newPage) {
		this.pageStack.push(newPage);
		this.currentPage = this.pageStack.peek();
	}
	
	public void pop() {
		this.pageStack.pop();
	}
	
	public void peek() {
		this.currentPage = this.pageStack.peek();
	}
	
	public void keyPressed(int keyCode) {
		this.currentPage.keyPressed(keyCode);
	}
}
