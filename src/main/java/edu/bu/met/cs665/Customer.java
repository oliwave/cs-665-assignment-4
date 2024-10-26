/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: Customer.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

/**
 * This is the Customer class.
 * This class is responsible for representing a Customer.
 */
public class Customer {

  private int customerId;
  private String data;

  /**
   * Create a customer using cutsomerID and data.
   * 
   * @param customerId The ID of the customer
   * @param data The data belong to customer
   */
  public Customer(int customerId, String data) {
    this.customerId = customerId;
    this.data = data;
  }

  /**
   * Getter method for customer id.
   * 
   * @return Return the customer id
   */
  public int getCustomerId() {
    return customerId;
  }

  /**
   * Setter method for the customer ID.
   * 
   * @param customerId The customer ID
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  /**
   * Getter method for customer's data.
   * 
   * @return Return the customer's data
   */
  public String getData() {
    return data;
  }

  /**
   * Setter method for the cusomer data.
   * 
   * @param data Data for customer
   */
  public void setData(String data) {
    this.data = data;
  }

}
