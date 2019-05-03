package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;

	public Missile(Direction direction, Position position) {
		super(direction, position, new Dimension(HEIGHT, WIDTH), SPEED, IMAGE);
	}

	public static int getWidthWithADirection(Direction direction) {
		return 1;
	}

	public static int getHeightWithADirection(Direction direction) {
		return 1;
	}

	public void move() {
		if (distanceTraveled + SPEED >= MAX_DISTANCE_TRAVELED) {
			
		}
	}

	public boolean isWeapon() {
		return true;
	}
}