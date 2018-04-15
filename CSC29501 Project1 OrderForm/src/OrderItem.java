
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddy
 */
public class OrderItem {
    
    private String item;
    private double pricePerItem;
    private double quantity;
    private double total;
    
    public OrderItem(String item, double pricePerItem, double quantity) {
	this.item = item;
	this.pricePerItem = pricePerItem;
	this.quantity = quantity;
	this.total = quantity * pricePerItem;
	
    }

    public String getItem() {
	return item;
    }

    public void setItem(String item) {
	this.item = item;
    }

    public double getPricePerItem() {
	return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
	this.pricePerItem = pricePerItem;
    }

    public double getQuantity() {
	return quantity;
    }

    public void setQuantity(double quantity) {
	this.quantity = quantity;
    }

    public double getTotal() {
	return total;
    }

    public void setTotal() {
	this.total = this.quantity * this.pricePerItem;
    }
    
    
}
