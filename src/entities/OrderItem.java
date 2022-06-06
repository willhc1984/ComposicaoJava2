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
	
	public OrderItem(Double quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", SubTotal: $"
				+ String.format("%.2f", subTotal());
	
	}

}
