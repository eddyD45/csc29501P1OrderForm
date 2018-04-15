/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddy
 */
public class Order {
    
    private Customer customer;
    private OrderItem beef;
    private OrderItem orange;
    private OrderItem carrots;
    private OrderItem banana;
    private OrderItem apple;
    private OrderItem onions;
    private double orderTotal;

    public Order(Customer customer, OrderItem beef, OrderItem orange, OrderItem carrots, OrderItem banana, OrderItem apple, OrderItem onions) {
	this.customer = customer;
	this.beef = beef;
	this.orange = orange;
	this.carrots = carrots;
	this.banana = banana;
	this.apple = apple;
	this.onions = onions;
	this.orderTotal = beef.getTotal() + orange.getTotal() + carrots.getTotal() + banana.getTotal() + apple.getTotal() + onions.getTotal();
	
    }

    public Customer getCustomer() {
	return customer;
    }

    public void setCustomer(Customer customer) {
	this.customer = customer;
    }

    public OrderItem getBeef() {
	return beef;
    }

    public void setBeef(OrderItem beef) {
	this.beef = beef;
    }

    public OrderItem getOrange() {
	return orange;
    }

    public void setOrange(OrderItem orange) {
	this.orange = orange;
    }

    public OrderItem getCarrots() {
	return carrots;
    }

    public void setCarrots(OrderItem carrots) {
	this.carrots = carrots;
    }

    public OrderItem getBanana() {
	return banana;
    }

    public void setBanana(OrderItem banana) {
	this.banana = banana;
    }

    public OrderItem getApple() {
	return apple;
    }

    public void setApple(OrderItem apple) {
	this.apple = apple;
    }

    public OrderItem getOnions() {
	return onions;
    }

    public void setOnions(OrderItem onions) {
	this.onions = onions;
    }

    public double getOrderTotal() {
	return orderTotal;
    }

    public void setOrderTotal() {
	this.orderTotal = beef.getTotal() + orange.getTotal() + carrots.getTotal() + banana.getTotal() + apple.getTotal() + onions.getTotal();
    }
    
    
    
}
