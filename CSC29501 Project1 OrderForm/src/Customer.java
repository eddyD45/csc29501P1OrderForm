
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddy
 */
public class Customer {
    private int title;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private int state;
    private String postalCode;
    private String cardNumber;

    public Customer(int title, String firstName, String lastName, String address1, String address2, String city, int state, String postalCode, String cardNumber) {
	this.title = title;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address1 = address1;
	this.address2 = address2;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;
	this.cardNumber = cardNumber;
    }

    
    
    

    public int getTitle() {
	return title;
    }

    public void setTitle(int title) {
	this.title = title;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getAddress1() {
	return address1;
    }

    public void setAddress1(String address1) {
	this.address1 = address1;
    }

    public String getAddress2() {
	return address2;
    }

    public void setAddress2(String address2) {
	this.address2 = address2;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public int getState() {
	return state;
    }

    public void setState(int state) {
	this.state = state;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }

    public String getCardNumber() {
	return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
    }
    
    
    
}
