/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: CustomerDataViaUsb.java
 * Description: Write a description for this interfaces
 */

package edu.bu.met.cs665.old;

import edu.bu.met.cs665.Customer;

/**
 * This is the CustomerDataViaUsb interfaces.
 * This interfaces is responsible for representing a CustomerDataViaUsb.
 */
public interface CustomerDataViaUsb {

  /**
   * Print customer information with ID.
   * 
   * @param customerId Customer ID
   */
  void printCustomer(int customerId);

  /**
   * Get the customer via the USB.
   * 
   * @param customerId Customer ID
   */
  Customer getCustomerViaUsb(int customerId);
}
