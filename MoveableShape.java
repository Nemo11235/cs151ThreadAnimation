package cs151AnimationThread;

import java.awt.Graphics2D;

/**
 * (borrowed from textbook, edited)
 *
 */
public interface MoveableShape {
	void draw(Graphics2D g2);
	int getX();
	void translate(int i, int j);
}

