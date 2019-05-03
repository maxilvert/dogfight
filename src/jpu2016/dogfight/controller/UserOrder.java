package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private Order order;
	private int player;
	
	public UserOrder(int player, Order order) {
		// TODO Auto-generated constructor stub
		this.player = player;
		this.order = order;
	}
	@Over
	public Order getOrder() {
		return this.order;
	}

	@Override
	public int getPlayer() {
		return this.player;
	}

}
