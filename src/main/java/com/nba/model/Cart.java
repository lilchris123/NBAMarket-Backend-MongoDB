package com.nba.model;

import java.io.Serializable;
import java.util.Set;

public class Cart implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Set<CartItem> cartItems;
	private int quantity;
	private int total;

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
