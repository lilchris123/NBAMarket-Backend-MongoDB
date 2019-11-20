package com.nba.model;

public class CartItem {

	private Player item;
	private int quantity;
	private int total_amount;
	
	
	public Player getItem() {
		return item;
	}
	public void setItem(Player item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
}
