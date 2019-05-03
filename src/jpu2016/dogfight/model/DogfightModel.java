package jpu2016.dogfight.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private Sky sky;
	private final ArrayList<IMobile> mobiles;

	public DogfightModel() {
		this.mobiles = new ArrayList<IMobile>();
	}

	@Override
	public IArea getArea() {
		return sky;
	}

	@Override
	public void buildArea(Dimension dimension) {
		try {
			this.sky = new Sky(dimension);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addMobile(IMobile mobile) {
		this.mobiles.add(mobile);
	}

	@Override
	public void removeMobile(IMobile mobile) {
		this.mobiles.remove(mobile);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return (ArrayList<IMobile>) mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		for (IMobile mobile : mobiles) {
			if (mobile.isPlayer(player)) {
				return mobile;
			}
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		this.setChanged();
		this.notifyObservers();
	}

}
