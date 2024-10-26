/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: CustomerDataFromDB.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665.newsys;

import edu.bu.met.cs665.Customer;

/**
 * This is the CustomerDataFromDB class.
 * This class is responsible for representing a CustomerDataFromDB.
 */
public class CustomerDataFromDB implements CustomerDataViaHttps {

  /**
   * Print customer information with ID.
   * 
   * @param customerId Customer ID
   */
  @Override
  public void printCustomer(int customerId) {
    System.out.println("Customer ID:" + customerId);
  }

  /**
   * Get the customer via the https.
   * 
   * @param customerId Customer ID
   */
  @Override
  public Customer getCustomerViaHttps(int customerId) {
    return new Customer(customerId, "Hello World from remote Database");
  }

}
