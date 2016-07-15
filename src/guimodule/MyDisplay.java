package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		size(800, 600);
		background(50, 20, 150);
	}
	
	public void draw() {
		fill(200, 50, 50);
		ellipse(400, 300, 200, 200);
	}
}
