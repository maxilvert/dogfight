package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile {
	private int speed;
	protected Dimension dimension;
	private Position position;
	private Direction direction;
	private Image[] images;
	private DogfightModel dogfightModel;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {

	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Position getPosition() {
		return position;
	}

	public int getWidth() {
		return 0;
	}

	public int getHeigth() {
		return 0;
	}

	public void move() {
		switch (direction) {
		case DOWN:
			moveDown();
			break;
		case UP:
			moveUp();
			break;
		case RIGHT:
			moveRight();
			break;
		case LEFT:
			moveLeft();
			break;
		default:
			break;
		}
	}

	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	public boolean isPlayer(int player) {
		return false;
	}

	private void moveUp() {
		// TODO Auto-generated method stub

	}

	private void moveDown() {
		// TODO Auto-generated method stub

	}

	private void moveLeft() {
		// TODO Auto-generated method stub

	}

	private void moveRight() {
		// TODO Auto-generated method stub

	}

	public Color getColor() {
		return Color.BLACK;
	}

	public IDogfightModel getDogfightModel() {
		return this.dogfightModel;
	}

	public void setDogfightModel(DogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImages() {
		return images[1];
	}
}
