/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/25/2024
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.newsys.CustomerDataFromDB;
import edu.bu.met.cs665.newsys.CustomerDataViaHttps;
import edu.bu.met.cs665.old.CustomerDataFromDisk;
import edu.bu.met.cs665.old.HttpsToUsbAdapter;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project. This could prove convenient to test as you are
   * developing.
   * However, please note that every assignment/final projects requires JUnit
   * tests.
   */
  public static void main(String[] args) {
    CustomerDataViaHttps https = new CustomerDataFromDB();

    https.printCustomer(1);
    Customer c1 = https.getCustomerViaHttps(1);
    System.out.println(c1.getData());

    https = new HttpsToUsbAdapter(new CustomerDataFromDisk());
    https.printCustomer(2);
    Customer c2 = https.getCustomerViaHttps(2);
    System.out.println(c2.getData());

  }

}
