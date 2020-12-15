package cs151AnimationThread;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JLabel;
import javax.swing.Timer;

public class CarRunnable implements Runnable{

	public CarRunnable(MoveableShape car, ShapeIcon icon, JLabel label) {
		this.icon = icon;
		this.car = car;
		this.label = label;
	}
	
	public void run() {
		int speed = ThreadLocalRandom.current().nextInt(1, 30);
		final int DELAY = 100;
		System.out.println(speed);
		Timer t = new Timer(DELAY, event -> 
		{
			this.car.translate(speed, 0);
			this.label.repaint();
		});
		t.start();
	}
	
	private MoveableShape car;
	private ShapeIcon icon;
	private JLabel label;
}
