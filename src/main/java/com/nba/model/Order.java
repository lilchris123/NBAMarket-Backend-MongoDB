package com.nba.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="orders")
public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private String orderId;
	
	private String userId;
	private String user_name;
	private String user_email;
	private String user_address;
	private String user_card_no;
	private String user_card_sec;
	private String user_card_expdate;
	private int auth_code;
	private boolean shipped;
	private Cart cart;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_card_no() {
		return user_card_no;
	}
	public void setUser_card_no(String user_card_no) {
		this.user_card_no = user_card_no;
	}
	public String getUser_card_sec() {
		return user_card_sec;
	}
	public void setUser_card_sec(String user_card_sec) {
		this.user_card_sec = user_card_sec;
	}
	public String getUser_card_expdate() {
		return user_card_expdate;
	}
	public void setUser_card_expdate(String user_card_expdate) {
		this.user_card_expdate = user_card_expdate;
	}
	public int getAuth_code() {
		return auth_code;
	}
	public void setAuth_code(int auth_code) {
		this.auth_code = auth_code;
	}
	
	public boolean isShipped() {
		return shipped;
	}
	public void setShipped(boolean shipped) {
		this.shipped = shipped;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
