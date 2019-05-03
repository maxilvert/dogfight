package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	private IViewSystem viewSystem;
	private void lauchMissile(int player) {}
	private void gameLoop() {}
	public DogfightController (IDogfightModel dogfightModel)
	{}
	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub

	}

	public void play() {}
	public IViewSystem getViewSystem() {
		return viewSystem;
	}
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	

}
