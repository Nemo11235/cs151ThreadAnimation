package cs151AnimationThread;

import java.awt.FlowLayout;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class AnimationTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
		ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);
		JLabel label = new JLabel(icon);
		CarRunnable car1 = new CarRunnable(shape, icon, label);
		
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(car1);
		

	}
	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
	private static final int CAR_NUMBER = 8;
	private static final int WINDOW_SIZE = 600;
}
