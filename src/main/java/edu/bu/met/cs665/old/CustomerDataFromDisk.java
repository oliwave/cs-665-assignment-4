/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: CustomerDataFromDisk.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665.old;

import edu.bu.met.cs665.Customer;


/**
 * This is the CustomerDataFromDisk class.
 * This class is responsible for representing a CustomerDataFromDisk.
 */
public class CustomerDataFromDisk implements CustomerDataViaUsb {

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
   * Get the customer via the USB.
   * 
   * @param customerId Customer ID
   */
  @Override
  public Customer getCustomerViaUsb(int customerId) {
    return new Customer(customerId, "Hello world from local disk");
  }

}
