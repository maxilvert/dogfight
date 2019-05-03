package jpu2016.dogfight.model;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;

	public Position(double x, double y, double maxX, double maxY) {
		this.setMaxX(maxX);
		this.setMaxY(maxY);
		this.setX(x);
		this.setY(y);
	}

	public Position(Position position) {
		this.setX(position.getX());
		this.setY(position.getY());
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		x = x % this.maxX;
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		y = y % this.maxY;
		this.y = y;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
