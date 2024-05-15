package models;

import java.io.Serializable;
import java.sql.Timestamp;

public class PurchaseHistroyModel implements Serializable{
    private int order_id;
    private Timestamp order_date;
    private int quantity;
    private double total_amount;
    private String product_name;
    private double price;
    private String status;
    private String product_image;
	public PurchaseHistroyModel(int order_id, Timestamp order_date, int quantity, double total_amount,
		String product_name, double price, String status, String product_image) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.quantity = quantity;
		this.total_amount = total_amount;
		this.product_name = product_name;
		this.price = price;
		this.status = status;
		this.product_image = product_image;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Timestamp getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
}