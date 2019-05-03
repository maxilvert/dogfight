package jpu2016.dogfight.model;

public class Dimension {

	public int width;
	public int height;

	public Dimension(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	public Dimension(Dimension dimension) {
		this.setHeight(dimension.getHeight());
		this.setWidth(dimension.getWidth());
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.setWidth(width);
	}

	public int getHeight() {
		return this.getHeight();
	}

	public void setHeight(int height) {
		this.setHeight(height);
	}
}
