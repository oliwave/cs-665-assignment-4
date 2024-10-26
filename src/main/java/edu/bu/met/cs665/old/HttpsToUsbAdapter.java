/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: HttpsToUsbAdapter.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665.old;

import edu.bu.met.cs665.Customer;
import edu.bu.met.cs665.newsys.CustomerDataViaHttps;

/**
 * This is the HttpsToUsbAdapter class.
 * This class is responsible for representing a HttpsToUsbAdapter.
 */
public class HttpsToUsbAdapter implements CustomerDataViaHttps {

  CustomerDataViaUsb customerDataViaUsb;

  /**
   * Create a HttpsToUsbAdapter using the CustomerDataViaUsb.
   * 
   * @param customerDataViaUsb The CustomerDataViaUsb instance
   */
  public HttpsToUsbAdapter(CustomerDataViaUsb customerDataViaUsb) {
    this.customerDataViaUsb = customerDataViaUsb;
  }

  /**
   * Print customer information with ID.
   * 
   * @param customerId Customer ID
   */
  @Override
  public void printCustomer(int customerId) {
    customerDataViaUsb.printCustomer(customerId);
  }

  /**
   * Get the customer via the https.
   * 
   * @param customerId Customer ID
   */
  @Override
  public Customer getCustomerViaHttps(int customerId) {
    return customerDataViaUsb.getCustomerViaUsb(customerId);
  }

}
