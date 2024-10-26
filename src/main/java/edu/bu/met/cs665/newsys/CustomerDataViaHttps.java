/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: CustomerDataViaHttps.java
 * Description: Write a description for this interface
 */

package edu.bu.met.cs665.newsys;

import edu.bu.met.cs665.Customer;

/**
 * This is the CustomerDataViaHttps interface.
 * This interface is responsible for representing a CustomerDataViaHttps.
 */
public interface CustomerDataViaHttps {

  /**
   * Print customer information with ID.
   * 
   * @param customerId Customer ID
   */
  void printCustomer(int customerId);

  /**
   * Get the customer via the https.
   * 
   * @param customerId Customer ID
   */
  Customer getCustomerViaHttps(int customerId);
}
