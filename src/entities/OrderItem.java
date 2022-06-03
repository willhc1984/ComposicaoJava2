package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Double quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Double quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
