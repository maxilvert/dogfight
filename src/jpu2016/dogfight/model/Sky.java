package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private Dimension dimension;
	private Image image;
	private String IMAGE = "sky.png";

	@Override
	public Dimension getDimension() {
		return this.dimension;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}

	public Sky(Dimension dimension) throws IOException {
		this.dimension = dimension;
		this.image = ImageIO.read(new File("images/" + this.IMAGE));
	}
}
