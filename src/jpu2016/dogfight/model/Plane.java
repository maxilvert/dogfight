package jpu2016.dogfight.model;

public class Plane extends Mobile {

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;

	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), Plane.SPEED, image);
		this.setPlayer(player);
	}

	public boolean isPlayer(int player) {
		if (player == this.getPlayer()) {
			return true;
		} else {
			return false;
		}
	}

	public int getPlayer() {
		return this.player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public boolean hit() {
		return false;
	}

}